package org.tob.ex5;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
private String nom;
private String prenom;
private int salaire;
		//constructeur sans paramétres
		public User() {
			super();
			// TODO Auto-generated constructor stub
		}
		//constructeur avec paramétres
		public User(String nom, String prenom, int salaire) {
			this.nom = nom;
			this.prenom = prenom;
			this.salaire = salaire;
			//affichage
			System.out.println("User : prénom = "+prenom+ " nom = " +nom+" salaire = "+salaire);
		}
		public User(String nom, int salaire) {
			this(nom,"",salaire);
			
			
		}
//getters et setters
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getSalaire() {
	return salaire;
}
public void setSalaire(int salaire) {
	this.salaire = salaire;
}
		//méthodes
		public void raise(int raise) 
		{
			if(raise>0)
			salaire=salaire+raise;//pas besoin de rajouter this.salaire car on a qu'un seul
			
		}
//Equals and Hashcode
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((nom == null) ? 0 : nom.hashCode());
			result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
			result = prime * result + salaire;
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			User other = (User) obj;
			if (nom == null) {
				if (other.nom != null)
					return false;
			} else if (!nom.equals(other.nom))
				return false;
			if (prenom == null) {
				if (other.prenom != null)
					return false;
			} else if (!prenom.equals(other.prenom))
				return false;
			if (salaire != other.salaire)
				return false;
			return true;
		}
//Comparaison par ordre alphabétique(java nous fourni l'api collection)
	
		
		
}
