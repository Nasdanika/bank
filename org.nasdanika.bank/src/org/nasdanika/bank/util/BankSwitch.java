/**
 */
package org.nasdanika.bank.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.nasdanika.bank.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.nasdanika.bank.BankPackage
 * @generated
 */
public class BankSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BankPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankSwitch() {
		if (modelPackage == null) {
			modelPackage = BankPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case BankPackage.PARTY: {
				Party party = (Party)theEObject;
				T1 result = caseParty(party);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.CONTACT_METHOD: {
				ContactMethod contactMethod = (ContactMethod)theEObject;
				T1 result = caseContactMethod(contactMethod);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.EMAIL: {
				EMail eMail = (EMail)theEObject;
				T1 result = caseEMail(eMail);
				if (result == null) result = caseContactMethod(eMail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.PHONE: {
				Phone phone = (Phone)theEObject;
				T1 result = casePhone(phone);
				if (result == null) result = caseContactMethod(phone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.POSTAL_ADDRESS: {
				PostalAddress postalAddress = (PostalAddress)theEObject;
				T1 result = casePostalAddress(postalAddress);
				if (result == null) result = caseContactMethod(postalAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.WEB_ADDRESS: {
				WebAddress webAddress = (WebAddress)theEObject;
				T1 result = caseWebAddress(webAddress);
				if (result == null) result = caseContactMethod(webAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.BANK: {
				Bank bank = (Bank)theEObject;
				T1 result = caseBank(bank);
				if (result == null) result = caseParty(bank);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.CUSTOMER: {
				Customer customer = (Customer)theEObject;
				T1 result = caseCustomer(customer);
				if (result == null) result = caseParty(customer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.ACCOUNT: {
				Account account = (Account)theEObject;
				T1 result = caseAccount(account);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.STATEMENT: {
				Statement statement = (Statement)theEObject;
				T1 result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.TRANSACTION: {
				Transaction<?> transaction = (Transaction<?>)theEObject;
				T1 result = caseTransaction(transaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.TRANSACTION_INITIATOR: {
				TransactionInitiator transactionInitiator = (TransactionInitiator)theEObject;
				T1 result = caseTransactionInitiator(transactionInitiator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.PRODUCT: {
				Product product = (Product)theEObject;
				T1 result = caseProduct(product);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.MERCHANT: {
				Merchant merchant = (Merchant)theEObject;
				T1 result = caseMerchant(merchant);
				if (result == null) result = caseParty(merchant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.POINT_OF_SALE: {
				PointOfSale pointOfSale = (PointOfSale)theEObject;
				T1 result = casePointOfSale(pointOfSale);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.DEVICE: {
				Device device = (Device)theEObject;
				T1 result = caseDevice(device);
				if (result == null) result = caseTransactionInitiator(device);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.MOBILE_PHONE: {
				MobilePhone mobilePhone = (MobilePhone)theEObject;
				T1 result = caseMobilePhone(mobilePhone);
				if (result == null) result = caseDevice(mobilePhone);
				if (result == null) result = caseTransactionInitiator(mobilePhone);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.CARD: {
				Card card = (Card)theEObject;
				T1 result = caseCard(card);
				if (result == null) result = caseDevice(card);
				if (result == null) result = caseTransactionInitiator(card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.DEVICE_TRANSACTION: {
				DeviceTransaction deviceTransaction = (DeviceTransaction)theEObject;
				T1 result = caseDeviceTransaction(deviceTransaction);
				if (result == null) result = caseTransaction(deviceTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.CUSTOMER_ACCOUNT: {
				CustomerAccount customerAccount = (CustomerAccount)theEObject;
				T1 result = caseCustomerAccount(customerAccount);
				if (result == null) result = caseAccount(customerAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.INTERNAL_ACCOUNT: {
				InternalAccount internalAccount = (InternalAccount)theEObject;
				T1 result = caseInternalAccount(internalAccount);
				if (result == null) result = caseAccount(internalAccount);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.BANKER: {
				Banker banker = (Banker)theEObject;
				T1 result = caseBanker(banker);
				if (result == null) result = caseParty(banker);
				if (result == null) result = caseTransactionInitiator(banker);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.BANKER_TRANSACTION: {
				BankerTransaction bankerTransaction = (BankerTransaction)theEObject;
				T1 result = caseBankerTransaction(bankerTransaction);
				if (result == null) result = caseTransaction(bankerTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.TOKEN: {
				Token token = (Token)theEObject;
				T1 result = caseToken(token);
				if (result == null) result = caseTransactionInitiator(token);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.TOKEN_TRANSACTION: {
				TokenTransaction tokenTransaction = (TokenTransaction)theEObject;
				T1 result = caseTokenTransaction(tokenTransaction);
				if (result == null) result = caseTransaction(tokenTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.INTERNET_ADDRESS: {
				InternetAddress internetAddress = (InternetAddress)theEObject;
				T1 result = caseInternetAddress(internetAddress);
				if (result == null) result = caseTransactionInitiator(internetAddress);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case BankPackage.ONLINE_TRANSACTION: {
				OnlineTransaction onlineTransaction = (OnlineTransaction)theEObject;
				T1 result = caseOnlineTransaction(onlineTransaction);
				if (result == null) result = caseTransaction(onlineTransaction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Party</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Party</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParty(Party object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact Method</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact Method</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContactMethod(ContactMethod object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EMail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EMail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEMail(EMail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePhone(Phone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postal Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePostalAddress(PostalAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Web Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Web Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseWebAddress(WebAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bank</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBank(Bank object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomer(Customer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAccount(Account object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStatement(Statement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends TransactionInitiator> T1 caseTransaction(Transaction<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Initiator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Initiator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransactionInitiator(TransactionInitiator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Product</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseProduct(Product object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Merchant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Merchant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMerchant(Merchant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Point Of Sale</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePointOfSale(PointOfSale object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDevice(Device object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mobile Phone</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMobilePhone(MobilePhone object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCard(Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDeviceTransaction(DeviceTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Customer Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Customer Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCustomerAccount(CustomerAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internal Account</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internal Account</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInternalAccount(InternalAccount object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banker</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banker</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBanker(Banker object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Banker Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Banker Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBankerTransaction(BankerTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseToken(Token object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Token Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Token Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTokenTransaction(TokenTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Internet Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Internet Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseInternetAddress(InternetAddress object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Online Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Online Transaction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOnlineTransaction(OnlineTransaction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //BankSwitch
