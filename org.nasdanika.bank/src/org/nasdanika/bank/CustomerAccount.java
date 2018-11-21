/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Account</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.CustomerAccount#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.nasdanika.bank.CustomerAccount#getProduct <em>Product</em>}</li>
 *   <li>{@link org.nasdanika.bank.CustomerAccount#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getCustomerAccount()
 * @model
 * @generated
 */
public interface CustomerAccount extends Account {
	/**
	 * Returns the value of the '<em><b>Devices</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Devices</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getCustomerAccount_Devices()
	 * @model containment="true"
	 * @generated
	 */
	EList<Device> getDevices();

	/**
	 * Returns the value of the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Product</em>' reference.
	 * @see #setProduct(Product)
	 * @see org.nasdanika.bank.BankPackage#getCustomerAccount_Product()
	 * @model required="true"
	 * @generated
	 */
	Product getProduct();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.CustomerAccount#getProduct <em>Product</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Product</em>' reference.
	 * @see #getProduct()
	 * @generated
	 */
	void setProduct(Product value);

	/**
	 * Returns the value of the '<em><b>Owners</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Customer}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Customer#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owners</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getCustomerAccount_Owners()
	 * @see org.nasdanika.bank.Customer#getAccounts
	 * @model opposite="accounts"
	 * @generated
	 */
	EList<Customer> getOwners();

} // CustomerAccount
