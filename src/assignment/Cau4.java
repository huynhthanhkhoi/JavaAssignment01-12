/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau4 {

	public static void main(String[] args) {
		int n, tong=0, sodu,tich =1;
		Scanner sc = new Scanner(System.in);
		System.out.println(" Tinh tong cac chu so cua n ");
		System.out.println(" moi nhap vao so n ");
		n=sc.nextInt();
		while(n>0) {
			sodu = n%10;
			n=n/10;
			tong +=sodu;	
			tich *=sodu;
		}
		 System.out.println("Tong = " + tong);
		 System.out.println("tich = " + tich);
		 sc.close();
	}
	
}
