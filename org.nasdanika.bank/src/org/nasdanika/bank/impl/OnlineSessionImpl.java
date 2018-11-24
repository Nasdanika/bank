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
	public String getInternetAddress() {
		return (String)eGet(BankPackage.Literals.ONLINE_SESSION__INTERNET_ADDRESS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternetAddress(String newInternetAddress) {
		eSet(BankPackage.Literals.ONLINE_SESSION__INTERNET_ADDRESS, newInternetAddress);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStart() {
		return (Date)eGet(BankPackage.Literals.ONLINE_SESSION__START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(Date newStart) {
		eSet(BankPackage.Literals.ONLINE_SESSION__START, newStart);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEnd() {
		return (Date)eGet(BankPackage.Literals.ONLINE_SESSION__END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Date newEnd) {
		eSet(BankPackage.Literals.ONLINE_SESSION__END, newEnd);
	}

} //OnlineSessionImpl
