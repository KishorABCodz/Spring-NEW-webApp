package com.example.model;

import javax.validation.constraints.NotEmpty;

public class registration {
	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
