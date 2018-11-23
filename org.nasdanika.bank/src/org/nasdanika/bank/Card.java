/**
 */
package org.nasdanika.bank;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
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
 *   <li>{@link org.nasdanika.bank.Card#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getActivated <em>Activated</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getDeactivated <em>Deactivated</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getLockedTo <em>Locked To</em>}</li>
 *   <li>{@link org.nasdanika.bank.Card#getReplaces <em>Replaces</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.bank.BankPackage#getCard()
 * @model
 * @generated
 */
public interface Card extends Device {

	/**
	 * Returns the value of the '<em><b>Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If true, the card is virtual, i.e. doesn't have physical representation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Virtual</em>' attribute.
	 * @see #setVirtual(boolean)
	 * @see org.nasdanika.bank.BankPackage#getCard_Virtual()
	 * @model
	 * @generated
	 */
	boolean isVirtual();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#isVirtual <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Virtual</em>' attribute.
	 * @see #isVirtual()
	 * @generated
	 */
	void setVirtual(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unique ID.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.bank.BankPackage#getCard_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Issued</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Issue date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Issued</em>' attribute.
	 * @see #setIssued(Date)
	 * @see org.nasdanika.bank.BankPackage#getCard_Issued()
	 * @model
	 * @generated
	 */
	Date getIssued();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getIssued <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issued</em>' attribute.
	 * @see #getIssued()
	 * @generated
	 */
	void setIssued(Date value);

	/**
	 * Returns the value of the '<em><b>Activated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Activation date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Activated</em>' attribute.
	 * @see #setActivated(Date)
	 * @see org.nasdanika.bank.BankPackage#getCard_Activated()
	 * @model
	 * @generated
	 */
	Date getActivated();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getActivated <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activated</em>' attribute.
	 * @see #getActivated()
	 * @generated
	 */
	void setActivated(Date value);

	/**
	 * Returns the value of the '<em><b>Deactivated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Deactivation date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deactivated</em>' attribute.
	 * @see #setDeactivated(Date)
	 * @see org.nasdanika.bank.BankPackage#getCard_Deactivated()
	 * @model
	 * @generated
	 */
	Date getDeactivated();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getDeactivated <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deactivated</em>' attribute.
	 * @see #getDeactivated()
	 * @generated
	 */
	void setDeactivated(Date value);

	/**
	 * Returns the value of the '<em><b>Expires</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Expiration date.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Expires</em>' attribute.
	 * @see #setExpires(Date)
	 * @see org.nasdanika.bank.BankPackage#getCard_Expires()
	 * @model
	 * @generated
	 */
	Date getExpires();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getExpires <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expires</em>' attribute.
	 * @see #getExpires()
	 * @generated
	 */
	void setExpires(Date value);

	/**
	 * Returns the value of the '<em><b>Locked To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Party (payee) to which this device is locked to. E.g. a virtual card can be locked to a particular merchant.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Locked To</em>' reference.
	 * @see #setLockedTo(Merchant)
	 * @see org.nasdanika.bank.BankPackage#getCard_LockedTo()
	 * @model
	 * @generated
	 */
	Merchant getLockedTo();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getLockedTo <em>Locked To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Locked To</em>' reference.
	 * @see #getLockedTo()
	 * @generated
	 */
	void setLockedTo(Merchant value);

	/**
	 * Returns the value of the '<em><b>Replaces</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to a card which this one replaces, e.g. a new card replaces an old damaged/lost/stolen/expired card. Or a virtual card replaces a physical card (at a specific merchant).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Replaces</em>' reference.
	 * @see #setReplaces(Card)
	 * @see org.nasdanika.bank.BankPackage#getCard_Replaces()
	 * @model
	 * @generated
	 */
	Card getReplaces();

	/**
	 * Sets the value of the '{@link org.nasdanika.bank.Card#getReplaces <em>Replaces</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Replaces</em>' reference.
	 * @see #getReplaces()
	 * @generated
	 */
	void setReplaces(Card value);
} // Card
