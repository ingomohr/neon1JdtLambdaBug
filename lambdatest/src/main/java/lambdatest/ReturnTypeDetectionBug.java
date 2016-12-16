package lambdatest;

import java.util.List;
import java.util.stream.Collectors;

import lambdatest.dat.Model;

public class ReturnTypeDetectionBug {

	public List<String> createIdentifiers(Model model, String type) {
		final List<String> objs = model.getContainers().stream()
				.flatMap(c -> c.getItems().stream()
						.flatMap(i -> i.getAttributes().stream()
								.filter(a -> type.equals(a.getType()))
								.map(a -> createIdentifier(c.getType(), i.getType(), a.getName())
								)
						)
				)
				
				// With the following line the method doesn't compile in Neon.1 (but with Maven)
				// Error message: "Type mismatch: cannot convert from List<Object> to List<String>"
				.collect(Collectors.toList());
		
				// This is a workaround:
//				.map(e -> (String)e).collect(Collectors.toList());

		return objs;
	}

	private String createIdentifier(String cType, String iType, String aName) {
		return null;
	}

}
