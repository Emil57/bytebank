package bytebank;

public class PruebaEncapsulamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuenta cuenta = new Cuenta(19);
		Cliente cliente = new Cliente();
		cliente.setNombre("Diego");
		cliente.setDocumento("1234fak");
		
		cuenta.setTitular(cliente);
		
		System.out.println(cuenta.getTitular().getNombre());
		System.out.println(cliente.getNombre());
		
		System.out.println(cliente);
		System.out.println(cuenta.getTitular());



	}

}
