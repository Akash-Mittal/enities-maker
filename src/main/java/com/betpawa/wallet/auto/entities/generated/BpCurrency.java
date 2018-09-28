package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the bp_currency database table.
 * 
 */
@Entity
@Table(name = "bp_currency")
@NamedQuery(name = "BpCurrency.findAll", query = "SELECT b FROM BpCurrency b")
public class BpCurrency implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "currency_name")
    private String currencyName;

    // bi-directional many-to-one association to BpUserCurrency
    @ManyToOne
    @JoinColumn(name = "currency_id", referencedColumnName = "currency_id")
    private BpUserCurrency bpUserCurrency;

    public BpCurrency() {
    }

    public String getCurrencyId() {
        return this.currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public BpUserCurrency getBpUserCurrency() {
        return this.bpUserCurrency;
    }

    public void setBpUserCurrency(BpUserCurrency bpUserCurrency) {
        this.bpUserCurrency = bpUserCurrency;
    }

}