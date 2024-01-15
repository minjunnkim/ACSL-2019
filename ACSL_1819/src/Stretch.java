import java.util.*;
import java.io.*;
public class Stretch {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(new FileReader(new File("as2-sample.txt")));
		for(int counter = 0;counter<10;counter++)
		{
			int r = in.nextInt();
			int c = in.nextInt();
			int s = in.nextInt();
			int n = in.nextInt();
			int[][] grid = new int[r][c];
			int x = s/c;
			int y = s%c;
			boolean[][] blocked = new boolean[r][c];
			for(int i =0;i<n;i++)
			{
				int next = in.nextInt();
				blocked[next/c][next%c]=true;
			}
			int block = 0;
			//A-0 B-1 C-2 D-3 E-4
			if(x==0)
			{
				while(y!=r-1)
				{
					if(block==0)
					{
						if(x==0||y>=c-3)
						{
							block++;
						}
						else
						{
							if(!(blocked[x][y+1]||blocked[x][y+2]||blocked[x][y+3]))
							{
								y+=3;
							}
							else if(!(blocked[x+1][y]||blocked[x+1][y+1]||blocked[x+1][y+2]))
							{
								x+=1;
								y+=2;
							}
						}
					}
					else if(block==1)
					{
						
					}
					else if(block==2)
					{
						
					}
					else if(block==3)
					{
						
					}
					else
					{
						
					}
				}
			}
			else
			{
				while(y!=0)
				{
					if(block==0)
					{
						
					}
					else if(block==1)
					{
						
					}
					else if(block==2)
					{
						
					}
					else if(block==3)
					{
						
					}
					else
					{
						
					}
				}
			}
			
			
		}
		
	}

}
