package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bp_user_currency database table.
 * 
 */
@Entity
@Table(name="bp_user_currency")
@NamedQuery(name="BpUserCurrency.findAll", query="SELECT b FROM BpUserCurrency b")
public class BpUserCurrency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_currency_id")
	private int userCurrencyId;

	//bi-directional many-to-one association to BpCurrency
	@ManyToOne
	@JoinColumn(name="currency_id")
	private BpCurrency bpCurrency;

	//bi-directional many-to-one association to BpUser
	@ManyToOne
	@JoinColumn(name="user_id")
	private BpUser bpUser;

	//bi-directional many-to-one association to BpUserWallet
	@OneToMany(mappedBy="bpUserCurrency")
	private List<BpUserWallet> bpUserWallets;

	public BpUserCurrency() {
	}

	public int getUserCurrencyId() {
		return this.userCurrencyId;
	}

	public void setUserCurrencyId(int userCurrencyId) {
		this.userCurrencyId = userCurrencyId;
	}

	public BpCurrency getBpCurrency() {
		return this.bpCurrency;
	}

	public void setBpCurrency(BpCurrency bpCurrency) {
		this.bpCurrency = bpCurrency;
	}

	public BpUser getBpUser() {
		return this.bpUser;
	}

	public void setBpUser(BpUser bpUser) {
		this.bpUser = bpUser;
	}

	public List<BpUserWallet> getBpUserWallets() {
		return this.bpUserWallets;
	}

	public void setBpUserWallets(List<BpUserWallet> bpUserWallets) {
		this.bpUserWallets = bpUserWallets;
	}

	public BpUserWallet addBpUserWallet(BpUserWallet bpUserWallet) {
		getBpUserWallets().add(bpUserWallet);
		bpUserWallet.setBpUserCurrency(this);

		return bpUserWallet;
	}

	public BpUserWallet removeBpUserWallet(BpUserWallet bpUserWallet) {
		getBpUserWallets().remove(bpUserWallet);
		bpUserWallet.setBpUserCurrency(null);

		return bpUserWallet;
	}

}