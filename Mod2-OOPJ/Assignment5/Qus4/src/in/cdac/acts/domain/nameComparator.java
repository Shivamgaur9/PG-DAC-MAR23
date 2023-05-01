package in.cdac.acts.domain;

import java.util.Comparator;

public class nameComparator implements Comparator<MenuItem> {

	@Override
	public int compare(MenuItem o1, MenuItem o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
