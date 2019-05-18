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
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

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
		return (Merchant)eDynamicGet(BankPackage.TOKEN__MERCHANT, BankPackage.Literals.TOKEN__MERCHANT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merchant basicGetMerchant() {
		return (Merchant)eDynamicGet(BankPackage.TOKEN__MERCHANT, BankPackage.Literals.TOKEN__MERCHANT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerchant(Merchant newMerchant) {
		eDynamicSet(BankPackage.TOKEN__MERCHANT, BankPackage.Literals.TOKEN__MERCHANT, newMerchant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return (String)eDynamicGet(BankPackage.TOKEN__VALUE, BankPackage.Literals.TOKEN__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		eDynamicSet(BankPackage.TOKEN__VALUE, BankPackage.Literals.TOKEN__VALUE, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.TOKEN__MERCHANT:
				if (resolve) return getMerchant();
				return basicGetMerchant();
			case BankPackage.TOKEN__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.TOKEN__MERCHANT:
				setMerchant((Merchant)newValue);
				return;
			case BankPackage.TOKEN__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BankPackage.TOKEN__MERCHANT:
				setMerchant((Merchant)null);
				return;
			case BankPackage.TOKEN__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BankPackage.TOKEN__MERCHANT:
				return basicGetMerchant() != null;
			case BankPackage.TOKEN__VALUE:
				return VALUE_EDEFAULT == null ? getValue() != null : !VALUE_EDEFAULT.equals(getValue());
		}
		return super.eIsSet(featureID);
	}

} //TokenImpl
