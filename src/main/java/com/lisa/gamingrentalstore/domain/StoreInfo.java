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
public class StoreInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String storeName;
    private String address;
    private String tel;

   private StoreInfo()
    {      
    }
    
     private StoreInfo(Builder builder)
   {
         id = builder.id;
         storeName = builder.storeName;
         address = builder.address;
         tel = builder.tel;
   }
    
    public static class Builder
  {
        private Long id;
        private String storeName;
        private String address;
        private String tel;
        

        public Builder(String storeName) {
            this.storeName = storeName;
            
        }
        
         public Builder storeName(String value) 
        {
            this.storeName = value;
            
            return this;
                    
        }
          public Builder address(String value) 
        {
            this.address = value;
            
            return this;
                    
        }
            public Builder tel(String value) 
        {
            this.tel = value;
            
            return this;
                    
        }
            public Builder storeInfo(StoreInfo storeInfo){
            id = storeInfo.getID();
            storeName = storeInfo.getStoreName();
            address = storeInfo.getAddress();
            tel = storeInfo.getTel();
            return this;
        }
         
          public StoreInfo build(){
            return new StoreInfo(this);
        }
    }
    
    public Long getID()
    {
        return id;
    }
    public String getStoreName() {
        return storeName;
    }

    public String getAddress() 
    {
        return address;
    }
    
    public String getTel() 
    {
        return tel;
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
        if (!(object instanceof StoreInfo)) {
            return false;
        }
        StoreInfo other = (StoreInfo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.StoreInfo[ id=" + id + " ]";
    }
    
}
