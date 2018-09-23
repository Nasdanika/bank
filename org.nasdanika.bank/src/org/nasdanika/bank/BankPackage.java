/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * A domain model of a Bank which offers customer debit and credit accounts with linked cards. While a domain model of a real bank would be much more complex and a domain model of a bounded context for a micro-service or a group of micro-services might be simpler this model is 
 * of "moderate" complexity so it is not so hard to grasp, it demonstrates the value of model documentation to communicate common understanding accross the oranization (ubiquitous language), and it can be used to generate bounded contexts.
 * 
 * 
 * Please keep in mind that this is just a demo, so the model may not be completely valid from the banking/finansial point of view.
 * <!-- end-model-doc -->
 * @see org.nasdanika.bank.BankFactory
 * @model kind="package"
 * @generated
 */
public interface BankPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bank";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "urn:org.nasdanika.bank";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.bank";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankPackage eINSTANCE = org.nasdanika.bank.impl.BankPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.BankImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 0;

	/**
	 * The feature id for the '<em><b>Merchants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__MERCHANTS = 0;

	/**
	 * The feature id for the '<em><b>Products</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__PRODUCTS = 1;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__ACCOUNTS = 2;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CUSTOMERS = 3;

	/**
	 * The feature id for the '<em><b>Bankers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__BANKERS = 4;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__TRANSACTIONS = 5;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.CustomerImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Accounts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__ACCOUNTS = 0;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.AccountImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 2;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__STATEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__OWNERS = 1;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.StatementImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 3;

	/**
	 * The feature id for the '<em><b>Debits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__DEBITS = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT__CREDITS = 1;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.TransactionImpl <em>Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.TransactionImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getTransaction()
	 * @generated
	 */
	int TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__DEBIT = 0;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION__CREDIT = 1;

	/**
	 * The number of structural features of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.ProductImpl <em>Product</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.ProductImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getProduct()
	 * @generated
	 */
	int PRODUCT = 5;

	/**
	 * The number of structural features of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Product</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRODUCT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.MerchantImpl <em>Merchant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.MerchantImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getMerchant()
	 * @generated
	 */
	int MERCHANT = 6;

	/**
	 * The feature id for the '<em><b>Points Of Sale</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT__POINTS_OF_SALE = 0;

	/**
	 * The number of structural features of the '<em>Merchant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Merchant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MERCHANT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.PointOfSaleImpl <em>Point Of Sale</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.PointOfSaleImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getPointOfSale()
	 * @generated
	 */
	int POINT_OF_SALE = 7;

	/**
	 * The number of structural features of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Point Of Sale</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OF_SALE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.DeviceImpl <em>Device</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.DeviceImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getDevice()
	 * @generated
	 */
	int DEVICE = 8;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE__TOKENS = 0;

	/**
	 * The number of structural features of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Device</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.MobilePhoneImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getMobilePhone()
	 * @generated
	 */
	int MOBILE_PHONE = 9;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PHONE__TOKENS = DEVICE__TOKENS;

	/**
	 * The number of structural features of the '<em>Mobile Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PHONE_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mobile Phone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBILE_PHONE_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.CardImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 10;

	/**
	 * The feature id for the '<em><b>Tokens</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TOKENS = DEVICE__TOKENS;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = DEVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = DEVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.DeviceTransactionImpl <em>Device Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.DeviceTransactionImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getDeviceTransaction()
	 * @generated
	 */
	int DEVICE_TRANSACTION = 11;

	/**
	 * The feature id for the '<em><b>Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION__DEBIT = TRANSACTION__DEBIT;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION__CREDIT = TRANSACTION__CREDIT;

	/**
	 * The feature id for the '<em><b>Device</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION__DEVICE = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pointofsale</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION__POINTOFSALE = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Device Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Device Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEVICE_TRANSACTION_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.CustomerAccountImpl <em>Customer Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.CustomerAccountImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getCustomerAccount()
	 * @generated
	 */
	int CUSTOMER_ACCOUNT = 12;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__STATEMENTS = ACCOUNT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__OWNERS = ACCOUNT__OWNERS;

	/**
	 * The feature id for the '<em><b>Devices</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__DEVICES = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Product</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT__PRODUCT = ACCOUNT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Customer Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_ACCOUNT_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.InternalAccountImpl <em>Internal Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.InternalAccountImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getInternalAccount()
	 * @generated
	 */
	int INTERNAL_ACCOUNT = 13;

	/**
	 * The feature id for the '<em><b>Statements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACCOUNT__STATEMENTS = ACCOUNT__STATEMENTS;

	/**
	 * The feature id for the '<em><b>Owners</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACCOUNT__OWNERS = ACCOUNT__OWNERS;

	/**
	 * The number of structural features of the '<em>Internal Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACCOUNT_FEATURE_COUNT = ACCOUNT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Internal Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERNAL_ACCOUNT_OPERATION_COUNT = ACCOUNT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.BankerImpl <em>Banker</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.BankerImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getBanker()
	 * @generated
	 */
	int BANKER = 14;

	/**
	 * The number of structural features of the '<em>Banker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Banker</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.BankerTransactionImpl <em>Banker Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.BankerTransactionImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getBankerTransaction()
	 * @generated
	 */
	int BANKER_TRANSACTION = 15;

	/**
	 * The feature id for the '<em><b>Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_TRANSACTION__DEBIT = TRANSACTION__DEBIT;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_TRANSACTION__CREDIT = TRANSACTION__CREDIT;

	/**
	 * The feature id for the '<em><b>Banker</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_TRANSACTION__BANKER = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Banker Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Banker Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANKER_TRANSACTION_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.TokenImpl <em>Token</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.TokenImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getToken()
	 * @generated
	 */
	int TOKEN = 16;

	/**
	 * The feature id for the '<em><b>Merchant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN__MERCHANT = 0;

	/**
	 * The number of structural features of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Token</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.bank.impl.TokenTransactionImpl <em>Token Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.bank.impl.TokenTransactionImpl
	 * @see org.nasdanika.bank.impl.BankPackageImpl#getTokenTransaction()
	 * @generated
	 */
	int TOKEN_TRANSACTION = 17;

	/**
	 * The feature id for the '<em><b>Debit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRANSACTION__DEBIT = TRANSACTION__DEBIT;

	/**
	 * The feature id for the '<em><b>Credit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRANSACTION__CREDIT = TRANSACTION__CREDIT;

	/**
	 * The feature id for the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRANSACTION__TOKEN = TRANSACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Token Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRANSACTION_FEATURE_COUNT = TRANSACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Token Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOKEN_TRANSACTION_OPERATION_COUNT = TRANSACTION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see org.nasdanika.bank.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getMerchants <em>Merchants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Merchants</em>'.
	 * @see org.nasdanika.bank.Bank#getMerchants()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Merchants();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getProducts <em>Products</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Products</em>'.
	 * @see org.nasdanika.bank.Bank#getProducts()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Products();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accounts</em>'.
	 * @see org.nasdanika.bank.Bank#getAccounts()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Accounts();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see org.nasdanika.bank.Bank#getCustomers()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Customers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getBankers <em>Bankers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bankers</em>'.
	 * @see org.nasdanika.bank.Bank#getBankers()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Bankers();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Bank#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see org.nasdanika.bank.Bank#getTransactions()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Transactions();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see org.nasdanika.bank.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.bank.Customer#getAccounts <em>Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Accounts</em>'.
	 * @see org.nasdanika.bank.Customer#getAccounts()
	 * @see #getCustomer()
	 * @generated
	 */
	EReference getCustomer_Accounts();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see org.nasdanika.bank.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Account#getStatements <em>Statements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statements</em>'.
	 * @see org.nasdanika.bank.Account#getStatements()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Statements();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.bank.Account#getOwners <em>Owners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Owners</em>'.
	 * @see org.nasdanika.bank.Account#getOwners()
	 * @see #getAccount()
	 * @generated
	 */
	EReference getAccount_Owners();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see org.nasdanika.bank.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.bank.Statement#getDebits <em>Debits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Debits</em>'.
	 * @see org.nasdanika.bank.Statement#getDebits()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Debits();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.bank.Statement#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Credits</em>'.
	 * @see org.nasdanika.bank.Statement#getCredits()
	 * @see #getStatement()
	 * @generated
	 */
	EReference getStatement_Credits();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Transaction <em>Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction</em>'.
	 * @see org.nasdanika.bank.Transaction
	 * @generated
	 */
	EClass getTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Debit</em>'.
	 * @see org.nasdanika.bank.Transaction#getDebit()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Debit();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit</em>'.
	 * @see org.nasdanika.bank.Transaction#getCredit()
	 * @see #getTransaction()
	 * @generated
	 */
	EReference getTransaction_Credit();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Product <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Product</em>'.
	 * @see org.nasdanika.bank.Product
	 * @generated
	 */
	EClass getProduct();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Merchant <em>Merchant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Merchant</em>'.
	 * @see org.nasdanika.bank.Merchant
	 * @generated
	 */
	EClass getMerchant();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Merchant#getPointsOfSale <em>Points Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Points Of Sale</em>'.
	 * @see org.nasdanika.bank.Merchant#getPointsOfSale()
	 * @see #getMerchant()
	 * @generated
	 */
	EReference getMerchant_PointsOfSale();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.PointOfSale <em>Point Of Sale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point Of Sale</em>'.
	 * @see org.nasdanika.bank.PointOfSale
	 * @generated
	 */
	EClass getPointOfSale();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Device <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device</em>'.
	 * @see org.nasdanika.bank.Device
	 * @generated
	 */
	EClass getDevice();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.Device#getTokens <em>Tokens</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tokens</em>'.
	 * @see org.nasdanika.bank.Device#getTokens()
	 * @see #getDevice()
	 * @generated
	 */
	EReference getDevice_Tokens();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.MobilePhone <em>Mobile Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mobile Phone</em>'.
	 * @see org.nasdanika.bank.MobilePhone
	 * @generated
	 */
	EClass getMobilePhone();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see org.nasdanika.bank.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.DeviceTransaction <em>Device Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Transaction</em>'.
	 * @see org.nasdanika.bank.DeviceTransaction
	 * @generated
	 */
	EClass getDeviceTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.DeviceTransaction#getDevice <em>Device</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Device</em>'.
	 * @see org.nasdanika.bank.DeviceTransaction#getDevice()
	 * @see #getDeviceTransaction()
	 * @generated
	 */
	EReference getDeviceTransaction_Device();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.DeviceTransaction#getPointofsale <em>Pointofsale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pointofsale</em>'.
	 * @see org.nasdanika.bank.DeviceTransaction#getPointofsale()
	 * @see #getDeviceTransaction()
	 * @generated
	 */
	EReference getDeviceTransaction_Pointofsale();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.CustomerAccount <em>Customer Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Account</em>'.
	 * @see org.nasdanika.bank.CustomerAccount
	 * @generated
	 */
	EClass getCustomerAccount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.bank.CustomerAccount#getDevices <em>Devices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Devices</em>'.
	 * @see org.nasdanika.bank.CustomerAccount#getDevices()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_Devices();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.CustomerAccount#getProduct <em>Product</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Product</em>'.
	 * @see org.nasdanika.bank.CustomerAccount#getProduct()
	 * @see #getCustomerAccount()
	 * @generated
	 */
	EReference getCustomerAccount_Product();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.InternalAccount <em>Internal Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Internal Account</em>'.
	 * @see org.nasdanika.bank.InternalAccount
	 * @generated
	 */
	EClass getInternalAccount();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Banker <em>Banker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Banker</em>'.
	 * @see org.nasdanika.bank.Banker
	 * @generated
	 */
	EClass getBanker();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.BankerTransaction <em>Banker Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Banker Transaction</em>'.
	 * @see org.nasdanika.bank.BankerTransaction
	 * @generated
	 */
	EClass getBankerTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.BankerTransaction#getBanker <em>Banker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Banker</em>'.
	 * @see org.nasdanika.bank.BankerTransaction#getBanker()
	 * @see #getBankerTransaction()
	 * @generated
	 */
	EReference getBankerTransaction_Banker();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.Token <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token</em>'.
	 * @see org.nasdanika.bank.Token
	 * @generated
	 */
	EClass getToken();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.Token#getMerchant <em>Merchant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Merchant</em>'.
	 * @see org.nasdanika.bank.Token#getMerchant()
	 * @see #getToken()
	 * @generated
	 */
	EReference getToken_Merchant();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.bank.TokenTransaction <em>Token Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Token Transaction</em>'.
	 * @see org.nasdanika.bank.TokenTransaction
	 * @generated
	 */
	EClass getTokenTransaction();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.bank.TokenTransaction#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Token</em>'.
	 * @see org.nasdanika.bank.TokenTransaction#getToken()
	 * @see #getTokenTransaction()
	 * @generated
	 */
	EReference getTokenTransaction_Token();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankFactory getBankFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.BankImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();
		/**
		 * The meta object literal for the '<em><b>Merchants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__MERCHANTS = eINSTANCE.getBank_Merchants();
		/**
		 * The meta object literal for the '<em><b>Products</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__PRODUCTS = eINSTANCE.getBank_Products();
		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__ACCOUNTS = eINSTANCE.getBank_Accounts();
		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__CUSTOMERS = eINSTANCE.getBank_Customers();
		/**
		 * The meta object literal for the '<em><b>Bankers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__BANKERS = eINSTANCE.getBank_Bankers();
		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__TRANSACTIONS = eINSTANCE.getBank_Transactions();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.CustomerImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();
		/**
		 * The meta object literal for the '<em><b>Accounts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER__ACCOUNTS = eINSTANCE.getCustomer_Accounts();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.AccountImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();
		/**
		 * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__STATEMENTS = eINSTANCE.getAccount_Statements();
		/**
		 * The meta object literal for the '<em><b>Owners</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT__OWNERS = eINSTANCE.getAccount_Owners();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.StatementImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();
		/**
		 * The meta object literal for the '<em><b>Debits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__DEBITS = eINSTANCE.getStatement_Debits();
		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATEMENT__CREDITS = eINSTANCE.getStatement_Credits();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.TransactionImpl <em>Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.TransactionImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getTransaction()
		 * @generated
		 */
		EClass TRANSACTION = eINSTANCE.getTransaction();
		/**
		 * The meta object literal for the '<em><b>Debit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__DEBIT = eINSTANCE.getTransaction_Debit();
		/**
		 * The meta object literal for the '<em><b>Credit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION__CREDIT = eINSTANCE.getTransaction_Credit();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.ProductImpl <em>Product</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.ProductImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getProduct()
		 * @generated
		 */
		EClass PRODUCT = eINSTANCE.getProduct();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.MerchantImpl <em>Merchant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.MerchantImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getMerchant()
		 * @generated
		 */
		EClass MERCHANT = eINSTANCE.getMerchant();
		/**
		 * The meta object literal for the '<em><b>Points Of Sale</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MERCHANT__POINTS_OF_SALE = eINSTANCE.getMerchant_PointsOfSale();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.PointOfSaleImpl <em>Point Of Sale</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.PointOfSaleImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getPointOfSale()
		 * @generated
		 */
		EClass POINT_OF_SALE = eINSTANCE.getPointOfSale();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.DeviceImpl <em>Device</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.DeviceImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getDevice()
		 * @generated
		 */
		EClass DEVICE = eINSTANCE.getDevice();
		/**
		 * The meta object literal for the '<em><b>Tokens</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE__TOKENS = eINSTANCE.getDevice_Tokens();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.MobilePhoneImpl <em>Mobile Phone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.MobilePhoneImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getMobilePhone()
		 * @generated
		 */
		EClass MOBILE_PHONE = eINSTANCE.getMobilePhone();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.CardImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.DeviceTransactionImpl <em>Device Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.DeviceTransactionImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getDeviceTransaction()
		 * @generated
		 */
		EClass DEVICE_TRANSACTION = eINSTANCE.getDeviceTransaction();
		/**
		 * The meta object literal for the '<em><b>Device</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TRANSACTION__DEVICE = eINSTANCE.getDeviceTransaction_Device();
		/**
		 * The meta object literal for the '<em><b>Pointofsale</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEVICE_TRANSACTION__POINTOFSALE = eINSTANCE.getDeviceTransaction_Pointofsale();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.CustomerAccountImpl <em>Customer Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.CustomerAccountImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getCustomerAccount()
		 * @generated
		 */
		EClass CUSTOMER_ACCOUNT = eINSTANCE.getCustomerAccount();
		/**
		 * The meta object literal for the '<em><b>Devices</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__DEVICES = eINSTANCE.getCustomerAccount_Devices();
		/**
		 * The meta object literal for the '<em><b>Product</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMER_ACCOUNT__PRODUCT = eINSTANCE.getCustomerAccount_Product();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.InternalAccountImpl <em>Internal Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.InternalAccountImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getInternalAccount()
		 * @generated
		 */
		EClass INTERNAL_ACCOUNT = eINSTANCE.getInternalAccount();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.BankerImpl <em>Banker</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.BankerImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getBanker()
		 * @generated
		 */
		EClass BANKER = eINSTANCE.getBanker();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.BankerTransactionImpl <em>Banker Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.BankerTransactionImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getBankerTransaction()
		 * @generated
		 */
		EClass BANKER_TRANSACTION = eINSTANCE.getBankerTransaction();
		/**
		 * The meta object literal for the '<em><b>Banker</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANKER_TRANSACTION__BANKER = eINSTANCE.getBankerTransaction_Banker();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.TokenImpl <em>Token</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.TokenImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getToken()
		 * @generated
		 */
		EClass TOKEN = eINSTANCE.getToken();
		/**
		 * The meta object literal for the '<em><b>Merchant</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN__MERCHANT = eINSTANCE.getToken_Merchant();
		/**
		 * The meta object literal for the '{@link org.nasdanika.bank.impl.TokenTransactionImpl <em>Token Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.bank.impl.TokenTransactionImpl
		 * @see org.nasdanika.bank.impl.BankPackageImpl#getTokenTransaction()
		 * @generated
		 */
		EClass TOKEN_TRANSACTION = eINSTANCE.getTokenTransaction();
		/**
		 * The meta object literal for the '<em><b>Token</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOKEN_TRANSACTION__TOKEN = eINSTANCE.getTokenTransaction_Token();

	}

} //BankPackage
