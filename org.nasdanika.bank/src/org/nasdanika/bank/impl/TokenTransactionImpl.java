/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Token;
import org.nasdanika.bank.TokenTransaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Token Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TokenTransactionImpl extends TransactionImpl<Token> implements TokenTransaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TokenTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.TOKEN_TRANSACTION;
	}

} //TokenTransactionImpl
