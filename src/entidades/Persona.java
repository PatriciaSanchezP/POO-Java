package entidades;

public class Persona {

	// 1. Propiedades o atributos

	public String nombre;
	public int edad;
	public String correo;
	public String telefono;

	// 2. Constructor (con 4 parametros)

	public Persona(String nombre, int edad, String correo, String telefono) {

		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
	}//cierre de constructos
	
	// 2. Sobrecarga de método (overloading) Constructor (con 3 parametros)

		public Persona(String nombre, int edad, String correo) {

			this.nombre = nombre;
			this.edad = edad;
			this.correo = correo;
		}//cierre de constructos
		
		// 2. Sobrecarga de método Constructor (con 2 parametros)

		public Persona(String nombre, int edad) {

			this.nombre = nombre;
			this.edad = edad;
		}//cierre de constructos
		
		
	
	
	
	
	
	
	

	// 3. Métodos

	public void mostrarInformacion() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Teléfono: " + telefono);

	}
	

	// Método main es una función "ejecutora"
	public static void main(String[] args) {

		// Instancia de un objeto persona
		Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");

		Felipe.mostrarInformacion();

		Persona Paty = new Persona("Paty", 25, "patypina_@hotmail.com", "3333321221");

		Paty.mostrarInformacion();

		Persona Melisa = new Persona("Melisa", 27, "melisa@hotmail.com", "3321321221");

		Melisa.mostrarInformacion();

		Persona Nancy = new Persona("Nancy", 26, "nanz@hotmail.com", "3321321551");

		Nancy.mostrarInformacion();

		Persona Pablo = new Persona("Pablo", 23, "pablo@hotmail.com", "3321324451");

		Pablo.mostrarInformacion();

		Persona Pedro = new Persona("Pedro", 22, "pedro@hotmail.com", "3321321551");

		Pedro.mostrarInformacion();
		
		Persona Mariana = new Persona("Mariana",19,"mariana@gmail.com"); //Segundo constructor
		
		Mariana.mostrarInformacion();
		
		Persona Fernanda = new Persona("Fernanda",20); //Tercer constructor
		Fernanda.mostrarInformacion();
		
		//No se puede instanciar porque no hay un constructor con un parámetro
//		Persona Victor = new Persona("Victor");
//		
//		Victor.mostrarInformacion();
		

	} // cierre del main

}// Cierre de clase persona
