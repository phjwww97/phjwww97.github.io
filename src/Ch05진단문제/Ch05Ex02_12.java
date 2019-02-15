package Ch05진단문제;

import java.util.*;

public class Ch05Ex02_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a[] = new int[100];
		int ten=0, twenty=0, thirty=0, forty=0, fifty=0, sixty=0, seventy=0, eighty=0, ninety=0, onehundred=0;
		
		for(int i=0;i<a.length;i++) {
			a[i] = scanner.nextInt();
			if(a[i]==0) {
				if(onehundred>0){
					System.out.printf("100 : %d person\n",onehundred);
					}if(ninety>0) {
						System.out.printf("90 : %d person\n",ninety);
					}if(eighty>0) {
						System.out.printf("80 : %d person\n",eighty);
					}if(seventy>0) {
						System.out.printf("70 : %d person\n",seventy);
					}if(sixty>0) {
						System.out.printf("60 : %d person\n",sixty);
					}if(fifty>0) {
						System.out.printf("50 : %d person\n",fifty);
					}if(forty>0) {
						System.out.printf("40 : %d person\n",forty);
					}if(thirty>0) {
						System.out.printf("30 : %d person\n",thirty);
					}if(twenty>0) {
						System.out.printf("20 : %d person\n",twenty);
					}if(ten>0) {
						System.out.printf("10 : %d person\n",ten);
					}
				break;
			}if(a[i]==100) {
				onehundred++;
			}else if(a[i] >= 90 && a[i] <= 99) {
				ninety++;
			}else if(a[i] >= 80 && a[i] <= 89) {
				eighty++;
			}else if(a[i] >= 70 && a[i] <= 79) {
				seventy++;
			}else if(a[i] >= 60 && a[i] <= 69) {
				sixty++;
			}else if(a[i] >= 50 && a[i] <= 59) {
				fifty++;
			}else if(a[i] >= 40 && a[i] <= 49) {
				forty++;
			}else if(a[i] >= 30 && a[i] <= 39) {
				thirty++;
			}else if(a[i] >= 20 && a[i] <= 29) {
				twenty++;
			}else if(a[i] >= 10 && a[i] <= 19) {
				ten++;
			}
		}

	}

}
