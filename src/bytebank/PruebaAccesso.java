package bytebank;

public class PruebaAccesso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta(2);
		cuenta.depositar(400);
		cuenta.retirar(300);
		System.out.println(cuenta.getSaldo());
		System.out.println("Agencia es: "+ cuenta.getAgencia());

	}

}
