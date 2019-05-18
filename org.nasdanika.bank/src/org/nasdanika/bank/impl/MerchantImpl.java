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
import org.nasdanika.bank.Merchant;
import org.nasdanika.bank.PointOfSale;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merchant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.MerchantImpl#getPointsOfSale <em>Points Of Sale</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MerchantImpl extends PartyImpl implements Merchant {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MerchantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.MERCHANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PointOfSale> getPointsOfSale() {
		return (EList<PointOfSale>)eDynamicGet(BankPackage.MERCHANT__POINTS_OF_SALE, BankPackage.Literals.MERCHANT__POINTS_OF_SALE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.MERCHANT__POINTS_OF_SALE:
				return ((InternalEList<?>)getPointsOfSale()).basicRemove(otherEnd, msgs);
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
			case BankPackage.MERCHANT__POINTS_OF_SALE:
				return getPointsOfSale();
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
			case BankPackage.MERCHANT__POINTS_OF_SALE:
				getPointsOfSale().clear();
				getPointsOfSale().addAll((Collection<? extends PointOfSale>)newValue);
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
			case BankPackage.MERCHANT__POINTS_OF_SALE:
				getPointsOfSale().clear();
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
			case BankPackage.MERCHANT__POINTS_OF_SALE:
				return !getPointsOfSale().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MerchantImpl
