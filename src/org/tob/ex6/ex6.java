package org.tob.ex6;

import java.util.ArrayList;
import java.util.List;
import org.tob.ex6.User;

public class ex6 {

	public static void main(String[] args) {
		User u1=new User("malagon","sebastien",2900);
		User u2=new User("malagon","sebastien",2900);
		User u3=new User("dupré","murielle",3500);
		UserUtil u=new UserUtil();
		User listUsers[] = {u1,u2,u3} ;
		System.out.println("Avant l'augmentation des salaires ,La médiane des salaire ="+u.getMedianSalary(listUsers));
		System.out.println("Avant l'augmentation des salaires ,Le salaire moyen = "+u.getAverageSalary(listUsers));
		System.out.println("Avant l'augmentation des salaires ,Le salaire maximal = "+u.getMaxSalary(listUsers));
		u.raise(listUsers, 20);
		System.out.println("Le salaire maximal = "+u.getMaxSalary(listUsers));
		System.out.println("Le salaire moyen = "+u.getAverageSalary(listUsers));
		System.out.println("Aprés augmentation du salaire ,La médiane des salaire ="+u.getMedianSalary(listUsers));
	}

}
