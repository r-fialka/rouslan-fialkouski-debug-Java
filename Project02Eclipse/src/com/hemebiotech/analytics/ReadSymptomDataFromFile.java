package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	public ReadSymptomDataFromFile(String filepath) {
        this.filepath = filepath;
    }
	
	@Override
	public List<String> getSymptoms() {
	    List<String> result = new ArrayList<>();

	    if (filepath != null) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(filepath))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                result.add(line);
	            }
	            reader.close();
	        } catch (IOException e) {
	        	System.out.println("Impossible lire le fichier.");
	        }
	    }

	    return result;
	}

}