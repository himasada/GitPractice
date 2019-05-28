package MavenTest.MavenTestP;

import org.testng.annotations.Test;

public class MavpracTest {
	@Test
	public void sum()
	{
		int a= 2;
		int b= 3;
		System.out.println(a+b);
		
	}
	@Test
	public void sub()
	{
		int a= 2;
		int b= 3;
		System.out.println(b-a);
	}
	@Test
	public void multiply()
	{
		int a=4;
		int b= 5;
		System.out.println(a*b);
	}
	@Test
	public void division()
	{
		int a=5;
		int b=25;
		System.out.println(b/a);
	}

}
