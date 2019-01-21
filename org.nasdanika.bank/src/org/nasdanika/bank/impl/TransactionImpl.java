/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Statement;
import org.nasdanika.bank.Transaction;
import org.nasdanika.bank.TransactionInitiator;

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
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.TransactionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TransactionImpl<T extends TransactionInitiator> extends CDOObjectImpl implements Transaction<T> {
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
	@Override
	public Statement getDebit() {
		return (Statement)eGet(BankPackage.Literals.TRANSACTION__DEBIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebit(Statement newDebit) {
		eSet(BankPackage.Literals.TRANSACTION__DEBIT, newDebit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getCredit() {
		return (Statement)eGet(BankPackage.Literals.TRANSACTION__CREDIT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit(Statement newCredit) {
		eSet(BankPackage.Literals.TRANSACTION__CREDIT, newCredit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionInitiator getInitiator() {
		return (TransactionInitiator)eGet(BankPackage.Literals.TRANSACTION__INITIATOR, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiator(TransactionInitiator newInitiator) {
		eSet(BankPackage.Literals.TRANSACTION__INITIATOR, newInitiator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eGet(BankPackage.Literals.TRANSACTION__AMOUNT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eSet(BankPackage.Literals.TRANSACTION__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eGet(BankPackage.Literals.TRANSACTION__DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eSet(BankPackage.Literals.TRANSACTION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eGet(BankPackage.Literals.TRANSACTION__COMMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eSet(BankPackage.Literals.TRANSACTION__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eGet(BankPackage.Literals.TRANSACTION__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eSet(BankPackage.Literals.TRANSACTION__ID, newId);
	}

} //TransactionImpl
