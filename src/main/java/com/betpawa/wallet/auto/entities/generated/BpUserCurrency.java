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
	private String userCurrencyId;

	//bi-directional many-to-one association to BpCurrency
	@OneToMany(mappedBy="bpUserCurrency")
	private List<BpCurrency> bpCurrencies;

	//bi-directional many-to-one association to BpUser
	@OneToMany(mappedBy="bpUserCurrency", cascade={CascadeType.ALL})
	private List<BpUser> bpUsers;

	//bi-directional many-to-one association to BpUserWallet
	@ManyToOne
	@JoinColumn(name="user_currency_id", referencedColumnName="user_currency_id")
	private BpUserWallet bpUserWallet;

	public BpUserCurrency() {
	}

	public String getUserCurrencyId() {
		return this.userCurrencyId;
	}

	public void setUserCurrencyId(String userCurrencyId) {
		this.userCurrencyId = userCurrencyId;
	}

	public List<BpCurrency> getBpCurrencies() {
		return this.bpCurrencies;
	}

	public void setBpCurrencies(List<BpCurrency> bpCurrencies) {
		this.bpCurrencies = bpCurrencies;
	}

	public BpCurrency addBpCurrency(BpCurrency bpCurrency) {
		getBpCurrencies().add(bpCurrency);
		bpCurrency.setBpUserCurrency(this);

		return bpCurrency;
	}

	public BpCurrency removeBpCurrency(BpCurrency bpCurrency) {
		getBpCurrencies().remove(bpCurrency);
		bpCurrency.setBpUserCurrency(null);

		return bpCurrency;
	}

	public List<BpUser> getBpUsers() {
		return this.bpUsers;
	}

	public void setBpUsers(List<BpUser> bpUsers) {
		this.bpUsers = bpUsers;
	}

	public BpUser addBpUser(BpUser bpUser) {
		getBpUsers().add(bpUser);
		bpUser.setBpUserCurrency(this);

		return bpUser;
	}

	public BpUser removeBpUser(BpUser bpUser) {
		getBpUsers().remove(bpUser);
		bpUser.setBpUserCurrency(null);

		return bpUser;
	}

	public BpUserWallet getBpUserWallet() {
		return this.bpUserWallet;
	}

	public void setBpUserWallet(BpUserWallet bpUserWallet) {
		this.bpUserWallet = bpUserWallet;
	}

}