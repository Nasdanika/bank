/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public abstract class AccountImpl extends CDOObjectImpl implements Account {
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
	public EList<Statement> getStatements() {
		return (EList<Statement>)eGet(BankPackage.Literals.ACCOUNT__STATEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNumber() {
		return (String)eGet(BankPackage.Literals.ACCOUNT__NUMBER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(String newNumber) {
		eSet(BankPackage.Literals.ACCOUNT__NUMBER, newNumber);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBalance() {
		return (BigDecimal)eGet(BankPackage.Literals.ACCOUNT__BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBalance(BigDecimal newBalance) {
		eSet(BankPackage.Literals.ACCOUNT__BALANCE, newBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(BankPackage.Literals.ACCOUNT__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(BankPackage.Literals.ACCOUNT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPeriodStart() {
		return (Integer)eGet(BankPackage.Literals.ACCOUNT__PERIOD_START, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeriodStart(int newPeriodStart) {
		eSet(BankPackage.Literals.ACCOUNT__PERIOD_START, newPeriodStart);
	}

} //AccountImpl
