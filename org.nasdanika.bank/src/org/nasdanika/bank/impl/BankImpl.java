/**
 */
package org.nasdanika.bank.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.bank.Account;
import org.nasdanika.bank.Bank;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Banker;
import org.nasdanika.bank.Customer;
import org.nasdanika.bank.Merchant;
import org.nasdanika.bank.Product;
import org.nasdanika.bank.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getMerchants <em>Merchants</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getBankers <em>Bankers</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.BankImpl#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankImpl extends PartyImpl implements Bank {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.BANK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Merchant> getMerchants() {
		return (EList<Merchant>)eDynamicGet(BankPackage.BANK__MERCHANTS, BankPackage.Literals.BANK__MERCHANTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Product> getProducts() {
		return (EList<Product>)eDynamicGet(BankPackage.BANK__PRODUCTS, BankPackage.Literals.BANK__PRODUCTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Account> getAccounts() {
		return (EList<Account>)eDynamicGet(BankPackage.BANK__ACCOUNTS, BankPackage.Literals.BANK__ACCOUNTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Customer> getCustomers() {
		return (EList<Customer>)eDynamicGet(BankPackage.BANK__CUSTOMERS, BankPackage.Literals.BANK__CUSTOMERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Banker> getBankers() {
		return (EList<Banker>)eDynamicGet(BankPackage.BANK__BANKERS, BankPackage.Literals.BANK__BANKERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transaction<?>> getTransactions() {
		return (EList<Transaction<?>>)eDynamicGet(BankPackage.BANK__TRANSACTIONS, BankPackage.Literals.BANK__TRANSACTIONS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.BANK__MERCHANTS:
				return ((InternalEList<?>)getMerchants()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__PRODUCTS:
				return ((InternalEList<?>)getProducts()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__ACCOUNTS:
				return ((InternalEList<?>)getAccounts()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__CUSTOMERS:
				return ((InternalEList<?>)getCustomers()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__BANKERS:
				return ((InternalEList<?>)getBankers()).basicRemove(otherEnd, msgs);
			case BankPackage.BANK__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case BankPackage.BANK__MERCHANTS:
				return getMerchants();
			case BankPackage.BANK__PRODUCTS:
				return getProducts();
			case BankPackage.BANK__ACCOUNTS:
				return getAccounts();
			case BankPackage.BANK__CUSTOMERS:
				return getCustomers();
			case BankPackage.BANK__BANKERS:
				return getBankers();
			case BankPackage.BANK__TRANSACTIONS:
				return getTransactions();
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
			case BankPackage.BANK__MERCHANTS:
				getMerchants().clear();
				getMerchants().addAll((Collection<? extends Merchant>)newValue);
				return;
			case BankPackage.BANK__PRODUCTS:
				getProducts().clear();
				getProducts().addAll((Collection<? extends Product>)newValue);
				return;
			case BankPackage.BANK__ACCOUNTS:
				getAccounts().clear();
				getAccounts().addAll((Collection<? extends Account>)newValue);
				return;
			case BankPackage.BANK__CUSTOMERS:
				getCustomers().clear();
				getCustomers().addAll((Collection<? extends Customer>)newValue);
				return;
			case BankPackage.BANK__BANKERS:
				getBankers().clear();
				getBankers().addAll((Collection<? extends Banker>)newValue);
				return;
			case BankPackage.BANK__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends Transaction<?>>)newValue);
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
			case BankPackage.BANK__MERCHANTS:
				getMerchants().clear();
				return;
			case BankPackage.BANK__PRODUCTS:
				getProducts().clear();
				return;
			case BankPackage.BANK__ACCOUNTS:
				getAccounts().clear();
				return;
			case BankPackage.BANK__CUSTOMERS:
				getCustomers().clear();
				return;
			case BankPackage.BANK__BANKERS:
				getBankers().clear();
				return;
			case BankPackage.BANK__TRANSACTIONS:
				getTransactions().clear();
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
			case BankPackage.BANK__MERCHANTS:
				return !getMerchants().isEmpty();
			case BankPackage.BANK__PRODUCTS:
				return !getProducts().isEmpty();
			case BankPackage.BANK__ACCOUNTS:
				return !getAccounts().isEmpty();
			case BankPackage.BANK__CUSTOMERS:
				return !getCustomers().isEmpty();
			case BankPackage.BANK__BANKERS:
				return !getBankers().isEmpty();
			case BankPackage.BANK__TRANSACTIONS:
				return !getTransactions().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BankImpl
