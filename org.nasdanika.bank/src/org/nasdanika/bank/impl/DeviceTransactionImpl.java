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
 *   <li>{@link org.nasdanika.bank.impl.DeviceTransactionImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.DeviceTransactionImpl#getPointOfSale <em>Point Of Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceTransactionImpl extends TransactionImpl implements DeviceTransaction {
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
	public Device getDevice() {
		return (Device)eGet(BankPackage.Literals.DEVICE_TRANSACTION__DEVICE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDevice(Device newDevice) {
		eSet(BankPackage.Literals.DEVICE_TRANSACTION__DEVICE, newDevice);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale getPointOfSale() {
		return (PointOfSale)eGet(BankPackage.Literals.DEVICE_TRANSACTION__POINT_OF_SALE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPointOfSale(PointOfSale newPointOfSale) {
		eSet(BankPackage.Literals.DEVICE_TRANSACTION__POINT_OF_SALE, newPointOfSale);
	}

} //DeviceTransactionImpl
