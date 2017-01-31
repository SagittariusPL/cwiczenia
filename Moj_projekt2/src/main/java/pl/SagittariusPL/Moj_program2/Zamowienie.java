package pl.SagittariusPL.Moj_program2;

import java.io.*;
import java.nio.Buffer;

public class Zamowienie implements Serializable {
	int ileDanych = 0;
	int maksRozmiar;
	Pozycja[] pozycje = new Pozycja[10];
	int indeks;

	public int maksRozmiar()

	{

		return maksRozmiar = 10;
	}

	public int ilePozycji(int maksRozmiar) {
		return maksRozmiar;
	}

	public void dodajPozycje(Pozycja p) {

		boolean dodajpoz = false;
		for (int k = 0; k < ileDanych; k++) {
			if (pozycje[k].nazwaTowaru == p.nazwaTowaru) {
				pozycje[k].ileSztuk = pozycje[k].ileSztuk + p.ileSztuk;
				// p.ileSztuk=0;
				// p.cena=0;
				// .nazwaTowaru="Zamiana";
				dodajpoz = true;
			}

		}

		if (dodajpoz == false) {
			pozycje[ileDanych] = p;
			ileDanych = ileDanych + 1;

		}

	}

	public double obliczWartosc() {
		double suma = 0;
		for (int i = 0; i < ileDanych; i++) {
			pozycje[i].obliczWartoscZRabatem();
			suma = suma + pozycje[i].obliczWartoscZRabatem();

		}
		return suma;
	}

	public String toString() {

		StringBuilder tekst = new StringBuilder();

		tekst.append("\nZamowienie :");
		for (int j = 0; j < ileDanych; j++)

		{

			tekst.append("\n" + pozycje[j]);

		}

		double x = obliczWartosc();
		tekst.append("\nRazem :");
		tekst.append(x);
		return tekst.toString();

	}

	public void usunPozycje(int indeks)

	{
		for (int k = indeks; k < ileDanych; k++) {
			pozycje[k] = pozycje[k + 1];

		}
		ileDanych = ileDanych - 1;
	}

	public void edytujPozycje(int indeks) {

		pozycje[indeks] = new Pozycja("Grejfrut", 3, 8);
	}

	private static String lokalizacjaPliku = "C://Users//SagittariusPL//Documents//Git//cwiczenia//plik.txt";

	public static void zapiszZamowienie(String ZapisDoPliku)

	{
		File plik = new File(lokalizacjaPliku);
		try {
			FileWriter zapisPliku = new FileWriter(plik);
			BufferedWriter buforowanyZapis = new BufferedWriter(zapisPliku);
			buforowanyZapis.write(ZapisDoPliku);

			buforowanyZapis.close();
			zapisPliku.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Zamowienie wczytajZamowienie(String nazwaPliku) {
				File plik = new File(lokalizacjaPliku);
				
				try {
					FileReader odczyt = new FileReader(plik);
					BufferedReader buforowanyOdczyt = new BufferedReader(odczyt);
					String linia="";
					
					try {
						while((linia = buforowanyOdczyt.readLine())!=null)
						{ 
							System.out.println(linia);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					try {
						odczyt.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return null;
				
	}
}
