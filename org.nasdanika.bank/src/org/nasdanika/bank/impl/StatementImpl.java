/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Statement;
import org.nasdanika.bank.Transaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getDebits <em>Debits</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getOpeningDate <em>Opening Date</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getClosingBalance <em>Closing Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.StatementImpl#getClosingDate <em>Closing Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StatementImpl extends MinimalEObjectImpl.Container implements Statement {
	/**
	 * The default value of the '{@link #getOpeningBalance() <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal OPENING_BALANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOpeningDate() <em>Opening Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpeningDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date OPENING_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getClosingBalance() <em>Closing Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal CLOSING_BALANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getClosingDate() <em>Closing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClosingDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date CLOSING_DATE_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.STATEMENT;
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transaction<?>> getDebits() {
		return (EList<Transaction<?>>)eDynamicGet(BankPackage.STATEMENT__DEBITS, BankPackage.Literals.STATEMENT__DEBITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transaction<?>> getCredits() {
		return (EList<Transaction<?>>)eDynamicGet(BankPackage.STATEMENT__CREDITS, BankPackage.Literals.STATEMENT__CREDITS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOpeningBalance() {
		return (BigDecimal)eDynamicGet(BankPackage.STATEMENT__OPENING_BALANCE, BankPackage.Literals.STATEMENT__OPENING_BALANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningBalance(BigDecimal newOpeningBalance) {
		eDynamicSet(BankPackage.STATEMENT__OPENING_BALANCE, BankPackage.Literals.STATEMENT__OPENING_BALANCE, newOpeningBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpeningDate() {
		return (Date)eDynamicGet(BankPackage.STATEMENT__OPENING_DATE, BankPackage.Literals.STATEMENT__OPENING_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningDate(Date newOpeningDate) {
		eDynamicSet(BankPackage.STATEMENT__OPENING_DATE, BankPackage.Literals.STATEMENT__OPENING_DATE, newOpeningDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getClosingBalance() {
		return (BigDecimal)eDynamicGet(BankPackage.STATEMENT__CLOSING_BALANCE, BankPackage.Literals.STATEMENT__CLOSING_BALANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingBalance(BigDecimal newClosingBalance) {
		eDynamicSet(BankPackage.STATEMENT__CLOSING_BALANCE, BankPackage.Literals.STATEMENT__CLOSING_BALANCE, newClosingBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosingDate() {
		return (Date)eDynamicGet(BankPackage.STATEMENT__CLOSING_DATE, BankPackage.Literals.STATEMENT__CLOSING_DATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingDate(Date newClosingDate) {
		eDynamicSet(BankPackage.STATEMENT__CLOSING_DATE, BankPackage.Literals.STATEMENT__CLOSING_DATE, newClosingDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.STATEMENT__DEBITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDebits()).basicAdd(otherEnd, msgs);
			case BankPackage.STATEMENT__CREDITS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getCredits()).basicAdd(otherEnd, msgs);
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
			case BankPackage.STATEMENT__DEBITS:
				return ((InternalEList<?>)getDebits()).basicRemove(otherEnd, msgs);
			case BankPackage.STATEMENT__CREDITS:
				return ((InternalEList<?>)getCredits()).basicRemove(otherEnd, msgs);
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
			case BankPackage.STATEMENT__DEBITS:
				return getDebits();
			case BankPackage.STATEMENT__CREDITS:
				return getCredits();
			case BankPackage.STATEMENT__OPENING_BALANCE:
				return getOpeningBalance();
			case BankPackage.STATEMENT__OPENING_DATE:
				return getOpeningDate();
			case BankPackage.STATEMENT__CLOSING_BALANCE:
				return getClosingBalance();
			case BankPackage.STATEMENT__CLOSING_DATE:
				return getClosingDate();
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
			case BankPackage.STATEMENT__DEBITS:
				getDebits().clear();
				getDebits().addAll((Collection<? extends Transaction<?>>)newValue);
				return;
			case BankPackage.STATEMENT__CREDITS:
				getCredits().clear();
				getCredits().addAll((Collection<? extends Transaction<?>>)newValue);
				return;
			case BankPackage.STATEMENT__OPENING_BALANCE:
				setOpeningBalance((BigDecimal)newValue);
				return;
			case BankPackage.STATEMENT__OPENING_DATE:
				setOpeningDate((Date)newValue);
				return;
			case BankPackage.STATEMENT__CLOSING_BALANCE:
				setClosingBalance((BigDecimal)newValue);
				return;
			case BankPackage.STATEMENT__CLOSING_DATE:
				setClosingDate((Date)newValue);
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
			case BankPackage.STATEMENT__DEBITS:
				getDebits().clear();
				return;
			case BankPackage.STATEMENT__CREDITS:
				getCredits().clear();
				return;
			case BankPackage.STATEMENT__OPENING_BALANCE:
				setOpeningBalance(OPENING_BALANCE_EDEFAULT);
				return;
			case BankPackage.STATEMENT__OPENING_DATE:
				setOpeningDate(OPENING_DATE_EDEFAULT);
				return;
			case BankPackage.STATEMENT__CLOSING_BALANCE:
				setClosingBalance(CLOSING_BALANCE_EDEFAULT);
				return;
			case BankPackage.STATEMENT__CLOSING_DATE:
				setClosingDate(CLOSING_DATE_EDEFAULT);
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
			case BankPackage.STATEMENT__DEBITS:
				return !getDebits().isEmpty();
			case BankPackage.STATEMENT__CREDITS:
				return !getCredits().isEmpty();
			case BankPackage.STATEMENT__OPENING_BALANCE:
				return OPENING_BALANCE_EDEFAULT == null ? getOpeningBalance() != null : !OPENING_BALANCE_EDEFAULT.equals(getOpeningBalance());
			case BankPackage.STATEMENT__OPENING_DATE:
				return OPENING_DATE_EDEFAULT == null ? getOpeningDate() != null : !OPENING_DATE_EDEFAULT.equals(getOpeningDate());
			case BankPackage.STATEMENT__CLOSING_BALANCE:
				return CLOSING_BALANCE_EDEFAULT == null ? getClosingBalance() != null : !CLOSING_BALANCE_EDEFAULT.equals(getClosingBalance());
			case BankPackage.STATEMENT__CLOSING_DATE:
				return CLOSING_DATE_EDEFAULT == null ? getClosingDate() != null : !CLOSING_DATE_EDEFAULT.equals(getClosingDate());
		}
		return super.eIsSet(featureID);
	}

} //StatementImpl
