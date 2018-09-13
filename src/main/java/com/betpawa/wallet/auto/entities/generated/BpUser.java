package com.betpawa.wallet.auto.entities.generated;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import com.betpawa.wallet.auto.entities.base.BaseEntityAudit;

/**
 * The persistent class for the bp_user database table.
 * 
 */
@Entity
@Table(name = "bp_user")
@NamedQuery(name = "BpUser.findAll", query = "SELECT b FROM BpUser b")
public class BpUser extends BaseEntityAudit implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "user_name")
    private String userName;

    public BpUser() {
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}