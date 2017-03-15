import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Yasmin Chavez
 * @author Daniel Rodriguez
 */
public class MainProgramadores {

	protected static Set myHash;
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
		Conjunto<String, String, String>  miConjunto = new Conjunto<String, String, String>();

		Scanner sc = new Scanner(System.in);
		//Instanciar objetos a utilizar
		 String cadena;
		 System.out.println("Elija el tipo de Hash (HashSet, TreeSet o LinkedHashSet): ");
		 String tHash = sc.nextLine();
		 if(tHash.equals("HashSet")) {
			 myHash = factory.getSet(tHash);
			 System.out.println(myHash);
		 }
		 if(tHash.equals("TreeSet")) {
			 myHash = factory.getSet(tHash);
			 System.out.println(myHash);
		 }
		 if(tHash.equals("LinkedHashSet")) {
			 myHash = factory.getSet(tHash);
			 System.out.println(myHash);
		 }
		 System.out.println("¿Cuantos programadores ingresara?");
		 int cantProgra = Integer.parseInt(sc.nextLine());

		 int cantIngresada = 0;


		while(cantIngresada != cantProgra){

			System.out.println("Nombre del programador");
			String name = sc.nextLine();

			System.out.println("DPI del programador");
			String dpi = sc.nextLine();

			System.out.println("Desarrolla en Java (si/no)");
			String respJava = sc.nextLine();
			if(respJava.equals("si")){
				Conjunto java = new Conjunto("Java", name, dpi);
				myHash.add(java);
			}
			else{
				boolean desarrollaJava = false;
			}

			System.out.println("Desarrolla en Android (si/no)");
			String respAndroid = sc.nextLine();
			if(respAndroid.equals("si")){
				Conjunto android = new Conjunto("Android", name, dpi);
				myHash.add(android);
			}
			else{
				boolean desarrollaAndroid = false;
			}

			System.out.println("Desarrolla en iOS (si/no)");
			String respIos = sc.nextLine();
			if(respIos.equals("si")){
				Conjunto iOS = new Conjunto("iOS", name, dpi);
				myHash.add(iOS);
			}
			else{
				boolean desarrollaIos = false;
			}

			cantIngresada++;
		 }

		 



		//Operaciones Requeridas
		System.out.println("\nEl conjunto de los desarrolladores es: ");
		System.out.println(myHash);




	}

}
