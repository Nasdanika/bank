/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

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
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getToken()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Token extends CDOObject {
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

} // Token
