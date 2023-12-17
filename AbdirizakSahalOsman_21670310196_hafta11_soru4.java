package Hafta11_Odev3;

import java.util.Scanner;

public class AbdirizakSahalOsman_21670310196_hafta11_soru4 {

	public static void main(String[] args) {
		
	
		Scanner scanner = new Scanner(System.in);
        
	        System.out.print("Yüksekliği (tek sayı) giriniz: ");
	        int yukseklik = scanner.nextInt();
	        
	        // Yukarıdaki for döngüsü üst kısmı oluşturur
	        for (int i = 0; i < yukseklik / 2 + 1; i++) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < yukseklik - 2 * i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        
	        // Aşağıdaki for döngüsü alt kısmı oluşturur
	        for (int i = yukseklik / 2 - 1; i >= 0; i--) {
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < yukseklik - 2 * i; k++) {
	                System.out.print("*");
	            }
	            System.out.println();
        }

	}

}
