package org.sample;

import java.io.File;

import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class Snippet {
	   public static void generateReport() {
	
	        File reportOutputDirectory = new File("target/advanced-report");
	        List<String> jsonFiles = new ArrayList<>();
	        jsonFiles.add("target/cucumber.json");
	
	        Configuration config = new Configuration(reportOutputDirectory, "Automation Project");
	        config.addClassifications("Platform", "Windows");
	        config.addClassifications("Browser", "Chrome");
	        config.addClassifications("Build", "1.0");
	
	        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
	        reportBuilder.generateReports();
	    }
	}


