/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Lisa
 */
@Entity
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private CustomerAccount customerAccount;
    
    private Customer()
    {
        
    }
    
    private Customer(Builder builder)
    {
        id = builder.id;
    }
    
     public static class Builder
     {
         private Long id;
         private CustomerAccount customerAccount;
         
          public Builder(Long id) {
            this.id = id;
        }
          
           public Builder customerAccount(CustomerAccount value) {
            customerAccount = value;
            return this;
        }
          
          
          
           public Builder Customer(Customer customer){
            id = customer.getId();
            customerAccount = customer.getCustomerAccount();
            return this;
            
        }
          
           public Customer build(){
            return new Customer(this);
        }
     }
           

    public Long getId() {
        return id;
    }
    
    public CustomerAccount getCustomerAccount()
    {
        return customerAccount;
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
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.Customer[ id=" + id + " ]";
    }
    
}
