import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Nom du fichier à lire
        String nomFichier = "test.txt";

        // Compteur total de mots
        int totalMots = 0;

        try {
            // Créer le lecteur de fichier (File Scanner)
            File fichier = new File(nomFichier);
            Scanner lecteur = new Scanner(fichier);

            System.out.println("=== Compteur de Mots ===");
            System.out.println("Lecture du fichier : " + nomFichier);
            System.out.println("------------------------");

            int numeroLigne = 1;

            // Boucle qui lit chaque ligne du fichier
            while (lecteur.hasNextLine()) {

                // Lire la ligne courante
                String ligne = lecteur.nextLine();

                // Séparer la ligne par les espaces
                String[] mots = ligne.split(" ");

                // Compter les mots de cette ligne
                int motsDansLigne = mots.length;

                // Afficher le résultat de la ligne
                System.out.println("Ligne " + numeroLigne + " (" + motsDansLigne + " mots) : " + ligne);

                // Additionner au total
                totalMots += motsDansLigne;
                numeroLigne++;
            }

            // Fermer le lecteur
            lecteur.close();

            System.out.println("------------------------");
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (FileNotFoundException e) {
            // Si le fichier n'est pas trouvé
            System.out.println("Erreur : fichier '" + nomFichier + "' non trouvé !");
        }
    }
}