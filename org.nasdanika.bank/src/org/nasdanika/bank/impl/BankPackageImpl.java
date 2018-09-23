/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.bank.Account;
import org.nasdanika.bank.Bank;
import org.nasdanika.bank.BankFactory;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Banker;
import org.nasdanika.bank.BankerTransaction;
import org.nasdanika.bank.Card;
import org.nasdanika.bank.Customer;
import org.nasdanika.bank.CustomerAccount;
import org.nasdanika.bank.Device;
import org.nasdanika.bank.DeviceTransaction;
import org.nasdanika.bank.InternalAccount;
import org.nasdanika.bank.Merchant;
import org.nasdanika.bank.MobilePhone;
import org.nasdanika.bank.PointOfSale;
import org.nasdanika.bank.Product;
import org.nasdanika.bank.Statement;
import org.nasdanika.bank.Token;
import org.nasdanika.bank.TokenTransaction;
import org.nasdanika.bank.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankPackageImpl extends EPackageImpl implements BankPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass productEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass merchantEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pointOfSaleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobilePhoneEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deviceTransactionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerAccountEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalAccountEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankerEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankerTransactionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenTransactionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.bank.BankPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BankPackageImpl() {
		super(eNS_URI, BankFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link BankPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BankPackage init() {
		if (isInited) return (BankPackage)EPackage.Registry.INSTANCE.getEPackage(BankPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBankPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BankPackageImpl theBankPackage = registeredBankPackage instanceof BankPackageImpl ? (BankPackageImpl)registeredBankPackage : new BankPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBankPackage.createPackageContents();

		// Initialize created meta-data
		theBankPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBankPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BankPackage.eNS_URI, theBankPackage);
		return theBankPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBank() {
		return bankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Merchants() {
		return (EReference)bankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Products() {
		return (EReference)bankEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Accounts() {
		return (EReference)bankEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Customers() {
		return (EReference)bankEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Bankers() {
		return (EReference)bankEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBank_Transactions() {
		return (EReference)bankEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomer_Accounts() {
		return (EReference)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccount() {
		return accountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Statements() {
		return (EReference)accountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAccount_Owners() {
		return (EReference)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Debits() {
		return (EReference)statementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStatement_Credits() {
		return (EReference)statementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Debit() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransaction_Credit() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProduct() {
		return productEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMerchant() {
		return merchantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMerchant_PointsOfSale() {
		return (EReference)merchantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPointOfSale() {
		return pointOfSaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDevice() {
		return deviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDevice_Tokens() {
		return (EReference)deviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobilePhone() {
		return mobilePhoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeviceTransaction() {
		return deviceTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceTransaction_Device() {
		return (EReference)deviceTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDeviceTransaction_Pointofsale() {
		return (EReference)deviceTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomerAccount() {
		return customerAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_Devices() {
		return (EReference)customerAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomerAccount_Product() {
		return (EReference)customerAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInternalAccount() {
		return internalAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBanker() {
		return bankerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBankerTransaction() {
		return bankerTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBankerTransaction_Banker() {
		return (EReference)bankerTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getToken_Merchant() {
		return (EReference)tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTokenTransaction() {
		return tokenTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTokenTransaction_Token() {
		return (EReference)tokenTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankFactory getBankFactory() {
		return (BankFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bankEClass = createEClass(BANK);
		createEReference(bankEClass, BANK__MERCHANTS);
		createEReference(bankEClass, BANK__PRODUCTS);
		createEReference(bankEClass, BANK__ACCOUNTS);
		createEReference(bankEClass, BANK__CUSTOMERS);
		createEReference(bankEClass, BANK__BANKERS);
		createEReference(bankEClass, BANK__TRANSACTIONS);

		customerEClass = createEClass(CUSTOMER);
		createEReference(customerEClass, CUSTOMER__ACCOUNTS);

		accountEClass = createEClass(ACCOUNT);
		createEReference(accountEClass, ACCOUNT__STATEMENTS);
		createEReference(accountEClass, ACCOUNT__OWNERS);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__DEBITS);
		createEReference(statementEClass, STATEMENT__CREDITS);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__DEBIT);
		createEReference(transactionEClass, TRANSACTION__CREDIT);

		productEClass = createEClass(PRODUCT);

		merchantEClass = createEClass(MERCHANT);
		createEReference(merchantEClass, MERCHANT__POINTS_OF_SALE);

		pointOfSaleEClass = createEClass(POINT_OF_SALE);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__TOKENS);

		mobilePhoneEClass = createEClass(MOBILE_PHONE);

		cardEClass = createEClass(CARD);

		deviceTransactionEClass = createEClass(DEVICE_TRANSACTION);
		createEReference(deviceTransactionEClass, DEVICE_TRANSACTION__DEVICE);
		createEReference(deviceTransactionEClass, DEVICE_TRANSACTION__POINTOFSALE);

		customerAccountEClass = createEClass(CUSTOMER_ACCOUNT);
		createEReference(customerAccountEClass, CUSTOMER_ACCOUNT__DEVICES);
		createEReference(customerAccountEClass, CUSTOMER_ACCOUNT__PRODUCT);

		internalAccountEClass = createEClass(INTERNAL_ACCOUNT);

		bankerEClass = createEClass(BANKER);

		bankerTransactionEClass = createEClass(BANKER_TRANSACTION);
		createEReference(bankerTransactionEClass, BANKER_TRANSACTION__BANKER);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__MERCHANT);

		tokenTransactionEClass = createEClass(TOKEN_TRANSACTION);
		createEReference(tokenTransactionEClass, TOKEN_TRANSACTION__TOKEN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobilePhoneEClass.getESuperTypes().add(this.getDevice());
		cardEClass.getESuperTypes().add(this.getDevice());
		deviceTransactionEClass.getESuperTypes().add(this.getTransaction());
		customerAccountEClass.getESuperTypes().add(this.getAccount());
		internalAccountEClass.getESuperTypes().add(this.getAccount());
		bankerTransactionEClass.getESuperTypes().add(this.getTransaction());
		tokenTransactionEClass.getESuperTypes().add(this.getTransaction());

		// Initialize classes, features, and operations; add parameters
		initEClass(bankEClass, Bank.class, "Bank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBank_Merchants(), this.getMerchant(), null, "merchants", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Products(), this.getProduct(), null, "products", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Accounts(), this.getAccount(), null, "accounts", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Customers(), this.getCustomer(), null, "customers", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Bankers(), this.getBanker(), null, "bankers", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Transactions(), this.getTransaction(), null, "transactions", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_Accounts(), this.getAccount(), this.getAccount_Owners(), "accounts", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccount_Statements(), this.getStatement(), null, "statements", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccount_Owners(), this.getCustomer(), this.getCustomer_Accounts(), "owners", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStatement_Debits(), this.getTransaction(), this.getTransaction_Debit(), "debits", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStatement_Credits(), this.getTransaction(), this.getTransaction_Credit(), "credits", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Debit(), this.getStatement(), this.getStatement_Debits(), "debit", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Credit(), this.getStatement(), this.getStatement_Credits(), "credit", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(merchantEClass, Merchant.class, "Merchant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMerchant_PointsOfSale(), this.getPointOfSale(), null, "pointsOfSale", null, 0, -1, Merchant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointOfSaleEClass, PointOfSale.class, "PointOfSale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilePhoneEClass, MobilePhone.class, "MobilePhone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(deviceTransactionEClass, DeviceTransaction.class, "DeviceTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceTransaction_Device(), this.getDevice(), null, "device", null, 0, 1, DeviceTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDeviceTransaction_Pointofsale(), this.getPointOfSale(), null, "pointofsale", null, 0, 1, DeviceTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerAccountEClass, CustomerAccount.class, "CustomerAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerAccount_Devices(), this.getDevice(), null, "devices", null, 0, -1, CustomerAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerAccount_Product(), this.getProduct(), null, "product", null, 1, 1, CustomerAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalAccountEClass, InternalAccount.class, "InternalAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bankerEClass, Banker.class, "Banker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bankerTransactionEClass, BankerTransaction.class, "BankerTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBankerTransaction_Banker(), this.getBanker(), null, "banker", null, 1, 1, BankerTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Merchant(), this.getMerchant(), null, "merchant", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenTransactionEClass, TokenTransaction.class, "TokenTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTokenTransaction_Token(), this.getToken(), null, "token", null, 1, 1, TokenTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "A domain model of a Bank which offers customer debit and credit accounts with linked cards. While a domain model of a real bank would be much more complex and a domain model of a bounded context for a micro-service or a group of micro-services might be simpler this model is \r\nof \"moderate\" complexity so it is not so hard to grasp, it demonstrates the value of model documentation to communicate common understanding accross the oranization (ubiquitous language), and it can be used to generate bounded contexts.\r\n\r\n\r\nPlease keep in mind that this is just a demo, so the model may not be completely valid from the banking/finansial point of view."
		   });
		addAnnotation
		  (bankEClass,
		   source,
		   new String[] {
			   "documentation", "Bank is the root of the domain model. Bank has customers and bankers - employees performing banking operations. Bank tracks merchants its customers interact with in order to provide customers information about their spending habits."
		   });
		addAnnotation
		  (getBank_Merchants(),
		   source,
		   new String[] {
			   "documentation", "Bank tracks merchants and points of sale used by customers. It also tracks token transactions. "
		   });
		addAnnotation
		  (getBank_Products(),
		   source,
		   new String[] {
			   "documentation", "Customer accounts belong to banking products which define their configuration such as fees and rates."
		   });
		addAnnotation
		  (getBank_Accounts(),
		   source,
		   new String[] {
			   "documentation", "The bank holds customer and own (internal) accounts."
		   });
		addAnnotation
		  (getBank_Customers(),
		   source,
		   new String[] {
			   "documentation", "Bank customers."
		   });
		addAnnotation
		  (getBank_Bankers(),
		   source,
		   new String[] {
			   "documentation", "Bank employees."
		   });
		addAnnotation
		  (getBank_Transactions(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (customerEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getCustomer_Accounts(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (accountEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getAccount_Statements(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getAccount_Owners(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (statementEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getStatement_Debits(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getStatement_Credits(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (transactionEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getTransaction_Debit(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getTransaction_Credit(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (productEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (merchantEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getMerchant_PointsOfSale(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (pointOfSaleEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (deviceEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getDevice_Tokens(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (mobilePhoneEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (cardEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (deviceTransactionEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getDeviceTransaction_Device(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getDeviceTransaction_Pointofsale(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (customerAccountEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getCustomerAccount_Devices(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getCustomerAccount_Product(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (internalAccountEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (bankerEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (bankerTransactionEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getBankerTransaction_Banker(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (tokenEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getToken_Merchant(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (tokenTransactionEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getTokenTransaction_Token(),
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
	}

} //BankPackageImpl
