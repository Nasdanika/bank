/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getTransaction()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Transaction extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Debit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Statement#getDebits <em>Debits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debit</em>' reference.
	 * @see #setDebit(Statement)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Debit()
	 * @see org.nasdanika.bank.Statement#getDebits
	 * @model opposite="debits" required="true"
	 * @generated
	 */
	Statement getDebit();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit</em>' reference.
	 * @see #getDebit()
	 * @generated
	 */
	void setDebit(Statement value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Statement#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit</em>' reference.
	 * @see #setCredit(Statement)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Credit()
	 * @see org.nasdanika.bank.Statement#getCredits
	 * @model opposite="credits" required="true"
	 * @generated
	 */
	Statement getCredit();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' reference.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(Statement value);

} // Transaction
