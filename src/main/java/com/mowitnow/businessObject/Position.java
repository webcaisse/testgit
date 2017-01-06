package com.mowitnow.businessObject;

public class Position {
	
	private Cordonnee cordonnee;
	
	private Orientation orientation;
	
	public Position() {
		super();
	}
	
	public Position(Cordonnee cordonnee, Orientation orientation) {
		super();
		this.cordonnee = cordonnee;
		this.orientation = orientation;
	}
	
	public Position(int x, int y, char code) {
		super();
		this.cordonnee = new Cordonnee(x,y);
		this.orientation = new Orientation(code);
	}

	public Cordonnee getCordonnee() {
		return cordonnee;
	}

	public void setCordonnee(Cordonnee cordonnee) {
		this.cordonnee = cordonnee;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}
	
	public String toString(){
		return cordonnee.toString()+" "+orientation.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cordonnee == null) ? 0 : cordonnee.hashCode());
		result = prime * result + ((orientation == null) ? 0 : orientation.hashCode());
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
		Position other = (Position) obj;
		if (cordonnee == null) {
			if (other.cordonnee != null)
				return false;
		} else if (!cordonnee.equals(other.cordonnee))
			return false;
		if (orientation == null) {
			if (other.orientation != null)
				return false;
		} else if (!orientation.equals(other.orientation))
			return false;
		return true;
	}
	
}
