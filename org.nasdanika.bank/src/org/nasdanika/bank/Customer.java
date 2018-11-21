/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

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
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getCustomer()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Customer extends CDOObject {
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

} // Customer
