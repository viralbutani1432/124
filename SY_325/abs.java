class parent
{
	public void show()
	{
		System.out.print("Abstract class");
	}
}
class child extends parent{}


class abs
{
	public static void main(String []args)
	{
		parent child=new parent();
		child.show();
	}
}