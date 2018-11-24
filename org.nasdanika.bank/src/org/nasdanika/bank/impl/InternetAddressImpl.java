/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.InternetAddress;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Internet Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.InternetAddressImpl#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InternetAddressImpl extends TransactionInitiatorImpl implements InternetAddress {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternetAddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.INTERNET_ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return (String)eGet(BankPackage.Literals.INTERNET_ADDRESS__ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		eSet(BankPackage.Literals.INTERNET_ADDRESS__ADDRESS, newAddress);
	}

} //InternetAddressImpl
