package entidades;

public class Cliente {
	
	//1. Atributos
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;

	
	//2. Constructor
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		super();
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.saldo=saldo;
		this.nip = nip;
	}//Constructor
	
	//3. Métodos
	public void mostrarInfoCliente() {
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + saldo);
		System.out.println("El nip es: " + nip);
	}//MostrarInfoCliente

	//Getters y setters

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

}//clase Cliente

/*
 * Encapsulamiento (1 de los 4 pilares de la POO)
 * 
 * 
 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y metodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos. 
 * 
 * 
 * Modificadores de acceso
 * 
 *     - public
 *     - private
 *     - protected
 *     - default (sin modificador de acceso)
 * 
 *
 *Con esto buscamos evitar:
 *
 *    - Reasignacion de valores
 *
 *        float cuenta = 157,478.75f;
 *        cuenta = 0.00f; 
 *
 * 
 */
