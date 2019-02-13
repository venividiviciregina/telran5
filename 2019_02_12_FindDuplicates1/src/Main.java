import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		List<String> listOne = new ArrayList(Arrays.asList("java", "c", "python", "delphi"));
		List<String> listTwo = new ArrayList(Arrays.asList("html", "java", "python", "java"));

		System.out.println(findDuplicate(listOne, listTwo));
	}

	public static List<String> findDuplicate(List<String> listA, List<String> listB) {

		if ((listA == null) || (listB == null) || listA.isEmpty() || listB.isEmpty())
			return Collections.emptyList();

		Set<String> setListA = new TreeSet<>(listA);
		setListA.retainAll(listB);

		return new ArrayList<String>(setListA);
	}
}
