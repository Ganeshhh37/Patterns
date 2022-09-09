package org.programme;

import java.util.Scanner;

public class Patterns {
	public static void pattern1() {
		int n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++){
				System.out.print(j+" ");			
				}
			System.out.println();
		}
		
	}
	public static void pattern2() {
		int n = 7;
		for(int i=1; i<=n; i++) {
			for(int space=1; space<=n-i; space++) {
				if(space<n) {
					System.out.print("1");
				}else {
					System.out.print("7");
				}
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public static void pattern3() {
		int n=7;
		for(int i=1; i<=2*n-1; i++) {
		int cols= i>n? 2*n-i:i;
			for(int j=1; j<=cols; j++) {
				System.out.print(j+" ");			
				}
			System.out.println();			
		}
		
	}
	static void pattern4() {
		int n=7;
		for(int i=1; i<=2*n-1; i++) {
			int cols = i<=n?n-i+1:i-n+1;
			for(int j=1; j<=cols; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	static void pattern5() {
		int n=7;
		for(int i=1; i<=n; i++) {
			 
			for(int j=7; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	static void pattern6() {
		int n=7;
		for(int row=1; row<=n; row++) {
			for(int col=7; col>=n-row+1; col--) {
					System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	static void pattern7() {
		int n=7;
		for(int row=1; row<=n; row++) {
			for (int col=1; col<=n-row+1; col++) {
				System.out.print(col+" ");
				}
			System.out.println();
			}
	}
	static void pattern8() {
		int n=7;
		int l=1;
		for(int row=1; row<=n; row++) {
			int k=0;
			for(int col=1; col<=l; col++) {
				if(col<=row) {
					k=k+1;
				}else {
					k=k-1;
				}
				System.out.print(k+" ");
			}
			System.out.println();
			l=l+2;
		}
	}
	static void pattern9() {
		int n = 7;
		//Printing upper half
		int k=1;
		for(int i=1; i<=n; i++) {
			for(int space=1; space<=i-1; space++) {
				System.out.print(" ");
			}
			for(int j=k; j<=n; j++) {
				
				System.out.print(j); 					
			}
			System.out.println();
			k=k+1;	
		}	
	}
	static void pattern9_1(){
		Scanner s= new Scanner(System.in);
		System.out.println("Enter no of rows:");
		int row = s.nextInt();
		System.out.println("your pattern is:");
		//Printing upper half 
		for(int i=1; i<=row; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=row;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		//Printing lower half
		for(int i=row-1; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=row; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		s.close();	
	}
	static void pattern10() {
		int n=7;
		for(int i=1; i<=n; i++ ) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
		for(int j=i; j<=n; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		}
		for(int i=n-1; i>=1; i--) {
			for(int j=1; j<i; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	static void pattern11() {
		int n=7;
		int k=1;
		for(int i=1; i<=n; i++) {
			
			for(int j=k; j<=i; j++) {
				if(j%2==0) {
					System.out.print("0");
				}else
				System.out.print("1");
			}
			System.out.println();
		}
		
	}
	static void pattern12() {
		int n=7;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i%2==0 && j%2!=0) {
					System.out.print("0");
				}
				else if(i%2!=0 && j%2==0) {
				System.out.print("0");
				}else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
		
	}
	static void pattern13() {
		int n=5;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				if(j==2) {
				System.out.print((i+4)+" ");
				}else if(j==3){
					System.out.print((i+7)+" ");
				}else if(j==4) {
					System.out.print((i+9)+" ");
				}else if(j==5) {
					System.out.print((i+10)+" ");
				}
				else {
					System.out.print(i+" ");
				}
			}
			System.out.println();
		}
	}
	static void pattern14() {
		int n=7;
		int k=-1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-1; j++) {
				if(i==j) {
					System.out.print(k=k+1);
				}
				System.out.print("0");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	//pattern1();
	//pattern2();
	//pattern3();
	//pattern4();
	//pattern5();
	//pattern6();
	//pattern7();
	//pattern8();
	//pattern9();
	//pattern9_1();
	//pattern10();
	//pattern11();
	//pattern12();
	//pattern13();
	pattern14();
	
	
}
}
