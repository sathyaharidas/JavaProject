import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.BeforeClass;
import org.junit.Test;


public class UnitTestEmployeeDetails {
	
	
static Class empClassObj = null;
static Class mainClassObj = null;
	
	@BeforeClass
	public static void setUp(){
		try {
			empClassObj = Class.forName("Employee");
			
		} catch (ClassNotFoundException e) {
			fail("No class with the name Employee is specified as per the problem statement");
		}
		
		
		try {
			mainClassObj = Class.forName("Main");
			
		} catch (ClassNotFoundException e) {
			fail("No class with the name Main is specified as per the problem statement");
		}
	}
	
	@Test
	public void testAttributeEmployeeId_NameCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeId");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be employeeId");
			}
		}
	}
	
	@Test
	public void testAttributeEmployeeId_ModifierCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeId");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for employeeId-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributeEmployeeId_TypeCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeId");
			Class modifierType=bookNameField.getType();
		
			assertTrue(modifierType.getName().equals("int"));
			
			
			
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for employeeId-Should be a int");
			}
		}
	}
	
	
	@Test
	public void testAttributeEmployeeName_NameCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeName");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be employeeName");
			}
		}
	}
	
	@Test
	public void testAttributeemployeeName_ModifierCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeName");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for employeeName-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributeEmployeeName_TypeCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("employeeName");
			Class modifierType=bookNameField.getType();
		
			assertTrue(modifierType.getName().equals("java.lang.String"));
			
			
			
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for employeeName-Should be a String");
			}
		}
	}
	
	
	
	@Test
	public void testAttributesalary_NameCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("salary");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be salary");
			}
		}
	}
	
	@Test
	public void testAttributesalary_ModifierCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("salary");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for salary-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributesalary_TypeCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("salary");
			Class modifierType=bookNameField.getType();
		
			assertTrue(modifierType.getName().equals("double"));
			
			
			
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for salary-Should be a double");
			}
		}
	}
	

	@Test
	public void testAttributenetSalary_NameCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("netSalary");
			}
			catch(Error|Exception e)
			{
				fail("Incorrect attribute Name- should be netSalary");
			}
		}
	}
	
	@Test
	public void testAttributenetSalary_ModifierCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("netSalary");
			int modifier=bookNameField.getModifiers();
			
				assertTrue(modifier==2);
			}
			catch(Error|Exception e)
			{
				fail("Incorrect modifier for netSalary-Should be a private");
			}
		}
	}
	
	@Test
	public void testAttributenetSalary_TypeCheck()
	{
		if(empClassObj!=null){
			try{
			Field bookNameField=empClassObj.getDeclaredField("netSalary");
			Class modifierType=bookNameField.getType();
		
			assertTrue(modifierType.getName().equals("double"));
			
			
			
			}
			
			catch(Error|Exception e)
			{
				fail("Incorrect type for netSalary-Should be a double");
			}
		}
	}
	
	
	
	@Test
	public void testEmployeeClassGetterSetterForemployeeId() {	
		try{
			Employee eobj=null;
			
		if( empClassObj != null){
			Constructor consRef=null;
				try{
				consRef =empClassObj.getConstructor();
				eobj=(Employee)consRef.newInstance();
				}
				catch(Exception e)
				{
					
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
				
					Method m = empClassObj.getMethod("setEmployeeId", new Class[]{int.class});
				 
					if(m!=null){
						int value=m.getModifiers();
						
						if(value!=1 &&  (!m.getReturnType().equals("void")))
							fail("Check whether the signature of the setEmployeeId is correct");
						else{
							m.invoke(eobj, 100);
						}
					}
					else
						fail("Check the availability of setter for employeeId method in Employee class");
					}

					Method m1 = empClassObj.getMethod("getEmployeeId");//Integer.TYPE
					if(m1!=null){
					
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getEmployeeId is correct");
					else{
					
					int	resname=(int)(m1.invoke(eobj));
					
						try{
							assertTrue(resname==100);
						}
						catch(Error | Exception e){
							fail("Check the correctness of setEmployeeId/getEmployeeId method in Employee class");
						}
					}
					}
					else
						fail("Check the availability of getter for employeeId method in Employee class");
					

		}
		catch(Exception  e)
		{
			
			if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
					fail("Check the signature of getter/setter of employeeId attribute");
		}
	}
	
	@Test
	public void testEmployeeClassGetterSetterForemployeeName() {	
		try{
			Employee eobj=null;
			
		if( empClassObj != null){
			Constructor consRef=null;
				try{
				consRef =empClassObj.getConstructor();
				eobj=(Employee)consRef.newInstance();
				}
				catch(Exception e)
				{
					
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
			
					Method m = empClassObj.getMethod("setEmployeeName", new Class[]{String.class});
				 
					
						int value=m.getModifiers();
						System.out.println(m.getReturnType() +" "+ value);
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setEmployeeName is correct");
						else{
							m.invoke(eobj, "John");
						}
					

					Method m1 = empClassObj.getMethod("getEmployeeName");//Integer.TYPE
					
					
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getEmployeeName is correct");
					else{
					
					String resname=(String)(m1.invoke(eobj));
					
						try{
							assertTrue(resname.equals("John"));
						}
						catch(Error | Exception e){
							fail("Check the correctness of setEmployeeName/getEmployeeName method in Employee class");
						}
					}
					
		}
		}
		catch(Exception  e)
		{
			
			if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
					fail("Check the availability of getter/setter of employeeName attribute");
		}
	}
	

	
	@Test
	public void testEmployeeClassGetterSetterForsalary() {	
		try{
			Employee eobj=null;
			
		if( empClassObj != null){
			Constructor consRef=null;
				try{
				consRef =empClassObj.getConstructor();
				eobj=(Employee)consRef.newInstance();
				}
				catch(Exception e)
				{
					
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
				
					Method m = empClassObj.getMethod("setSalary", new Class[]{double.class});
				 
					
						int value=m.getModifiers();
						
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setEmployeeSalary is correct");
						else{
							m.invoke(eobj, 1000.50);
						}
				

					Method m1 = empClassObj.getMethod("getSalary");//Integer.TYPE
					
					
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getSalary is correct");
					else{
					
					double resname=(double)(m1.invoke(eobj));
					
					
						try{
							assertTrue(resname==1000.50);
						}
						catch(Error | Exception e){
							fail("Check the availability of setSalary/getSalary method in Employee class");
						}
					}
					
		}
		}
		catch(Exception  e)
		{
			
			if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
				{ 
					fail("Check the availability of getter/setter of salary attribute");
				}
		}
	}
	
	
	@Test
	public void testEmployeeClassGetterSetterForNetSalary() {	
		try{
			Employee eobj=null;
			
		if( empClassObj != null){
			Constructor consRef=null;
				try{
				consRef =empClassObj.getConstructor();
				eobj=(Employee)consRef.newInstance();
				
				}
				catch(Exception e)
				{
					
					fail("Do not provide any additional constructor other than default constructor - which is not asked in the problem statement");
				}
				
				
					Method m = empClassObj.getMethod("setNetSalary", new Class[]{double.class});
				 
					if(m!=null){
						int value=m.getModifiers();
						System.out.println("return type"+m.getReturnType()+ value);
						if(value!=1 ||  (!(m.getReturnType().getName().equals("void"))))
							fail("Check whether the signature of the setNetSalary is correct");
						
					}
					else
						fail("Check the availability of setter for netSalary method in Employee class");
					}

		
				
					Method m1 = empClassObj.getMethod("getNetSalary");
				
					
					
					int value1=m1.getModifiers();
					if(value1!=1)
						fail("Check whether the signature of the getNetSalary is correct");
					
				
					

		}
		catch(NoSuchMethodException  e)
		{
						
		if(e.getMessage().contains("Do not provide"))
				fail(e.getMessage());
				else
				{ 
					fail("Check the availability of getter/setter of netSalary attribute");
				}
		}
	}
	

}
