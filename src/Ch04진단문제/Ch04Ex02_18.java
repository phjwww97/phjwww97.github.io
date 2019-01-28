package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_18 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b;
		int c;
		int d;
		
		for (b=0;b<a-1;b++) 
		  { 
		    System.out.printf(" "); 
		    for (c=0;c<b+1;c++) 
		    { 
		      System.out.printf("#"); 
		   } 
		   System.out.println(); 
		} 
		for(b=a-1;b>-1;b--) { 
		  System.out.printf(" "); 
		  for (c=0;c<a-b-1;c++) 
		  System.out.printf(" ");
		  for (d=0;d<b+1;d++) 
		  System.out.printf("#"); 
		  System.out.println(); 
		}
	}
}


