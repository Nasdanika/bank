/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Device;
import org.nasdanika.bank.DeviceTransaction;
import org.nasdanika.bank.PointOfSale;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.DeviceTransactionImpl#getPointOfSale <em>Point Of Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTransactionImpl extends TransactionImpl<Device> implements DeviceTransaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.DEVICE_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointOfSale getPointOfSale() {
		return (PointOfSale)eDynamicGet(BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE, BankPackage.Literals.DEVICE_TRANSACTION__POINT_OF_SALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale basicGetPointOfSale() {
		return (PointOfSale)eDynamicGet(BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE, BankPackage.Literals.DEVICE_TRANSACTION__POINT_OF_SALE, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPointOfSale(PointOfSale newPointOfSale) {
		eDynamicSet(BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE, BankPackage.Literals.DEVICE_TRANSACTION__POINT_OF_SALE, newPointOfSale);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE:
				if (resolve) return getPointOfSale();
				return basicGetPointOfSale();
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
			case BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE:
				setPointOfSale((PointOfSale)newValue);
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
			case BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE:
				setPointOfSale((PointOfSale)null);
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
			case BankPackage.DEVICE_TRANSACTION__POINT_OF_SALE:
				return basicGetPointOfSale() != null;
		}
		return super.eIsSet(featureID);
	}

} //DeviceTransactionImpl
