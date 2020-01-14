
public class Funcionario extends Pessoa{
	
	private int qntClientes;

	public int getQntClientes() {
		return qntClientes;
	}

	public void setQntClientes(int qntClientes) {
		this.qntClientes = qntClientes;
	}
	
	public void clienteAtendido() {
		this.qntClientes++;
	}
	
}//Código Pronto
