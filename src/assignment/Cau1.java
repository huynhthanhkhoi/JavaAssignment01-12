/*
 * @author KhoiHT2
 * @date 29 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("xin vui long nhap gia tri n");
		n= sc.nextInt();
		for(int i=0;i<n;i++) {
			 for (int j = 1; j <= i; ++j) {
			        System.out.print("* ");
			      }
			 System.out.println();
		}
    sc.close();
	}

}
