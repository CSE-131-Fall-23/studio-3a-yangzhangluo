package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner in= new Scanner(System.in);
		   System.out.println("Size");
		   int n = in.nextInt();
		   int num[] = new int[n - 1];
		   for(int i = 0; i < n - 1; i++) {
			   num[i] = i + 2;
		   }
		   for(int s = 0; s < n - 1; s++) {
			   System.out.print(num[s] + " ");
		   }
		   System.out.println();
		   for(int i = 0; i < n - 1; i++) {
			   if(num[i] != 0) {
				   int k = num[i];
				   for(int j = i + k; j < n - 1; j+= k) {
					   num[j] = 0;
				   }
			   }
		   }
		   for(int i = 0; i < n - 1; i++) {
			  if(num[i] != 0) {
				   System.out.print(num[i] + " ");
			  }
		
	}

}
}
