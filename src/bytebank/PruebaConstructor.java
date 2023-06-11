package bytebank;

public class PruebaConstructor {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(234);
		Cuenta cuenta2 = new Cuenta(21);
		System.out.println("Total de cuentas es: "+Cuenta.getTotal());
	}

}
