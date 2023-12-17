package Hafta11_Odev3;

public class AbdirizakSahalOsman_21670310196_hafta11_soru1 {

	public static void main(String[] args) {
		
			int size =5;
			for(int satir =1; satir <= size; satir++) {
				for (int sutun=1; sutun <= size; sutun++) {
					
				
		 if( satir == 1 || satir == size || sutun == 1 || sutun== size ) {
					System.out.print("* ");
				 }else {
					 System.out.print("  "); 			 }
					 
			}
			System.out.println();
		}

	}

}
