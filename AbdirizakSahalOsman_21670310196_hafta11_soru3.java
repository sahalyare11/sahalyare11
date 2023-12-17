package Hafta11_Odev3;
import java.util.Scanner;
public class AbdirizakSahalOsman_21670310196_hafta11_soru3 {

	

	private static final int i = 0;

	public static void main(String[] args) {
		
		Scanner Scanner = new Scanner(System.in);
		int []dizi= new int [10]; 
		
		System.out.println("Lutfen 10 sayi giriniz: ");
		for(int i = 0; i < 10; i++);{
		  System.out.println("Dizinin" + ( + 1) + ".eleminini giriniz:");
		  dizi [i] = Scanner.nextInt();
		}
		
		int enbuyuk = Integer.MIN_VALUE;
		int ikinciEb = Integer.MIN_VALUE;
		
		
		for (int  i = 0;  i < 10; i ++);
		if(dizi [i] > enbuyuk) {
			ikinciEb = enbuyuk;
			enbuyuk = dizi[i];
			
		}else if(dizi [i] > ikinciEb && dizi[i]!= enbuyuk ) {
			ikinciEb = dizi[i];
		}
		System.out.println("Dizinin en buyuk ikinci elemeni :" + ikinciEb);


	}

}
