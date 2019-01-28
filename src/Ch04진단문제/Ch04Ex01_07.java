package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char a;
		a = scanner.next().charAt(0);
		
		if (a=='A') {
			System.out.println("Execllent");
		}else if(a=='B') {
			System.out.println("Good");
		}else if (a=='C') {
			System.out.println("usually");
		}else if (a=='D'){
			System.out.println("Effort");
		}else if(a=='F'){
			System.out.println("Failure");
		}else {
			System.out.println("error");
		}

	}

}
