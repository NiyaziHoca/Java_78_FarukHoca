package DuseyAra;
/*
 * 3 parametre alacak:
 * 1- Aranacak değer
 * 2- aranacak dizi
 * 3- index değeri
 */
public class Main {

	public static void main(String[] args) {
		String[][] ogrenci= {
				{"asli","ozturk","50"},
				{"ece","saka","800"},
				{"eda","yalcindag","1000"},
				{"intizar","guzelcay","500"},
				{"nakisa","alizaey","860"}				
		};//ogrenci sonu
		
		String ara=Arama.duseyAra("eda", ogrenci, 2);
		
		System.out.println("Aranan değer sonucu: "+ara);

	}//main sonu
	
	

}
