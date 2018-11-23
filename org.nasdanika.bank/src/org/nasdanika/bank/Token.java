/**
 */
package org.nasdanika.bank;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Token</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Token#getMerchant <em>Merchant</em>}</li>
 *   <li>{@link org.nasdanika.bank.Token#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getToken()
 * @model
 * @generated
 */
public interface Token extends TransactionInitiator {
	/**
	 * Returns the value of the '<em><b>Merchant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merchant</em>' reference.
	 * @see #setMerchant(Merchant)
	 * @see org.nasdanika.bank.BankPackage#getToken_Merchant()
	 * @model required="true"
	 * @generated
	 */
	Merchant getMerchant();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Token#getMerchant <em>Merchant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Merchant</em>' reference.
	 * @see #getMerchant()
	 * @generated
	 */
	void setMerchant(Merchant value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.nasdanika.bank.BankPackage#getToken_Value()
	 * @model
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Token#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Token
