package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * La classe {@code ReadSymptomDataFromFile} est une implémentation de
 * l'interface {@link ISymptomReader}. Elle permet de lire une liste de
 * symptômes depuis un fichier texte ligne par ligne.
 * <p>
 * Chaque ligne du fichier représente un symptôme.
 * </p>
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;

	/**
	 * Constructeur qui initialise le chemin du fichier à lire.
	 *
	 * @param filepath le chemin vers le fichier contenant les symptômes
	 */
	public ReadSymptomDataFromFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Lit les symptômes depuis le fichier spécifié lors de la construction.
	 * <p>
	 * Chaque ligne du fichier est ajoutée comme un élément de la liste retournée.
	 * Si le fichier est introuvable ou illisible, une exception sera affichée dans
	 * la console.
	 * </p>
	 *
	 * @return une liste de chaînes représentant les symptômes lus depuis le fichier
	 *         ; la liste peut être vide si une erreur se produit ou si le fichier
	 *         est vide
	 */
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
				System.out.println("Impossible lire le fichier." + filepath);
			}
		}
		return result;
	}
}