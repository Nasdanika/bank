/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
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
		return (EList<PointOfSale>)eGet(BankPackage.Literals.MERCHANT__POINTS_OF_SALE, true);
	}

} //MerchantImpl
