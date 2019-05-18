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
	 * The default value of the '{@link #isVirtual() <em>Virtual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVirtual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VIRTUAL_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getIssued() <em>Issued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssued()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getActivated() <em>Activated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivated()
	 * @generated
	 * @ordered
	 */
	protected static final Date ACTIVATED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getDeactivated() <em>Deactivated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeactivated()
	 * @generated
	 * @ordered
	 */
	protected static final Date DEACTIVATED_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getExpires() <em>Expires</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpires()
	 * @generated
	 * @ordered
	 */
	protected static final Date EXPIRES_EDEFAULT = null;

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
	@Override
	public boolean isVirtual() {
		return (Boolean)eDynamicGet(BankPackage.CARD__VIRTUAL, BankPackage.Literals.CARD__VIRTUAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVirtual(boolean newVirtual) {
		eDynamicSet(BankPackage.CARD__VIRTUAL, BankPackage.Literals.CARD__VIRTUAL, newVirtual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(BankPackage.CARD__ID, BankPackage.Literals.CARD__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(BankPackage.CARD__ID, BankPackage.Literals.CARD__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getIssued() {
		return (Date)eDynamicGet(BankPackage.CARD__ISSUED, BankPackage.Literals.CARD__ISSUED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIssued(Date newIssued) {
		eDynamicSet(BankPackage.CARD__ISSUED, BankPackage.Literals.CARD__ISSUED, newIssued);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getActivated() {
		return (Date)eDynamicGet(BankPackage.CARD__ACTIVATED, BankPackage.Literals.CARD__ACTIVATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivated(Date newActivated) {
		eDynamicSet(BankPackage.CARD__ACTIVATED, BankPackage.Literals.CARD__ACTIVATED, newActivated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeactivated() {
		return (Date)eDynamicGet(BankPackage.CARD__DEACTIVATED, BankPackage.Literals.CARD__DEACTIVATED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeactivated(Date newDeactivated) {
		eDynamicSet(BankPackage.CARD__DEACTIVATED, BankPackage.Literals.CARD__DEACTIVATED, newDeactivated);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getExpires() {
		return (Date)eDynamicGet(BankPackage.CARD__EXPIRES, BankPackage.Literals.CARD__EXPIRES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpires(Date newExpires) {
		eDynamicSet(BankPackage.CARD__EXPIRES, BankPackage.Literals.CARD__EXPIRES, newExpires);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merchant getLockedTo() {
		return (Merchant)eDynamicGet(BankPackage.CARD__LOCKED_TO, BankPackage.Literals.CARD__LOCKED_TO, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Merchant basicGetLockedTo() {
		return (Merchant)eDynamicGet(BankPackage.CARD__LOCKED_TO, BankPackage.Literals.CARD__LOCKED_TO, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLockedTo(Merchant newLockedTo) {
		eDynamicSet(BankPackage.CARD__LOCKED_TO, BankPackage.Literals.CARD__LOCKED_TO, newLockedTo);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Card getReplaces() {
		return (Card)eDynamicGet(BankPackage.CARD__REPLACES, BankPackage.Literals.CARD__REPLACES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card basicGetReplaces() {
		return (Card)eDynamicGet(BankPackage.CARD__REPLACES, BankPackage.Literals.CARD__REPLACES, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReplaces(Card newReplaces) {
		eDynamicSet(BankPackage.CARD__REPLACES, BankPackage.Literals.CARD__REPLACES, newReplaces);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BankPackage.CARD__VIRTUAL:
				return isVirtual();
			case BankPackage.CARD__ID:
				return getId();
			case BankPackage.CARD__ISSUED:
				return getIssued();
			case BankPackage.CARD__ACTIVATED:
				return getActivated();
			case BankPackage.CARD__DEACTIVATED:
				return getDeactivated();
			case BankPackage.CARD__EXPIRES:
				return getExpires();
			case BankPackage.CARD__LOCKED_TO:
				if (resolve) return getLockedTo();
				return basicGetLockedTo();
			case BankPackage.CARD__REPLACES:
				if (resolve) return getReplaces();
				return basicGetReplaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BankPackage.CARD__VIRTUAL:
				setVirtual((Boolean)newValue);
				return;
			case BankPackage.CARD__ID:
				setId((String)newValue);
				return;
			case BankPackage.CARD__ISSUED:
				setIssued((Date)newValue);
				return;
			case BankPackage.CARD__ACTIVATED:
				setActivated((Date)newValue);
				return;
			case BankPackage.CARD__DEACTIVATED:
				setDeactivated((Date)newValue);
				return;
			case BankPackage.CARD__EXPIRES:
				setExpires((Date)newValue);
				return;
			case BankPackage.CARD__LOCKED_TO:
				setLockedTo((Merchant)newValue);
				return;
			case BankPackage.CARD__REPLACES:
				setReplaces((Card)newValue);
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
			case BankPackage.CARD__VIRTUAL:
				setVirtual(VIRTUAL_EDEFAULT);
				return;
			case BankPackage.CARD__ID:
				setId(ID_EDEFAULT);
				return;
			case BankPackage.CARD__ISSUED:
				setIssued(ISSUED_EDEFAULT);
				return;
			case BankPackage.CARD__ACTIVATED:
				setActivated(ACTIVATED_EDEFAULT);
				return;
			case BankPackage.CARD__DEACTIVATED:
				setDeactivated(DEACTIVATED_EDEFAULT);
				return;
			case BankPackage.CARD__EXPIRES:
				setExpires(EXPIRES_EDEFAULT);
				return;
			case BankPackage.CARD__LOCKED_TO:
				setLockedTo((Merchant)null);
				return;
			case BankPackage.CARD__REPLACES:
				setReplaces((Card)null);
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
			case BankPackage.CARD__VIRTUAL:
				return isVirtual() != VIRTUAL_EDEFAULT;
			case BankPackage.CARD__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case BankPackage.CARD__ISSUED:
				return ISSUED_EDEFAULT == null ? getIssued() != null : !ISSUED_EDEFAULT.equals(getIssued());
			case BankPackage.CARD__ACTIVATED:
				return ACTIVATED_EDEFAULT == null ? getActivated() != null : !ACTIVATED_EDEFAULT.equals(getActivated());
			case BankPackage.CARD__DEACTIVATED:
				return DEACTIVATED_EDEFAULT == null ? getDeactivated() != null : !DEACTIVATED_EDEFAULT.equals(getDeactivated());
			case BankPackage.CARD__EXPIRES:
				return EXPIRES_EDEFAULT == null ? getExpires() != null : !EXPIRES_EDEFAULT.equals(getExpires());
			case BankPackage.CARD__LOCKED_TO:
				return basicGetLockedTo() != null;
			case BankPackage.CARD__REPLACES:
				return basicGetReplaces() != null;
		}
		return super.eIsSet(featureID);
	}

} //CardImpl
