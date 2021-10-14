package unidade2;

public class fibonacci {

    static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
    	
    	int fibo[] = new int [20];
    	
    	fibo[0] = 1;
    	fibo[1] = fibo[0];
    	fibo[2] = fibo[0] + fibo[1];
    	
    	for(int i = 3; i < 20; i++) {
    		fibo[i] = fibo[i -1] + fibo[i-2];
    	}
    	for(int f:fibo) {
    		System.out.print(f + "/");
    	}

	// teste do programa. Imprime os 30 primeiros termos
	/*for (int i = 0; i <= 30; i++) {
            System.out.println("(" + i + "):" + fibonacci.fibo(i));
        }*/
    }
}
