package Practice_DSA;

import java.util.*;
import java.text.*;


public class Time_Conversion {
	
   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine(); //07:05:45PM
		DateFormat inFormat = new SimpleDateFormat( "hh:mm:ssaa");
		DateFormat outFormat = new SimpleDateFormat( "HH:mm:ss");

		Date date = null;
		try {
			date = inFormat.parse(s); 
		}catch (ParseException e ){
			e.printStackTrace();
		}
		if( date != null ){
			String myDate = outFormat.format(date);
			System.out.println(myDate);
		}
	}

	
}
