/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
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
public abstract class TransactionImpl<T extends TransactionInitiator> extends MinimalEObjectImpl.Container implements Transaction<T> {
	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal AMOUNT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
		return (Statement)eDynamicGet(BankPackage.TRANSACTION__DEBIT, BankPackage.Literals.TRANSACTION__DEBIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetDebit() {
		return (Statement)eDynamicGet(BankPackage.TRANSACTION__DEBIT, BankPackage.Literals.TRANSACTION__DEBIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebit(Statement newDebit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newDebit, BankPackage.TRANSACTION__DEBIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebit(Statement newDebit) {
		eDynamicSet(BankPackage.TRANSACTION__DEBIT, BankPackage.Literals.TRANSACTION__DEBIT, newDebit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Statement getCredit() {
		return (Statement)eDynamicGet(BankPackage.TRANSACTION__CREDIT, BankPackage.Literals.TRANSACTION__CREDIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statement basicGetCredit() {
		return (Statement)eDynamicGet(BankPackage.TRANSACTION__CREDIT, BankPackage.Literals.TRANSACTION__CREDIT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCredit(Statement newCredit, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newCredit, BankPackage.TRANSACTION__CREDIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit(Statement newCredit) {
		eDynamicSet(BankPackage.TRANSACTION__CREDIT, BankPackage.Literals.TRANSACTION__CREDIT, newCredit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransactionInitiator getInitiator() {
		return (TransactionInitiator)eDynamicGet(BankPackage.TRANSACTION__INITIATOR, BankPackage.Literals.TRANSACTION__INITIATOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionInitiator basicGetInitiator() {
		return (TransactionInitiator)eDynamicGet(BankPackage.TRANSACTION__INITIATOR, BankPackage.Literals.TRANSACTION__INITIATOR, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInitiator(TransactionInitiator newInitiator) {
		eDynamicSet(BankPackage.TRANSACTION__INITIATOR, BankPackage.Literals.TRANSACTION__INITIATOR, newInitiator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getAmount() {
		return (BigDecimal)eDynamicGet(BankPackage.TRANSACTION__AMOUNT, BankPackage.Literals.TRANSACTION__AMOUNT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(BigDecimal newAmount) {
		eDynamicSet(BankPackage.TRANSACTION__AMOUNT, BankPackage.Literals.TRANSACTION__AMOUNT, newAmount);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDate() {
		return (Date)eDynamicGet(BankPackage.TRANSACTION__DATE, BankPackage.Literals.TRANSACTION__DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDate(Date newDate) {
		eDynamicSet(BankPackage.TRANSACTION__DATE, BankPackage.Literals.TRANSACTION__DATE, newDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getComment() {
		return (String)eDynamicGet(BankPackage.TRANSACTION__COMMENT, BankPackage.Literals.TRANSACTION__COMMENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setComment(String newComment) {
		eDynamicSet(BankPackage.TRANSACTION__COMMENT, BankPackage.Literals.TRANSACTION__COMMENT, newComment);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(BankPackage.TRANSACTION__ID, BankPackage.Literals.TRANSACTION__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(BankPackage.TRANSACTION__ID, BankPackage.Literals.TRANSACTION__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.TRANSACTION__DEBIT:
				Statement debit = basicGetDebit();
				if (debit != null)
					msgs = ((InternalEObject)debit).eInverseRemove(this, BankPackage.STATEMENT__DEBITS, Statement.class, msgs);
				return basicSetDebit((Statement)otherEnd, msgs);
			case BankPackage.TRANSACTION__CREDIT:
				Statement credit = basicGetCredit();
				if (credit != null)
					msgs = ((InternalEObject)credit).eInverseRemove(this, BankPackage.STATEMENT__CREDITS, Statement.class, msgs);
				return basicSetCredit((Statement)otherEnd, msgs);
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
			case BankPackage.TRANSACTION__DEBIT:
				return basicSetDebit(null, msgs);
			case BankPackage.TRANSACTION__CREDIT:
				return basicSetCredit(null, msgs);
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
			case BankPackage.TRANSACTION__DEBIT:
				if (resolve) return getDebit();
				return basicGetDebit();
			case BankPackage.TRANSACTION__CREDIT:
				if (resolve) return getCredit();
				return basicGetCredit();
			case BankPackage.TRANSACTION__INITIATOR:
				if (resolve) return getInitiator();
				return basicGetInitiator();
			case BankPackage.TRANSACTION__AMOUNT:
				return getAmount();
			case BankPackage.TRANSACTION__DATE:
				return getDate();
			case BankPackage.TRANSACTION__COMMENT:
				return getComment();
			case BankPackage.TRANSACTION__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.TRANSACTION__DEBIT:
				setDebit((Statement)newValue);
				return;
			case BankPackage.TRANSACTION__CREDIT:
				setCredit((Statement)newValue);
				return;
			case BankPackage.TRANSACTION__INITIATOR:
				setInitiator((TransactionInitiator)newValue);
				return;
			case BankPackage.TRANSACTION__AMOUNT:
				setAmount((BigDecimal)newValue);
				return;
			case BankPackage.TRANSACTION__DATE:
				setDate((Date)newValue);
				return;
			case BankPackage.TRANSACTION__COMMENT:
				setComment((String)newValue);
				return;
			case BankPackage.TRANSACTION__ID:
				setId((String)newValue);
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
			case BankPackage.TRANSACTION__DEBIT:
				setDebit((Statement)null);
				return;
			case BankPackage.TRANSACTION__CREDIT:
				setCredit((Statement)null);
				return;
			case BankPackage.TRANSACTION__INITIATOR:
				setInitiator((TransactionInitiator)null);
				return;
			case BankPackage.TRANSACTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case BankPackage.TRANSACTION__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case BankPackage.TRANSACTION__COMMENT:
				setComment(COMMENT_EDEFAULT);
				return;
			case BankPackage.TRANSACTION__ID:
				setId(ID_EDEFAULT);
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
			case BankPackage.TRANSACTION__DEBIT:
				return basicGetDebit() != null;
			case BankPackage.TRANSACTION__CREDIT:
				return basicGetCredit() != null;
			case BankPackage.TRANSACTION__INITIATOR:
				return basicGetInitiator() != null;
			case BankPackage.TRANSACTION__AMOUNT:
				return AMOUNT_EDEFAULT == null ? getAmount() != null : !AMOUNT_EDEFAULT.equals(getAmount());
			case BankPackage.TRANSACTION__DATE:
				return DATE_EDEFAULT == null ? getDate() != null : !DATE_EDEFAULT.equals(getDate());
			case BankPackage.TRANSACTION__COMMENT:
				return COMMENT_EDEFAULT == null ? getComment() != null : !COMMENT_EDEFAULT.equals(getComment());
			case BankPackage.TRANSACTION__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
		}
		return super.eIsSet(featureID);
	}

} //TransactionImpl
