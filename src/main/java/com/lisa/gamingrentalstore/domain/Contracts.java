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
public class Contracts implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contractCode;
    private String contractName;
    private String contractLength;
    private String contractType;
    private BigDecimal contractPrice;
    
    private Contracts()
    {
    }

    private Contracts(Builder builder)
    {
        id = builder.id;
        contractCode = builder.contractCode;
        contractName = builder.contractName;
        contractLength = builder.contractLength;
        contractType = builder.contractType;
        contractPrice = builder.contractPrice;
    }
    
    public static class Builder{
        
        private long id;
        private String contractCode;
        private String contractName;
        private String contractLength;
        private String contractType;
        private BigDecimal contractPrice;
        

        public Builder(String value) {
            this.contractCode = value;
        }
        
         public Builder id(Long value) {
            id = value;
            return this;
        }
        

        public Builder contractName(String value)
        {
            this.contractName = value;
            return this;
        }

        
        public Builder contractLength(String value)
        {
            this.contractLength = value;
            return this;
        }
        
          public Builder contractType(String value)
        {
            this.contractType = value;
            return this;
        }
          
           public Builder contractPrice(BigDecimal value)
        {
            this.contractPrice = value;
            return this;
        }
           
           public Builder contracts(Contracts contracts){
            id = contracts.getID();
            contractCode = contracts.getContractCode();
            contractName = contracts.getContractName();
            contractLength = contracts.getContractLength();
            contractType = contracts.getContractType();
            contractPrice = contracts.getContractPrice();
            return this;
            
        }
        public Contracts build(){
            return new Contracts(this);
        }
    }
    
    public long getID() {
        return id;
    }
    
      public String getContractCode() {
        return contractCode;
    }
     
     public String getContractName() {
        return contractName;
    }
     
     public String getContractLength() 
     {
        return contractLength;
    }
     
     public String getContractType() {
        return contractType;
    }
     
     public BigDecimal getContractPrice() {
        return contractPrice;
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
        if (!(object instanceof Contracts)) {
            return false;
        }
        Contracts other = (Contracts) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.Contracts[ id=" + id + " ]";
    }
    
}
