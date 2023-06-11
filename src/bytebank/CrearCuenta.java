package bytebank;

public class CrearCuenta {

	public static void main(String[] args) {
		Cuenta primeraCuenta = new Cuenta(32);
		primeraCuenta.depositar(1000);
		System.out.println(primeraCuenta.getSaldo());
		
		Cuenta segundaCuenta = new Cuenta(35);
		primeraCuenta.depositar(200);
		System.out.println(segundaCuenta.getSaldo());
		System.out.println(primeraCuenta.getSaldo());

	}

}
