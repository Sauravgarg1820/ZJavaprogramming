package Brokenlink;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindBrokenLink {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		 List<WebElement> allLink = driver.findElements(By.tagName("a"));
		 System.out.println(allLink.size());
		 int count=0;
		List<String> urlList =new ArrayList<String>();
		for(WebElement link: allLink) {
		String linkUrl = link.getAttribute("href");
		urlList.add(linkUrl);
		
	try {
		URL url= new URL(linkUrl);
		HttpURLConnection httpURLConnection=(HttpURLConnection)url.openConnection();
		httpURLConnection.setConnectTimeout(5000);
		httpURLConnection.connect();
		
		
		
		if(httpURLConnection.getResponseCode()>=400) {
			System.out.println(linkUrl+"---->"+httpURLConnection.getResponseMessage()+"This link is broken");
			count++;
		}
		else
			System.out.println(linkUrl+"---->"+httpURLConnection.getResponseMessage()+"This link is not broken");
		}
	catch (Exception e) {
	}
	}
		System.out.println("no of broken links:" + count);
		


	}

}
