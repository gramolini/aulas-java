import javax.swing.JOptionPane;

public class PostoGasolina {
	private String nome; 
	private int cnpj;
	private BombaCombustivel bombas[];
	
	public PostoGasolina(String nome, int cnpj) {
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public BombaCombustivel[] getBombas() {
		return bombas;
	}
	public void setBombas(BombaCombustivel[] bombas) {
		this.bombas = bombas;
	}
	
	public void dadosBombas() {
		for(int i=0;i<bombas.length;i++) {
			JOptionPane.showMessageDialog(null, "Bomba "+bombas[i].getCodigoBomba()+
					"\nTipo combustível: "+bombas[i].getTipoCombustivel()+
					"\nQuantidade disponível: "+bombas[i].getQuantidadeDisponivel());
		}
	}
	
	public String bombasDisponiveis(String combustivel, double quantidade) {
		String bombasDisponiveis = "-";
		
		for(int i=0;i<bombas.length;i++){
			if(combustivel != null && bombas[i] != null && bombas[i].getTipoCombustivel() != null) {
				if(combustivel.equals(bombas[i].getTipoCombustivel())) {
					if(quantidade < bombas[i].getQuantidadeDisponivel()) {
						bombasDisponiveis = bombasDisponiveis+bombas[i].getCodigoBomba()+"-";
					}
				}
			}
		}
		
		if(bombasDisponiveis.equals("-")){
			bombasDisponiveis = "Não há bombas disponíveis!";
		}
		
		return bombasDisponiveis;
	}
}
