package peaje;


public class Vehiculo {
	private String placa;
	private int cantRuedas;
	private int cantPuertas;
	
	enum tipo{carro,moto,camion};
	tipo tipoVeh;
	
	public Vehiculo(String placa, int cantRuedas, int cantPuertas,tipo tipoVeh) {
		// TODO Auto-generated constructor stub
		
		this.placa=placa;
		this.cantRuedas=cantRuedas;
		this.cantPuertas=cantPuertas;
		this.tipoVeh=tipoVeh;
	
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public int getCantRuedas() {
		return cantRuedas;
	}


	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}


	public int getCantPuertas() {
		return cantPuertas;
	}


	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}
	
	public tipo getTipoVeh() {
		return tipoVeh;
	}


	public void setTipoVeh(tipo tipoVeh) {
		this.tipoVeh = tipoVeh;
	}


	
	

}

