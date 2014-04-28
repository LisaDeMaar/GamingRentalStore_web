/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lisa
 */
@Entity
public class Cashier implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cashierName;
    private String cashierSurname;

  //private contructor
    private Cashier()
    {      
    }
    
    private Cashier(Builder builder)
    {
        id = builder.id;
        cashierName = builder.cashierName;
        cashierSurname = builder.cashierSurname;       
    }
    
    public static class Builder
    {
    private Long id;
    private String cashierName;
    private String cashierSurname;
    
        

        public Builder(Long id) {
            this.id = id;
        }

        public Builder cashierName(String value)
        {
            this.cashierName = value;
            return this;
        }

        public Builder cashierSurname (String value){
            this.cashierSurname = value;
            return this;
        }
        
        public Builder cashier(Cashier cashier)
        {
            id = cashier.getID();
            cashierName = cashier.getCashierName();
            cashierSurname = cashier.getCashierSurname();
            return this;
            
        }

        public Cashier build(){
            return new Cashier(this);
        }
    }
    
       public Long getID() {
        return id;
    }

    public String getCashierName() 
    {
        return cashierName;
    }

    public String getCashierSurname() {
        return cashierSurname;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cashier)) {
            return false;
        }
        Cashier other = (Cashier) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.Cashier[ id=" + id + " ]";
    }
    
}
