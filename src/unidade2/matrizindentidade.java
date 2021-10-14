package unidade2;

public class matrizindentidade {
	
	public static void main( String[] args) {
		
		int matriz[][] = new int [3][3];
		 
		for(int l = 0; l<=2; l++ ) {
			for(int c = 0; c<=2; c++) {
				if(l != c) {
					matriz[l][c] = 0;
				}else if(l ==c ) {
					matriz[l][c] = 1;
				}
				
			}
		}
		for(int l = 0; l<=2; l++ ) {
			for(int c = 0; c<=2; c++) {
				System.out.print(matriz[l][c]);
			}
			System.out.println("");
		}
	}

}
