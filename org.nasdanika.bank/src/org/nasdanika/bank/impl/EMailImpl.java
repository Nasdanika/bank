/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
public class EMailImpl extends MinimalEObjectImpl.Container implements EMail {
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
	 * The default value of the '{@link #getEMailAddress() <em>EMail Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEMailAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_ADDRESS_EDEFAULT = null;

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
		return (String)eDynamicGet(BankPackage.EMAIL__NAME, BankPackage.Literals.CONTACT_METHOD__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(BankPackage.EMAIL__NAME, BankPackage.Literals.CONTACT_METHOD__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(BankPackage.EMAIL__DESCRIPTION, BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(BankPackage.EMAIL__DESCRIPTION, BankPackage.Literals.CONTACT_METHOD__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEMailAddress() {
		return (String)eDynamicGet(BankPackage.EMAIL__EMAIL_ADDRESS, BankPackage.Literals.EMAIL__EMAIL_ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEMailAddress(String newEMailAddress) {
		eDynamicSet(BankPackage.EMAIL__EMAIL_ADDRESS, BankPackage.Literals.EMAIL__EMAIL_ADDRESS, newEMailAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.EMAIL__NAME:
				return getName();
			case BankPackage.EMAIL__DESCRIPTION:
				return getDescription();
			case BankPackage.EMAIL__EMAIL_ADDRESS:
				return getEMailAddress();
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
			case BankPackage.EMAIL__NAME:
				setName((String)newValue);
				return;
			case BankPackage.EMAIL__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BankPackage.EMAIL__EMAIL_ADDRESS:
				setEMailAddress((String)newValue);
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
			case BankPackage.EMAIL__NAME:
				setName(NAME_EDEFAULT);
				return;
			case BankPackage.EMAIL__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BankPackage.EMAIL__EMAIL_ADDRESS:
				setEMailAddress(EMAIL_ADDRESS_EDEFAULT);
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
			case BankPackage.EMAIL__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case BankPackage.EMAIL__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BankPackage.EMAIL__EMAIL_ADDRESS:
				return EMAIL_ADDRESS_EDEFAULT == null ? getEMailAddress() != null : !EMAIL_ADDRESS_EDEFAULT.equals(getEMailAddress());
		}
		return super.eIsSet(featureID);
	}

} //EMailImpl
