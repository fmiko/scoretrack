
public class TennisScoreGenerator
{
	static String[] Scores = {"0", "15", "30", "40", "A", "W"};
	public static void main(String args[])
	{
		String input = "DDFFDFDD";
		System.out.println(input);
		int d = 0;
		int f = 0;
		for (int i = 0; i < input.length(); i++)
		{
			int flag = 0;
			if (input.charAt(i) == 'D') 
			{
				d++;
			}
			if (input.charAt(i) == 'F')
			{
				f++;
			}
			//System.out.println("d: "+d+" f: "+f);
			if (d == 4 && f == 4)
			{
				System.out.println("40 - 40");
				flag = 1;
			}
			if (d - f > 2 && d == 4)
			{
				System.out.println("1-0");
				return;
			}
			if (f - d > 2 && f == 4)
			{
				System.out.println("0-1");
				return;
			}
			if (d == 5)
			{
				if (f == 3)
				{
					System.out.println("1-0");
					return;
				}
				else 
				{
					System.out.println("A - 40");
					d = 4;
					f = 3;
					flag = 1;
				}
			}
			if (f == 5)
			{
				if (d == 3)
				{
					System.out.println("0-1");
					return;
				}
				else
				{
					System.out.println("40 - A");
					f = 4;
					d = 3;
					flag = 1;
				}
			}
			if (flag == 0)
			{
				System.out.println(Scores[d]+" - "+Scores[f]);
			}
		}
	}
}
