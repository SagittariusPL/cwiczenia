package pl.SagittariusPL.Moj_program2;

public class MinNumber
{
	int min;
	 
	 int min(int...k)
	 {
	    
	  for(int i =0; i<k.length; i++)
	  {
	   if (i == 0) min = k[i];
	   if (k[i]<min) min = k[i];
	   
	  }
	  return min;
	  
	 }
	
	
	
	
}
