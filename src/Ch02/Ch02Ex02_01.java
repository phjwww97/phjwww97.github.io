package Ch02;

import java.util.*;

public class Ch02Ex02_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor = scanner.nextInt();
		int mat = scanner.nextInt();
		int eng = scanner.nextInt();
		
		int sum=0, avg=0;
		
		System.out.printf("kor %d \nmat %d\neng %d\n", kor, mat, eng);
		System.out.printf("sum %d\navg %d", kor+mat+eng,(kor+mat+eng)/3);

	}

}
