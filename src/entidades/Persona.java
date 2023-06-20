/*
 * Notas para trabajar con POO en JAVA
 * 
 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
 * 
 *  - Primero nuestras propiedades o atributos usando variables de JAVA
 *  
 *  - Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
 *  
 *  - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).
 *  
 *  
 *  
 *  Notas adicionales
 *  
 *  Sobrecarga de metodos.
 *  
 *  La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo.
 *  
 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
 *  
 * 
 */

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
		
		// 2. Sobrecarga de método (overloading) Constructor (con 3 parametros)

		public Persona(String nombre, String correo, String telefono) {

			this.nombre = nombre;
			this.correo = correo;
			this.telefono = telefono;
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
		
		//Si no respetamos número de parámetros, órden de los parámetros, órden de los datos o tipo de datos, tendremos errores para instanciar a nuestros objetos.
		Persona Mariana = new Persona("Mariana",19,"mariana@gmail.com"); //Segundo constructor
		
		Mariana.mostrarInformacion();
		
		Persona Fernanda = new Persona("Fernanda",20); //Tercer constructor
		Fernanda.mostrarInformacion();
		
		//Podemos definir primero nuestros objetos y después crear nuestros constructores
		//Persona Jesus = new Persona ("Jesús", "Maqueda", 31, 1.80f, 150.67f); Da error porque no se están alimentando los datos que están en el constructor.
		
		//No se puede instanciar porque no hay un constructor con un parámetro
//		Persona Victor = new Persona("Victor");
//		
//		Victor.mostrarInformacion();
		

	} // cierre del main

}// Cierre de clase persona
