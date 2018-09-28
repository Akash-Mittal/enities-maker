package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the bp_user_wallet database table.
 * 
 */
@Entity
@Table(name = "bp_user_wallet")
@NamedQuery(name = "BpUserWallet.findAll", query = "SELECT b FROM BpUserWallet b")
public class BpUserWallet implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_wallet_id")
    private String userWalletId;

    @Column(name = "user_balance")
    private BigDecimal userBalance;

    // bi-directional many-to-one association to BpUserCurrency
    @OneToMany(mappedBy = "bpUserWallet", cascade = { CascadeType.ALL })
    private List<BpUserCurrency> bpUserCurrencies;

    public BpUserWallet() {
    }

    public String getUserWalletId() {
        return this.userWalletId;
    }

    public void setUserWalletId(String userWalletId) {
        this.userWalletId = userWalletId;
    }

    public BigDecimal getUserBalance() {
        return this.userBalance;
    }

    public void setUserBalance(BigDecimal userBalance) {
        this.userBalance = userBalance;
    }

    public List<BpUserCurrency> getBpUserCurrencies() {
        return this.bpUserCurrencies;
    }

    public void setBpUserCurrencies(List<BpUserCurrency> bpUserCurrencies) {
        this.bpUserCurrencies = bpUserCurrencies;
    }

    public BpUserCurrency addBpUserCurrency(BpUserCurrency bpUserCurrency) {
        getBpUserCurrencies().add(bpUserCurrency);
        bpUserCurrency.setBpUserWallet(this);

        return bpUserCurrency;
    }

    public BpUserCurrency removeBpUserCurrency(BpUserCurrency bpUserCurrency) {
        getBpUserCurrencies().remove(bpUserCurrency);
        bpUserCurrency.setBpUserWallet(null);

        return bpUserCurrency;
    }

}