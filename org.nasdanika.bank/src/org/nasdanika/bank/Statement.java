/**
 */
package org.nasdanika.bank;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Statement</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Statement#getDebits <em>Debits</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getCredits <em>Credits</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getOpeningBalance <em>Opening Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getOpeningDate <em>Opening Date</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getClosingBalance <em>Closing Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.Statement#getClosingDate <em>Closing Date</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getStatement()
 * @model
 * @generated
 */
public interface Statement extends EObject {
	/**
	 * Returns the value of the '<em><b>Debits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Transaction}<code>&lt;?&gt;</code>.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debits</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getStatement_Debits()
	 * @see org.nasdanika.bank.Transaction#getDebit
	 * @model opposite="debit"
	 * @generated
	 */
	EList<Transaction<?>> getDebits();

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Transaction}<code>&lt;?&gt;</code>.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credits</em>' reference list.
	 * @see org.nasdanika.bank.BankPackage#getStatement_Credits()
	 * @see org.nasdanika.bank.Transaction#getCredit
	 * @model opposite="credit"
	 * @generated
	 */
	EList<Transaction<?>> getCredits();

	/**
	 * Returns the value of the '<em><b>Opening Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening balance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opening Balance</em>' attribute.
	 * @see #setOpeningBalance(BigDecimal)
	 * @see org.nasdanika.bank.BankPackage#getStatement_OpeningBalance()
	 * @model
	 * @generated
	 */
	BigDecimal getOpeningBalance();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Statement#getOpeningBalance <em>Opening Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Balance</em>' attribute.
	 * @see #getOpeningBalance()
	 * @generated
	 */
	void setOpeningBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Opening Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Opening date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Opening Date</em>' attribute.
	 * @see #setOpeningDate(Date)
	 * @see org.nasdanika.bank.BankPackage#getStatement_OpeningDate()
	 * @model
	 * @generated
	 */
	Date getOpeningDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Statement#getOpeningDate <em>Opening Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opening Date</em>' attribute.
	 * @see #getOpeningDate()
	 * @generated
	 */
	void setOpeningDate(Date value);

	/**
	 * Returns the value of the '<em><b>Closing Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closing balance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Closing Balance</em>' attribute.
	 * @see #setClosingBalance(BigDecimal)
	 * @see org.nasdanika.bank.BankPackage#getStatement_ClosingBalance()
	 * @model
	 * @generated
	 */
	BigDecimal getClosingBalance();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Statement#getClosingBalance <em>Closing Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Balance</em>' attribute.
	 * @see #getClosingBalance()
	 * @generated
	 */
	void setClosingBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Closing Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Closing date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Closing Date</em>' attribute.
	 * @see #setClosingDate(Date)
	 * @see org.nasdanika.bank.BankPackage#getStatement_ClosingDate()
	 * @model
	 * @generated
	 */
	Date getClosingDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Statement#getClosingDate <em>Closing Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closing Date</em>' attribute.
	 * @see #getClosingDate()
	 * @generated
	 */
	void setClosingDate(Date value);

} // Statement
