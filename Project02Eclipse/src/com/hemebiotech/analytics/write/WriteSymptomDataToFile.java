package com.hemebiotech.analytics.write;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * La classe {@code WriteSymptomDataToFile} est une implémentation de
 * l’interface {@link ISymptomWriter}. Elle permet d’écrire une liste de
 * symptômes avec leur nombre d’occurrences dans un fichier texte.
 * <p>
 * Chaque ligne du fichier contient un symptôme suivi de son nombre, au format :
 * {@code symptome : nombre}
 * </p>
 */
public class WriteSymptomDataToFile implements ISymptomWriter {
	private String filepath;

	/**
	 * Constructeur qui initialise le chemin du fichier dans lequel écrire les
	 * résultats.
	 *
	 * @param filepath le chemin du fichier de sortie
	 */
	public WriteSymptomDataToFile(String filepath) {
		this.filepath = filepath;
	}

	/**
	 * Écrit les symptômes et leur nombre d’occurrences dans le fichier spécifié.
	 * <p>
	 * Chaque entrée de la map sera écrite sur une nouvelle ligne dans le format :
	 * {@code symptome : nombre}.
	 * </p>
	 * En cas d'erreur d'écriture, un message d’erreur est affiché dans la console.
	 *
	 * @param symptoms une {@code Map} contenant les noms des symptômes comme clés
	 *                 et leur fréquence comme valeurs
	 */
	@Override
	public void writeSymptoms(Map<String, Integer> symptoms) {
		try (FileWriter writer = new FileWriter(filepath)) {
			for (String wordSymptom : symptoms.keySet()) {
				writer.write(wordSymptom + " : " + symptoms.get(wordSymptom) + "\n");
			}
			writer.close();
		} catch (IOException e) {
			System.out.println("Impossible d'ecrire dans le fichier." + filepath);
		}
	}
}