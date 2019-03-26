package test3;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class login {
	@Test
	public void open() throws InterruptedException{
	System.setProperty("webdriver.chrome.driver", "./Tools/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	String url1="http://localhost:8080/examsys/login.thtml";
	driver.get(url1);
	//用户名输入			
	driver.findElement(By.name("username")).sendKeys("hujianming");				
	//密码输入		       
	driver.findElement(By.name("userpass")).sendKeys("hujianming123");		
        //选择角色        
        WebElement s=driver.findElement(By.name("usertype"));
		        	Select s1=new Select(s);
		        	s1.selectByVisibleText("管理员");
		Thread.sleep(5000); 	
		      //点击登录
		      
		        	driver.findElement(By.cssSelector("button.tm_btn")).click(); 
}
}