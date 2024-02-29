package TestNg16;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest6 {

	
	@DataProvider
	public Object[][] data(){
		
	Object[][] arr =new Object[3][3];
	
	arr[0][0]= "Ram";
	arr[1][0]= "Mohan";
	arr[2][0]= "Shyam";
	
	arr[0][1]= "Ram@gmail.com";
	arr[1][1]= "Mohan@gmail.com";
	arr[2][1]= "Shyam@gmail.com";

	arr[0][2]= "riya@123";
	arr[1][2]= "priya@123";
	arr[2][2]= "sonam@123";
	
	return arr;
   }

	@Test(dataProvider= "data")
	public void register(String name, String email, String password) {
		System.out.println("Name : "+name +", email : "+email +", password : "+password);
	}
}
