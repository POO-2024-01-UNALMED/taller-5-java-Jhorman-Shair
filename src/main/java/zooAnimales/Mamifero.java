package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	private ArrayList<Mamifero> listado= new ArrayList<>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int creados;
	public static String habitat0="algo";
	public static boolean pelaje0=false;
	public static int patas0=4;

	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		String habitat="pradera";
		boolean pelaje=true;
		int patas=4;
		Mamifero a=new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
		caballos++;
		return a;
	}
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat,genero);
		this.pelaje=pelaje;
		this.patas=patas;
		creados++;
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
		creados++;
	}
	
	public int cantidadMamiferos() {
		return (caballos+leones+creados);
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		String habitat="selva";
		boolean pelaje=true;
		int patas=4;
		Mamifero a=new Mamifero(nombre, edad, habitat, genero,pelaje,patas);
		leones++;
		return a;
	}
}
