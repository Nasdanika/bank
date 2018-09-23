/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
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
	public EList<Device> getDevices() {
		return (EList<Device>)eGet(BankPackage.Literals.CUSTOMER_ACCOUNT__DEVICES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Product getProduct() {
		return (Product)eGet(BankPackage.Literals.CUSTOMER_ACCOUNT__PRODUCT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProduct(Product newProduct) {
		eSet(BankPackage.Literals.CUSTOMER_ACCOUNT__PRODUCT, newProduct);
	}

} //CustomerAccountImpl
