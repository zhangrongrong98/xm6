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
	//�û�������			
	driver.findElement(By.name("username")).sendKeys("hujianming");				
	//��������		       
	driver.findElement(By.name("userpass")).sendKeys("hujianming123");		
        //ѡ���ɫ        
        WebElement s=driver.findElement(By.name("usertype"));
		        	Select s1=new Select(s);
		        	s1.selectByVisibleText("����Ա");
		Thread.sleep(5000); 	
		      //�����¼
		      
		        	driver.findElement(By.cssSelector("button.tm_btn")).click(); 
}
}