package pglp_4.annr;

import java.time.LocalDate;

import pglp_4.annr.Personne1.Builder;

public enum App {

   APPLICATION;

public void run(final String[] args) {
	Numero_telephone portable = new Numero_telephone(Type_tel.portable,"065745324");
	Builder builder = new Builder("denis","lola", "chef de service", LocalDate.of(1986,8,11));
	builder.Num_telephone(portable);
	Personne1 chefservice = builder.build();
	
	Numero_telephone portable_1 = new Numero_telephone(Type_tel.portable,"064342556");
	Builder builder_1 = new Builder("omari","haitam", "employe", LocalDate.of(1990,11,9));
	builder_1.Num_telephone(portable_1);
	Personne1 employe = builder_1.build();
	
	
	Numero_telephone portable_2 = new Numero_telephone(Type_tel.portable,"0612345653");
	Builder builder_2 = new Builder("elgaamouss","manale", "employee", LocalDate.of(1996,8,27));
	builder_2.Num_telephone(portable_2);
	Personne1 employee =  builder_2.build();
	
	Numero_telephone portable_3 = new Numero_telephone(Type_tel.portable,"064344532");
	Builder builder_3 = new Builder("khatir","alae", "chef de departement", LocalDate.of(1981,11,9));
	builder_3.Num_telephone(portable_3);
	Personne1 chefdepartement = builder_3.build();
	
	
	Numero_telephone portable_4 = new Numero_telephone(Type_tel.portable,"0613556673");
	Builder builder_4 = new Builder("darin","imen", "manager", LocalDate.of(1976,6,2));
	builder_4.Num_telephone(portable_4);
	Personne1 manager =  builder_4.build();
	
	Groupe Departement = new Groupe();
	Groupe Service = new Groupe();
	Groupe Equipe = new Groupe();
	

	Equipe.add(employee);
	Equipe.add(employe);
	
	Service.add(chefservice);
	Service.add(Equipe);
	Service.add(manager);

	Departement.add(chefdepartement);
	Departement.add(Service);
	
	Departement.print();
}


    public static void main(final String[] args) {
     APPLICATION.run(args);
    }

}