package peaje;


import peaje.Vehiculo.tipo;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		 Vehiculo carro = new Carro("ABC123", 4, 4,tipo.carro, "Sedan", "Rojo");
	        Vehiculo camion = new Camion("XYZ789", 6, 2,tipo.camion, 4);
	        
	        // Crear el peaje y registrar vehículos
	        Peaje peaje1 = new Peaje(1, "Peaje Principal", "Ciudad A", 0,0, carro);
	        
	        // Registrar un carro
	        peaje1.imprimirVehiculos();
	        peaje1.registrarPeaje();
	        
	        // Registrar un camión
	        peaje1.vehiculo = camion; // Cambiamos al camión
	        peaje1.imprimirVehiculos();
	        peaje1.registrarPeaje();
	        
	        // Mostrar el total de peajes recolectados
	        peaje1.mostrarTotalPeajes();
	    }

}

