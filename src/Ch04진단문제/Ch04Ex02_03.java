package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		for(;;) {
			System.out.printf("정수를 입력하세요.(0:종료)>");
			int a = scanner.nextInt();
			if(a>0) {
				System.out.println("positive integer");
			}else if (a<0) {
				System.out.println("negative number");
			}else if (a==0) {
				break;
			}
			
		}

	}

}
