/**
 */
package org.nasdanika.bank;

import java.math.BigDecimal;
import java.util.Date;
import org.eclipse.emf.cdo.CDOObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getInitiator <em>Initiator</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getDate <em>Date</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getComment <em>Comment</em>}</li>
 *   <li>{@link org.nasdanika.bank.Transaction#getId <em>Id</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getTransaction()
 * @model abstract="true"
 * @extends CDOObject
 * @generated
 */
public interface Transaction<T extends TransactionInitiator> extends CDOObject {
	/**
	 * Returns the value of the '<em><b>Debit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Statement#getDebits <em>Debits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Debit</em>' reference.
	 * @see #setDebit(Statement)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Debit()
	 * @see org.nasdanika.bank.Statement#getDebits
	 * @model opposite="debits" required="true"
	 * @generated
	 */
	Statement getDebit();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getDebit <em>Debit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debit</em>' reference.
	 * @see #getDebit()
	 * @generated
	 */
	void setDebit(Statement value);

	/**
	 * Returns the value of the '<em><b>Credit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.bank.Statement#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Credit</em>' reference.
	 * @see #setCredit(Statement)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Credit()
	 * @see org.nasdanika.bank.Statement#getCredits
	 * @model opposite="credits" required="true"
	 * @generated
	 */
	Statement getCredit();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getCredit <em>Credit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit</em>' reference.
	 * @see #getCredit()
	 * @generated
	 */
	void setCredit(Statement value);

	/**
	 * Returns the value of the '<em><b>Initiator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiator</em>' reference.
	 * @see #setInitiator(TransactionInitiator)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Initiator()
	 * @model
	 * @generated
	 */
	TransactionInitiator getInitiator();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getInitiator <em>Initiator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiator</em>' reference.
	 * @see #getInitiator()
	 * @generated
	 */
	void setInitiator(TransactionInitiator value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Amount
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(BigDecimal)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Amount()
	 * @model
	 * @generated
	 */
	BigDecimal getAmount();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Date
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Additional information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Comment()
	 * @model
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique transaction ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.bank.BankPackage#getTransaction_Id()
	 * @model id="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Transaction#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Transaction
