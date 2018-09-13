package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.betpawa.wallet.auto.entities.base.BaseEntityAudit;

/**
 * The persistent class for the bp_currency database table.
 * 
 */
@Entity
@Table(name = "bp_currency")
@NamedQuery(name = "BpCurrency.findAll", query = "SELECT b FROM BpCurrency b")
public class BpCurrency extends BaseEntityAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "currency_val")
    private String currencyVal;

    public BpCurrency() {
    }

    public String getCurrencyVal() {
        return this.currencyVal;
    }

    public void setCurrencyVal(String currencyVal) {
        this.currencyVal = currencyVal;
    }

}