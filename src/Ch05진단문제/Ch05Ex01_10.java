package Ch05진단문제;

import java.util.*;

public class Ch05Ex01_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char abc[] = new char[100];
		int a=0, b=0, c=0, d=0, e=0, f=0, g=0, h=0,i=0, j=0, k=0, l=0, m=0, n=0, o=0, p=0, q=0, r=0, s=0, t=0, u=0, v=0, w=0, x=0, y=0, z=0;
		
		for(int ii=0;i<abc.length;ii++) {
			String bc = scanner.nextLine();
			abc[ii] = bc.charAt(0);
			if(!(abc[ii] >= 65 && abc[ii] <= 90)) {
				if(a>0){
					System.out.printf("A : %d\n",a);
					}if(b>0) {
						System.out.printf("B : %d\n",b);
					}if(c>0) {
						System.out.printf("C : %d\n",c);
					}if(d>0) {
						System.out.printf("D : %d\n",d);
					}if(e>0) {
						System.out.printf("E : %d\n",e);
					}if(f>0) {
						System.out.printf("F : %d\n",f);
					}if(g>0) {
						System.out.printf("G : %d\n",g);
					}if(h>0) {
						System.out.printf("H : %d\n",h);
					}if(i>0) {
						System.out.printf("I : %d\n",i);
					}if(j>0) {
						System.out.printf("J : %d\n",j);
					}if(k>0) {
						System.out.printf("K : %d\n",k);
					}if(l>0) {
						System.out.printf("L : %d\n",l);
					}if(m>0) {
						System.out.printf("M : %d\n",m);
					}if(n>0) {
						System.out.printf("N : %d\n",n);
					}if(o>0) {
						System.out.printf("O : %d\n",o);
					}if(p>0) {
						System.out.printf("P : %d\n",p);
					}if(q>0) {
						System.out.printf("Q : %d\n",q);
					}if(r>0) {
						System.out.printf("R : %d\n",r);
					}if(s>0) {
						System.out.printf("S : %d\n",s);
					}if(t>0) {
						System.out.printf("T : %d\n",t);
					}if(u>0) {
						System.out.printf("u : %d\n",u);
					}if(v>0) {
						System.out.printf("V : %d\n",v);
					}if(w>0) {
						System.out.printf("W : %d\n",w);
					}if(x>0) {
						System.out.printf("X : %d\n",x);
					}if(y>0) {
						System.out.printf("Y : %d\n",y);
					}if(z>0) {
						System.out.printf("Z : %d\n",z);
						}
				break;
			}if(abc[ii]=='A') {
				a++;
			}else if(abc[ii]=='B') {
				b++;
			}else if(abc[ii]=='C') {
				c++;
			}else if(abc[ii]=='D') {
				d++;
			}else if(abc[ii]=='E') {
				e++;
			}else if(abc[ii]=='F') {
				f++;
			}else if(abc[ii]=='G') {
				g++;
			}else if(abc[ii]=='H') {
				h++;
			}else if(abc[ii]=='I') {
				i++;
			}else if(abc[ii]=='J') {
				j++;
			}else if(abc[ii]=='K') {
				k++;
		}else if(abc[ii]=='L') {
			l++;
	}else if(abc[ii]=='M') {
		m++;
	}else if(abc[ii]=='N') {
		n++;
	}else if(abc[ii]=='O') {
		o++;
	}else if(abc[ii]=='P') {
		p++;
	}else if(abc[ii]=='Q') {
		q++;
	}else if(abc[ii]=='R') {
		r++;
	}else if(abc[ii]=='S') {
		s++;
	}else if(abc[ii]=='T') {
		t++;
	}else if(abc[ii]=='U') {
		u++;
	}else if(abc[ii]=='V') {
	v++;
	}else if(abc[ii]=='W') {
	w++;
	}else if(abc[ii]=='X') {
	x++;
	}else if(abc[ii]=='Y') {
	y++;
	}else if(abc[ii]=='Z') {
	z++;
	}
			
		}
	}
}