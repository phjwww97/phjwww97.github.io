package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_17 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b;
		int c;
		int d;
		int q=0;
		
		 for (b=0;b<a;b++){
			 	for(c=0;c<b;c++){
	        		System.out.printf(" ");
	        	}
	        	for (d=a;d>b;d--){
	        		q++;
	        		if(q>9) {
	        			q=0;
	        		}
	        		System.out.printf("%d",q);
	        		}	
	        	System.out.printf("\n");
		 }      	
	        	
		 }
	}
