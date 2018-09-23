/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Statement#getDebits <em>Debits</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getStatement()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Statement extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Debits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Transaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debits</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getStatement_Debits()
	 * @see org.nasdanika.bank.Transaction#getDebit
	 * @model opposite="debit"
	 * @generated
	 */
	EList<Transaction> getDebits();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Transaction}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credits</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getStatement_Credits()
	 * @see org.nasdanika.bank.Transaction#getCredit
	 * @model opposite="credit"
	 * @generated
	 */
	EList<Transaction> getCredits();

} // Statement
