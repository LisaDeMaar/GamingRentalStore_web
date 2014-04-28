/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Lisa
 */
@Entity
public class RentalSales implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date rentalDate;
    private String rentalPeriod;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date returnDate;
    private double rentalTotalPrice;
    private double amountRendered;
    private double change;
    @ManyToOne
    private Cashier cashier;

   private RentalSales()
    {
    }
    
     private RentalSales(Builder builder)
        {
            id = builder.id;
            rentalDate = builder.rentalDate;
            rentalPeriod = builder.rentalPeriod;
            returnDate = builder.returnDate;
            rentalTotalPrice = builder.rentalTotalPrice;
            amountRendered = builder.amountRendered;
            change = builder.change;
        }
     
      public static class Builder
     {
        private long id;
        private Date rentalDate;
        private String rentalPeriod;
        private Date returnDate;
        private double rentalTotalPrice;
        private double amountRendered;
        private double change;
        private Cashier cashier;
        
        public Builder(long rentalID)
        {
            this.id = id;
        }
        
         public Builder rentalDate(Date value)
        {
            this.rentalDate = value;
            return this;
        }
         
         public Builder rentalPeriod(String value)
         {
             this.rentalPeriod = value;
             return this;
         }
         public Builder returnDate(Date value)
         {
             this.returnDate = value;
             return this;
         }
         public Builder rentalTotalPrice(double value)
         {
             this.rentalTotalPrice = value;
             return this;
         }
         public Builder amountRendered(double value)
         {
             this.amountRendered = value;
             return this;
         }
         public Builder change(double value)
         {
             this.change = value;
             return this;
         }
         
         public Builder cashier(Cashier value)
         {
             this.cashier = value;
             return this;
         }
         
          public Builder rentalSales(RentalSales rentalSales){
              
            id = rentalSales.getID();
            rentalDate = rentalSales.getRentalDate();
            rentalPeriod = rentalSales.getRentalPeriod();
            returnDate = rentalSales.getReturnDate();
            rentalTotalPrice = rentalSales.getRentalTotalPrice();
            amountRendered = rentalSales.getamountRendered();
            change = rentalSales.getChange();
            cashier = rentalSales.getCashier();
            
            return this;
            
        }
           
            public RentalSales build(){
            return new RentalSales(this);
        }
    }
      
      public long getID() {
        return id;
    }

    public Date getRentalDate() 
    {
        return rentalDate;
    }

    public String getRentalPeriod() {
        return rentalPeriod;
    }
    
     public Date getReturnDate() 
     {
        return returnDate;
    }
     
      public double getRentalTotalPrice() {
        return rentalTotalPrice;
    }
    public double getamountRendered() {
        return amountRendered;
    }
    public double getChange() {
        return change;
    }
     public Cashier getCashier() {
        return cashier;
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
        if (!(object instanceof RentalSales)) {
            return false;
        }
        RentalSales other = (RentalSales) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.RentalSales[ id=" + id + " ]";
    }
    
}
