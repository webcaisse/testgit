package com.mowitnow.businessObject;

public class Orientation {
	
	private char code;

	public char getCode() {
		return code;
	}

	public void setCode(char code) {
		this.code = code;
	}
	
	public Orientation() {
		super();
	}

	public Orientation(char code) {
		super();
		this.code = code;
	}
	
	public String toString(){
		return ""+code;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + code;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Orientation other = (Orientation) obj;
		if (code != other.code)
			return false;
		return true;
	}

}
