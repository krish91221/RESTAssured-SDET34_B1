package serealizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClasses.EmployeeDetails;
import pojoClasses.EmployeeDetailsWithArray;
import pojoClasses.EmployeeDetailsWithObject;
import pojoClasses.EmployeeObject;
import pojoClasses.Kid1;
import pojoClasses.Kid2;
import pojoClasses.Spouse;

public class Serialization {

	@Test
	public void serializationTest() throws JsonGenerationException, JsonMappingException, IOException
	{

		EmployeeDetails emp=new EmployeeDetails("Murali", "TYC00422078", 9989436339L, "murali.s@testyantra.in");
		ObjectMapper oMap=new ObjectMapper();
		oMap.writeValue(new File("./marshallFiles/empDetail.json"), emp);
	}

	@Test
	public void serializationOfComplexRequest() throws JsonGenerationException, JsonMappingException, IOException
	{
		long phone[]= {9989436339L,8886221868L};
		String email[]= {"muralikrish.tech@gmail.com","murali.s@testyantra.in"};
		EmployeeDetailsWithArray emp=new EmployeeDetailsWithArray("Murali", "TYC004078", phone,email) ;
		ObjectMapper oMap=new ObjectMapper();
		oMap.writeValue(new File("./marshallFiles/empDetail2.json"), emp);
	}

	@Test
	public void serializationOfComplexRequestWithObject() throws JsonGenerationException, JsonMappingException, IOException
	{
		long[] phone = { 9989436339L,8886221868L};
		Spouse s=new Spouse("Revathi", "Acc123", "Accenture",9989436339L);
		//Step 1: Create object of Pojo 
		EmployeeDetailsWithObject emp=new EmployeeDetailsWithObject("Nagendra Kumar", "nag@xyz.com", phone, s);

		//Step 2: Create obj of Object Mapper
		ObjectMapper oMap=new ObjectMapper();

		//Step 3: Call writeValues() of ObjectMapper
		oMap.writeValue(new File("./marshallFiles/empDetail3.json"), emp);
	}

	@Test
	public void serializationOfPage() throws JsonGenerationException, JsonMappingException, IOException
	{
		long[] phone = {9989436339L,8886221868L};
		String [] email= {"nkumar@gmail.com","gnk@accenture.com"};
		Spouse spouse=new Spouse("Revathi", "Acc123", "Accenture",9989436339L);
		Kid1 kid1=new Kid1("Baby1","B1");
		Kid2 kid2=new Kid2("Baby2","B2");
		Object[] kids= {kid1,kid2};
		//Step 1: Create object of Pojo 
		EmployeeObject emp=new EmployeeObject("Nagendra Kumar","gnkAcc123",email,phone,spouse,kids) ;
		//Step 2: Create obj of Object Mapper
		ObjectMapper oMap=new ObjectMapper();
		//Step 3: Call writeValues() of ObjectMapper
		oMap.writeValue(new File("./marshallFiles/empDetail4.json"), emp);
	}
}
