/**
 */
package org.nasdanika.bank;

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Online Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.OnlineSession#getInternetAddress <em>Internet Address</em>}</li>
 *   <li>{@link org.nasdanika.bank.OnlineSession#getStart <em>Start</em>}</li>
 *   <li>{@link org.nasdanika.bank.OnlineSession#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getOnlineSession()
 * @model
 * @generated
 */
public interface OnlineSession extends TransactionInitiator {
	/**
	 * Returns the value of the '<em><b>Internet Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internet Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internet Address</em>' attribute.
	 * @see #setInternetAddress(String)
	 * @see org.nasdanika.bank.BankPackage#getOnlineSession_InternetAddress()
	 * @model required="true"
	 * @generated
	 */
	String getInternetAddress();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.OnlineSession#getInternetAddress <em>Internet Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Internet Address</em>' attribute.
	 * @see #getInternetAddress()
	 * @generated
	 */
	void setInternetAddress(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' attribute.
	 * @see #setStart(Date)
	 * @see org.nasdanika.bank.BankPackage#getOnlineSession_Start()
	 * @model
	 * @generated
	 */
	Date getStart();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.OnlineSession#getStart <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' attribute.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(Date value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' attribute.
	 * @see #setEnd(Date)
	 * @see org.nasdanika.bank.BankPackage#getOnlineSession_End()
	 * @model
	 * @generated
	 */
	Date getEnd();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.OnlineSession#getEnd <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' attribute.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(Date value);

} // OnlineSession
