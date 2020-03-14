package pglp_4.annr;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personne1 {
	
     private String nom;
     private String prenom;
     private LocalDate date_naissance;
     private ArrayList<String> num_telephone;
     
     public static class Builder{
    	 private String nom;
         private String prenom;
         private LocalDate date_naissance=null;
         private ArrayList<String> num_telephone=null;
        
         public Builder(String nom,String prenom) {
        	 this.nom=nom;
        	 this.prenom=prenom;
         }
         
         public Builder Date_naissance(LocalDate date_naissance) {
        	 this.date_naissance=date_naissance;
        	 return this;
         }
         
         public builder Num_telephone(ArrayList<String> num_telephone) {
        	  this.num_telephone=new 
        	  return this;
         }
       
     }
}
