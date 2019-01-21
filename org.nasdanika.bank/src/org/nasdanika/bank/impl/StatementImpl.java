/**
 */
package org.nasdanika.bank.impl;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

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
public class StatementImpl extends CDOObjectImpl implements Statement {
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
		return (EList<Transaction<?>>)eGet(BankPackage.Literals.STATEMENT__DEBITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Transaction<?>> getCredits() {
		return (EList<Transaction<?>>)eGet(BankPackage.Literals.STATEMENT__CREDITS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getOpeningBalance() {
		return (BigDecimal)eGet(BankPackage.Literals.STATEMENT__OPENING_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningBalance(BigDecimal newOpeningBalance) {
		eSet(BankPackage.Literals.STATEMENT__OPENING_BALANCE, newOpeningBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getOpeningDate() {
		return (Date)eGet(BankPackage.Literals.STATEMENT__OPENING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpeningDate(Date newOpeningDate) {
		eSet(BankPackage.Literals.STATEMENT__OPENING_DATE, newOpeningDate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getClosingBalance() {
		return (BigDecimal)eGet(BankPackage.Literals.STATEMENT__CLOSING_BALANCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingBalance(BigDecimal newClosingBalance) {
		eSet(BankPackage.Literals.STATEMENT__CLOSING_BALANCE, newClosingBalance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getClosingDate() {
		return (Date)eGet(BankPackage.Literals.STATEMENT__CLOSING_DATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClosingDate(Date newClosingDate) {
		eSet(BankPackage.Literals.STATEMENT__CLOSING_DATE, newClosingDate);
	}

} //StatementImpl
