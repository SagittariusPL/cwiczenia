package pl.SagittariusPL.Moj_program2;

public class MaxNumber 
{
	int max;
	 
	 int max(int...j)
	 {
	    
	  for(int i =0; i<j.length; i++)
	  {
	   if (i == 0) max = j[i];
	   if (j[i]>max) max = j[i];
	   
	  }
	  return max;
	  
	 }
	
	
	
	
}
