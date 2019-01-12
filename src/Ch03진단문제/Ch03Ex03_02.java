package Ch03진단문제;

import java.util.*;

public class Ch03Ex03_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt(); //int a 선언 
		int b = scanner.nextInt(); //int b 선언  
		
		System.out.printf("%d %.2f",a/b ,(double)a/b); 
		//소수 둘째자리까지 출력하기위해 %f앞에 .2를 추가하고 a를 실수형으로 변환시켜 값을 구했다.

	}

}
