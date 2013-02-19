package com.metarnet.fusionchart.core;

import java.util.ArrayList;
import java.util.List;

public class Categories {
	public List<Category> categories;

	public Categories() {
		categories = new ArrayList<Category>();
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public void addCategory(Category category) {
		if (categories != null)
			categories.add(category);
	}

}
