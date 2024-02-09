package Versuch4;

import java.io.Serializable;

public class Mensch implements Serializable {

	private String name;
	private double groesse;
	private int alter;
	
	//Konstruktor
	public Mensch(String name , double groesse, int alter) {
		this.name = name;
		this.groesse = groesse;
		this.alter = alter;
		
	}
	
	public void Ausgabe() {
		System.out.println("Name ist: " +name);
		System.out.println("Groesse ist: " +groesse);
		System.out.println("Alter ist: " +alter);		
  }
    @Override
    public String toString() {
        return "Name: " + name + ", Größe: " + groesse + ", Alter: " + alter;
    }
}
