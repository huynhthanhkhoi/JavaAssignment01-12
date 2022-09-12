/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n ;
		System.out.println("Tinh 1 + 1/2 + 1/3 + ... +1/n");
		System.out.println("Vui long nhap n ");
		n=sc.nextInt();
		float sum =0;			
		for(int i = 1; i <= n; i++) {
            sum += 1.0/i;
        }
         
        System.out.println("Sum = " + sum);
        sc.close();
	}

}
