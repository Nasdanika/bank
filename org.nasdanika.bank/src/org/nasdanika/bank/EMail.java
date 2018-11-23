/**
 */
package org.nasdanika.bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMail</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.EMail#getEMailAddress <em>EMail Address</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getEMail()
 * @model
 * @generated
 */
public interface EMail extends ContactMethod {
	/**
	 * Returns the value of the '<em><b>EMail Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EMail Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EMail Address</em>' attribute.
	 * @see #setEMailAddress(String)
	 * @see org.nasdanika.bank.BankPackage#getEMail_EMailAddress()
	 * @model
	 * @generated
	 */
	String getEMailAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.EMail#getEMailAddress <em>EMail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail Address</em>' attribute.
	 * @see #getEMailAddress()
	 * @generated
	 */
	void setEMailAddress(String value);

} // EMail
