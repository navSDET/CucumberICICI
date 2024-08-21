package Utilities;

import StepDefination.CommonComponent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;


import static StepDefination.CommonComponent.driver;

public class Configuration
{
 public static void switchToChildWindow(int id)
 {
  Set<String> mulid =  driver.getWindowHandles();
  ArrayList<String> al= new ArrayList<>(mulid);
  driver.switchTo().window(al.get(id));
 }

 public static String getPropertyFromKey(String key)
 {
    String value=null;

    try{
     Properties prop= new Properties();
     FileInputStream file= new FileInputStream("src/test/resources/cofig.properties");
     prop.load(file);
     value= prop.getProperty(key);
    }
    catch(FileNotFoundException e)
    {
     throw new RuntimeException(e);
    }
    catch (IOException e)
    {
     throw new RuntimeException(e);
    }
    return value;
 }

}
