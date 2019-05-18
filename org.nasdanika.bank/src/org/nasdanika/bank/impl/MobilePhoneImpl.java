/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.MobilePhone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobile Phone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.MobilePhoneImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.MobilePhoneImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobilePhoneImpl extends DeviceImpl implements MobilePhone {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePhoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.MOBILE_PHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return (String)eDynamicGet(BankPackage.MOBILE_PHONE__NUMBER, BankPackage.Literals.MOBILE_PHONE__NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		eDynamicSet(BankPackage.MOBILE_PHONE__NUMBER, BankPackage.Literals.MOBILE_PHONE__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return (String)eDynamicGet(BankPackage.MOBILE_PHONE__KEY, BankPackage.Literals.MOBILE_PHONE__KEY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		eDynamicSet(BankPackage.MOBILE_PHONE__KEY, BankPackage.Literals.MOBILE_PHONE__KEY, newKey);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.MOBILE_PHONE__NUMBER:
				return getNumber();
			case BankPackage.MOBILE_PHONE__KEY:
				return getKey();
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
			case BankPackage.MOBILE_PHONE__NUMBER:
				setNumber((String)newValue);
				return;
			case BankPackage.MOBILE_PHONE__KEY:
				setKey((String)newValue);
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
			case BankPackage.MOBILE_PHONE__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case BankPackage.MOBILE_PHONE__KEY:
				setKey(KEY_EDEFAULT);
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
			case BankPackage.MOBILE_PHONE__NUMBER:
				return NUMBER_EDEFAULT == null ? getNumber() != null : !NUMBER_EDEFAULT.equals(getNumber());
			case BankPackage.MOBILE_PHONE__KEY:
				return KEY_EDEFAULT == null ? getKey() != null : !KEY_EDEFAULT.equals(getKey());
		}
		return super.eIsSet(featureID);
	}

} //MobilePhoneImpl
