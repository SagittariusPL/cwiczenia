package pl.SagittariusPL.Moj_program2;

import java.util.Arrays;
import java.util.Random;

public class Tab10 
{
	int[] tab; 
	
	
	
	
	int[] losowanieLiczby(int a, int b, int c)
	{
		
	 int[] tab = new int[c];
	Random r= new Random();
	
	 
	
	for(int i =0; i<c; i++)
	{
		tab[i]=r.nextInt(a)-b;
		
	}
	
	return tab;
	
	
	}
	
	
		
	
	
	
}
