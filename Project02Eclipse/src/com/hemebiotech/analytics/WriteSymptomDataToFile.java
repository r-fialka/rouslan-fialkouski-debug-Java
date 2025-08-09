package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteSymptomDataToFile implements ISymptomWriter {
	
	private String filepath;

    public WriteSymptomDataToFile(String filepath) {
        this.filepath = filepath;
    }

	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		try (FileWriter writer = new FileWriter(filepath)) {
            for (String wordSymptom : symptoms.keySet()) {
                writer.write(wordSymptom + " : " + symptoms.get(wordSymptom) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Impossible d'ecrire dans le fichier.");
        }
	}
}