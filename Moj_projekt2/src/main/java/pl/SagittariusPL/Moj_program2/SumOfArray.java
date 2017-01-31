package pl.SagittariusPL.Moj_program2;

public class SumOfArray 
{
	 public  int[] array = {10, 20, 30, 40, 50, 10};
    
	 
	 int sum=0;
    
	 int oblicz()
    {
      //Advanced for loop
      for( int num : array)
      {
          sum = sum+num;
      }
      return  sum;
    
}
}
