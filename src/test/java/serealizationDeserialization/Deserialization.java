package serealizationDeserialization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClasses.EmployeeDetails;
import pojoClasses.EmployeeDetailsWithArray;
import pojoClasses.EmployeeDetailsWithObject;
import pojoClasses.EmployeeObject;

public class Deserialization {
	@Test
	public void deSerialization() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper oMap =new ObjectMapper();
		EmployeeDetails emp = oMap.readValue(new File("./marshallFiles/empDetail.json"), EmployeeDetails.class);
		System.out.println(emp.geteName());
		System.out.println(emp.geteId());
		System.out.println(emp.getPhone());
		System.out.println(emp.getEmail());
	}

	@Test
	public void deSerializationOfComplexResponse() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper oMap =new ObjectMapper();
		EmployeeDetailsWithArray emp = oMap.readValue(new File("./marshallFiles/empDetail2.json"), EmployeeDetailsWithArray.class);
		System.out.println(emp.geteName());
		System.out.println(emp.geteId());
		System.out.println(emp.getPhone());
		System.out.println(emp.getEmail());
	}

	@Test
	public void deSerializationOfComplexRequestWithObject() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper oMap =new ObjectMapper();
		EmployeeDetailsWithObject emp = oMap.readValue(new File("./marshallFiles/empDetail3.json"), EmployeeDetailsWithObject.class);
		System.out.println(emp.geteName());
		System.out.println(emp.geteId());
		System.out.println(emp.getPhone());
		System.out.println(emp.getSpouse());
	}
	@Test
	public void deSerializationOfPage() throws JsonParseException, JsonMappingException, IOException
	{
		ObjectMapper oMap =new ObjectMapper();
		EmployeeObject emp = oMap.readValue(new File("./marshallFiles/empDetail4.json"), EmployeeObject.class);
		System.out.println(emp.geteName());
		System.out.println(emp.geteId());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhone());
		System.out.println(emp.getSpouse());
		System.out.println(emp.getKids());
	}
}
