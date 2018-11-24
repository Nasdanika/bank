/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Customer#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.bank.Customer#getOnlineSessions <em>Online Sessions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getCustomer()
 * @model
 * @generated
 */
public interface Customer extends Party {
	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.CustomerAccount}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.CustomerAccount#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounts</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getCustomer_Accounts()
	 * @see org.nasdanika.bank.CustomerAccount#getOwners
	 * @model opposite="owners"
	 * @generated
	 */
	EList<CustomerAccount> getAccounts();

	/**
	 * Returns the value of the '<em><b>Online Sessions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.OnlineSession}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Online Sessions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Sessions</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getCustomer_OnlineSessions()
	 * @model containment="true"
	 * @generated
	 */
	EList<OnlineSession> getOnlineSessions();

} // Customer
