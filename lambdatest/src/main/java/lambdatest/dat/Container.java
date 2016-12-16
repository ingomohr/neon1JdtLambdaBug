package lambdatest.dat;

import java.util.ArrayList;
import java.util.List;

public class Container extends TypedElement {

	private final List<Item> items = new ArrayList<>();

	public List<Item> getItems() {
		return items;
	}

}
