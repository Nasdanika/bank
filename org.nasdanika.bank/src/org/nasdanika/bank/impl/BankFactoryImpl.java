/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.nasdanika.bank.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankFactoryImpl extends EFactoryImpl implements BankFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BankFactory init() {
		try {
			BankFactory theBankFactory = (BankFactory)EPackage.Registry.INSTANCE.getEFactory(BankPackage.eNS_URI);
			if (theBankFactory != null) {
				return theBankFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BankFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BankPackage.EMAIL: return (EObject)createEMail();
			case BankPackage.PHONE: return (EObject)createPhone();
			case BankPackage.POSTAL_ADDRESS: return (EObject)createPostalAddress();
			case BankPackage.WEB_ADDRESS: return (EObject)createWebAddress();
			case BankPackage.BANK: return (EObject)createBank();
			case BankPackage.CUSTOMER: return (EObject)createCustomer();
			case BankPackage.STATEMENT: return (EObject)createStatement();
			case BankPackage.PRODUCT: return (EObject)createProduct();
			case BankPackage.MERCHANT: return (EObject)createMerchant();
			case BankPackage.POINT_OF_SALE: return (EObject)createPointOfSale();
			case BankPackage.MOBILE_PHONE: return (EObject)createMobilePhone();
			case BankPackage.CARD: return (EObject)createCard();
			case BankPackage.DEVICE_TRANSACTION: return (EObject)createDeviceTransaction();
			case BankPackage.CUSTOMER_ACCOUNT: return (EObject)createCustomerAccount();
			case BankPackage.INTERNAL_ACCOUNT: return (EObject)createInternalAccount();
			case BankPackage.BANKER: return (EObject)createBanker();
			case BankPackage.BANKER_TRANSACTION: return (EObject)createBankerTransaction();
			case BankPackage.TOKEN: return (EObject)createToken();
			case BankPackage.TOKEN_TRANSACTION: return (EObject)createTokenTransaction();
			case BankPackage.INTERNET_ADDRESS: return (EObject)createInternetAddress();
			case BankPackage.ONLINE_TRANSACTION: return (EObject)createOnlineTransaction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMail createEMail() {
		EMailImpl eMail = new EMailImpl();
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PostalAddress createPostalAddress() {
		PostalAddressImpl postalAddress = new PostalAddressImpl();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebAddress createWebAddress() {
		WebAddressImpl webAddress = new WebAddressImpl();
		return webAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bank createBank() {
		BankImpl bank = new BankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merchant createMerchant() {
		MerchantImpl merchant = new MerchantImpl();
		return merchant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PointOfSale createPointOfSale() {
		PointOfSaleImpl pointOfSale = new PointOfSaleImpl();
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePhone createMobilePhone() {
		MobilePhoneImpl mobilePhone = new MobilePhoneImpl();
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceTransaction createDeviceTransaction() {
		DeviceTransactionImpl deviceTransaction = new DeviceTransactionImpl();
		return deviceTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerAccount createCustomerAccount() {
		CustomerAccountImpl customerAccount = new CustomerAccountImpl();
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalAccount createInternalAccount() {
		InternalAccountImpl internalAccount = new InternalAccountImpl();
		return internalAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Banker createBanker() {
		BankerImpl banker = new BankerImpl();
		return banker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankerTransaction createBankerTransaction() {
		BankerTransactionImpl bankerTransaction = new BankerTransactionImpl();
		return bankerTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TokenTransaction createTokenTransaction() {
		TokenTransactionImpl tokenTransaction = new TokenTransactionImpl();
		return tokenTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternetAddress createInternetAddress() {
		InternetAddressImpl internetAddress = new InternetAddressImpl();
		return internetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnlineTransaction createOnlineTransaction() {
		OnlineTransactionImpl onlineTransaction = new OnlineTransactionImpl();
		return onlineTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankPackage getBankPackage() {
		return (BankPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BankPackage getPackage() {
		return BankPackage.eINSTANCE;
	}

} //BankFactoryImpl
