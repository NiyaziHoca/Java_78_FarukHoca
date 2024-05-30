package DuseyAra;

public class Arama {
	
	public static String duseyAra(String deger,String[][] dizi,int index) {
		for (int i=0;i<dizi.length;i++) {
			
			for(int j=0;j<dizi[i].length;j++) {
				
				if (dizi[i][j]==deger) {
					return dizi[i][index];
				}
				
			}//for j sonu
			
		}// for i sonu
		
		return "#YOK";
		
	}//duseyAra sonu
}
