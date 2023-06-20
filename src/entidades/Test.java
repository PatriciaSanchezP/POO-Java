package entidades;

public class Test {

	public static void main(String[] args) {
		Empleado EvilFelipe = new Empleado("Evil Felipe",31,"evilFelipe@gmail.com","55255372571","ABC2343","83029749743", "Bell Boy");
		
		EvilFelipe.mostrarInformacion();
		
		Empleado Pikachu = new Empleado ("Pikachu",50,"ASRFRRF", "3456464", "Pokemon", null, null);
		
		Pikachu.mostrarInformacion();
		
		System.out.println("Impresión de Objetos");
		System.out.println(EvilFelipe);
		
		
	}
	


}
