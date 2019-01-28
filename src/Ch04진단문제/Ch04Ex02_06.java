package Ch04진단문제;

import java.util.*;

public class Ch04Ex02_06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("1.korea\n2.USA\n3.Japan\n4.China\nnumber? ");
		
		
		for(;;) {
			int a = scanner.nextInt();
			if (a==1) {
				System.out.println("대한민국 = 서울(Seoul)");
			}else if (a==2) {
				System.out.println("미국 = 워싱턴(Washington)");
			}else if (a==3) {
				System.out.println("일본 = 동경(Tokyo)");
			}else if (a==4) {
				System.out.println("중국 = 북경(Beijing)");
			}else {
				System.out.println("none");
				break;
			}
		}

	}

}
