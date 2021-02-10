package org.tob.ex6;

public class UserUtil extends User{
	//méthodes
	public void raise(User[] users, int percentage) 
	{
		
		
		int tailleUsers=users.length;
		for(int i=0;i<tailleUsers;i++)
		{
			users[i].raise(percentage*(users[i].getSalaire())/100);
			System.out.println("aprés augmentation de "+percentage+"% Le salaire du user numero "+(i+1)+" devient "+users[i].getSalaire());
		}

	}
	public int getMaxSalary(User[] users)
	{
		int MaxSalary=0;
		int tailleUsers=users.length;
		for(int i=0;i<tailleUsers;i++)
		{
			if(MaxSalary<users[i].getSalaire())
			
				MaxSalary=users[i].getSalaire();
			
		}
		return MaxSalary;
	}
	public int getAverageSalary(User[] users)
	{
		int AverageSalary=0;
		int tailleUsers=users.length;
		for(int i=0;i<tailleUsers;i++)
		{
			AverageSalary=AverageSalary+users[i].getSalaire();
		}
		AverageSalary=AverageSalary/tailleUsers;
		return AverageSalary;
		
	}
	public int getMedianSalary(User[] users)
	{
		int MedianSalary=0;
		int tailleUsers=users.length;
		
		MedianSalary=users[tailleUsers/2].getSalaire();
		return MedianSalary;
	}
}
