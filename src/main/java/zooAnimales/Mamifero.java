package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado= new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public boolean pelaje0=true;
	public int patas0=4;
	public String habitat0="pradera";
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
	}
	
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
	
	public int cantidadMamiferos() {
		return (caballos+leones);
	}
	
	public void crearCaballo(String nombre, int edad, String genero) {
		this(nombre,edad,habitat0,genero,pelaje0,patas0);
	}
	
	public void crearLeon() {
		
	}
}
