public class Change
{
	public static void main(String[] args)
	{
		System.out.println("hello, world!");

		//count the number of ways to make change for a given amount of money.
		//hard coded to 1, 5, 10, and 25c cent coins
		public static int numberOfWaysToMakeChange(int cents)
		{
			int ways = 0;
			if (cents < 5)
			{
				return 1;
			}
			else if (cents < 9)
			{
				return 2;
			}
			else if (cents < 15)
			{
				return 4;
			}
			else if (cents < 20)

			if ( cents > 25)
			{
				ways++;
				if (cents%25 = 1)
				{
					ways++;
					return ways;
				}
				else if (cents%25)
			}
		return ways;

		}
	}


}