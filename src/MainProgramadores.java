/*
HOJA DE TRABAJO # 6
Desarrolladores de Java, Android y iOS

Autores:
Daniel Rodriguez # 15796
Yasmin Chavez #

Clase MAIN del Programa donde se organizan desarrolladores de Java, Android y iOS dependiendo
de su experiencia. Ademas se selecciona el tipo de ordenamiento a travez
de las diferentes implementaciones de SET (HashSet, TreeSet, LinkedHashSet)
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainProgramadores {

	//Atributos para los diferentes Sets de los Conjuntos
	protected static Set desJava;
	protected static Set desAndroid;
	protected static Set desiOS;
	protected static Set conjuntoExp;

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
		//Permite Instaciar el tipo de implementacion seleccionada comunicandose con la clase FactoryHash.
		 String cadena;
		 System.out.println("Elija el tipo de Hash (HashSet, TreeSet o LinkedHashSet): ");
		 String tHash = sc.nextLine();
		 if(tHash.equals("HashSet")) {
			 desJava = factory.getSet(tHash);
			 desAndroid = factory.getSet(tHash);
			 desiOS = factory.getSet(tHash);
			 conjuntoExp = factory.getSet(tHash);
		 }
		 if(tHash.equals("TreeSet")) {
			 desJava = factory.getSet(tHash);
			 desAndroid = factory.getSet(tHash);
			 desiOS = factory.getSet(tHash);
			 conjuntoExp = factory.getSet(tHash);
		 }
		 if(tHash.equals("LinkedHashSet")) {
			 desJava = factory.getSet(tHash);
			 desAndroid = factory.getSet(tHash);
			 desiOS = factory.getSet(tHash);
			 conjuntoExp = factory.getSet(tHash);
		 }
		 System.out.println("¿Cuantos programadores ingresara?");
		 int cantProgra = Integer.parseInt(sc.nextLine());

		 int cantIngresada = 0;

		//Obtiene la informacion de los desarrolladores y los almacena en los conjuntos.
		while(cantIngresada != cantProgra){

			System.out.println("Nombre del programador");
			String name = sc.nextLine();

			System.out.println("DPI del programador");
			String dpi = sc.nextLine();

			System.out.println("Desarrolla en Java (si/no)");
			String respJava = sc.nextLine();
			if(respJava.equals("si")){
				if(tHash.equals("TreeSet")){
					Conjunto java = new Conjunto(dpi, name, "Java");
					desJava.add(dpi);
				}
				else{
					Conjunto java = new Conjunto(dpi, name, "Java");
					desJava.add(java);
				}

			}
			System.out.println("Desarrolla en Android (si/no)");
			String respAndroid = sc.nextLine();
			if(respAndroid.equals("si")){
				if(tHash.equals("TreeSet")){
					Conjunto android = new Conjunto(dpi, name, "Java");
					desAndroid.add(dpi);
				}
				else{
					Conjunto android = new Conjunto(dpi, name, "Java");
					desAndroid.add(android);
				}
			}

			System.out.println("Desarrolla en iOS (si/no)");
			String respIos = sc.nextLine();
			if(respIos.equals("si")){
				if(tHash.equals("TreeSet")){
					Conjunto iOS = new Conjunto(dpi, name, "Java");
					desiOS.add(dpi);
				}
				else{
					Conjunto iOS = new Conjunto(dpi, name, "Java");
					desiOS.add(iOS);
				}
			}
			cantIngresada++;
		 }

		//Presenta la informacion de los diferentes conjuntos con la informacion organizada dependiendo de lo requerido.
		System.out.println("\nEl conjunto de los desarrolladores es: ");
		System.out.println("\nProgramadores de Java: "+desJava);
		System.out.println("\nProgramadores de Android: "+desAndroid);
		System.out.println("\nProgramadores de iOS: "+desiOS);

		System.out.println("\nProgramadores con experiencia Java, Android y iOS:");
		conjuntoExp.addAll(desJava);
		conjuntoExp.retainAll(desAndroid);
		conjuntoExp.retainAll(desiOS);
		System.out.println(conjuntoExp.toString());

		System.out.println("\nProgramadores con experiencia Java y no Android:");
		conjuntoExp.clear();
		conjuntoExp.addAll(desJava);
		conjuntoExp.addAll(desAndroid);
		conjuntoExp.removeAll(desAndroid);
		System.out.println(conjuntoExp.toString());

		System.out.println("\nProgramadores con experiencia Android y iOS, pero no Java:");
		conjuntoExp.containsAll(desiOS);
		conjuntoExp.clear();
		conjuntoExp.addAll(desAndroid);
		conjuntoExp.retainAll(desiOS);
		conjuntoExp.removeAll(desJava);
		System.out.println(conjuntoExp.toString());

		System.out.println("\nProgramadores con experiencia Android o iOS, pero no Java:");
		conjuntoExp.clear();
		conjuntoExp.addAll(desAndroid);
		conjuntoExp.addAll(desiOS);
		conjuntoExp.removeAll(desJava);
		System.out.println(conjuntoExp.toString());

		if(desAndroid.containsAll(desJava)){
			System.out.println("\nJava es un subjunto de Android.");
		}
		else{
			System.out.println("\nJava no es un subjunto de Android.");
		}

		int javaSize = desJava.size();
		int iOSize = desiOS.size();
		int androidSize = desAndroid.size();
		if(javaSize>iOSize && javaSize>androidSize){
				System.out.print("\nEl conjunto con la mayor cantidad desarrolladores es la de Java.");
		}
		else if(iOSize>javaSize && iOSize>androidSize){
				System.out.print("\nEl conjunto con la mayor cantidad desarrolladores es la de iOS.");
		}
		else if(androidSize>javaSize && androidSize>iOSize){
				System.out.print("\nEl conjunto con la mayor cantidad desarrolladores es la de Android.");
		}
		else{
				System.out.print("No hay conjunto con la mayor cantidad de desarrolladores.");
		}
	}
}
