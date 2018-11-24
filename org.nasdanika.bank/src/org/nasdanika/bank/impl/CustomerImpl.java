/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Customer;
import org.nasdanika.bank.CustomerAccount;
import org.nasdanika.bank.OnlineSession;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.CustomerImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CustomerImpl#getOnlineSessions <em>Online Sessions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerImpl extends PartyImpl implements Customer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.CUSTOMER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<CustomerAccount> getAccounts() {
		return (EList<CustomerAccount>)eGet(BankPackage.Literals.CUSTOMER__ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<OnlineSession> getOnlineSessions() {
		return (EList<OnlineSession>)eGet(BankPackage.Literals.CUSTOMER__ONLINE_SESSIONS, true);
	}

} //CustomerImpl
