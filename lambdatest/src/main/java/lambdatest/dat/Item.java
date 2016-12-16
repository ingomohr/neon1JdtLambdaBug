package lambdatest.dat;

import java.util.ArrayList;
import java.util.List;

public class Item extends TypedElement {

	private final List<Attribute> attributes = new ArrayList<>();

	public List<Attribute> getAttributes() {
		return attributes;
	}

}
