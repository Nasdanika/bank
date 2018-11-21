/**
 */
package org.nasdanika.bank.provider;


import java.util.Collection;
import java.util.List;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.nasdanika.bank.Bank;
import org.nasdanika.bank.BankFactory;
import org.nasdanika.bank.BankPackage;

/**
 * This is the item provider adapter for a {@link org.nasdanika.bank.Bank} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BankItemProvider 
	extends CDOItemProviderAdapterEx
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(BankPackage.Literals.BANK__MERCHANTS);
			childrenFeatures.add(BankPackage.Literals.BANK__PRODUCTS);
			childrenFeatures.add(BankPackage.Literals.BANK__ACCOUNTS);
			childrenFeatures.add(BankPackage.Literals.BANK__CUSTOMERS);
			childrenFeatures.add(BankPackage.Literals.BANK__BANKERS);
			childrenFeatures.add(BankPackage.Literals.BANK__TRANSACTIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Bank.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Bank"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Bank_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Bank.class)) {
			case BankPackage.BANK__MERCHANTS:
			case BankPackage.BANK__PRODUCTS:
			case BankPackage.BANK__ACCOUNTS:
			case BankPackage.BANK__CUSTOMERS:
			case BankPackage.BANK__BANKERS:
			case BankPackage.BANK__TRANSACTIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__MERCHANTS,
				 BankFactory.eINSTANCE.createMerchant()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__PRODUCTS,
				 BankFactory.eINSTANCE.createProduct()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__ACCOUNTS,
				 BankFactory.eINSTANCE.createCustomerAccount()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__ACCOUNTS,
				 BankFactory.eINSTANCE.createInternalAccount()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__CUSTOMERS,
				 BankFactory.eINSTANCE.createCustomer()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__BANKERS,
				 BankFactory.eINSTANCE.createBanker()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__TRANSACTIONS,
				 BankFactory.eINSTANCE.createTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__TRANSACTIONS,
				 BankFactory.eINSTANCE.createDeviceTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__TRANSACTIONS,
				 BankFactory.eINSTANCE.createBankerTransaction()));

		newChildDescriptors.add
			(createChildParameter
				(BankPackage.Literals.BANK__TRANSACTIONS,
				 BankFactory.eINSTANCE.createTokenTransaction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return bankEditPlugin.INSTANCE;
	}

}
