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
public class GamesComingSoon implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String gameName;
    private String gameDescription;
    
     private GamesComingSoon()
    {
        
    }
    
     private GamesComingSoon(Builder builder)
   {
       id = builder.id;
       gameName = builder.gameName;
       gameDescription = builder.gameDescription;
      
   }
    
    public static class Builder
  {
        private Long id;
        private String gameName;
        private String gameDescription;
        

        public Builder(Long id) {
            this.id = id;
            
        }
        
         public Builder gameName(String value) 
        {
            gameName = value;
            
            return this;
                    
        }
        
         public Builder gameDescription(String value) 
        {
            gameDescription = value;
            
            return this;
                    
        }
         
          public Builder gamesComingSoon(GamesComingSoon gamesComingSoon){
            id = gamesComingSoon.getID();
            gameName = gamesComingSoon.getGameName();
            gameDescription = gamesComingSoon.getGameDescription();
            
            return this;
            
        }
         
          public GamesComingSoon build(){
            return new GamesComingSoon(this);
        }
    }
    
    public Long getID()
    {
        return id;
    }
    
    public String getGameName() {
        return gameName;
    }

    public String getGameDescription() 
    {
        return gameDescription;
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
        if (!(object instanceof GamesComingSoon)) {
            return false;
        }
        GamesComingSoon other = (GamesComingSoon) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.lisa.gamingrentalstore.domain.GamesComingSoon[ id=" + id + " ]";
    }
    
}
