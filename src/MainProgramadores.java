import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author Yasmin Chavez
 *
 */
public class MainProgramadores {

	
	/**
	 * @param args
	 * Java Collections Framework: Sets
	 * Interface: Set 
	 * Implementation: HashSet, TreeSet, LinkedHashSet
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryHash factory = new FactoryHash();
		
		Scanner sc = new Scanner(System.in); 
		//Instanciar objetos a utilizar
		 String cadena;
		 System.out.println("Elija el tipo de Hash (HashSet, TreeSet o LinkedHashSet): ");
		 String tHash = sc.nextLine();
		 if(!tHash.equals("PilaLista")) {
			 Set myHash = factory.getSet(tHash);
		 }
		 
		 
		 
		
	

	}

}
