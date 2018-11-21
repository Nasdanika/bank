/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.Account#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getAccount()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Account extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getAccount_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

} // Account
