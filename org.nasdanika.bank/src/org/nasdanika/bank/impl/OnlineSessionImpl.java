/**
 */
package org.nasdanika.bank.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.OnlineSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Online Session</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.OnlineSessionImpl#getInternetAddress <em>Internet Address</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.OnlineSessionImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.OnlineSessionImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OnlineSessionImpl extends TransactionInitiatorImpl implements OnlineSession {
	/**
	 * The default value of the '{@link #getInternetAddress() <em>Internet Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternetAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERNET_ADDRESS_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlineSessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.ONLINE_SESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInternetAddress() {
		return (String)eDynamicGet(BankPackage.ONLINE_SESSION__INTERNET_ADDRESS, BankPackage.Literals.ONLINE_SESSION__INTERNET_ADDRESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInternetAddress(String newInternetAddress) {
		eDynamicSet(BankPackage.ONLINE_SESSION__INTERNET_ADDRESS, BankPackage.Literals.ONLINE_SESSION__INTERNET_ADDRESS, newInternetAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getStart() {
		return (Date)eDynamicGet(BankPackage.ONLINE_SESSION__START, BankPackage.Literals.ONLINE_SESSION__START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(Date newStart) {
		eDynamicSet(BankPackage.ONLINE_SESSION__START, BankPackage.Literals.ONLINE_SESSION__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getEnd() {
		return (Date)eDynamicGet(BankPackage.ONLINE_SESSION__END, BankPackage.Literals.ONLINE_SESSION__END, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Date newEnd) {
		eDynamicSet(BankPackage.ONLINE_SESSION__END, BankPackage.Literals.ONLINE_SESSION__END, newEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.ONLINE_SESSION__INTERNET_ADDRESS:
				return getInternetAddress();
			case BankPackage.ONLINE_SESSION__START:
				return getStart();
			case BankPackage.ONLINE_SESSION__END:
				return getEnd();
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
			case BankPackage.ONLINE_SESSION__INTERNET_ADDRESS:
				setInternetAddress((String)newValue);
				return;
			case BankPackage.ONLINE_SESSION__START:
				setStart((Date)newValue);
				return;
			case BankPackage.ONLINE_SESSION__END:
				setEnd((Date)newValue);
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
			case BankPackage.ONLINE_SESSION__INTERNET_ADDRESS:
				setInternetAddress(INTERNET_ADDRESS_EDEFAULT);
				return;
			case BankPackage.ONLINE_SESSION__START:
				setStart(START_EDEFAULT);
				return;
			case BankPackage.ONLINE_SESSION__END:
				setEnd(END_EDEFAULT);
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
			case BankPackage.ONLINE_SESSION__INTERNET_ADDRESS:
				return INTERNET_ADDRESS_EDEFAULT == null ? getInternetAddress() != null : !INTERNET_ADDRESS_EDEFAULT.equals(getInternetAddress());
			case BankPackage.ONLINE_SESSION__START:
				return START_EDEFAULT == null ? getStart() != null : !START_EDEFAULT.equals(getStart());
			case BankPackage.ONLINE_SESSION__END:
				return END_EDEFAULT == null ? getEnd() != null : !END_EDEFAULT.equals(getEnd());
		}
		return super.eIsSet(featureID);
	}

} //OnlineSessionImpl
