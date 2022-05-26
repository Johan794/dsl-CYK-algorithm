package org.xtext.cyk.mydsl.generator;

import java.io.*;
import java.util.*;

public class CYK{

    public static String word;
    public static String startingSymbol;
    public static boolean isTokenWord = false;
    public static ArrayList<String> terminals = new ArrayList<String>();
    public static ArrayList<String> nonTerminals = new ArrayList<String>();
    public static TreeMap<String,ArrayList<String>> grammar = new TreeMap<>();
    
    public String doSteps(){
        String[][] cykTable = createCYKTable();
        return  printResult(doCyk(cykTable));
    }

    
    public static String printResult (String[][] cykTable){
    	String result = "";
    	result+="Word: " + word+"\n";
    	result+= "\nG = (" + terminals.toString().replace("[", "{").replace("]", "}") 
                + ", " + nonTerminals.toString().replace("[", "{").replace("]", "}")
                + ", P, " + startingSymbol + ")\n\nWith Productions P as:\n";
        for(String s: grammar.keySet()){
        	result+=s + " -> " + grammar.get(s).toString().replaceAll("[\\[\\]\\,]", "").replaceAll("\\s", " | ")+"\n";
        }
        
        result+="\nApplying CYK-Algorithm:\n";
        

        return result+=drawTable(cykTable);
    }

    public static String drawTable(String[][] cykTable){
    	String out = "";
        int l = findLongestString(cykTable) + 2;
        String formatString = "| %-" + l + "s ";
        String s = "";
        StringBuilder sb = new StringBuilder();
    //Building Table Structure Modules
        sb.append("+");
        for(int x = 0; x <= l + 2; x++){
            if(x == l + 2){ 
                sb.append("+");
            }else{
                sb.append("-");
            }
        }
        String low = sb.toString();
        sb.delete(0, 1);
        String lowRight = sb.toString();
    //Print Table
        for(int i = 0; i < cykTable.length; i++){
            for(int j = 0; j <= cykTable[i].length; j++){
            	out+=((j == 0) ? low : (i <= 1 && j == cykTable[i].length - 1) ? "" : lowRight);
                System.out.print((j == 0) ? low : (i <= 1 && j == cykTable[i].length - 1) ? "" : lowRight);
            }
            out+="\n";
            System.out.println();
            for(int j = 0; j < cykTable[i].length; j++){
                s = (cykTable[i][j].isEmpty()) ? "-" : cykTable[i][j];
                System.out.format(formatString, s.replaceAll("\\s", ","));
                out+= String.format(formatString,s.replaceAll("\\s", ","));
              
                if(j == cykTable[i].length - 1) { 
                	out+="|";
                	System.out.print("|"); 
                }
            }
            out+="\n";
            System.out.println();
        }
        out+=low+"\n";
        System.out.println(low+"\n");
    //Step 4: Evaluate success.
        if(cykTable[cykTable.length-1][cykTable[cykTable.length-1].length-1].contains(startingSymbol)){
        	out+="The word \"" + word + "\" is an element of the CFG G and can be derived from it.\n";
        	System.out.println("The word \"" + word + "\" is an element of the CFG G and can be derived from it.");
        }else{
        	out+="The word \"" + word + "\" is not an element of the CFG G and can not be derived from it.\n";
            System.out.println("The word \"" + word + "\" is not an element of the CFG G and can not be derived from it.");
        }
        
        return out;
    }

    public static int findLongestString(String[][] cykTable){
        int x = 0;
        for(String[] s : cykTable){
            for(String d : s){
                if(d.length() > x){ x = d.length(); }
            }
        }
        return x;
    }

//Jagged Array for the Algorithm
    public static String[][] createCYKTable (){
        int length = isTokenWord ? toArray(word).length : word.length();
        String[][] cykTable = new String[length + 1][];
        cykTable[0] = new String[length];
        for(int i = 1; i < cykTable.length; i++){
            cykTable[i] = new String[length - (i - 1)];
        }
        for(int i = 1; i < cykTable.length; i++){
            for(int j = 0; j < cykTable[i].length; j++){
                cykTable[i][j] = "";
            }
        }
        return cykTable;
    }

