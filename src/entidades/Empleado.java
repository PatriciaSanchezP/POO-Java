package entidades;

//Primero tengo que dar la instrucción de que quiero heredar
public class Empleado extends Persona {
	

	//1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;

	//2. Constructor con parámetros (heredamos "la mitad" del constructor de Pesona
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //nos indica qué heredamos
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}

	

	public Empleado(String nombre, int edad, String numEmpleado, String nss, String puesto) {
		super(nombre, edad);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}


	//3. Método para imprimir Información del empleado
	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Teléfono: " + telefono);
		   System.out.println("Numero Empleado: " + numEmpleado);
           System.out.println("Numero Seguro Social: " + nss);
           System.out.println("Puesto: " + puesto);
	}
	
	

}
