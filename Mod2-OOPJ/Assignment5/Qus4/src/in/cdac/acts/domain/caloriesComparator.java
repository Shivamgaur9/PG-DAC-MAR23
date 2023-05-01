package in.cdac.acts.domain;

import java.util.Comparator;

public class caloriesComparator implements Comparator<MenuItem> {

	@Override
	public int compare(MenuItem o1, MenuItem o2) {
		return o1.getCalories()-o2.getCalories();
	}

}
