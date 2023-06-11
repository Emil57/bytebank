package bytebank;

class Cuenta {
	//atributos de la instancia
	private double saldo; 
	private int agencia;
	private int numero;
	private Cliente titular = new Cliente();
	
	//variable de la instancia (objeto particular) 
	private static int total=0;

	//metodos de la instancia
	public Cuenta(int agencia) {
		if(agencia < 0) {
			System.out.println("No se permiten negativos");
			this.agencia = 1;
		} 
		else {
			this.agencia = agencia;
		}
		total++;
		System.out.println("Total de cuentas es: "+ total);
		
	}
	
	public void depositar(double valor) {
		saldo+=valor;
	}
	
	public boolean retirar(double valor){
		if(this.saldo >= valor) {
			this.saldo-=valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saldo-=valor;
			cuenta.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	
	//metodos de la clase
	public static int getTotal() {
		return Cuenta.total;
	}
}
