package bytebank;

public class PruebaMetodos {

	public static void main(String[] args) {
		Cuenta miCuenta = new Cuenta(502);
		miCuenta.depositar(300);
		System.out.println(miCuenta.getSaldo());
		miCuenta.retirar(100);
		System.out.println(miCuenta.getSaldo());
		
		Cuenta cuentaJimena = new Cuenta(10);
		cuentaJimena.depositar(1000);
		System.out.println("Saldo Jimena: "+ cuentaJimena.getSaldo());
		System.out.println("Saldo mi cuenta: "+ miCuenta.getAgencia());
		
		if(cuentaJimena.transferir(1020, miCuenta)) {
			System.out.println("Transferencia exitosa");
		}
		else {
			System.out.println("Transferencia fallo");

		}
		System.out.println("Saldo Jimena: "+ cuentaJimena.getSaldo());
		System.out.println("Saldo mi cuenta: "+ miCuenta.getSaldo());

	}

}
