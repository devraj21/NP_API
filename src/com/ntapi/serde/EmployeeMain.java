package com.ntapi.serde;

import java.io.File;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;


public class EmployeeMain {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		Employee emp =  new Employee();
		
		emp.setName("Devraj");
		emp.setAge(35);
		emp.setContact("9049930659");
		emp.setDesignation("Engineer");
		
		File OutFile = new File("C:\\Users\\Welcome\\eclipse-workspace\\NT_API\\data\\empInput.json");
		//mapper.writeValue(OutFile, emp);
		
		String empJson = mapper.writeValueAsString(emp);
		System.out.println(empJson);
		
		
		//read json file and create java object
//		File file = new File("C:\\Users\\Welcome\\eclipse-workspace\\NT_API\\data\\empInput.json");
//		Employee e = mapper.readValue(file, Employee.class);
//		System.out.println(e);

	}

}
