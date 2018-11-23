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
 *   <li>{@link org.nasdanika.bank.DeviceTransaction#getPointOfSale <em>Point Of Sale</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getDeviceTransaction()
 * @model
 * @generated
 */
public interface DeviceTransaction extends Transaction<Device> {
	/**
	 * Returns the value of the '<em><b>Point Of Sale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Point Of Sale</em>' reference.
	 * @see #setPointOfSale(PointOfSale)
	 * @see org.nasdanika.bank.BankPackage#getDeviceTransaction_PointOfSale()
	 * @model
	 * @generated
	 */
	PointOfSale getPointOfSale();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.DeviceTransaction#getPointOfSale <em>Point Of Sale</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Of Sale</em>' reference.
	 * @see #getPointOfSale()
	 * @generated
	 */
	void setPointOfSale(PointOfSale value);

} // DeviceTransaction
