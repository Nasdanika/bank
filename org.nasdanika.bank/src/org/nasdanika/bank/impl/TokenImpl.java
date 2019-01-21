/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Merchant;
import org.nasdanika.bank.Token;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.TokenImpl#getMerchant <em>Merchant</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TokenImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenImpl extends TransactionInitiatorImpl implements Token {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.TOKEN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merchant getMerchant() {
		return (Merchant)eGet(BankPackage.Literals.TOKEN__MERCHANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchant(Merchant newMerchant) {
		eSet(BankPackage.Literals.TOKEN__MERCHANT, newMerchant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eGet(BankPackage.Literals.TOKEN__VALUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eSet(BankPackage.Literals.TOKEN__VALUE, newValue);
	}

} //TokenImpl
