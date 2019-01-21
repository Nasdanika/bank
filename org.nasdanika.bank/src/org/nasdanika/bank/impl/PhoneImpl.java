/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public class PhoneImpl extends CDOObjectImpl implements Phone {
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
		return (String)eGet(BankPackage.Literals.CONTACT_METHOD__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eSet(BankPackage.Literals.CONTACT_METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eGet(BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eSet(BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCountryCode() {
		return (Integer)eGet(BankPackage.Literals.PHONE__COUNTRY_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountryCode(int newCountryCode) {
		eSet(BankPackage.Literals.PHONE__COUNTRY_CODE, newCountryCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getAreaCode() {
		return (Integer)eGet(BankPackage.Literals.PHONE__AREA_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAreaCode(int newAreaCode) {
		eSet(BankPackage.Literals.PHONE__AREA_CODE, newAreaCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPhoneNumber() {
		return (Integer)eGet(BankPackage.Literals.PHONE__PHONE_NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPhoneNumber(int newPhoneNumber) {
		eSet(BankPackage.Literals.PHONE__PHONE_NUMBER, newPhoneNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getExtension() {
		return (Integer)eGet(BankPackage.Literals.PHONE__EXTENSION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtension(int newExtension) {
		eSet(BankPackage.Literals.PHONE__EXTENSION, newExtension);
	}

} //PhoneImpl