    public static String[][] doCyk(String[][] cykTable){
    //Step 1: Fill header row
        for(int i = 0; i < cykTable[0].length; i++){
            cykTable[0][i] = manageWord(word, i);
        }
    //Step 2: Get productions for terminals
        for(int i = 0; i < cykTable[1].length; i++){
            String[] validCombinations = checkIfProduces(new String[] {cykTable[0][i]});
            cykTable[1][i] = toString(validCombinations);
        }
        if(word.length() <= 1) { return cykTable; }
    //Step 3: Get productions for subwords with the length of 2
        for(int i = 0; i < cykTable[2].length; i++){
            String[] downwards = toArray(cykTable[1][i]);
            String[] diagonal = toArray(cykTable[1][i+1]);
            String[] validCombinations = checkIfProduces(getAllCombinations(downwards, diagonal));
            cykTable[2][i] = toString(validCombinations);
        }
        if(word.length() <= 2){ return cykTable; }
    //Step 3: Get productions for subwords with the length of n
        TreeSet<String> currentValues = new TreeSet<String>();

        for(int i = 3; i < cykTable.length; i++){
            for(int j = 0; j < cykTable[i].length; j++){
                for(int compareFrom = 1; compareFrom < i; compareFrom++){
                    String[] downwards = cykTable[compareFrom][j].split("\\s");
                    String[] diagonal = cykTable[i-compareFrom][j+compareFrom].split("\\s");
                    String[] combinations = getAllCombinations(downwards, diagonal);
                    String[] validCombinations = checkIfProduces(combinations);
                    if(cykTable[i][j].isEmpty()){
                        cykTable[i][j] = toString(validCombinations);
                    }else{
                        String[] oldValues = toArray(cykTable[i][j]);
                        ArrayList<String> newValues = new ArrayList<String>(Arrays.asList(oldValues));
                        newValues.addAll(Arrays.asList(validCombinations));
                        currentValues.addAll(newValues);
                        cykTable[i][j] = toString(currentValues.toArray(new String[currentValues.size()]));
                    }
                }
                currentValues.clear();
            }
        }
        return cykTable;
    }

    public static String manageWord(String word, int position){
        if(!isTokenWord){ return Character.toString(word.charAt(position)); }
        return toArray(word)[position];
    }

    public static String[] checkIfProduces(String[] toCheck){
        ArrayList<String> storage = new ArrayList<>();
        for(String s : grammar.keySet()){
            for(String current : toCheck){
                if(grammar.get(s).contains(current)){
                    storage.add(s);
                }
            }
        }
        if(storage.size() == 0) { 
        	System.out.println("Storage vacio");
        	return new String[] {}; 
        }
        return storage.toArray(new String[storage.size()]);
    }

    public static String[] getAllCombinations(String[] from, String[] to){
        int length = from.length * to.length;
        int counter = 0;
        String[] combinations = new String[length];
        if(length == 0){ return combinations; };
        for(int i = 0; i < from.length; i++){
            for(int j = 0; j < to.length; j++){
                combinations[counter] = from[i] + to[j];
                counter++;
            }
        }
        return combinations;
    }

    public static String toString(String[] input){
        return Arrays.toString(input).replaceAll("[\\[\\]\\,]", "");
    }

    public static String[] toArray(String input){
        return input.split("\\s");
    }

    public static Scanner openFile(String file){
        try{
            return new Scanner(new File(file));
        }catch(FileNotFoundException e){
            System.out.println("Error: Can't find or open the file: " + file + ".");
            System.exit(1);
            return null;
        }
    }

	public static String getWord() {
		return word;
	}

	public void setWord(String word) {
		CYK.word = word;
	}

	public static String getStartingSymbol() {
		return startingSymbol;
	}

	public  void setStartingSymbol(String startingSymbol) {
		CYK.startingSymbol = startingSymbol;
	}

	public static boolean isTokenWord() {
		return isTokenWord;
	}

	public static void setTokenWord(boolean isTokenWord) {
		CYK.isTokenWord = isTokenWord;
	}

	public static ArrayList<String> getTerminals() {
		return terminals;
	}

	public  void setTerminals(ArrayList<String> terminals) {
		CYK.terminals = terminals;
	}

	public static ArrayList<String> getNonTerminals() {
		return nonTerminals;
	}

	public  void setNonTerminals(ArrayList<String> nonTerminals) {
		CYK.nonTerminals = nonTerminals;
	}

	public  TreeMap<String, ArrayList<String>> getGrammar() {
		return grammar;
	}

	public  void setGrammar(TreeMap<String, ArrayList<String>> grammar) {
		CYK.grammar = grammar;
	}    
}
