package com.omrbranch.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
public class Reporting {

public static void generatejvmreport(String jsonFile) {
	File file =new File("C:\\Users\\HP\\eclipse-workspace\\OMRBranchHotelAutomation\\target");
	Configuration configuration =new Configuration(file, "OMR Branch Automation");
	configuration.addClassifications("os","WIN11");
	configuration.addClassifications("Browser", "Chrome");
	configuration.addClassifications("Browser version", "119");
	configuration.addClassifications("Sprint", "34");
	configuration.addClassifications("Testing", "Reg");
	
	List<String>jsonFiles = new ArrayList<String>();
	jsonFiles.add(jsonFile);
	ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);
	builder.generateReports();
	
	
}
}
