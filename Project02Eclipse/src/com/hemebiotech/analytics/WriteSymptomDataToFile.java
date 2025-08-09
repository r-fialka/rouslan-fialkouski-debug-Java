package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {

	@Override
	public void writeSymptoms() {
		
		AnalyticsCounter headacheCount = new AnalyticsCounter();
		AnalyticsCounter rashCount = new AnalyticsCounter();
		AnalyticsCounter pupilCount = new AnalyticsCounter();
		
		FileWriter writer;
		try {
			writer = new FileWriter ("result.out");
			writer.write("headache: " + headacheCount + "\n");
			writer.write("rash: " + rashCount + "\n");
			writer.write("dialated pupils: " + pupilCount + "\n");
			writer.close();
		} catch (IOException e) {
			System.out.println("Impossible d'ecrire dans le fichier.");
		}
	}

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		
	}

}