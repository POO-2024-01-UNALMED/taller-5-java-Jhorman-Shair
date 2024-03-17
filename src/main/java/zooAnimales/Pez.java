package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado= new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int creados;
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getCantidadAletas() {
		return cantidadAletas;
	}

	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}

	public Pez() {
		creados++;
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		creados++;
	}
	
	public int cantidadPeces() {
		return (salmones+bacalaos+creados);
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		String habitat="oceano";
		String colorEscamas="rojo";
		int cantidadAletas=6;
		Pez a=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		salmones++;
		return a;
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		String habitat="oceano";
		String colorEscamas="gris";
		int cantidadAletas=6;
		Pez a=new Pez(nombre,edad,habitat,genero,colorEscamas,cantidadAletas);
		bacalaos++;
		return a;
	}
}
