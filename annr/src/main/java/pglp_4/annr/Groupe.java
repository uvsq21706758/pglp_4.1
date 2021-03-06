package pglp_4.annr;

import java.util.ArrayList;
import java.util.Iterator;

public class Groupe implements Composite{

	private ArrayList<Composite> personnes = new ArrayList<Composite>();
	
	public ArrayList<Composite> getPersonnes() {
		return personnes;
	}
	private String nom;
    
    public Groupe(final String nom) {
        this.nom = nom;
    }
   
    
	public void print() {
	
		for(Composite composant: personnes) {
			composant.print();
		}
	}
	
	public void add(Composite composant) {
		personnes.add(composant);
	}
	
	public void remove(Composite composant) {
		personnes.remove(composant);
	}
	 public String getNom() {
	        return this.nom;
	    }
	 public void hierarchique() {
	        Iterator<Composite> iterator = personnes.iterator();
	        System.out.println(this.getNom() + ":    ");
	        while (iterator.hasNext()) {
	            Composite comp = iterator.next();
	            comp.print();
	        }
	 }
}
