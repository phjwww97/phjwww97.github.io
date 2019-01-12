package Ch03진단문제;

import java.util.*;

public class Ch03Ex03_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble(); //double a 를 선언 
		double b = scanner.nextDouble(); //double b 를 선언 
		
		System.out.printf("%d %d",(int)(a*b) ,(int)a*(int)b); 
		//두 실수의 곱을 구한후 정수형으로 변환을 하여 출력해주고, 두 실수를 곱하기전에 정수형으로 변환한 후 곱하였다. 

	}

}
