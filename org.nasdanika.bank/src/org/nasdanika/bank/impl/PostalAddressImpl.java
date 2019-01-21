/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.PostalAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Postal Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getStateProvince <em>State Province</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getLine1 <em>Line1</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PostalAddressImpl#getLine2 <em>Line2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostalAddressImpl extends CDOObjectImpl implements PostalAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.POSTAL_ADDRESS;
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
	public String getCountry() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__COUNTRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(String newCountry) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__COUNTRY, newCountry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStateProvince() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStateProvince(String newStateProvince) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__STATE_PROVINCE, newStateProvince);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__CITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__CITY, newCity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPostalCode() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPostalCode(String newPostalCode) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__POSTAL_CODE, newPostalCode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLine1() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__LINE1, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine1(String newLine1) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__LINE1, newLine1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLine2() {
		return (String)eGet(BankPackage.Literals.POSTAL_ADDRESS__LINE2, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLine2(String newLine2) {
		eSet(BankPackage.Literals.POSTAL_ADDRESS__LINE2, newLine2);
	}

} //PostalAddressImpl
