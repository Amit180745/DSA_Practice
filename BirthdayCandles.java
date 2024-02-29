package Practice_DSA;

import java.util.*;

public class BirthdayCandles {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int max = 0;
        for(int i = 0; i < arr.length ; i++)
        {
           int num = arr[i];
           sc.close();
           if(num > max)
           {
              max = num;
              count = 1;
           }else if(max == num)
           {
           count++;
           }
         }   
         System.out.println(count);
    }
}
