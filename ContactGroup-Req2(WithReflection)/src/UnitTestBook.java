import static org.junit.Assert.*;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;


import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.*;



public class UnitTestBook {
	
	
	
	static Class classObj = null;
	
	@BeforeClass
	public static void setUp(){
		try {
			classObj = Class.forName("Book");
		} catch (ClassNotFoundException e) {
			fail("No class with the name Book is specified as per the problem statement");
		}
	}
	
	@Test
	public void testAttributeBookName_NameCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookName");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be bookName");
			}
		}
	}
	
	@Test
	public void testAttributeBookName_ModifierCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookName");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for bookName-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributeBookName_TypeCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookName");
			Class modifierType=bookNameField.getType();
		
			assertTrue(modifierType.getName().equals("java.lang.String"));
			
			
			
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for bookName-Should be a String");
			}
		}
	}
	
	@Test
	public void testAttributeBookPrice_NameCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookPrice");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be bookPrice");
			}
		}
	}
	
	@Test
	public void testAttributeBookPrice_ModifierCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookPrice");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for bookPrice-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributeBookPrice_TypeCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("bookPrice");
			Class modifierType=bookNameField.getType();
			assertTrue(modifierType.getName().equals("int"));
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for bookPrice-Should be a int");
			}
		}
	}
	
	@Test
	public void testAttributeauthorName_NameCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("authorName");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be authorName");
			}
		}
	}
	
	@Test
	public void testAttributeAuthorName_ModifierCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("authorName");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for authorName-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributeAuthorName_TypeCheck()
	{
		if(classObj!=null){
			try{
			Field bookNameField=classObj.getDeclaredField("authorName");
			Class modifierType=bookNameField.getType();
			assertTrue(modifierType.getName().equals("java.lang.String"));
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for authorName-Should be a String");
			}
		}
	}
	
	@Test
	public void testBookClassGetterSetterForbookName() {	
		try{
			Book bobj=null;
			
		if( classObj != null){
			Constructor consRef=null;
				try{
				consRef = classObj.getConstructor();
				bobj=(Book)consRef.newInstance();
				}
				catch(Exception e)
				{
					
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
				
					Method m = classObj.getDeclaredMethod("setBookName", new Class[]{String.class});
				 
					System.out.println(m);
						int value=m.getModifiers();
						
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setBookName is correct");
						else{
							m.invoke(bobj, "Java");
						}
					
					
					}

					Method m1 = classObj.getDeclaredMethod("getBookName");//Integer.TYPE
					
					String resname="";
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getBookName is correct");
					else{
					
						resname=(String)(m1.invoke(bobj));
						try{
							assertTrue(resname.equals("Java"));
						}
						catch(Error | Exception e){
							fail("Check the correctness of setBookName/getBookName method in Book class");
						}
					}
					

		}
		catch(Exception e)
		{
			
			if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
					fail("Check the availability of getter/setter of bookName attribute");
		}
	}
	
	
	
	@Test
	public void testBookClassGetterSetterForBookPrice() {	
		try{
			Book bobj=null;
			
		if( classObj != null){
			Constructor consRef=null;
				try{
				consRef = classObj.getConstructor();
				bobj=(Book)consRef.newInstance();
				}
				catch(Exception e)
				{
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
			
					Method m = classObj.getDeclaredMethod("setBookPrice", int.class);
					
				
					
						int value=m.getModifiers();
						
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setBookPrice is correct");
						else{
							m.invoke(bobj, 1000);
						}
				
					}

					Method m1 = classObj.getDeclaredMethod("getBookPrice");//Integer.TYPE
					
					
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getBookPrice is correct");
					else{
					
						int resname=(int)(m1.invoke(bobj));
					
						try{
							assertTrue(resname==1000);
						}
						catch(Error | Exception e){
							
							fail("Check the correctness of setBookPrice/getBookPrice method in Book class");
						}
					}
				
					

		}
		catch(Exception e)
		{
			if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
					fail("Check the availability of getter/setter of bookPrice attribute");
		}
	}
	
	
	@Test
	public void testBookClassGetterSetterForAuthorName() {	
		try{
			Book bobj=null;
			
		if( classObj != null){
			Constructor consRef=null;
				try{
				consRef = classObj.getConstructor();
				bobj=(Book)consRef.newInstance();
				}
				catch(Exception e)
				{
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
					Method m = classObj.getDeclaredMethod("setAuthorName", new Class[]{String.class});
				 
					
						int value=m.getModifiers();
						
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setAuthorName is correct");
						else{
							m.invoke(bobj, "James Gosling");
						}
					
					}

					Method m1 = classObj.getDeclaredMethod("getAuthorName");//Integer.TYPE
					
					String resname="";
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getAuthorName is correct");
					else{
					
						resname=(String)(m1.invoke(bobj));
						try{
							assertTrue(resname.equals("James Gosling"));
						}
						catch(Error | Exception e){
							fail("Check the correctness of setAuthorName/getAuthorName method in Book class");
						}
					}
					
					

		}
		catch(Exception  e)
		{
			if(e.getMessage().contains("Do not provide"))
			fail(e.getMessage());
			else
				fail("Check the availability of getter/setter of authorName attribute");
		}
	}
	
}
		