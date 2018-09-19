package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the bp_user database table.
 * 
 */
@Entity
@Table(name="bp_user")
@NamedQuery(name="BpUser.findAll", query="SELECT b FROM BpUser b")
public class BpUser implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="user_id")
	private int userId;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to BpUserCurrency
	@OneToMany(mappedBy="bpUser")
	private List<BpUserCurrency> bpUserCurrencies;

	public BpUser() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<BpUserCurrency> getBpUserCurrencies() {
		return this.bpUserCurrencies;
	}

	public void setBpUserCurrencies(List<BpUserCurrency> bpUserCurrencies) {
		this.bpUserCurrencies = bpUserCurrencies;
	}

	public BpUserCurrency addBpUserCurrency(BpUserCurrency bpUserCurrency) {
		getBpUserCurrencies().add(bpUserCurrency);
		bpUserCurrency.setBpUser(this);

		return bpUserCurrency;
	}

	public BpUserCurrency removeBpUserCurrency(BpUserCurrency bpUserCurrency) {
		getBpUserCurrencies().remove(bpUserCurrency);
		bpUserCurrency.setBpUser(null);

		return bpUserCurrency;
	}

}