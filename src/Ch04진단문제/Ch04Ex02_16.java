package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b;
		int c;
		int d;
		int q=0;
		char ch='A';
		
		
		if(a<=6) {
	        for (b=0;b<a;b++) {
	        	for (c=a;c>b;c--){
	        		System.out.printf("%c",ch);
	        		ch++; 			        
	        	}
	        	for(d=0;d<b;d++){
	        		System.out.printf("%d",q);
	        		q++;
	        	}	
	        	System.out.printf("\n");
	        }
	     }
	}
}