/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.bank.Account;
import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.AccountImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.AccountImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.AccountImpl#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.AccountImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.AccountImpl#getPeriodStart <em>Period Start</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AccountImpl extends MinimalEObjectImpl.Container implements Account {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String NUMBER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getBalance() <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBalance()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BALANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getPeriodStart() <em>Period Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPeriodStart()
	 * @generated
	 * @ordered
	 */
	protected static final int PERIOD_START_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.ACCOUNT;
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
	public EList<Statement> getStatements() {
		return (EList<Statement>)eDynamicGet(BankPackage.ACCOUNT__STATEMENTS, BankPackage.Literals.ACCOUNT__STATEMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNumber() {
		return (String)eDynamicGet(BankPackage.ACCOUNT__NUMBER, BankPackage.Literals.ACCOUNT__NUMBER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumber(String newNumber) {
		eDynamicSet(BankPackage.ACCOUNT__NUMBER, BankPackage.Literals.ACCOUNT__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getBalance() {
		return (BigDecimal)eDynamicGet(BankPackage.ACCOUNT__BALANCE, BankPackage.Literals.ACCOUNT__BALANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBalance(BigDecimal newBalance) {
		eDynamicSet(BankPackage.ACCOUNT__BALANCE, BankPackage.Literals.ACCOUNT__BALANCE, newBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(BankPackage.ACCOUNT__DESCRIPTION, BankPackage.Literals.ACCOUNT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(BankPackage.ACCOUNT__DESCRIPTION, BankPackage.Literals.ACCOUNT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPeriodStart() {
		return (Integer)eDynamicGet(BankPackage.ACCOUNT__PERIOD_START, BankPackage.Literals.ACCOUNT__PERIOD_START, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPeriodStart(int newPeriodStart) {
		eDynamicSet(BankPackage.ACCOUNT__PERIOD_START, BankPackage.Literals.ACCOUNT__PERIOD_START, newPeriodStart);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BankPackage.ACCOUNT__STATEMENTS:
				return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
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
			case BankPackage.ACCOUNT__STATEMENTS:
				return getStatements();
			case BankPackage.ACCOUNT__NUMBER:
				return getNumber();
			case BankPackage.ACCOUNT__BALANCE:
				return getBalance();
			case BankPackage.ACCOUNT__DESCRIPTION:
				return getDescription();
			case BankPackage.ACCOUNT__PERIOD_START:
				return getPeriodStart();
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
			case BankPackage.ACCOUNT__STATEMENTS:
				getStatements().clear();
				getStatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BankPackage.ACCOUNT__NUMBER:
				setNumber((String)newValue);
				return;
			case BankPackage.ACCOUNT__BALANCE:
				setBalance((BigDecimal)newValue);
				return;
			case BankPackage.ACCOUNT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case BankPackage.ACCOUNT__PERIOD_START:
				setPeriodStart((Integer)newValue);
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
			case BankPackage.ACCOUNT__STATEMENTS:
				getStatements().clear();
				return;
			case BankPackage.ACCOUNT__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case BankPackage.ACCOUNT__BALANCE:
				setBalance(BALANCE_EDEFAULT);
				return;
			case BankPackage.ACCOUNT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case BankPackage.ACCOUNT__PERIOD_START:
				setPeriodStart(PERIOD_START_EDEFAULT);
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
			case BankPackage.ACCOUNT__STATEMENTS:
				return !getStatements().isEmpty();
			case BankPackage.ACCOUNT__NUMBER:
				return NUMBER_EDEFAULT == null ? getNumber() != null : !NUMBER_EDEFAULT.equals(getNumber());
			case BankPackage.ACCOUNT__BALANCE:
				return BALANCE_EDEFAULT == null ? getBalance() != null : !BALANCE_EDEFAULT.equals(getBalance());
			case BankPackage.ACCOUNT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case BankPackage.ACCOUNT__PERIOD_START:
				return getPeriodStart() != PERIOD_START_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String toString() {
		return super.toString() + " " + getNumber();
	}

} //AccountImpl
