package pglp_4.annr;

import java.util.ArrayList;

public class Groupe implements Composite{

	private ArrayList<Composite> personnes = new ArrayList<Composite>();
	
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
}
