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
			return new HashSet<String>();
		}
		if (theSet.equals("TreeSet")){
			return new TreeSet<String>();
		}
		if (theSet.equals("LinkedHashSet")){
			return new LinkedHashSet<String>();
		}
		else{
			return null;
		}
	}
}
