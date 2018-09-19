package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the bp_user_wallet database table.
 * 
 */
@Entity
@Table(name="bp_user_wallet")
@NamedQuery(name="BpUserWallet.findAll", query="SELECT b FROM BpUserWallet b")
public class BpUserWallet implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_wallet_id")
	private int userWalletId;

	@Column(name="user_balance")
	private float userBalance;

	//bi-directional many-to-one association to BpUserCurrency
	@ManyToOne
	@JoinColumn(name="user_currency_id")
	private BpUserCurrency bpUserCurrency;

	public BpUserWallet() {
	}

	public int getUserWalletId() {
		return this.userWalletId;
	}

	public void setUserWalletId(int userWalletId) {
		this.userWalletId = userWalletId;
	}

	public float getUserBalance() {
		return this.userBalance;
	}

	public void setUserBalance(float userBalance) {
		this.userBalance = userBalance;
	}

	public BpUserCurrency getBpUserCurrency() {
		return this.bpUserCurrency;
	}

	public void setBpUserCurrency(BpUserCurrency bpUserCurrency) {
		this.bpUserCurrency = bpUserCurrency;
	}

}