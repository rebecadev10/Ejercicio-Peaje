package peaje;
import peaje.Vehiculo.tipo;

public class Peaje {
	int id;
	String nombre;
	String ciudad;
	int totalDiario;
	int totalAcumulado;
	Vehiculo vehiculo;
	Camion camion;
	
	
	public Peaje(int id, String nombre, String ciudad, int totalDiario,int totalAcumulado,Vehiculo vehiculo) {
	
		this.id = id;
		this.nombre = nombre;
		this.ciudad = ciudad;
		this.totalDiario = totalDiario;
		this.totalAcumulado=totalAcumulado;
		this.vehiculo=vehiculo;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getTotalDiario() {
		return totalDiario;
	}

	public void setTotalDiario(int totalDiario) {
		this.totalDiario = totalDiario;
	}

	public int getTotalAcumulado() {
		return totalAcumulado;
	}

	public void setTotalAcumulado(int totalAcumulado) {
		this.totalAcumulado = totalAcumulado;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

		public int calcularPeaje() {
		if(vehiculo.getTipoVeh()==tipo.carro) {
			
			return  10;
		}
		else if (vehiculo.getTipoVeh()==tipo.moto) {
			return 5;
		}
		else if(vehiculo.getTipoVeh()==tipo.camion) {
	        if (vehiculo instanceof Camion) {
	            Camion camion = (Camion) vehiculo;  // Hacer el casting seguro
	            return 5 * camion.getCantEjes();    // Calcular el peaje basado en la cantidad de ejes
	        }
		}
		return 0;
	}
	
	  // Método para sumar el peaje al total diario y acumulado
    public void registrarPeaje() {
        int peaje = calcularPeaje();
        totalDiario += peaje;
        totalAcumulado += peaje;
    }
	
	public void  imprimirVehiculos() {
		
		System.out.println("Vechiculo registrado: ");
		System.out.println("Numero de placa: "+ vehiculo.getPlaca());
		System.out.println("Tipo de Vehiculo: "+ vehiculo.getTipoVeh() );
		System.out.println("Peaje correspondiente:" + calcularPeaje());
		
	}
	 // Método para mostrar el total de peajes recolectados
    public void mostrarTotalPeajes() {
        System.out.println("Total peajes recolectados hoy: " + totalDiario);
        System.out.println("Total acumulado de peajes: " + totalAcumulado);
    }
	

}
