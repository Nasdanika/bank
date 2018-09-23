/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Statement;
import org.nasdanika.bank.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getDebit <em>Debit</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getCredit <em>Credit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransactionImpl extends CDOObjectImpl implements Transaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getDebit() {
		return (Statement)eGet(BankPackage.Literals.TRANSACTION__DEBIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebit(Statement newDebit) {
		eSet(BankPackage.Literals.TRANSACTION__DEBIT, newDebit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement getCredit() {
		return (Statement)eGet(BankPackage.Literals.TRANSACTION__CREDIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredit(Statement newCredit) {
		eSet(BankPackage.Literals.TRANSACTION__CREDIT, newCredit);
	}

} //TransactionImpl
