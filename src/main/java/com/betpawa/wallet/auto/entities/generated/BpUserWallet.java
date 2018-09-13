package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.betpawa.wallet.auto.entities.base.BaseEntityAudit;

/**
 * The persistent class for the bp_user_wallet database table.
 * 
 */
@Entity
@Table(name = "bp_user_wallet")
@NamedQuery(name = "BpUserWallet.findAll", query = "SELECT b FROM BpUserWallet b")
public class BpUserWallet extends BaseEntityAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "user_balance")
    private float userBalance;

    @Column(name = "user_currency_id")
    private String userCurrencyId;

    public BpUserWallet() {
    }

    public float getUserBalance() {
        return this.userBalance;
    }

    public void setUserBalance(float userBalance) {
        this.userBalance = userBalance;
    }

    public String getUserCurrencyId() {
        return this.userCurrencyId;
    }

    public void setUserCurrencyId(String userCurrencyId) {
        this.userCurrencyId = userCurrencyId;
    }

}