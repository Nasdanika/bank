/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Merchant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * TODO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.Merchant#getPointsOfSale <em>Points Of Sale</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getMerchant()
 * @model
 * @generated
 */
public interface Merchant extends Party {
	/**
	 * Returns the value of the '<em><b>Points Of Sale</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.PointOfSale}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Points Of Sale</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getMerchant_PointsOfSale()
	 * @model containment="true"
	 * @generated
	 */
	EList<PointOfSale> getPointsOfSale();

} // Merchant
