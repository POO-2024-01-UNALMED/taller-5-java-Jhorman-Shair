package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	private ArrayList<Pez> listado= new ArrayList<>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
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
		
	}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat,genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
	}
	
	public void cantidadPeces() {
		
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}
}
