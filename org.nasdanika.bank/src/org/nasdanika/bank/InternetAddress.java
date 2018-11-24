/**
 */
package org.nasdanika.bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Internet Address</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.InternetAddress#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getInternetAddress()
 * @model
 * @generated
 */
public interface InternetAddress extends TransactionInitiator {
	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see org.nasdanika.bank.BankPackage#getInternetAddress_Address()
	 * @model required="true"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.InternetAddress#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // InternetAddress
