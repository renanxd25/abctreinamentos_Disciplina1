package unidade2;

public class vetorapp {
	
	public static void main(String[] args ) {
		int a[] = new int [50];
		int b[] = new int[50];
		
		for(int x=0; x<50; x++) {
			
			a[x] = x;
			
			if(x%2 ==  0) {
				b[x] = 2*a[x];
			}else if(x%2 == 1) {
				b[x] =a[x]/2;
			}
			
			
		}
		for(int A: a) {
			System.out.print(A + "/" );
		}
		System.out.println("===============================================================================");
		for(int B: b) {
			System.out.print(B + "/");
		}
	}

}
