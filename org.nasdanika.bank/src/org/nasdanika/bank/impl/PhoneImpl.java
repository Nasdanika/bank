/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Phone;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Phone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getCountryCode <em>Country Code</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getAreaCode <em>Area Code</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PhoneImpl#getExtension <em>Extension</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PhoneImpl extends MinimalEObjectImpl.Container implements Phone {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getCountryCode() <em>Country Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountryCode()
	 * @generated
	 * @ordered
	 */
	protected static final int COUNTRY_CODE_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getAreaCode() <em>Area Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAreaCode()
	 * @generated
	 * @ordered
	 */
	protected static final int AREA_CODE_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PHONE_NUMBER_EDEFAULT = 0;
	/**
	 * The default value of the '{@link #getExtension() <em>Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtension()
	 * @generated
	 * @ordered
	 */
	protected static final int EXTENSION_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.PHONE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(BankPackage.PHONE__NAME, BankPackage.Literals.CONTACT_METHOD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(BankPackage.PHONE__NAME, BankPackage.Literals.CONTACT_METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(BankPackage.PHONE__DESCRIPTION, BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(BankPackage.PHONE__DESCRIPTION, BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCountryCode() {
		return (Integer)eDynamicGet(BankPackage.PHONE__COUNTRY_CODE, BankPackage.Literals.PHONE__COUNTRY_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(int newCountryCode) {
		eDynamicSet(BankPackage.PHONE__COUNTRY_CODE, BankPackage.Literals.PHONE__COUNTRY_CODE, newCountryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAreaCode() {
		return (Integer)eDynamicGet(BankPackage.PHONE__AREA_CODE, BankPackage.Literals.PHONE__AREA_CODE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaCode(int newAreaCode) {
		eDynamicSet(BankPackage.PHONE__AREA_CODE, BankPackage.Literals.PHONE__AREA_CODE, newAreaCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhoneNumber() {
		return (Integer)eDynamicGet(BankPackage.PHONE__PHONE_NUMBER, BankPackage.Literals.PHONE__PHONE_NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(int newPhoneNumber) {
		eDynamicSet(BankPackage.PHONE__PHONE_NUMBER, BankPackage.Literals.PHONE__PHONE_NUMBER, newPhoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtension() {
		return (Integer)eDynamicGet(BankPackage.PHONE__EXTENSION, BankPackage.Literals.PHONE__EXTENSION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(int newExtension) {
		eDynamicSet(BankPackage.PHONE__EXTENSION, BankPackage.Literals.PHONE__EXTENSION, newExtension);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.PHONE__NAME:
				return getName();
			case BankPackage.PHONE__DESCRIPTION:
				return getDescription();
			case BankPackage.PHONE__COUNTRY_CODE:
				return getCountryCode();
			case BankPackage.PHONE__AREA_CODE:
				return getAreaCode();
			case BankPackage.PHONE__PHONE_NUMBER:
				return getPhoneNumber();
			case BankPackage.PHONE__EXTENSION:
				return getExtension();
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
			case BankPackage.PHONE__NAME:
				setName((String)newValue);
				return;
			case BankPackage.PHONE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BankPackage.PHONE__COUNTRY_CODE:
				setCountryCode((Integer)newValue);
				return;
			case BankPackage.PHONE__AREA_CODE:
				setAreaCode((Integer)newValue);
				return;
			case BankPackage.PHONE__PHONE_NUMBER:
				setPhoneNumber((Integer)newValue);
				return;
			case BankPackage.PHONE__EXTENSION:
				setExtension((Integer)newValue);
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
			case BankPackage.PHONE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BankPackage.PHONE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BankPackage.PHONE__COUNTRY_CODE:
				setCountryCode(COUNTRY_CODE_EDEFAULT);
				return;
			case BankPackage.PHONE__AREA_CODE:
				setAreaCode(AREA_CODE_EDEFAULT);
				return;
			case BankPackage.PHONE__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case BankPackage.PHONE__EXTENSION:
				setExtension(EXTENSION_EDEFAULT);
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
			case BankPackage.PHONE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BankPackage.PHONE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BankPackage.PHONE__COUNTRY_CODE:
				return getCountryCode() != COUNTRY_CODE_EDEFAULT;
			case BankPackage.PHONE__AREA_CODE:
				return getAreaCode() != AREA_CODE_EDEFAULT;
			case BankPackage.PHONE__PHONE_NUMBER:
				return getPhoneNumber() != PHONE_NUMBER_EDEFAULT;
			case BankPackage.PHONE__EXTENSION:
				return getExtension() != EXTENSION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //PhoneImpl
