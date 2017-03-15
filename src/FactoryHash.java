import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 */

/**
 * @author ychav
 *
 */
public class FactoryHash<E> {
	
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
