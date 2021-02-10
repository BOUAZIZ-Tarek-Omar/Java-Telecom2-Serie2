package org.tob.ex5;

public class ex5 {

	public static void main(String[] args) {
	    //initialisation des objets
		User u1=new User("malagon","sebastien",2900);
		User u2=new User("malagon","sebastien",2900);
		User u3=new User("dupré","murielle",3500);
		//comparer les objets
		System.out.println("u1=u2?="+u1.equals(u2));
		System.out.println("u1=u3?="+u1.equals(u3));
		System.out.println("u2=u3?="+u2.equals(u3));
		//affichage du hashcode(remarque:u1.equals(u2)==true donc u1 et u2 ont le méme hashcode)
		System.out.println(u1.hashCode());
		System.out.println(u2.hashCode());
		System.out.println(u3.hashCode());
		//on a pas fait le sort en cours
	
	}

}
