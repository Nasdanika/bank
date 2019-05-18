/**
 */
package org.nasdanika.bank;

import java.math.BigDecimal;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Account#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.nasdanika.bank.Account#getNumber <em>Number</em>}</li>
 *   <li>{@link org.nasdanika.bank.Account#getBalance <em>Balance</em>}</li>
 *   <li>{@link org.nasdanika.bank.Account#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.bank.Account#getPeriodStart <em>Period Start</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getAccount()
 * @model abstract="true"
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.bank.Statement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Statements</em>' containment reference list.
	 * @see org.nasdanika.bank.BankPackage#getAccount_Statements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getStatements();

	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(String)
	 * @see org.nasdanika.bank.BankPackage#getAccount_Number()
	 * @model id="true"
	 * @generated
	 */
	String getNumber();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Account#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(String value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account balance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(BigDecimal)
	 * @see org.nasdanika.bank.BankPackage#getAccount_Balance()
	 * @model
	 * @generated
	 */
	BigDecimal getBalance();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Account#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Account description, currently not used.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.nasdanika.bank.BankPackage#getAccount_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Account#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Period Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Billing period start.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Period Start</em>' attribute.
	 * @see #setPeriodStart(int)
	 * @see org.nasdanika.bank.BankPackage#getAccount_PeriodStart()
	 * @model
	 * @generated
	 */
	int getPeriodStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Account#getPeriodStart <em>Period Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Period Start</em>' attribute.
	 * @see #getPeriodStart()
	 * @generated
	 */
	void setPeriodStart(int value);

} // Account
