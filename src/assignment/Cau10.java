/*
 * @author KhoiHT2
 * @date 5 thg 9, 2022
 * @version 1.0
 */



package assignment;

import java.util.Arrays;

public class Cau10 {
	
	public static void main(String[] args)
	  {
	    int num = 11;
	    Test obj1 = new Test();	    
	    int[] array = {1, 2}; // [1, 2]
	  //by pass value 
	    unchange(num);
	    System.out.println(num);
	    
	   //by pass refference 
	    changesomething(obj1,array);
	    System.out.println(obj1.item);
	    System.out.println(Arrays.toString(array));
	  }

	  public static void unchange(int a){
	    a = a * 10;	    
	  }
	  
	  public static void changesomething(Test a, int[] b){
		    a.item = "Huynh thanh khởi";
		    b[0] = 100;
		  }
	  
	}

class Test
{
  public String item = "unchanged";
}

