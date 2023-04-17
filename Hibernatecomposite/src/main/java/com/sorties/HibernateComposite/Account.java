package com.sorties.HibernateComposite;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Account {
            Ck_accId ck_accid;
            private int acc_bal;
            @Id 
              public Ck_accId getCk_accid() {
                        return ck_accid;
            }
              public void setCk_accid(Ck_accId ck_accid) {
                        this.ck_accid = ck_accid;
            }
              public int getAcc_bal() { 
                        return acc_bal;
            }
              public void setAcc_bal(int acc_bal) {
                        this.acc_bal = acc_bal;
            }
    } 
