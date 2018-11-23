/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.bank.Account;
import org.nasdanika.bank.Bank;
import org.nasdanika.bank.BankFactory;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Banker;
import org.nasdanika.bank.BankerTransaction;
import org.nasdanika.bank.Card;
import org.nasdanika.bank.ContactMethod;
import org.nasdanika.bank.Customer;
import org.nasdanika.bank.CustomerAccount;
import org.nasdanika.bank.Device;
import org.nasdanika.bank.DeviceTransaction;
import org.nasdanika.bank.EMail;
import org.nasdanika.bank.InternalAccount;
import org.nasdanika.bank.Merchant;
import org.nasdanika.bank.MobilePhone;
import org.nasdanika.bank.Party;
import org.nasdanika.bank.Phone;
import org.nasdanika.bank.PointOfSale;
import org.nasdanika.bank.PostalAddress;
import org.nasdanika.bank.Product;
import org.nasdanika.bank.Statement;
import org.nasdanika.bank.Token;
import org.nasdanika.bank.TokenTransaction;
import org.nasdanika.bank.Transaction;
import org.nasdanika.bank.TransactionInitiator;
import org.nasdanika.bank.WebAddress;

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
	private EClass partyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eMailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass postalAddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webAddressEClass = null;

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
	private EClass transactionInitiatorEClass = null;

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
	public EClass getParty() {
		return partyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParty_Name() {
		return (EAttribute)partyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParty_ContactMethods() {
		return (EReference)partyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactMethod() {
		return contactMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactMethod_Name() {
		return (EAttribute)contactMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactMethod_Description() {
		return (EAttribute)contactMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEMail() {
		return eMailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEMail_EMailAddress() {
		return (EAttribute)eMailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhone() {
		return phoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_CountryCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_AreaCode() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_PhoneNumber() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhone_Extension() {
		return (EAttribute)phoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPostalAddress() {
		return postalAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_Country() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_StateProvince() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_City() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_PostalCode() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_Line1() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPostalAddress_Line2() {
		return (EAttribute)postalAddressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWebAddress() {
		return webAddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWebAddress_Url() {
		return (EAttribute)webAddressEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAccount_Number() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Balance() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_Description() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccount_PeriodStart() {
		return (EAttribute)accountEClass.getEStructuralFeatures().get(4);
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
	public EAttribute getStatement_OpeningBalance() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_OpeningDate() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_ClosingBalance() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStatement_ClosingDate() {
		return (EAttribute)statementEClass.getEStructuralFeatures().get(5);
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
	public EReference getTransaction_Initiator() {
		return (EReference)transactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Amount() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Date() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Comment() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Id() {
		return (EAttribute)transactionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionInitiator() {
		return transactionInitiatorEClass;
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
	public EAttribute getPointOfSale_Id() {
		return (EAttribute)pointOfSaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPointOfSale_Location() {
		return (EReference)pointOfSaleEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getCard_Virtual() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Id() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Issued() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Activated() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Deactivated() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Expires() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_LockedTo() {
		return (EReference)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Replaces() {
		return (EReference)cardEClass.getEStructuralFeatures().get(7);
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
	public EReference getDeviceTransaction_PointOfSale() {
		return (EReference)deviceTransactionEClass.getEStructuralFeatures().get(0);
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
	public EReference getCustomerAccount_Owners() {
		return (EReference)customerAccountEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getToken_Value() {
		return (EAttribute)tokenEClass.getEStructuralFeatures().get(1);
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
		partyEClass = createEClass(PARTY);
		createEAttribute(partyEClass, PARTY__NAME);
		createEReference(partyEClass, PARTY__CONTACT_METHODS);

		contactMethodEClass = createEClass(CONTACT_METHOD);
		createEAttribute(contactMethodEClass, CONTACT_METHOD__NAME);
		createEAttribute(contactMethodEClass, CONTACT_METHOD__DESCRIPTION);

		eMailEClass = createEClass(EMAIL);
		createEAttribute(eMailEClass, EMAIL__EMAIL_ADDRESS);

		phoneEClass = createEClass(PHONE);
		createEAttribute(phoneEClass, PHONE__COUNTRY_CODE);
		createEAttribute(phoneEClass, PHONE__AREA_CODE);
		createEAttribute(phoneEClass, PHONE__PHONE_NUMBER);
		createEAttribute(phoneEClass, PHONE__EXTENSION);

		postalAddressEClass = createEClass(POSTAL_ADDRESS);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__COUNTRY);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__STATE_PROVINCE);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__CITY);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__POSTAL_CODE);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__LINE1);
		createEAttribute(postalAddressEClass, POSTAL_ADDRESS__LINE2);

		webAddressEClass = createEClass(WEB_ADDRESS);
		createEAttribute(webAddressEClass, WEB_ADDRESS__URL);

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
		createEAttribute(accountEClass, ACCOUNT__NUMBER);
		createEAttribute(accountEClass, ACCOUNT__BALANCE);
		createEAttribute(accountEClass, ACCOUNT__DESCRIPTION);
		createEAttribute(accountEClass, ACCOUNT__PERIOD_START);

		statementEClass = createEClass(STATEMENT);
		createEReference(statementEClass, STATEMENT__DEBITS);
		createEReference(statementEClass, STATEMENT__CREDITS);
		createEAttribute(statementEClass, STATEMENT__OPENING_BALANCE);
		createEAttribute(statementEClass, STATEMENT__OPENING_DATE);
		createEAttribute(statementEClass, STATEMENT__CLOSING_BALANCE);
		createEAttribute(statementEClass, STATEMENT__CLOSING_DATE);

		transactionEClass = createEClass(TRANSACTION);
		createEReference(transactionEClass, TRANSACTION__DEBIT);
		createEReference(transactionEClass, TRANSACTION__CREDIT);
		createEReference(transactionEClass, TRANSACTION__INITIATOR);
		createEAttribute(transactionEClass, TRANSACTION__AMOUNT);
		createEAttribute(transactionEClass, TRANSACTION__DATE);
		createEAttribute(transactionEClass, TRANSACTION__COMMENT);
		createEAttribute(transactionEClass, TRANSACTION__ID);

		transactionInitiatorEClass = createEClass(TRANSACTION_INITIATOR);

		productEClass = createEClass(PRODUCT);

		merchantEClass = createEClass(MERCHANT);
		createEReference(merchantEClass, MERCHANT__POINTS_OF_SALE);

		pointOfSaleEClass = createEClass(POINT_OF_SALE);
		createEAttribute(pointOfSaleEClass, POINT_OF_SALE__ID);
		createEReference(pointOfSaleEClass, POINT_OF_SALE__LOCATION);

		deviceEClass = createEClass(DEVICE);
		createEReference(deviceEClass, DEVICE__TOKENS);

		mobilePhoneEClass = createEClass(MOBILE_PHONE);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__VIRTUAL);
		createEAttribute(cardEClass, CARD__ID);
		createEAttribute(cardEClass, CARD__ISSUED);
		createEAttribute(cardEClass, CARD__ACTIVATED);
		createEAttribute(cardEClass, CARD__DEACTIVATED);
		createEAttribute(cardEClass, CARD__EXPIRES);
		createEReference(cardEClass, CARD__LOCKED_TO);
		createEReference(cardEClass, CARD__REPLACES);

		deviceTransactionEClass = createEClass(DEVICE_TRANSACTION);
		createEReference(deviceTransactionEClass, DEVICE_TRANSACTION__POINT_OF_SALE);

		customerAccountEClass = createEClass(CUSTOMER_ACCOUNT);
		createEReference(customerAccountEClass, CUSTOMER_ACCOUNT__DEVICES);
		createEReference(customerAccountEClass, CUSTOMER_ACCOUNT__PRODUCT);
		createEReference(customerAccountEClass, CUSTOMER_ACCOUNT__OWNERS);

		internalAccountEClass = createEClass(INTERNAL_ACCOUNT);

		bankerEClass = createEClass(BANKER);

		bankerTransactionEClass = createEClass(BANKER_TRANSACTION);

		tokenEClass = createEClass(TOKEN);
		createEReference(tokenEClass, TOKEN__MERCHANT);
		createEAttribute(tokenEClass, TOKEN__VALUE);

		tokenTransactionEClass = createEClass(TOKEN_TRANSACTION);
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
		ETypeParameter transactionEClass_T = addETypeParameter(transactionEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getTransactionInitiator());
		transactionEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		eMailEClass.getESuperTypes().add(this.getContactMethod());
		phoneEClass.getESuperTypes().add(this.getContactMethod());
		postalAddressEClass.getESuperTypes().add(this.getContactMethod());
		webAddressEClass.getESuperTypes().add(this.getContactMethod());
		bankEClass.getESuperTypes().add(this.getParty());
		customerEClass.getESuperTypes().add(this.getParty());
		merchantEClass.getESuperTypes().add(this.getParty());
		deviceEClass.getESuperTypes().add(this.getTransactionInitiator());
		mobilePhoneEClass.getESuperTypes().add(this.getDevice());
		cardEClass.getESuperTypes().add(this.getDevice());
		g1 = createEGenericType(this.getTransaction());
		EGenericType g2 = createEGenericType(this.getDevice());
		g1.getETypeArguments().add(g2);
		deviceTransactionEClass.getEGenericSuperTypes().add(g1);
		customerAccountEClass.getESuperTypes().add(this.getAccount());
		internalAccountEClass.getESuperTypes().add(this.getAccount());
		bankerEClass.getESuperTypes().add(this.getTransactionInitiator());
		g1 = createEGenericType(this.getTransaction());
		g2 = createEGenericType(this.getBanker());
		g1.getETypeArguments().add(g2);
		bankerTransactionEClass.getEGenericSuperTypes().add(g1);
		tokenEClass.getESuperTypes().add(this.getTransactionInitiator());
		g1 = createEGenericType(this.getTransaction());
		g2 = createEGenericType(this.getToken());
		g1.getETypeArguments().add(g2);
		tokenTransactionEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(partyEClass, Party.class, "Party", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParty_Name(), ecorePackage.getEString(), "name", null, 0, 1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParty_ContactMethods(), this.getContactMethod(), null, "contactMethods", null, 0, -1, Party.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactMethodEClass, ContactMethod.class, "ContactMethod", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ContactMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactMethod_Description(), ecorePackage.getEString(), "description", null, 0, 1, ContactMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eMailEClass, EMail.class, "EMail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEMail_EMailAddress(), ecorePackage.getEString(), "eMailAddress", null, 0, 1, EMail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phoneEClass, Phone.class, "Phone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhone_CountryCode(), ecorePackage.getEInt(), "countryCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_AreaCode(), ecorePackage.getEInt(), "areaCode", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_PhoneNumber(), ecorePackage.getEInt(), "phoneNumber", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPhone_Extension(), ecorePackage.getEInt(), "extension", null, 0, 1, Phone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(postalAddressEClass, PostalAddress.class, "PostalAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPostalAddress_Country(), ecorePackage.getEString(), "country", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_StateProvince(), ecorePackage.getEString(), "stateProvince", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_City(), ecorePackage.getEString(), "city", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_PostalCode(), ecorePackage.getEString(), "postalCode", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_Line1(), ecorePackage.getEString(), "line1", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPostalAddress_Line2(), ecorePackage.getEString(), "line2", null, 0, 1, PostalAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webAddressEClass, WebAddress.class, "WebAddress", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWebAddress_Url(), ecorePackage.getEString(), "url", null, 0, 1, WebAddress.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankEClass, Bank.class, "Bank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBank_Merchants(), this.getMerchant(), null, "merchants", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Products(), this.getProduct(), null, "products", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Accounts(), this.getAccount(), null, "accounts", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Customers(), this.getCustomer(), null, "customers", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBank_Bankers(), this.getBanker(), null, "bankers", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getTransaction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getBank_Transactions(), g1, null, "transactions", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomer_Accounts(), this.getCustomerAccount(), this.getCustomerAccount_Owners(), "accounts", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountEClass, Account.class, "Account", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccount_Statements(), this.getStatement(), null, "statements", null, 0, -1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Number(), ecorePackage.getEString(), "number", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Balance(), ecorePackage.getEBigDecimal(), "balance", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_Description(), ecorePackage.getEString(), "description", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccount_PeriodStart(), ecorePackage.getEInt(), "periodStart", null, 0, 1, Account.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getTransaction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getStatement_Debits(), g1, this.getTransaction_Debit(), "debits", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		g1 = createEGenericType(this.getTransaction());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getStatement_Credits(), g1, this.getTransaction_Credit(), "credits", null, 0, -1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_OpeningBalance(), ecorePackage.getEBigDecimal(), "openingBalance", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_OpeningDate(), ecorePackage.getEDate(), "openingDate", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_ClosingBalance(), ecorePackage.getEBigDecimal(), "closingBalance", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStatement_ClosingDate(), ecorePackage.getEDate(), "closingDate", null, 0, 1, Statement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionEClass, Transaction.class, "Transaction", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransaction_Debit(), this.getStatement(), this.getStatement_Debits(), "debit", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Credit(), this.getStatement(), this.getStatement_Credits(), "credit", null, 1, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransaction_Initiator(), this.getTransactionInitiator(), null, "initiator", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Amount(), ecorePackage.getEBigDecimal(), "amount", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransaction_Id(), ecorePackage.getEString(), "id", null, 0, 1, Transaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transactionInitiatorEClass, TransactionInitiator.class, "TransactionInitiator", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(productEClass, Product.class, "Product", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(merchantEClass, Merchant.class, "Merchant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMerchant_PointsOfSale(), this.getPointOfSale(), null, "pointsOfSale", null, 0, -1, Merchant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pointOfSaleEClass, PointOfSale.class, "PointOfSale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPointOfSale_Id(), ecorePackage.getEString(), "id", null, 0, 1, PointOfSale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPointOfSale_Location(), this.getPostalAddress(), null, "location", null, 0, 1, PointOfSale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceEClass, Device.class, "Device", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDevice_Tokens(), this.getToken(), null, "tokens", null, 0, -1, Device.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobilePhoneEClass, MobilePhone.class, "MobilePhone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Virtual(), ecorePackage.getEBoolean(), "virtual", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Id(), ecorePackage.getEString(), "id", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Issued(), ecorePackage.getEDate(), "issued", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Activated(), ecorePackage.getEDate(), "activated", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Deactivated(), ecorePackage.getEDate(), "deactivated", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Expires(), ecorePackage.getEDate(), "expires", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_LockedTo(), this.getMerchant(), null, "lockedTo", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Replaces(), this.getCard(), null, "replaces", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deviceTransactionEClass, DeviceTransaction.class, "DeviceTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeviceTransaction_PointOfSale(), this.getPointOfSale(), null, "pointOfSale", null, 0, 1, DeviceTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customerAccountEClass, CustomerAccount.class, "CustomerAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomerAccount_Devices(), this.getDevice(), null, "devices", null, 0, -1, CustomerAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerAccount_Product(), this.getProduct(), null, "product", null, 1, 1, CustomerAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCustomerAccount_Owners(), this.getCustomer(), this.getCustomer_Accounts(), "owners", null, 0, -1, CustomerAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalAccountEClass, InternalAccount.class, "InternalAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bankerEClass, Banker.class, "Banker", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bankerTransactionEClass, BankerTransaction.class, "BankerTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getToken_Merchant(), this.getMerchant(), null, "merchant", null, 1, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Value(), ecorePackage.getEString(), "value", null, 0, 1, Token.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenTransactionEClass, TokenTransaction.class, "TokenTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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
		  (getParty_ContactMethods(),
		   source,
		   new String[] {
			   "documentation", "Party can have zero or more contact methods."
		   });
		addAnnotation
		  (contactMethodEClass,
		   source,
		   new String[] {
			   "documentation", "Contact method interface."
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
			   "documentation", "Bank transactions"
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
		  (getAccount_Number(),
		   source,
		   new String[] {
			   "documentation", "Account number."
		   });
		addAnnotation
		  (getAccount_Balance(),
		   source,
		   new String[] {
			   "documentation", "Account balance, used by the prototype UI."
		   });
		addAnnotation
		  (getAccount_Description(),
		   source,
		   new String[] {
			   "documentation", "Account description, currently not used."
		   });
		addAnnotation
		  (getAccount_PeriodStart(),
		   source,
		   new String[] {
			   "documentation", "Billing period start, used by the prototype UI for generation of random data - will be removed once back-end connectivity is implemented."
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
		  (getStatement_OpeningBalance(),
		   source,
		   new String[] {
			   "documentation", "Opening balance, used by the prototype UI, not needed by the auto-updater component."
		   });
		addAnnotation
		  (getStatement_OpeningDate(),
		   source,
		   new String[] {
			   "documentation", "Opening date, used by the prototype UI, not needed by the auto-updater component."
		   });
		addAnnotation
		  (getStatement_ClosingBalance(),
		   source,
		   new String[] {
			   "documentation", "Closing balance, used by the prototype UI, not needed by the auto-updater component."
		   });
		addAnnotation
		  (getStatement_ClosingDate(),
		   source,
		   new String[] {
			   "documentation", "Closing date, used by the prototype UI, not needed by the auto-updater component."
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
		  (getTransaction_Amount(),
		   source,
		   new String[] {
			   "documentation", "Amount"
		   });
		addAnnotation
		  (getTransaction_Date(),
		   source,
		   new String[] {
			   "documentation", "Date"
		   });
		addAnnotation
		  (getTransaction_Comment(),
		   source,
		   new String[] {
			   "documentation", "Additional information"
		   });
		addAnnotation
		  (getTransaction_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique transaction ID."
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
			   "documentation", "Device is a generic term for a card and other means to initiate a transaction on an account."
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
		  (getCard_Virtual(),
		   source,
		   new String[] {
			   "documentation", "If true, the card is virtual, i.e. doesn\'t have physical representation."
		   });
		addAnnotation
		  (getCard_Id(),
		   source,
		   new String[] {
			   "documentation", "Unique ID."
		   });
		addAnnotation
		  (getCard_Issued(),
		   source,
		   new String[] {
			   "documentation", "Issue date."
		   });
		addAnnotation
		  (getCard_Activated(),
		   source,
		   new String[] {
			   "documentation", "Activation date."
		   });
		addAnnotation
		  (getCard_Deactivated(),
		   source,
		   new String[] {
			   "documentation", "Deactivation date."
		   });
		addAnnotation
		  (getCard_Expires(),
		   source,
		   new String[] {
			   "documentation", "Expiration date."
		   });
		addAnnotation
		  (getCard_LockedTo(),
		   source,
		   new String[] {
			   "documentation", "Party (payee) to which this device is locked to. E.g. a virtual card can be locked to a particular merchant."
		   });
		addAnnotation
		  (getCard_Replaces(),
		   source,
		   new String[] {
			   "documentation", "Reference to a card which this one replaces, e.g. a new card replaces an old damaged/lost/stolen/expired card. Or a virtual card replaces a physical card (at a specific merchant)."
		   });
		addAnnotation
		  (deviceTransactionEClass,
		   source,
		   new String[] {
			   "documentation", "TODO"
		   });
		addAnnotation
		  (getDeviceTransaction_PointOfSale(),
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
		  (getCustomerAccount_Owners(),
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
	}

} //BankPackageImpl
