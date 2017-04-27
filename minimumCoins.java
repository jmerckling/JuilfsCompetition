import java.util.*;
import java.io.*;

public class minimumCoins 
{
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		
		int transactions = scan.nextInt();
		
		//Iterate through all transactions
		for(int i = 0; i < transactions; i ++)
		{
			int change = scan.nextInt(); //Change Due
			int size = scan.nextInt(); //Size of coin array
			int coin[] = new int[size];
			
			for(int j = 0; j < size; j++)
			{
				coin[j] = scan.nextInt();
			}
			
			System.out.println(greedyCoin(change, coin));
		}
	}
	
	// Greedy function to find minimum number of coins
	public static int greedyCoin(int change, int[] coin)
	{
		int min = 0;
		while(change != 0)
		{
			int max = coin.length;
			for(int i = max - 1; i >= 0; i--)
			{
				if(coin[i] <= change)
				{
					//System.out.println("initial i = " + i);
					change -= coin[i];
					min++;
					i = max;
					//System.out.println("Change = "+ change + " i = " + i);
				}
			}
		}//end while
		return min;
	}
}
