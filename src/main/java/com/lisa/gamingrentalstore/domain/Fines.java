/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lisa
 */
@Entity
public class Fines implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal fineAmount;

   private Fines()
    {
    }
    
    private Fines(Builder builder)
   {
       id = builder.id;
       fineAmount = builder.fineAmount;
   }
    
     public static class Builder
  {
        private long id;
        private BigDecimal fineAmount;
        

        public Builder(long id) {
            this.id = id;
            
        }
        
         public Builder fineAmount(BigDecimal value) 
        {
            this.fineAmount = value;
            return this;            
        }
         
         public Builder fines(Fines fines){
            id = fines.getID();
            fineAmount = fines.getFineAmount();
            return this;
            
        }
         
          public Fines build(){
            return new Fines(this);
        }
    }
     
     public long getID() {
        return id;
    }

    public BigDecimal getFineAmount() 
    {
        return fineAmount;
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
        if (!(object instanceof Fines)) {
            return false;
        }
        Fines other = (Fines) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.Fines[ id=" + id + " ]";
    }
    
}
