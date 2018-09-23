/**
 */
package org.nasdanika.bank.impl;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.bank.BankPackage;
import org.nasdanika.bank.Banker;
import org.nasdanika.bank.BankerTransaction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Banker Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.bank.impl.BankerTransactionImpl#getBanker <em>Banker</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankerTransactionImpl extends TransactionImpl implements BankerTransaction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankerTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BankPackage.Literals.BANKER_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Banker getBanker() {
		return (Banker)eGet(BankPackage.Literals.BANKER_TRANSACTION__BANKER, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBanker(Banker newBanker) {
		eSet(BankPackage.Literals.BANKER_TRANSACTION__BANKER, newBanker);
	}

} //BankerTransactionImpl
