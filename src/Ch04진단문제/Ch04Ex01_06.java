package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a;
		a = scanner.next().charAt(0);
		int b = scanner.nextInt();
		
		if (a=='M') {
			if (b>18) {
				System.out.println("MAN");
			}else 
			System.out.println("BOY");
		}
		
		if (a=='F') {
			if (b>18) {
				System.out.println("WOMAN");
			}else 
				System.out.println("GIRL");
		}	 
	}	
	}



