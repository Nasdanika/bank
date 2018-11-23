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
	public Merchant getMerchant() {
		return (Merchant)eGet(BankPackage.Literals.TOKEN__MERCHANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMerchant(Merchant newMerchant) {
		eSet(BankPackage.Literals.TOKEN__MERCHANT, newMerchant);
	}

} //TokenImpl
