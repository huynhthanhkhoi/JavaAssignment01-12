/*
 * @author KhoiHT2
 * @date 5 thg 9, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau9 {
	
	// c.	Tạo ra mảng một chiều X với X[i] là các giá trị lớn nhất trên từng dòng i của ma trận A
	
	public static int[] MaxInEachRow(int a[][], int m, int n){
		int max=a[0][0];
		int arr[] = new int[m];
		for(int i=0; i<m; ++i){
			for(int j=0; j<n; ++j)
			{
				if(a[i][j]>max){
					max=a[i][j];
				}
			}
			arr[i]=max;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int m, n;		
		Scanner scanner = new Scanner(System.in);
		     
		do {
		    System.out.println("Nhập vào số dòng của ma trận:");
		    m = scanner.nextInt();
		    System.out.println("Nhập vào số cột của ma trận:");
		    n = scanner.nextInt();
		} while (m < 1 || n < 1);
		     
		// khai báo ma trận A có m dòng, n cột
		int A[][] = new int[m][n];
		     
		System.out.println("Nhập các phần tử cho ma trận A:");
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print("A[" + i + "," + j + "] = ");
		        A[i][j] = scanner.nextInt();
		    }
		}
		     
		System.out.println("Ma trận A vừa nhập:");
		for (int i = 0; i < m; i++) {
		    for (int j = 0; j < n; j++) {
		        System.out.print(A[i][j] + "\t");
		    }
		    System.out.println("\n");
		}
   
		scanner.close();
		
		// câu b tính tính của số là bội số của 3 trên dòng đâu tiên của ma trận
		    int tich =1;
		
		    for (int j = 0; j < n; j++) {
		    	if(A[0][j] % 3 ==0) {
		    		tich *= A[0][j];		    	
		    	}
		    }
		    if(tich!=1) {
		    	 System.out.println("Tích các số là bội số của 3 nằm trên dòng đầu tiên của ma trận là  =  " + tich );
		    }else {
		    	 System.out.println("Dòng đầu tiên không có số nào là bội số của 3 ");
		    }	
		    System.out.println("Mảng B từ phần tử lớn nhất của mổi dòng trong ma trận A " );
		   int B[] = MaxInEachRow(A,m,n) ;
		   for(int k=0; k<B.length;k++) {
			   System.out.print(B[k] + " " );
		   }
		
	}
	
	
	 
}
