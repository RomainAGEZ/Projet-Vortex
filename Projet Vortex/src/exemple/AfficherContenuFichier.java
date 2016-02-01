package exemple;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AfficherContenuFichier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream flux= new FileInputStream("test.txt");
			ObjectInputStream lecture = new ObjectInputStream(flux);
			 
			int  val = lecture .readInt();
			System.out.println(val );
			lecture.close();
			}
			catch (Exception e){
			System.out.println(e.toString());
			}

			
	}

}
