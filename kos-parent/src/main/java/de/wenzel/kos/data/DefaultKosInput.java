package de.wenzel.kos.data;

import java.util.ArrayList;
import java.util.List;

public class DefaultKosInput implements KosInput{

	private List<KosResource> resources = new ArrayList<>();

	@Override
	public List<KosResource> getResources() {
		return resources;
	}

}
