/**
 * generated by Xtext 2.27.0-SNAPSHOT
 */
package org.xtext.cyk.mydsl.myFNC;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GNFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.cyk.mydsl.myFNC.GNFC#getInit <em>Init</em>}</li>
 *   <li>{@link org.xtext.cyk.mydsl.myFNC.GNFC#getProductions <em>Productions</em>}</li>
 *   <li>{@link org.xtext.cyk.mydsl.myFNC.GNFC#getFinal <em>Final</em>}</li>
 * </ul>
 *
 * @see org.xtext.cyk.mydsl.myFNC.MyFNCPackage#getGNFC()
 * @model
 * @generated
 */
public interface GNFC extends EObject
{
  /**
   * Returns the value of the '<em><b>Init</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init</em>' containment reference.
   * @see #setInit(Initial)
   * @see org.xtext.cyk.mydsl.myFNC.MyFNCPackage#getGNFC_Init()
   * @model containment="true"
   * @generated
   */
  Initial getInit();

  /**
   * Sets the value of the '{@link org.xtext.cyk.mydsl.myFNC.GNFC#getInit <em>Init</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init</em>' containment reference.
   * @see #getInit()
   * @generated
   */
  void setInit(Initial value);

  /**
   * Returns the value of the '<em><b>Productions</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.cyk.mydsl.myFNC.Production}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Productions</em>' containment reference list.
   * @see org.xtext.cyk.mydsl.myFNC.MyFNCPackage#getGNFC_Productions()
   * @model containment="true"
   * @generated
   */
  EList<Production> getProductions();

  /**
   * Returns the value of the '<em><b>Final</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final</em>' containment reference.
   * @see #setFinal(InputString)
   * @see org.xtext.cyk.mydsl.myFNC.MyFNCPackage#getGNFC_Final()
   * @model containment="true"
   * @generated
   */
  InputString getFinal();

  /**
   * Sets the value of the '{@link org.xtext.cyk.mydsl.myFNC.GNFC#getFinal <em>Final</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final</em>' containment reference.
   * @see #getFinal()
   * @generated
   */
  void setFinal(InputString value);

} // GNFC
