/*
 * @author KhoiHT2
 * @date 5 thg 9, 2022
 * @version 1.0
 */



package assignment;

import java.util.Arrays;

public class cau11 {
	
	public static void main(String[] args){
	    int num = 11;
	    Test1 obj1 = new Test1();	    
	    int[] array = {1, 2}; // [1, 2]
	  //by pass value ( đây là comment)
	    unchange(num);
	    System.out.println(num);
	    
	   //by pass refference ( đây là comment)
	    changesomething(obj1,array);
	    System.out.println(obj1.item);
	    System.out.println(Arrays.toString(array));
	  }
// javaDoc
	  /**
	 * @param a
	 */
	public static void unchange(int a){
	    a = a * 10;	    
	  }
// javaDoc	  
	  /**
	 * @param a
	 * @param b
	 */
	public static void changesomething(Test1 a, int[] b){
		    a.item = "Huynh thanh khởi";
		    b[0] = 100;
		  }
	  
}


class Test1
{
public String item = "unchanged";
}



