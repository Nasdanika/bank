/**
 */
package org.nasdanika.bank;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.DeviceTransaction#getDevice <em>Device</em>}</li>
 *   <li>{@link org.nasdanika.bank.DeviceTransaction#getPointofsale <em>Pointofsale</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getDeviceTransaction()
 * @model
 * @generated
 */
public interface DeviceTransaction extends Transaction {
	/**
	 * Returns the value of the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Device</em>' reference.
	 * @see #setDevice(Device)
	 * @see org.nasdanika.bank.BankPackage#getDeviceTransaction_Device()
	 * @model
	 * @generated
	 */
	Device getDevice();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.DeviceTransaction#getDevice <em>Device</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Device</em>' reference.
	 * @see #getDevice()
	 * @generated
	 */
	void setDevice(Device value);

	/**
	 * Returns the value of the '<em><b>Pointofsale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pointofsale</em>' reference.
	 * @see #setPointofsale(PointOfSale)
	 * @see org.nasdanika.bank.BankPackage#getDeviceTransaction_Pointofsale()
	 * @model
	 * @generated
	 */
	PointOfSale getPointofsale();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.DeviceTransaction#getPointofsale <em>Pointofsale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pointofsale</em>' reference.
	 * @see #getPointofsale()
	 * @generated
	 */
	void setPointofsale(PointOfSale value);

} // DeviceTransaction
