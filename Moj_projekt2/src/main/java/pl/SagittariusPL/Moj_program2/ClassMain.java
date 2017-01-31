package pl.SagittariusPL.Moj_program2;


import java.io.FileNotFoundException;


import java.util.Scanner;

public class ClassMain 
{
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws FileNotFoundException
	{
		
		/**
		 * Kuba komentarz do Ciebie!
		 */
		
		Pozycja p1= new Pozycja("Mleko",  1, 7);
		System.out.println(p1);
		Pozycja p2= new Pozycja("Chleb",  2, 3.5);
		System.out.println(p2);
		System.out.println(p1.obliczWartosc()+p2.obliczWartosc());
		 
	      
	}
		
		
}
