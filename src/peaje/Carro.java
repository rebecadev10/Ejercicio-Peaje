package peaje;

public class Carro extends Vehiculo{

	String modelo;
	String Color;
	
	public Carro(String placa, int cantRuedas, int cantPuertas, tipo tipoVeh, String modelo, String color) {
		super(placa, cantRuedas, cantPuertas, tipoVeh);
		this.modelo = modelo;
		Color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
		
	
}
