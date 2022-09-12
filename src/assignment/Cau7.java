/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Cau7 {
	
	public static void reverse(String s) {
		
		String rs ="" ;
		int l = s.length();
		for(int i =0; i<l;i++) {
			rs=s.charAt(i)+rs;
//			System.out.println(s.charAt(i));
		}
		System.out.println(rs);
		System.out.println(rs.toUpperCase());
		System.out.println(rs.toLowerCase());
		
	}
	public static void DemKyTu(String str){   
		
		
		int len = str.length();
        int counter[] = new int[256];             
        for (int i = 0; i < len; i++) {
            counter[str.charAt(i)]++;           
        }
        char array[] = new char[str.length()];
        
        for (int i = 0; i < len; i++) {
            array[i] = str.charAt(i);           
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;                
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
    }
	
	
public static void DemKyTu1(String str){   
		Map<Character,Integer> a = new HashMap<>();
		int len = str.length();   
		int count =1;
        for (int i = 0; i < len; i++) {
        	if(a.containsKey(str.charAt(i))) {
        		 a.put(str.charAt(i), count+1) ;
        	}else {
        		 a.put(str.charAt(i), count) ;
        	}
                   
        }
        Set<Character> keyset = a.keySet();       
        for(Character key : keyset)  {
        	System.out.println(key + ":" + a.get(key));
        }
	
    }
	
	
	public static void tachchuoi(String str, int m, int n) {
		 System.out.println(str.substring(m, n));
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		int m,n;
		System.out.println("chuong trinh dao nguoc chuoi");
		System.out.println(" xin vui long nhap chuoi");
		s=sc.nextLine();
		Cau7.reverse(s);		
		Cau7.DemKyTu1(s);
		System.out.println("nhập vị trí m, n để tách chuổi");
		m=sc.nextInt();
		n=sc.nextInt();
		Cau7.tachchuoi(s, m, n);
		sc.close();
	}

}
