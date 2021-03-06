import java.util.Scanner;


public class BinaryToDecimal
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter binary number");
		
		String userBinary = input.nextLine();
		
		System.out.println(userBinary + " in decimal is " + binaryToDecimal(userBinary));
		
		input.close();
		
	}
	
	public static int binaryToDecimal(String s)
	{
		double decimalVal = 0;
		int power = s.length()-1;
		
		for (int i = 0; i < s.length(); i++)
		{
			if(s.charAt(i) == '1')
			{
				decimalVal = decimalVal + Math.pow(2, power);
			}
			power--;
		}
		return (int)decimalVal;
	}
}
