package peaje;

public class Camion  extends Vehiculo{
	int cantEjes;

	
	public Camion(String placa, int cantRuedas, int cantPuertas, tipo tipoVeh, int cantEjes) {
		super(placa, cantRuedas, cantPuertas, tipoVeh);
		this.cantEjes = cantEjes;
	}

	public int getCantEjes() {
		return cantEjes;
	}

	public void setCantEjes(int cantEjes) {
		this.cantEjes = cantEjes;
	}

	



}
