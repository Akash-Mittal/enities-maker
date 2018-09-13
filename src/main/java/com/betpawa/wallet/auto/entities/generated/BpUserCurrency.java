package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.betpawa.wallet.auto.entities.base.BaseEntityAudit;

/**
 * The persistent class for the bp_user_currency database table.
 * 
 */
@Entity
@Table(name = "bp_user_currency")
@NamedQuery(name = "BpUserCurrency.findAll", query = "SELECT b FROM BpUserCurrency b")
public class BpUserCurrency extends BaseEntityAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "user_id")
    private String userId;

    public BpUserCurrency() {
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}