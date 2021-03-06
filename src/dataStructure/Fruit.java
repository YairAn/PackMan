package dataStructure;

import utils.*;

public class Fruit {
	private int type;
	private double value;
	private  Point3D pos;
	private boolean underTarget;
	private edge_data edge;
	
	
	public boolean isUnderTarget() {
		return this.underTarget;
	}

	public void setUnderTarget(boolean underTarget) {
		this.underTarget = underTarget;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public Point3D getPos() {
		return pos;
	}

	public void setPos(Point3D pos) {
		this.pos = pos;
	}

	public Fruit() {
			
	}
	public Fruit(int type,double value,Point3D p) {
		this.type=type;
		this.value=value;
		this.pos=p;
		this.underTarget = false;
		this.edge =null;
	}

	public edge_data getEdge() {
		return edge;
	}

	

	public void setEdge(edge_data e) {
		this.edge = e;
		
	}

}
