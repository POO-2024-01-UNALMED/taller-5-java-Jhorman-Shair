package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado= new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int creados;
	
	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}

	public Reptil() {
		creados++;
	}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		super(nombre, edad, habitat,genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		creados++;
	}
	
	public int cantidadReptiles() {
		return (iguanas+serpientes+creados);
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		String habitat="humedal";
		String colorEscamas="verde";
		int largoCola=3;
		Reptil a=new Reptil(nombre,edad,habitat,genero,colorEscamas,largoCola);
		iguanas++;
		return a;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		String habitat="jungla";
		String colorEscamas="blanco";
		int largoCola=1;
		Reptil a=new Reptil(nombre,edad,habitat,genero,colorEscamas,largoCola);
		serpientes++;
		return a;
	}
}
