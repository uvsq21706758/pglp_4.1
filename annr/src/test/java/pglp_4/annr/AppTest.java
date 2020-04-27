package pglp_4.annr;


import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import pglp_4.annr.Personne1.Builder;


public class AppTest 
{
	 Numero_telephone telephone = new Numero_telephone(Type_tel.portable, "061234656");
	 @Test
	    public void NumeroTest() {
	        String num = "061234656";
	        assertEquals(num, telephone.getNumero());
	    }
	 @Test
	    public void TypetelTest() {
	        Type_tel type =Type_tel.portable;
	        assertEquals(type, telephone.getType());
	    }
	 @Test
	    public void constructeur_personne1Test() {
	       
	        Builder b = new Builder("elgaamouss", "manale", "employee", LocalDate.of(1996, 8, 27));
	        b.Num_telephone(telephone);
	        Personne1 employee = b.build();

	        Type_tel type =Type_tel.portable;
	        String num = "061234656";
	        String nom = "elgaamouss";
	        String prenom = "manale";
	        String fonction = "employee";
	        LocalDate date = LocalDate.of(1996, 8, 27);

	        assertEquals(type,employee.getNumero_telephone().get(0).getType());
	        assertEquals(num, employee.getNumero_telephone().get(0).getNumero());
	        assertEquals(nom, employee.getNom());
	        assertEquals(prenom, employee.getPrenom());
	        assertEquals(fonction, employee.getFonction());
	        assertEquals(date, employee.getDate_naissance());

	    }
	 @Test
	    public void groupeTest() {
	        Groupe RH = new Groupe("RH");
	        Groupe RES = new Groupe("RES");
	        Groupe INFO = new Groupe("INFO");
	        RH.add(RES);
	        RH.add(INFO);
	        RH.remove(RES);
	        assertEquals(RH.getPersonnes().get(0), INFO);
	    }
}
