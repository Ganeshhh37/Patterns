package org.programme;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	System.out.println("Enter no. of rows:");
	int row = s.nextInt();
	System.out.println("Your pattern is:");
	for(int i=row; i>=1; i--) {
		for(int j=1;j<=i; j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	s.close();
}
}
