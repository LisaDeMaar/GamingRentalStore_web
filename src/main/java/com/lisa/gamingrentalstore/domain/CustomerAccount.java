/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author Lisa
 */
@Entity
public class CustomerAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String rentalCode;
    @OneToOne
    private CustomerDetails customerDetails;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerAccount_id")
    private List<RentalSales> rentalSales;
    @ManyToOne(cascade = CascadeType.ALL)
    private Contracts contract;
    @Embedded
    Demographics demographics;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customerAccount_id")
    private List<Fines> fines;

   private CustomerAccount()
   {
       
   }
   
   private CustomerAccount(Builder builder)
   {
       rentalCode = builder.rentalCode;
       customerDetails = builder.customerDetails;
       rentalSales = builder.rentalSales;
       contract = builder.contract;
       
   }
   
    public static class Builder{
        private long id;
        private String rentalCode;
        private CustomerDetails customerDetails;
        private List<RentalSales> rentalSales;
        private Contracts contract;
        private Demographics demographics;
        private List<Fines> fines;

        public Builder(String rentalCode) {
            this.rentalCode= rentalCode;
        }

        public Builder customerDetails(CustomerDetails value )
        {
            customerDetails = value;
            return this;
        }
        
         public Builder demographics(Demographics value )
        {
            demographics = value;
            return this;
        }
         
          public Builder fines(List<Fines> value )
        {
            fines = value;
            return this;
        }
        
        public Builder id(long value )
        {
            id = value;
            return this;
        }

        public Builder rentalSales(List<RentalSales> value){
            rentalSales = value;
            return this;
        }
        
         public Builder contract(Contracts value){
             this.contract = value;
            return this;
        }
         
         public Builder customerAccount(CustomerAccount customerAccount){
            id = customerAccount.getID();
            rentalCode = customerAccount.getRentalCode();
            customerDetails = customerAccount.getCustomerDetails();
            rentalSales = customerAccount.getRentalSales();
            contract = customerAccount.getContract();
            demographics = customerAccount.getDemographics();
            fines = customerAccount.getFines();
            
            
            return this;
            
        }

        public CustomerAccount build(){
            return new CustomerAccount(this);
        }
    }
    
     public String getRentalCode() {
        return rentalCode;
    }

    public long getID() {
        return id;
    }

    public CustomerDetails getCustomerDetails() 
    {
        return customerDetails;
    }

    public List<RentalSales> getRentalSales() {
        return rentalSales;
    }
   
    public Contracts getContract() {
        return contract;
    }
    
     public Demographics getDemographics() {
        return demographics;
    }
     
     public List<Fines> getFines() {
        return fines;
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
        if (!(object instanceof CustomerAccount)) {
            return false;
        }
        CustomerAccount other = (CustomerAccount) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.CustomerAccount[ id=" + id + " ]";
    }
    
}
