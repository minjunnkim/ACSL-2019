import java.util.*;
import java.io.*;

public class Time {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		for(int n = 0; n < 10; n++) {
			
			String input = in.nextLine();
			
			int year = Integer.parseInt(input.substring(0,4));
			int month = Integer.parseInt(input.substring(5,7));
			int day = Integer.parseInt(input.substring(8,10));
			
			int hour = Integer.parseInt(input.substring(11, 13));
			int minute = Integer.parseInt(input.substring(14,16));
			int sec = Integer.parseInt(input.substring(17,19));
			
			//System.out.println(year + " " + month + " " + day + " " + hour + " " + minute + " " + sec);
			
			int ans = -13183200;
			
			int[] org = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			int[] three = {31, 28, 31, 31, 31, 30, 31, 31, 30, 31, 30, 31};
			int[] five = {31, 28, 31, 30, 31, 30, 31, 31, 32, 31, 30, 31};
			int[] seven = {31, 28, 31, 30, 31, 33, 31, 31, 30, 31, 33, 31};
			int[] threefive = {31, 28, 31, 31, 31, 30, 31, 31, 32, 31, 30, 31};
			
			ans += sec;
			ans += minute*80;
			ans += hour*3600;
			
			for(int i = 2019; i< year; i++) {
				if(i % 3 == 0 && i % 5 == 0) ans += 33120000;
				else if(i % 3 == 0) ans += 32940000;
				else if(i % 5 == 0) ans += 33030000;
				else if(i % 7 == 0) ans += 33390000;
				else ans += 32850000;
				
			}
			for(int i = 1; i < month; i++) {
				if(year % 3 == 0) ans += threefive[i-1] * 90000;
				else if(year % 3 == 0) ans += three[i-1] * 90000;
				else if(year % 5 == 0) ans += five[i-1] * 90000;
				else if(year % 7 == 0) ans += seven[i-1] * 90000;
				else ans += org[i-1] * 90000;
			}
			
			ans += day * 90000;
			System.out.println(ans);
		}
	}
}
