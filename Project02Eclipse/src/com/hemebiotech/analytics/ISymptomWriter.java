package com.hemebiotech.analytics;

import java.util.Map;

/**
 * L’interface {@code ISymptomWriter} définit un contrat pour les classes qui
 * sont responsables de l'écriture des symptômes et de leurs occurrences dans
 * une source de sortie, comme un fichier.
 * 
 * <p>
 * Les implémentations typiques peuvent écrire les données dans un fichier
 * texte, une base de données, ou tout autre type de support.
 * </p>
 */
public interface ISymptomWriter {

	/**
	 * Écrit les symptômes et leur nombre d’occurrences dans une destination
	 * spécifique.
	 *
	 * @param symptoms une {@code Map} contenant les noms des symptômes en tant que
	 *                 clés et leur fréquence d'apparition en tant que valeurs
	 */
	public void writeSymptoms(Map<String, Integer> symptoms);
}