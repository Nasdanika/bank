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
			case BankPackage.EMAIL: return createEMail();
			case BankPackage.PHONE: return createPhone();
			case BankPackage.POSTAL_ADDRESS: return createPostalAddress();
			case BankPackage.WEB_ADDRESS: return createWebAddress();
			case BankPackage.BANK: return createBank();
			case BankPackage.CUSTOMER: return createCustomer();
			case BankPackage.STATEMENT: return createStatement();
			case BankPackage.PRODUCT: return createProduct();
			case BankPackage.MERCHANT: return createMerchant();
			case BankPackage.POINT_OF_SALE: return createPointOfSale();
			case BankPackage.MOBILE_PHONE: return createMobilePhone();
			case BankPackage.CARD: return createCard();
			case BankPackage.DEVICE_TRANSACTION: return createDeviceTransaction();
			case BankPackage.CUSTOMER_ACCOUNT: return createCustomerAccount();
			case BankPackage.INTERNAL_ACCOUNT: return createInternalAccount();
			case BankPackage.BANKER: return createBanker();
			case BankPackage.BANKER_TRANSACTION: return createBankerTransaction();
			case BankPackage.TOKEN: return createToken();
			case BankPackage.TOKEN_TRANSACTION: return createTokenTransaction();
			case BankPackage.ONLINE_SESSION: return createOnlineSession();
			case BankPackage.ONLINE_TRANSACTION: return createOnlineTransaction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EMail createEMail() {
		EMailImpl eMail = new EMailImpl();
		return eMail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Phone createPhone() {
		PhoneImpl phone = new PhoneImpl();
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PostalAddress createPostalAddress() {
		PostalAddressImpl postalAddress = new PostalAddressImpl();
		return postalAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public WebAddress createWebAddress() {
		WebAddressImpl webAddress = new WebAddressImpl();
		return webAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bank createBank() {
		BankImpl bank = new BankImpl();
		return bank;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement createStatement() {
		StatementImpl statement = new StatementImpl();
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product createProduct() {
		ProductImpl product = new ProductImpl();
		return product;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merchant createMerchant() {
		MerchantImpl merchant = new MerchantImpl();
		return merchant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PointOfSale createPointOfSale() {
		PointOfSaleImpl pointOfSale = new PointOfSaleImpl();
		return pointOfSale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MobilePhone createMobilePhone() {
		MobilePhoneImpl mobilePhone = new MobilePhoneImpl();
		return mobilePhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeviceTransaction createDeviceTransaction() {
		DeviceTransactionImpl deviceTransaction = new DeviceTransactionImpl();
		return deviceTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CustomerAccount createCustomerAccount() {
		CustomerAccountImpl customerAccount = new CustomerAccountImpl();
		return customerAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public InternalAccount createInternalAccount() {
		InternalAccountImpl internalAccount = new InternalAccountImpl();
		return internalAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Banker createBanker() {
		BankerImpl banker = new BankerImpl();
		return banker;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankerTransaction createBankerTransaction() {
		BankerTransactionImpl bankerTransaction = new BankerTransactionImpl();
		return bankerTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Token createToken() {
		TokenImpl token = new TokenImpl();
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TokenTransaction createTokenTransaction() {
		TokenTransactionImpl tokenTransaction = new TokenTransactionImpl();
		return tokenTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineSession createOnlineSession() {
		OnlineSessionImpl onlineSession = new OnlineSessionImpl();
		return onlineSession;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OnlineTransaction createOnlineTransaction() {
		OnlineTransactionImpl onlineTransaction = new OnlineTransactionImpl();
		return onlineTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
