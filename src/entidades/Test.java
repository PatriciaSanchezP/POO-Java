package entidades;

public class Test {

	public static void main(String[] args) {
		Empleado EvilFelipe = new Empleado("Evil Felipe",31,"evilFelipe@gmail.com","55255372571","ABC2343","83029749743", "Bell Boy");
		
		EvilFelipe.mostrarInformacion();
		
		Empleado Pikachu = new Empleado ("Pikachu",50,"ASRFRRF", "3456464", "Pokemon", null, null);
		
		Pikachu.mostrarInformacion();
		
		System.out.println("Impresión de Objetos");
		System.out.println(EvilFelipe);
		
		//Instancia de un cliente
		System.out.println();
		System.out.println("Instancia de un cliente");
		
		Cliente Jesus = new Cliente ("Jesús González", "ABCD1234", 1577654.00f, "1234");
		Jesus.mostrarInfoCliente();
		
		//Modificacion de un atributo
		Jesus.nombre = "Evil Jesus";
//		Jesus.setSaldo(0.00f); No va a funcionar, modificación sin setter
		Jesus.setCuentaBancaria("XSRFJR");
		
		System.out.println(Jesus.getCuentaBancaria());
		//Impresion del objeto ya modificado
		System.out.println();
		Jesus.mostrarInfoCliente();
		
		
	}
	


}
