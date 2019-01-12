package Ch03진단문제;

import java.util.*;

public class Ch03Ex03_04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble(); //double a를 선언 
		double b = scanner.nextDouble(); //double b를 선언 
		double c = scanner.nextDouble(); //double c를 선언 
		
		System.out.printf("%d %d",(int)a+(int)b+(int)c ,(int)(a+b+c)/3);	
		//정수형으로 출력하기위해 %d를 사용하였고, 정수부분의 합계를 구하기위해 a,b,c,를 정수형으로 변환시켰다.
		
	}

}
