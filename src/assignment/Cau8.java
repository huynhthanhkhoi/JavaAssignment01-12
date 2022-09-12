/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.Scanner;

public class Cau8 {
	public static Scanner sc = new Scanner(System.in);
	// sắp xếp mảng tăng dần
	public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
	// in phần tử trong mảng
	 public static void show(int [] arr) {
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	 
	 // chèn phần tử  vào  trong mảng mà không làm thay đổi thứ tự 
	 public static int [] insert(int [] arr, int k) {
	        int arrIndex = arr.length - 1;
	        int tempIndex = arr.length;
	        int [] tempArr = new int [tempIndex + 1];
	        boolean inserted = false;
	         
	        for (int i = tempIndex; i >= 0; i--) {
	            if (arrIndex > -1 && arr[arrIndex] > k) {
	                tempArr[i] = arr[arrIndex--];
	            } else {
	                if (!inserted) {
	                    tempArr[i] = k;
	                    inserted = true;
	                } else {
	                    tempArr[i] = arr[arrIndex--];
	                }
	            }
	        }
	        return tempArr;
	        
	    } 
	 
	public static void main(String[] args) {		
		int n, sum =0,k;
		System.out.println("Nhập vào số phần tử của mảng");
		n=sc.nextInt();		
		int arr[] = new int[n];			
		System.out.println(" nhập vào từng phần tử của mảng");
		for (int i = 0; i < n; i++) {
			System.out.println(" nhập vào phần tử thứ " + i);
			arr[i] = sc.nextInt();						
		}		
		// tính tổng số nguyên dương lẽ trong mảng
		System.out.println(" tính tổ các số nguyên dương lẻ trong mảng ");
		for (int i = 0; i < n; i++) {
			if(arr[i] > 0 && arr[i]%2!=0) {
				sum +=arr[i];
			}
		}	
		System.out.println("tổng số nguyên dương lẻ trong mảng là : " + sum);
		// tìm kiếm phần tử k trong mảng
		System.out.println("vui lòng nhập phần tử k để tìm kiếm");
		k=sc.nextInt();
		boolean kt = false;
		for (int i = 0; i < n; i++) {
			if(arr[i]==k) {
				System.out.println("đã tìm thấy k tại vị trí " + i);
				kt =true;
			}
		}
		if(!kt) {
			System.out.println("Không tìm thấy k trong mảng");
		}
		
		// sắp xếp mảng a tằng dần
		// mảng trước khi được sắp xếp
		System.out.println("Mảng trước khi sắp xếp là ");
		        show(arr);
		System.out.println("");
		System.out.println(" Mảng sau khi duoc sap xep la ");
				sortASC(arr);		 
		        show(arr);
		        System.out.println("");
		 //chen vao phan tu p sao cho mang van duoc tang dan
		        System.out.printf("\nChèn phần tử %d vào mảng.", k);		
		        insert(arr,k);
		        
		        System.out.print("\nMảng sau khi chèn: ");
		        show(arr);
		
         sc.close();
	}

}
