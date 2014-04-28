/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.lisa.gamingrentalstore.domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author Lisa
 */
@Embeddable
public class Demographics implements Serializable 
{
    private String gender;
    private String age;
    private Date dob;
    
     private Demographics()
    {      
    }
    
    private Demographics(Builder builder)
   {
      gender = builder.gender;
      age = builder.age;
      dob = builder.dob;
   }
    
    public static class Builder
  {
        private String gender;
        private String age;
        private Date dob;
        

        public Builder(String gender) {
            this.gender = gender;
            
        }
        
         public Builder age(String value) 
        {
            this.age = value;
            
            return this;
                    
        }
            
         
          public Builder dob(Date value) {
            this.dob = value;
            
            return this;
          }
          public Builder demographics(Demographics demographics){
            
            return this;
            
        }

        public Demographics build(){
            return new Demographics(this);
        }
    }
    
    public String getGender() {
        return gender;
    }

    public String getAge() 
    {
        return age;
    }
    
     public Date getDob() 
    {
        return dob;
    }
     
      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Demographics demographic = (Demographics) o;

        if (!gender.equals(demographic.gender)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return gender.hashCode();
    }
}
