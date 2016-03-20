package group1.artifact1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {
	
	@DataProvider( name = "dataFactory")
	public Object [][] dataGen(){
		Object [][] data = { { "arg00", "arg01" }, { "arg10", "arg11" } };
		return data;
	}
	
	@BeforeSuite
	public void beforeSuite(){
		System.out.println("From Before Suite ...");
	}
	
	@BeforeTest
	public void beforeTest(){
		System.out.println("From Before Test....");
	}
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("From Before Class.. <FirstTest>");
	}
	@Test(dataProvider = "dataFactory" )
	public void test1( String arg1, String arg2 ){
		System.out.println("From test1.... Arg1 : " + arg1 
				+ " Arg2 is : " + arg2 );
	}
	
	@Test
	@Parameters( { "name", "age" } )
	public void test2( String arg1, String arg2 ){
		System.out.println("From test2");
		System.out.println("Arg1 is : " + arg1 + " Arg2 is : " + arg2 );
	}
	
	@Test
	public void anotherTest(){
		System.out.println("Last test....Added now");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("From After Class... <FirstTest>");
	}
	
	@AfterTest
	public void afterTest(){
		System.out.println("From After Test....");
	}
	
	@AfterSuite
	public void afterSuite(){
		System.out.println("From After Suite ....");
	}
	
// Just a comment

}
