
import org.testng.annotations.Test;

public class ReadingdatafromCommandtest {

	@Test(groups="smoke")
	public void ReadingdatafromCommandtest() {
		
	String URL=	System.getProperty("url");
	String UN=System.getProperty("username");
	String PWD=System.getProperty("password");
	System.out.println(URL);
	System.out.println(UN);
	System.out.println(PWD);

}
	@Test(groups="rt")
	public void regressiontest() {
		System.out.println("regression test");
	}
}
