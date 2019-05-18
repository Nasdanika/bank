/**
 */
package org.nasdanika.bank.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Customer;
import org.nasdanika.bank.CustomerAccount;
import org.nasdanika.bank.Device;
import org.nasdanika.bank.Product;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.CustomerAccountImpl#getDevices <em>Devices</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CustomerAccountImpl#getProduct <em>Product</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CustomerAccountImpl#getOwners <em>Owners</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomerAccountImpl extends AccountImpl implements CustomerAccount {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomerAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.CUSTOMER_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Device> getDevices() {
		return (EList<Device>)eDynamicGet(BankPackage.CUSTOMER_ACCOUNT__DEVICES, BankPackage.Literals.CUSTOMER_ACCOUNT__DEVICES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Product getProduct() {
		return (Product)eDynamicGet(BankPackage.CUSTOMER_ACCOUNT__PRODUCT, BankPackage.Literals.CUSTOMER_ACCOUNT__PRODUCT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product basicGetProduct() {
		return (Product)eDynamicGet(BankPackage.CUSTOMER_ACCOUNT__PRODUCT, BankPackage.Literals.CUSTOMER_ACCOUNT__PRODUCT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProduct(Product newProduct) {
		eDynamicSet(BankPackage.CUSTOMER_ACCOUNT__PRODUCT, BankPackage.Literals.CUSTOMER_ACCOUNT__PRODUCT, newProduct);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Customer> getOwners() {
		return (EList<Customer>)eDynamicGet(BankPackage.CUSTOMER_ACCOUNT__OWNERS, BankPackage.Literals.CUSTOMER_ACCOUNT__OWNERS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwners()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__DEVICES:
				return ((InternalEList<?>)getDevices()).basicRemove(otherEnd, msgs);
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				return ((InternalEList<?>)getOwners()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__DEVICES:
				return getDevices();
			case BankPackage.CUSTOMER_ACCOUNT__PRODUCT:
				if (resolve) return getProduct();
				return basicGetProduct();
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				return getOwners();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__DEVICES:
				getDevices().clear();
				getDevices().addAll((Collection<? extends Device>)newValue);
				return;
			case BankPackage.CUSTOMER_ACCOUNT__PRODUCT:
				setProduct((Product)newValue);
				return;
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				getOwners().clear();
				getOwners().addAll((Collection<? extends Customer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__DEVICES:
				getDevices().clear();
				return;
			case BankPackage.CUSTOMER_ACCOUNT__PRODUCT:
				setProduct((Product)null);
				return;
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				getOwners().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BankPackage.CUSTOMER_ACCOUNT__DEVICES:
				return !getDevices().isEmpty();
			case BankPackage.CUSTOMER_ACCOUNT__PRODUCT:
				return basicGetProduct() != null;
			case BankPackage.CUSTOMER_ACCOUNT__OWNERS:
				return !getOwners().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomerAccountImpl
