package com.sorties.HibernateComposite;

import java.io.Serializable;
import javax.persistence.Embeddable;
@Embeddable
public class Ck_accId implements Serializable{
            private int user_id;
            private int acc_id;
            public Ck_accId(int user_id, int acc_id) {
                        super(); 
                        this.user_id = user_id;
                        this.acc_id = acc_id;
            }
            public int getUser_id() {
                        return user_id;
            }
            public void setUser_id(int user_id) { 
                        this.user_id = user_id;
            }
            public int getAcc_id() {
                        return acc_id;
            }
            public void setAcc_id(int acc_id) { 
                        this.acc_id = acc_id;
            }
            @Override
            public int hashCode() {
                        final int prime = 31;
                        int result = 1;
                        result = prime * result + acc_id; 
                        result = prime * result + user_id;
                        return result;
            }
            @Override
            public boolean equals(Object obj) {
                        if (this == obj)
                                    return true;
                        if (obj == null) 
                                    return false;
                        if (getClass() != obj.getClass())
                                    return false;
                        Ck_accId other = (Ck_accId) obj;
                        if (acc_id != other.acc_id)
                                    return false; 
                        if (user_id != other.user_id)
                                    return false;
                        return true;
            }
  } 
