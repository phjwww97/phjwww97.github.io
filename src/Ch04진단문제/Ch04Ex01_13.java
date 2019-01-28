package Ch04진단문제;

import java.util.*;

public class Ch04Ex01_13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("번호를 입력하세요. > ");
		
		int a = scanner.nextInt();
		
		if (a==1)
			System.out.println("dog");
		else if (a==2)
			System.out.println("cat");
		else if (a==3)
			System.out.println("chick");
		else 
			System.out.println("I don't know.");

	}

}
