import java.util.Scanner;
class simple_interest
{
		public static void main(String[] args)
		{
			Scanner user=new Scanner(System.in);
			int value;
			int per;
			int interest;
			System.out.println("Enter value :" );
			value=user.nextInt();
			System.out.println("Enter interest percentages:");
			per=user.nextInt();
			interest=value/100*per;
			System.out.println("simple interest:"+interest);
		}
}