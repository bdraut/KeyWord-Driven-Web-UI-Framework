
public class PyramidPrint {

	/*Program to print below pyramid using for loop
	 * 1234
	 * 567
	 * 89
	 * 0
	 */
	
	public static void main(String[] args) {
	
		for (int i=0;i<5;i++) 
		{
			System.out.print(i);
			for(int j=2 ; j<8;j++)
			{
				System.out.print(j);
			}
		}

	}

}
