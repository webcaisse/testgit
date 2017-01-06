package com.mowitnow.businessObject;

import com.mowitnow.util.MowException;

public class Tondeuse {
	
	private Position position;
	
	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Tondeuse(Position position) {
		super();
		this.position = position;
	}
	
	public Tondeuse(int x, int y, char code) {
		this.position = new Position(x,y,code);
	}
	
	public String toString(){
		return this.position.toString();
	}
	
	public void executerInstruction(Pelouse pelouse,char inst) throws MowException{
		switch (inst){
			case 'D':
				pivoterDroit();
				break;
			case 'G':
				pivoterGauche();
				break;
			case 'A':
				avancer(pelouse);
				break;
			default:
				throw new MowException("Instruction incorrecte: "+inst);
		}
	}

	private void avancer(Pelouse pelouse) throws MowException{
		int x=this.position.getCordonnee().getX();
		int y=this.position.getCordonnee().getY();
		switch (this.position.getOrientation().getCode()){
			case 'N':
				y++;
				break;
			case 'E':
				x++;
				break;
			case 'S':
				y--;
				break;
			case 'W':
				x--;
				break;
			default:
				throw new MowException("avancement impossible");
		}
		if(x>=0 && x<=pelouse.getMaxX())
			this.position.getCordonnee().setX(x);
		if(y>=0 && y<=pelouse.getMaxY())
			this.position.getCordonnee().setY(y);
	}

	private void pivoterGauche() throws MowException{
		switch (this.position.getOrientation().getCode()){
			case 'N':
				this.position.getOrientation().setCode('W');
				break;
			case 'W':
				this.position.getOrientation().setCode('S');
				break;
			case 'S':
				this.position.getOrientation().setCode('E');
				break;
			case 'E':
				this.position.getOrientation().setCode('N');
				break;
			default:
				throw new MowException("Orientation inexistante");
		}
	}

	private void pivoterDroit() throws MowException{
		switch (this.position.getOrientation().getCode()){
			case 'N':
				this.position.getOrientation().setCode('E');
				break;
			case 'E':
				this.position.getOrientation().setCode('S');
				break;
			case 'S':
				this.position.getOrientation().setCode('W');
				break;
			case 'W':
				this.position.getOrientation().setCode('N');
				break;
			default:
				throw new MowException("Orientation inexistante");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
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
		Tondeuse other = (Tondeuse) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		return true;
	}

}
