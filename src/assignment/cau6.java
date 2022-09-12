/*
 * @author KhoiHT2
 * @date 30 thg 8, 2022
 * @version 1.0
 */



package assignment;

public class cau6 {

	public static void main(String[] args) {
		cau6.convertBinary(123);

	}
	  public static void convertBinary(int num){
	        int binary[] = new int[50];
	        int index = 0;
	        while(num > 0){
	            binary[index++] = num%2;
	            num = num/2;
	        }
	        for(int i = index-1;i >= 0;i--){
	            System.out.print(binary[i]);
	        }
	    }

}
