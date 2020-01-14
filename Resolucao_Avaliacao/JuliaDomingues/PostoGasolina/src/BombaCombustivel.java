
public class BombaCombustivel implements Abastecer{
	private int codigoBomba; 
	private String tipoCombustivel;//gasolina, etanol ou diesel
	private double valorCombustivel;
	private double quantidadeDisponivel;
	
	public BombaCombustivel(int codigoBomba, String tipoCombustivel, double valorCombustivel, double quantidadeDisponivel) {
		this.codigoBomba = codigoBomba;
		this.tipoCombustivel = tipoCombustivel;
		this.valorCombustivel = valorCombustivel;
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public int getCodigoBomba() {
		return codigoBomba;
	}
	public void setCodigoBomba(int codigoBomba) {
		this.codigoBomba = codigoBomba;
	}
	public String getTipoCombustivel() {
		return tipoCombustivel;
	}
	public void setTipoCombustível(String tipoCombustível) {
		this.tipoCombustivel = tipoCombustível;
	}
	public double getValorCombustivel() {
		return valorCombustivel;
	}
	public void setValorCombustivel(double valorCombustivel) {
		this.valorCombustivel = valorCombustivel;
	}
	public double getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(double quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	
	public boolean abastecerCarro(double qntCombustivel) {
		if(qntCombustivel<this.quantidadeDisponivel) {
			this.quantidadeDisponivel -= qntCombustivel;
			return true;
		}
		else
			return false;
	}
	
	public void encherBomba() {
		this.quantidadeDisponivel = 1000;
	}
}//Código pronto
