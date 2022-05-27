  # dsl-CYK-algorithm instructions
```
Word: abbbabaa

G = ({a, b}, {S, A, B, E, C, X, Y, Z}, P, S)

With Productions P as:
A -> a | YE | XC
B -> b | XE | YZ
C -> AA
E -> YB | XA
S -> YB | XA | *
X -> b
Y -> a
Z -> BB

Applying CYK-Algorithm:

+-------+-------+-------+-------+-------+-------+-------+-------+
| a     | b     | b     | b     | a     | b     | a     | a     |
+-------+-------+-------+-------+-------+-------+-------+-------+
| A,Y   | B,X   | B,X   | B,X   | A,Y   | B,X   | A,Y   | A,Y   |
+-------+-------+-------+-------+-------+-------+-------+-------+
| E,S   | Z     | Z     | E,S   | E,S   | E,S   | C     |
+-------+-------+-------+-------+-------+-------+-------+
| B     | -     | B     | B     | A     | A     |
+-------+-------+-------+-------+-------+-------+
| Z     | Z     | Z     | E,S   | C     |
+-------+-------+-------+-------+-------+
| B     | -     | B     | A     |
+-------+-------+-------+-------+
| Z     | Z     | E,S   |
+-------+-------+-------+
| B     | B     |
+-------+-------+
| E,S   |
+-------+
The word abbbabaa is an element of the CFG G and can be derived from it.
```
## Note: In order to help you runing this proyect please use the following link and download the pluging for xtext
  *  [Xtext plugin](https://www.eclipse.org/Xtext/download.html)
  *  Folow the steps for installing the plugin in your eclipse IDE
 
 
# STEPS:
  1.  *Download this repository and open it as a workspace*
  2.  *Once you have it, please go to the proyect* ``` org.xtext.cyk```  *and open de the file * ``` MyFNC.xtext``` *locaded here:*
            ![image](https://user-images.githubusercontent.com/69874418/170621195-cc0d4435-ac1a-4753-8764-ee5b6158999b.png)
            <br>
            
  3. *Rigth click on the file* ``` MyFNC.xtext``` *and select* ``` Run as -> Generate xtext artifacts```
            ![image](https://user-images.githubusercontent.com/69874418/170621945-de708fc6-9725-49e7-af95-798f187727b8.png)
            ![image](https://user-images.githubusercontent.com/69874418/170621973-cdfb8819-7311-4089-97e6-6b3d39856acf.png)
            <br>
        
  4. *Rigth click on the file* ```GenerateMyFNC.mwe2``` *and select* ``` Run as -> 1 MWE2 WorkFlow```
            ![image](https://user-images.githubusercontent.com/69874418/170622252-abdcda45-c87d-47fd-ad96-e4b5661779a5.png)
            ![image](https://user-images.githubusercontent.com/69874418/170622292-ad8479cb-5719-4aae-adfa-ed1383be0dca.png)
            <br>
  5. *Rigth click on the proyect* ``` org.xtext.cyk``` *and select*  ``` Run as -> Eclipse aplication``` *it will open a new Eclipse IDE*
            ![image](https://user-images.githubusercontent.com/69874418/170622939-e06e3da2-8674-4c5b-83df-eb94e448287a.png)
            ![image](https://user-images.githubusercontent.com/69874418/170622975-62b6dcbe-13ef-4a8a-adcf-8cd59f0987f1.png)
            <br>
  6. *On that new IDE create a new Java proyect, then at the folder* ``` src``` *create a new file with the extention* ```.fnc```
  7. *In your new file* ```.fnc``` *write your grammar as in the following pic* *you can paste it from the file* ```test.txt```
            ![image](https://user-images.githubusercontent.com/69874418/170623743-467053f0-5ee2-43a4-b96a-667f6360ed21.png)
            <br>
  8. *For writing the word that you'd like to test with the cyk algorithm , first write the reserved word* ```Check``` *enclose in quotation marks the string that you want to taste*
            ![image](https://user-images.githubusercontent.com/69874418/170624682-055f920d-7925-4627-b14d-b042e5796296.png)
  9. *Finally check the folder*  ```src-gen``` *and you will find the output in the file*  ```result.txt```
            ![image](https://user-images.githubusercontent.com/69874418/170625522-c0453856-d3fb-4b6b-aef1-bc9743092e88.png)

 





      

      
