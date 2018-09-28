package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;
import javax.persistence.*;


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
	private String userId;

	@Column(name="user_name")
	private String userName;

	//bi-directional many-to-one association to BpUserCurrency
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="user_id", referencedColumnName="user_id")
	private BpUserCurrency bpUserCurrency;

	public BpUser() {
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public BpUserCurrency getBpUserCurrency() {
		return this.bpUserCurrency;
	}

	public void setBpUserCurrency(BpUserCurrency bpUserCurrency) {
		this.bpUserCurrency = bpUserCurrency;
	}

}