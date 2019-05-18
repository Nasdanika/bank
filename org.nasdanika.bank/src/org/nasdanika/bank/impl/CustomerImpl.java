/**
 */
package org.nasdanika.bank.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
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
	@Override
	public EList<CustomerAccount> getAccounts() {
		return (EList<CustomerAccount>)eDynamicGet(BankPackage.CUSTOMER__ACCOUNTS, BankPackage.Literals.CUSTOMER__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<OnlineSession> getOnlineSessions() {
		return (EList<OnlineSession>)eDynamicGet(BankPackage.CUSTOMER__ONLINE_SESSIONS, BankPackage.Literals.CUSTOMER__ONLINE_SESSIONS, true, true);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.CUSTOMER__ACCOUNTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAccounts()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.CUSTOMER__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case BankPackage.CUSTOMER__ONLINE_SESSIONS:
				return ((InternalEList<?>)getOnlineSessions()).basicRemove(otherEnd, msgs);
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
			case BankPackage.CUSTOMER__ACCOUNTS:
				return getAccounts();
			case BankPackage.CUSTOMER__ONLINE_SESSIONS:
				return getOnlineSessions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.CUSTOMER__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends CustomerAccount>)newValue);
				return;
			case BankPackage.CUSTOMER__ONLINE_SESSIONS:
				getOnlineSessions().clear();
				getOnlineSessions().addAll((Collection<? extends OnlineSession>)newValue);
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
			case BankPackage.CUSTOMER__ACCOUNTS:
				getAccounts().clear();
				return;
			case BankPackage.CUSTOMER__ONLINE_SESSIONS:
				getOnlineSessions().clear();
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
			case BankPackage.CUSTOMER__ACCOUNTS:
				return !getAccounts().isEmpty();
			case BankPackage.CUSTOMER__ONLINE_SESSIONS:
				return !getOnlineSessions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		return super.toString() + " " + getName();
	}

} //CustomerImpl
