# 🧬 Analyseur de Symptômes - HemeBiotech Analytics

Ce projet Java a pour objectif de lire une liste de symptômes depuis un fichier texte, 
de compter la fréquence d’apparition de chaque symptôme, de trier les résultats par ordre alphabétique, puis d’enregistrer ces résultats dans un fichier de sortie.

---

## 📁 Structure du projet

com.hemebiotech.analytics  
    ├── Main.java # Point d'entrée de l'application  
    ├── AnalyticsCounter.java # Classe principale pour l’analyse  
    ├── ReadSymptomDataFromFile.java # Lecture des symptômes depuis un fichier  
    ├── WriteSymptomDataToFile.java # Écriture des résultats dans un fichier  
    ├── ISymptomReader.java # Interface pour la lecture  
    └── ISymptomWriter.java # Interface pour l’écriture  

---

## ⚙️ Fonctionnalités

- 📥 Lecture des symptômes depuis un fichier texte (symptoms.txt)
- 📊 Comptage du nombre d’occurrences de chaque symptôme
- 🔤 Tri des symptômes par ordre alphabétique
- 💾 Écriture des résultats dans un fichier (result.out)

---

## 🚀 Exécution

### 📌 Prérequis

- Java 8 ou plus
- IDE ou terminal avec javac et java

### 📦 Compilation
```bash
javac -d bin src/com/hemebiotech/analytics/*.java
```
## ▶️ Lancement
```bash
java -cp bin com.hemebiotech.analytics.Main
```
## 📝 Format des fichiers

✅ Fichier d'entrée : symptoms.txt  
Chaque ligne contient un nom de symptôme, par exemple :
- headache,
- highblood pressure,
- rash

✅ Fichier de sortie : result.out  
Chaque ligne contient un symptôme et sa fréquence :
- headache : 3
- highblood pressure : 10
- rash : 4

## 🧩 Extensions possibles
Générer des graphiques ou rapports PDF
Ajouter une interface graphique (Swing, JavaFX)
Lire à partir d'une base de données
Filtrage ou regroupement des symptômes
## 👨‍💻 Auteur
Projet développé dans le cadre d’un exercice d’analyse de données en Java.
## 📄 Licence
Ce projet est libre de droits pour l’apprentissage et l’expérimentation.
