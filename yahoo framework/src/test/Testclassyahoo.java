package test;

import java.io.IOException;

import org.testng.annotations.Test;

import generics.BaseTest;
import pom.Pomyahoo;

public class Testclassyahoo extends BaseTest
{

   @Test
   public void save() throws IOException, InterruptedException
   {
	   Pomyahoo f=new Pomyahoo(driver);
	   f.enterdetails();
	   
   }

}
