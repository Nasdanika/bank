/**
 */
package org.nasdanika.bank.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import org.nasdanika.bank.util.BankAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BankItemProviderAdapterFactory extends BankAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.EMail} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EMailItemProvider eMailItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.EMail}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEMailAdapter() {
		if (eMailItemProvider == null) {
			eMailItemProvider = new EMailItemProvider(this);
		}

		return eMailItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Phone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PhoneItemProvider phoneItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Phone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPhoneAdapter() {
		if (phoneItemProvider == null) {
			phoneItemProvider = new PhoneItemProvider(this);
		}

		return phoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.PostalAddress} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostalAddressItemProvider postalAddressItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.PostalAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPostalAddressAdapter() {
		if (postalAddressItemProvider == null) {
			postalAddressItemProvider = new PostalAddressItemProvider(this);
		}

		return postalAddressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.WebAddress} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebAddressItemProvider webAddressItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.WebAddress}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWebAddressAdapter() {
		if (webAddressItemProvider == null) {
			webAddressItemProvider = new WebAddressItemProvider(this);
		}

		return webAddressItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Bank} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankItemProvider bankItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Bank}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBankAdapter() {
		if (bankItemProvider == null) {
			bankItemProvider = new BankItemProvider(this);
		}

		return bankItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Customer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerItemProvider customerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Customer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerAdapter() {
		if (customerItemProvider == null) {
			customerItemProvider = new CustomerItemProvider(this);
		}

		return customerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Statement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementItemProvider statementItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createStatementAdapter() {
		if (statementItemProvider == null) {
			statementItemProvider = new StatementItemProvider(this);
		}

		return statementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Product} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProductItemProvider productItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Product}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProductAdapter() {
		if (productItemProvider == null) {
			productItemProvider = new ProductItemProvider(this);
		}

		return productItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Merchant} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerchantItemProvider merchantItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Merchant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMerchantAdapter() {
		if (merchantItemProvider == null) {
			merchantItemProvider = new MerchantItemProvider(this);
		}

		return merchantItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.PointOfSale} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PointOfSaleItemProvider pointOfSaleItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.PointOfSale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPointOfSaleAdapter() {
		if (pointOfSaleItemProvider == null) {
			pointOfSaleItemProvider = new PointOfSaleItemProvider(this);
		}

		return pointOfSaleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Device} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceItemProvider deviceItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Device}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceAdapter() {
		if (deviceItemProvider == null) {
			deviceItemProvider = new DeviceItemProvider(this);
		}

		return deviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.MobilePhone} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilePhoneItemProvider mobilePhoneItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.MobilePhone}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMobilePhoneAdapter() {
		if (mobilePhoneItemProvider == null) {
			mobilePhoneItemProvider = new MobilePhoneItemProvider(this);
		}

		return mobilePhoneItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Card} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardItemProvider cardItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Card}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCardAdapter() {
		if (cardItemProvider == null) {
			cardItemProvider = new CardItemProvider(this);
		}

		return cardItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.DeviceTransaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTransactionItemProvider deviceTransactionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.DeviceTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceTransactionAdapter() {
		if (deviceTransactionItemProvider == null) {
			deviceTransactionItemProvider = new DeviceTransactionItemProvider(this);
		}

		return deviceTransactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.CustomerAccount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAccountItemProvider customerAccountItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.CustomerAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCustomerAccountAdapter() {
		if (customerAccountItemProvider == null) {
			customerAccountItemProvider = new CustomerAccountItemProvider(this);
		}

		return customerAccountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.InternalAccount} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InternalAccountItemProvider internalAccountItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.InternalAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInternalAccountAdapter() {
		if (internalAccountItemProvider == null) {
			internalAccountItemProvider = new InternalAccountItemProvider(this);
		}

		return internalAccountItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Banker} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankerItemProvider bankerItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Banker}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBankerAdapter() {
		if (bankerItemProvider == null) {
			bankerItemProvider = new BankerItemProvider(this);
		}

		return bankerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.BankerTransaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankerTransactionItemProvider bankerTransactionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.BankerTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBankerTransactionAdapter() {
		if (bankerTransactionItemProvider == null) {
			bankerTransactionItemProvider = new BankerTransactionItemProvider(this);
		}

		return bankerTransactionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.Token} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenItemProvider tokenItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenAdapter() {
		if (tokenItemProvider == null) {
			tokenItemProvider = new TokenItemProvider(this);
		}

		return tokenItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.nasdanika.bank.TokenTransaction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTransactionItemProvider tokenTransactionItemProvider;

	/**
	 * This creates an adapter for a {@link org.nasdanika.bank.TokenTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTokenTransactionAdapter() {
		if (tokenTransactionItemProvider == null) {
			tokenTransactionItemProvider = new TokenTransactionItemProvider(this);
		}

		return tokenTransactionItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (eMailItemProvider != null) eMailItemProvider.dispose();
		if (phoneItemProvider != null) phoneItemProvider.dispose();
		if (postalAddressItemProvider != null) postalAddressItemProvider.dispose();
		if (webAddressItemProvider != null) webAddressItemProvider.dispose();
		if (bankItemProvider != null) bankItemProvider.dispose();
		if (customerItemProvider != null) customerItemProvider.dispose();
		if (statementItemProvider != null) statementItemProvider.dispose();
		if (productItemProvider != null) productItemProvider.dispose();
		if (merchantItemProvider != null) merchantItemProvider.dispose();
		if (pointOfSaleItemProvider != null) pointOfSaleItemProvider.dispose();
		if (deviceItemProvider != null) deviceItemProvider.dispose();
		if (mobilePhoneItemProvider != null) mobilePhoneItemProvider.dispose();
		if (cardItemProvider != null) cardItemProvider.dispose();
		if (deviceTransactionItemProvider != null) deviceTransactionItemProvider.dispose();
		if (customerAccountItemProvider != null) customerAccountItemProvider.dispose();
		if (internalAccountItemProvider != null) internalAccountItemProvider.dispose();
		if (bankerItemProvider != null) bankerItemProvider.dispose();
		if (bankerTransactionItemProvider != null) bankerTransactionItemProvider.dispose();
		if (tokenItemProvider != null) tokenItemProvider.dispose();
		if (tokenTransactionItemProvider != null) tokenTransactionItemProvider.dispose();
	}

}
