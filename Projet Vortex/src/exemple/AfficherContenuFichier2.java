package exemple;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AfficherContenuFichier2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*File fichier = new File ("56e040ec0902e58df8573adaec65c5da6e9304");
        System.out.println("Chemin absolut du fichier : " + fichier.getAbsolutePath());
        System.out.println("Nom du fichier : "+fichier.getName());
        System.out.println("Est-ce qu'il existe ? " + fichier.exists());
        System.out.println("Est-ce un répertoire ? " + fichier.isDirectory());
        System.out.println("Est-ce un fichier ? " + fichier.isFile());*/
        
		try {
	          FileInputStream fis = new FileInputStream ("test.txt");
	          FileOutputStream fos = new FileOutputStream ("test2.txt");               
	                while((n = fis.read(buf)) >= 0)
	                {
	                        //On écrit dans notre deuxième fichier
	                		//avec l'objet adéquat 
	                        fos.write(buf);       
	                        //On affiche ce qu'a lu notre boucle
	                        //au format byte et au format char
	                        for(byte bit : buf)
	                        	System.out.print("\t" + bit + "(" + (char)bit + ")");
	                        
	                        System.out.println("");
	                }
	           fis.close ();
	           fos.close ();
	} catch (IOException e) {
	}

	}

}
