/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public class BankImpl extends CDOObjectImpl implements Bank {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Merchant> getMerchants() {
		return (EList<Merchant>)eGet(BankPackage.Literals.BANK__MERCHANTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Product> getProducts() {
		return (EList<Product>)eGet(BankPackage.Literals.BANK__PRODUCTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Account> getAccounts() {
		return (EList<Account>)eGet(BankPackage.Literals.BANK__ACCOUNTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Customer> getCustomers() {
		return (EList<Customer>)eGet(BankPackage.Literals.BANK__CUSTOMERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Banker> getBankers() {
		return (EList<Banker>)eGet(BankPackage.Literals.BANK__BANKERS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Transaction> getTransactions() {
		return (EList<Transaction>)eGet(BankPackage.Literals.BANK__TRANSACTIONS, true);
	}

} //BankImpl
