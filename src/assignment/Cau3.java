/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau3 {

	public static void main(String[] args) {
		System.out.println("S = 1+1/3!+1/5!+…..+1/(2n-1)!");
		Scanner sc = new Scanner(System.in);
		int n,gt=1;
		System.out.println("Vui long nhap n ");
		n=sc.nextInt();
		float sum =0;
		for(int i = 1; i <= n; i++) {			
            sum += 1.0/gt;
            gt *=(2*i)*(2*i+1);
        }
         
        System.out.println("Sum = " + sum);
        sc.close();
	}
}
