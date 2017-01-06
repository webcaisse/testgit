package com.mowitnow.businessObject;

public class Pelouse {

	private int maxX;
	
	private int maxY;
	
	public Pelouse() {
		
	}	

	public Pelouse(int maxX, int maxY) {
		super();
		this.maxX = maxX;
		this.maxY = maxY;
	}

	public int getMaxX() {
		return maxX;
	}

	public void setMaxX(int maxX) {
		this.maxX = maxX;
	}

	public int getMaxY() {
		return maxY;
	}

	public void setMaxY(int maxY) {
		this.maxY = maxY;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maxX;
		result = prime * result + maxY;
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
		Pelouse other = (Pelouse) obj;
		if (maxX != other.maxX)
			return false;
		if (maxY != other.maxY)
			return false;
		return true;
	}
	
	public String toString(){
		return ""+maxX+" "+maxY;
	}
	
}
