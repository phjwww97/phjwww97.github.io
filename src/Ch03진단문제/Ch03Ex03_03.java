package Ch03진단문제;

import java.util.*;

public class Ch03Ex03_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(); // int a 선언 
		int b = scanner.nextInt(); // int b 선언 
		int c = scanner.nextInt(); // int c 선언 
		
		System.out.printf("%.1f",(float)(a+b+c)/3);
		//소수 첫째자리까지 출력하기위해 %.1f를추가하고 실수형으로 변환시켜줬다.
	}

}
