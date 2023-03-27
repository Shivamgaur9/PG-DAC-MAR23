public class Array2{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter Element: ");
			arr[i]=sc.nextInt();
		}
		for(int a:arr){
			System.out.println(a);
		}
	}
}