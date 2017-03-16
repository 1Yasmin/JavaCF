/*
HOJA DE TRABAJO # 6
Desarrolladores de Java, Android y iOS

Autores:
Daniel Rodriguez # 15796
Yasmin Chavez #

Clase FactoryHash permite seleccionar el tipo de ordenamiento a travez
de las diferentes implementaciones de SET (HashSet, TreeSet, LinkedHashSet)
utilizando el patron de diseño de Factory.
*/

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FactoryHash<E> {

	//Metodo que devuelve la instancia del tipo de SET dependiendo del seleccionado.
	public Set getSet(String theSet){
		if (theSet.equals("HashSet")){
			return new HashSet<Conjunto>();
		}
		if (theSet.equals("TreeSet")){
			return new TreeSet<Conjunto>();
		}
		if (theSet.equals("LinkedHashSet")){
			return new LinkedHashSet<Conjunto>();
		}
		else{
			return null;
		}
	}
}
