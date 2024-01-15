
import java.io.*;
import java.util.*;

public class DigitExpressions {
	
	public static int ans;
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader(new File("as4-test.txt")));
		/*
		 * CHANGE TO 10 INPUTS
		 */
		for(int c = 0;c<10;c++)
		{
			String a = in.next();
			ans = 0;
			for(int i =1;i<a.length();i++)
			{
				String temp = a;
				if(temp.charAt(i)=='0')
				{
					continue;
				}
				temp = a.substring(0,i)+" "+a.substring(i);
				//System.out.println(temp);
				String[] split = temp.split(" ");
				oneOperator(split);
				//System.out.println(ans);
			}
			for(int i =1;i<a.length();i++)
			{
				String temp = a;
				if(temp.charAt(i)=='0')
				{
					continue;
				}
				temp = a.substring(0,i)+" "+a.substring(i);
				
				for(int j =i+2;j<temp.length();j++)
				{
					//System.out.print(j+"- " +temp+": ");
					if(temp.charAt(j)=='0')
					{
						//System.out.println();
						continue;
					}
					temp = temp.substring(0,j)+" "+temp.substring(j);
					//System.out.println(temp);
					String[] split = temp.split(" ");
					//System.out.println(Arrays.toString(split));
					twoOperator(split);
					//System.out.println(ans);
					temp = a.substring(0,i)+" "+a.substring(i);
				}
			}
			for(int i =1;i<a.length();i++)
			{
				String temp = a;
				if(temp.charAt(i)=='0')
				{
					continue;
				}
				temp = a.substring(0,i)+" "+a.substring(i);
				for(int j =i+2;j<temp.length();j++)
				{
					
					if(temp.charAt(j)=='0')
					{
						continue;
					}
					temp = temp.substring(0,j)+" "+temp.substring(j);
					for(int k = j+2;k<temp.length();k++)
					{
						if(temp.charAt(k)=='0')
						{
							continue;
						}
						temp = temp.substring(0,k)+" "+temp.substring(k);
						//System.out.println(temp);
						String[] split = temp.split(" ");
						threeOperator(split);
						temp = a.substring(0,i)+" "+a.substring(i);
						temp = temp.substring(0,j)+" "+temp.substring(j);
						//System.out.println(ans);
					}
					temp = a.substring(0,i)+" "+a.substring(i);
				}
				
				
			}
			
			System.out.println(ans);
			//System.out.println();
		}
	}
	public static void oneOperator(String[] split)
	{
		long first = Long.parseLong(split[0]);
		long second = Long.parseLong(split[1]);
		if(first+second>0)
			ans++;
		if(first*second>0)
			ans++;
		if(first-second>0)
			ans++;
	}
	public static void twoOperator(String[] split)
	{
		long first = Long.parseLong(split[0]);
		long second = Long.parseLong(split[1]);
		long third = Long.parseLong(split[2]);
		if(first+second-third>0)
			ans++;
		if(first+(second*third)>0)
			ans++;
		if(first-(second*third)>0)
			ans++;
		if(first-second+third>0)
			ans++;
		if((first*second)+third>0)
			ans++;
		if((first*second)-third>0)
			ans++;
		
	}
	public static void threeOperator(String[] split)
	{
		long first = Long.parseLong(split[0]);
		long second = Long.parseLong(split[1]);
		long third = Long.parseLong(split[2]);
		long four = Long.parseLong(split[3]);
		if(first+(second*third)-four>0)
			ans++;
		if(first+second-(third*four)>0)
			ans++;
		if((first*second)-third+four>0)
			ans++;
		if((first*second)+third-four>0)
			ans++;
		if(first-(second*third)+four>0)
			ans++;
		if(first-second+(third*four)>0)
			ans++;
	}
	

}
