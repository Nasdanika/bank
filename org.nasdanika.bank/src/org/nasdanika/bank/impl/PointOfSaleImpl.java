/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.PointOfSale;
import org.nasdanika.bank.PostalAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Point Of Sale</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.PointOfSaleImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.PointOfSaleImpl#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PointOfSaleImpl extends MinimalEObjectImpl.Container implements PointOfSale {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOfSaleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.POINT_OF_SALE;
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
	public String getId() {
		return (String)eDynamicGet(BankPackage.POINT_OF_SALE__ID, BankPackage.Literals.POINT_OF_SALE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(BankPackage.POINT_OF_SALE__ID, BankPackage.Literals.POINT_OF_SALE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress getLocation() {
		return (PostalAddress)eDynamicGet(BankPackage.POINT_OF_SALE__LOCATION, BankPackage.Literals.POINT_OF_SALE__LOCATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(PostalAddress newLocation, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLocation, BankPackage.POINT_OF_SALE__LOCATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(PostalAddress newLocation) {
		eDynamicSet(BankPackage.POINT_OF_SALE__LOCATION, BankPackage.Literals.POINT_OF_SALE__LOCATION, newLocation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.POINT_OF_SALE__LOCATION:
				return basicSetLocation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.POINT_OF_SALE__ID:
				return getId();
			case BankPackage.POINT_OF_SALE__LOCATION:
				return getLocation();
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
			case BankPackage.POINT_OF_SALE__ID:
				setId((String)newValue);
				return;
			case BankPackage.POINT_OF_SALE__LOCATION:
				setLocation((PostalAddress)newValue);
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
			case BankPackage.POINT_OF_SALE__ID:
				setId(ID_EDEFAULT);
				return;
			case BankPackage.POINT_OF_SALE__LOCATION:
				setLocation((PostalAddress)null);
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
			case BankPackage.POINT_OF_SALE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BankPackage.POINT_OF_SALE__LOCATION:
				return getLocation() != null;
		}
		return super.eIsSet(featureID);
	}

} //PointOfSaleImpl
