package test2;

import java.io.Serializable;

public class Food implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8965755615445631444L;
	String name;
	int kcal;
	public Food() {}
	public Food(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKcal() {
		return kcal;
	}
	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", kcal=" + kcal + "]";
	}
}
