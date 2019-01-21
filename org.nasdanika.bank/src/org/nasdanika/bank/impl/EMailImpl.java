/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.EMail;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMail</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.EMailImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.EMailImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.EMailImpl#getEMailAddress <em>EMail Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EMailImpl extends CDOObjectImpl implements EMail {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMailImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.EMAIL;
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
	public String getEMailAddress() {
		return (String)eGet(BankPackage.Literals.EMAIL__EMAIL_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMailAddress(String newEMailAddress) {
		eSet(BankPackage.Literals.EMAIL__EMAIL_ADDRESS, newEMailAddress);
	}

} //EMailImpl
