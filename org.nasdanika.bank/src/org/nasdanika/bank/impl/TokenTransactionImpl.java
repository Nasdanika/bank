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
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.TokenTransactionImpl#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TokenTransactionImpl extends TransactionImpl implements TokenTransaction {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Token getToken() {
		return (Token)eGet(BankPackage.Literals.TOKEN_TRANSACTION__TOKEN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(Token newToken) {
		eSet(BankPackage.Literals.TOKEN_TRANSACTION__TOKEN, newToken);
	}

} //TokenTransactionImpl
