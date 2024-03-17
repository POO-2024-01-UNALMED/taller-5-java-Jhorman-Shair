package zooAnimales;

import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{
	private ArrayList<Anfibio> listado= new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

	public Anfibio() {
		
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel,boolean venenoso) {
		super(nombre, edad, habitat,genero);
		this.colorPiel=colorPiel;
		this.venenoso=venenoso;
	}
	
	public void cantidadAnfibios() {
		
	}
	
	public String movimiento(){
		return "saltar";	
	}
	
	public void crearRana(){
		
	}
	
	public void crearSalamandra(){
		
	}
}
