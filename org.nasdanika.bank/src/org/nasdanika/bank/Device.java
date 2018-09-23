/**
 */
package org.nasdanika.bank;

import org.eclipse.emf.cdo.CDOObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Device#getTokens <em>Tokens</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getDevice()
 * @model
 * @extends CDOObject
 * @generated
 */
public interface Device extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Token}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tokens</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getDevice_Tokens()
	 * @model containment="true"
	 * @generated
	 */
	EList<Token> getTokens();

} // Device
