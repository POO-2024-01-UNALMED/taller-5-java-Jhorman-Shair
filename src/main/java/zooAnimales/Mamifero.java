package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado= new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public boolean isPelaje() {
		return pelaje;
	}

	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public Mamifero() {
		
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
	public void cantidadMamiferos() {
		
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		boolean habitat=true;
		super(nombre, edad, habitat,genero);
		
	}
	
	public void crearLeon() {
		
	}
}
