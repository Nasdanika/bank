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
	public String getNumber() {
		return (String)eGet(BankPackage.Literals.MOBILE_PHONE__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		eSet(BankPackage.Literals.MOBILE_PHONE__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKey() {
		return (String)eGet(BankPackage.Literals.MOBILE_PHONE__KEY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(String newKey) {
		eSet(BankPackage.Literals.MOBILE_PHONE__KEY, newKey);
	}

} //MobilePhoneImpl
