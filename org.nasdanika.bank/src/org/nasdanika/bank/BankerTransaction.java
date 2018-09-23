/**
 */
package org.nasdanika.bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Banker Transaction</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.BankerTransaction#getBanker <em>Banker</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getBankerTransaction()
 * @model
 * @generated
 */
public interface BankerTransaction extends Transaction {
	/**
	 * Returns the value of the '<em><b>Banker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Banker</em>' reference.
	 * @see #setBanker(Banker)
	 * @see org.nasdanika.bank.BankPackage#getBankerTransaction_Banker()
	 * @model required="true"
	 * @generated
	 */
	Banker getBanker();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.BankerTransaction#getBanker <em>Banker</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Banker</em>' reference.
	 * @see #getBanker()
	 * @generated
	 */
	void setBanker(Banker value);

} // BankerTransaction
