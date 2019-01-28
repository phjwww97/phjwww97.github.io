package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		if(a%4==0)
			System.out.println("leap year");
		else 
			System.out.println("common year");

	}

}
