package utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import pageObjects.NhsDemoBaseClass;


public class FailedTestCasesSceenShots extends NhsDemoBaseClass{

		public void getScreenshot() {
		String location="/DemoFinal/Screenshots";
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			try {
				System.out.println("enter into the screenshot method");
				FileUtils.copyFile(src,new File(location + "Screenshot1" +"_"+".png"));
			} catch (Exception e) 
			
			{
				
				e.printStackTrace();
			}
	 }

	
}