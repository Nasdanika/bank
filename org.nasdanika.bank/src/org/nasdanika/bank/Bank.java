/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bank is the root of the domain model. Bank has customers and bankers - employees performing banking operations. Bank tracks merchants its customers interact with in order to provide customers information about their spending habits.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.Bank#getMerchants <em>Merchants</em>}</li>
 *   <li>{@link org.nasdanika.bank.Bank#getProducts <em>Products</em>}</li>
 *   <li>{@link org.nasdanika.bank.Bank#getAccounts <em>Accounts</em>}</li>
 *   <li>{@link org.nasdanika.bank.Bank#getCustomers <em>Customers</em>}</li>
 *   <li>{@link org.nasdanika.bank.Bank#getBankers <em>Bankers</em>}</li>
 *   <li>{@link org.nasdanika.bank.Bank#getTransactions <em>Transactions</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getBank()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='a'"
 *        annotation="org.nasdanika.html icon='fas fa-university'"
 * @generated
 */
public interface Bank extends Party {

	/**
	 * Returns the value of the '<em><b>Merchants</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Merchant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bank tracks merchants and points of sale used by customers. It also tracks token transactions. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Merchants</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Merchants()
	 * @model containment="true"
	 * @generated
	 */
	EList<Merchant> getMerchants();

	/**
	 * Returns the value of the '<em><b>Products</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Customer accounts belong to banking products which define their configuration such as fees and rates.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Products</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Products()
	 * @model containment="true"
	 * @generated
	 */
	EList<Product> getProducts();

	/**
	 * Returns the value of the '<em><b>Accounts</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Account}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bank holds customer and own (internal) accounts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accounts</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Accounts()
	 * @model containment="true"
	 * @generated
	 */
	EList<Account> getAccounts();

	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bank customers.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Customer> getCustomers();

	/**
	 * Returns the value of the '<em><b>Bankers</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Banker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bank employees.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bankers</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Bankers()
	 * @model containment="true"
	 * @generated
	 */
	EList<Banker> getBankers();

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Transaction}<code>&lt;?&gt;</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bank transactions
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getBank_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Transaction<?>> getTransactions();
} // Bank
