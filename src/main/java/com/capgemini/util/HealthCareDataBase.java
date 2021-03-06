package com.capgemini.util;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.dto.DiagnosticCenter;
import com.capgemini.dto.Appointment;
import com.capgemini.dto.Test;

public class HealthCareDataBase {
	public static List<DiagnosticCenter> centerList= new ArrayList<DiagnosticCenter>();
	public static List<Test> listOfTests1 = new ArrayList<Test>();
	public static List<Test> listOfTests2 = new ArrayList<Test>();
	
	public static List<Appointment> AppointmentList = new ArrayList<Appointment>();
	public static int appointmentCount = 0;
	
	public static int centerCount = 0;
	public static int testCount = 0;
	public static String centerAutogeneratedId()
	{
		String key = "C"+(++centerCount);
		return key;
	}
	public static String testAutogeneratedId()
	{
	    String	key= "T"+(++testCount);
		return key;	
	}
	static
	{
		listOfTests1.add(new Test(testAutogeneratedId(),"Blood group"));
		listOfTests1.add(new Test(testAutogeneratedId(),"Blood sugar"));
		listOfTests1.add(new Test(testAutogeneratedId(),"Blood pressure"));
	}
	static
	{
		listOfTests2.add(new Test(testAutogeneratedId(),"Blood group"));
		listOfTests2.add(new Test(testAutogeneratedId(),"Blood sugar"));
		listOfTests2.add(new Test(testAutogeneratedId(),"Blood pressure"));
	}
	static
	{
		centerList.add(new DiagnosticCenter(centerAutogeneratedId(),"APOLLO",listOfTests1));
		centerList.add(new DiagnosticCenter(centerAutogeneratedId(),"AIIMS",listOfTests2));
	}
	static
	{
		//AppointmentList.add(new Appointment());
	}
	

}
