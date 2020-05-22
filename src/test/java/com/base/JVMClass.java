package com.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMClass {

	public static void jvmReportGenerate(String jsonFileLoca) {

		File JvmLoc = new File(System.getProperty("user.dir") + "\\src\\test\\resources\\JVMReport");

		Configuration con = new Configuration(JvmLoc, "Cucumber Project Evening ");

		con.addClassifications("Browser", "Firefox");
		con.addClassifications("Framework", "Cucumber - BDD");
		con.addClassifications("Environment", "Java");
		// ==================================================================================

		List<String> listOfJson = new ArrayList<String>();

		listOfJson.add(jsonFileLoca);

		ReportBuilder build = new ReportBuilder(listOfJson, con);

		build.generateReports();

	}

}
