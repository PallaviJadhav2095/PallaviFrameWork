package UtlisLayer;

import java.util.ArrayList;
import java.util.Set;

import BaseLayer.BaseClass;

public class HandleWindowsMethods extends BaseClass{
	
	public static String handletwowindows(Set<String>allwindows,String parent) {
		for(String abc:allwindows)
		{
			if(!abc.equals(parent))
			{
				driver.switchTo().window(abc);
				return driver.getWindowHandle();
			}
		}
		return null;
	}

	public static String handleThreeWindows(String parent,String firstwindow,Set<String>allwindows) {
		for (String abc:allwindows)
		{
			if((!abc.equals(parent))&&(!abc.equals(firstwindow)))
			{
				driver.switchTo().window(abc);
				return driver.getWindowHandle();	
			}
		}
		return null;
	}
	public static String handleFourWindows(String parent,String firstwindow,String secondwindow,Set<String>allwindows) {
		for (String abc:allwindows)
		{
			if((!abc.equals(parent))&&(!abc.equals(firstwindow))&&(!abc.equals(secondwindow)))
			{
				driver.switchTo().window(abc);
				return driver.getWindowHandle();	
			}
		}
		return null;
		
	}



    //Window handle using Arraylist
public static void HandlewindowwithArrayList(Set<String>allwindows,String parent,int index) {
	ArrayList<String> arr=new ArrayList<String>(allwindows);
	driver.switchTo().window(arr.get(index));
	
}
}


