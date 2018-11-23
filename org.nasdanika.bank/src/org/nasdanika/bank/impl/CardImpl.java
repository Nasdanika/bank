/**
 */
package org.nasdanika.bank.impl;

import java.util.Date;
import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Card;
import org.nasdanika.bank.Merchant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#isVirtual <em>Virtual</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getIssued <em>Issued</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getActivated <em>Activated</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getDeactivated <em>Deactivated</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getExpires <em>Expires</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getLockedTo <em>Locked To</em>}</li>
 *   <li>{@link org.nasdanika.bank.impl.CardImpl#getReplaces <em>Replaces</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CardImpl extends DeviceImpl implements Card {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVirtual() {
		return (Boolean)eGet(BankPackage.Literals.CARD__VIRTUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtual(boolean newVirtual) {
		eSet(BankPackage.Literals.CARD__VIRTUAL, newVirtual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return (String)eGet(BankPackage.Literals.CARD__ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		eSet(BankPackage.Literals.CARD__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssued() {
		return (Date)eGet(BankPackage.Literals.CARD__ISSUED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssued(Date newIssued) {
		eSet(BankPackage.Literals.CARD__ISSUED, newIssued);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getActivated() {
		return (Date)eGet(BankPackage.Literals.CARD__ACTIVATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActivated(Date newActivated) {
		eSet(BankPackage.Literals.CARD__ACTIVATED, newActivated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeactivated() {
		return (Date)eGet(BankPackage.Literals.CARD__DEACTIVATED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeactivated(Date newDeactivated) {
		eSet(BankPackage.Literals.CARD__DEACTIVATED, newDeactivated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getExpires() {
		return (Date)eGet(BankPackage.Literals.CARD__EXPIRES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpires(Date newExpires) {
		eSet(BankPackage.Literals.CARD__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merchant getLockedTo() {
		return (Merchant)eGet(BankPackage.Literals.CARD__LOCKED_TO, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLockedTo(Merchant newLockedTo) {
		eSet(BankPackage.Literals.CARD__LOCKED_TO, newLockedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card getReplaces() {
		return (Card)eGet(BankPackage.Literals.CARD__REPLACES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaces(Card newReplaces) {
		eSet(BankPackage.Literals.CARD__REPLACES, newReplaces);
	}

} //CardImpl
