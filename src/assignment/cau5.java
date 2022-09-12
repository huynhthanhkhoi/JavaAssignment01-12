/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class cau5 {	
	    public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên dương a = ");
	        int a = scanner.nextInt();
	        System.out.print("Nhập số nguyên dương b = ");
	        int b = scanner.nextInt();
	        // tính USCLN của a và b
	        System.out.println("USCLN của " + a + " và " + b
	                + " là: " + USCLN(a, b));
	        // tính BSCNN của a và b
	        System.out.println("BSCNN của " + a + " và " + b
	                + " là: " + BSCNN(a, b));
	        scanner.close();
	    }
	    public static int USCLN(int a, int b) {
	        if (b == 0) return a;
	        return USCLN(b, a % b);
	    }	    
	    public static int BSCNN(int a, int b) {
	        return (a * b) / USCLN(a, b);
	    }
	}