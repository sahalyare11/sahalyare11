package Hafta11_Odev3;
import java.util.Scanner;
public class AbdirizakSahalOsman_21670310196_hafta11_soru2 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	        
        System.out.print("Üçgenin boyutunu giriniz: ");
        int boyut = scanner.nextInt();
        
        
        for (int satir = 0; satir < boyut; satir++) {
            int sayi = 1;
            for (int bosluk = 0; bosluk < boyut - satir - 1; bosluk++) {
                System.out.print(" ");
            }
            for (int sutun = 0; sutun <= satir; sutun++) {
                System.out.print(sayi + " ");
                sayi = sayi * (satir - sutun) / (sutun + 1);
            }
            System.out.println();
        }
        

    }

}
