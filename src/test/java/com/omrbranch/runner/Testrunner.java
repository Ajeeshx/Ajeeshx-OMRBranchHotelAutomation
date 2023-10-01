package com.omrbranch.runner;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
@RunWith(Cucumber.class)
@CucumberOptions(dryRun=false,snippets=SnippetType.CAMELCASE,publish=true,monochrome=true,plugin= {"pretty","json:target\\index.json"},

features="src\\test\\resources\\Features",name="",glue="com.omrbranch.stepdefinition")
public class Testrunner {
	@AfterClass
	public static void jvmReports() {
Reporting.generatejvmreport("C:\\Users\\HP\\eclipse-workspace\\OMRBranchHotelAutomation\\target\\index.json");	
}
}
