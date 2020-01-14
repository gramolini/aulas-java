import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostoGasolina posto = new PostoGasolina("Ipiranga",123456);
		
		BombaCombustivel bombas[] = new BombaCombustivel[9]; 
		bombas[0] = new BombaCombustivel(111,"GASOLINA",5.00,1000.00);
		bombas[1] = new BombaCombustivel(211,"ETANOL",3.00,1000.00);
		bombas[2] = new BombaCombustivel(311,"DIESEL",4.00,1000.00);
		bombas[3] = new BombaCombustivel(121,"GASOLINA",5.00,0.00);
		bombas[4] = new BombaCombustivel(221,"ETANOL",3.00,0.00);
		bombas[5] = new BombaCombustivel(321,"DIESEL",4.00,0.00);
		bombas[6] = new BombaCombustivel(131,"GASOLINA",5.00,100.00);
		bombas[7] = new BombaCombustivel(231,"ETANOL",3.00,100.00);
		bombas[8] = new BombaCombustivel(331,"DIESEL",4.00,100.00);
		
		posto.setBombas(bombas);
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Julia Domingues");
		funcionario.setCpf(490);
		
		int novoCliente;
		
		do{
			novoCliente = JOptionPane.showConfirmDialog(null, "Deseja abastecer?", "Posto Gasolina", JOptionPane.YES_NO_OPTION);
			if(novoCliente == JOptionPane.YES_OPTION) {
				String bombasDisponiveis;
				String combustivel;
				double quantidade;
				double gasto;
				int bombaEscolhida;
				boolean abasteceu;
				
				Cliente cliente = new Cliente();
				cliente.setNome(JOptionPane.showInputDialog(null,"NOME: "));
				cliente.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null,"CPF: ")));
				cliente.setTelefone(JOptionPane.showInputDialog(null,"TELEFONE: "));
				
				combustivel = JOptionPane.showInputDialog(null,"TIPO COMBUSTIVEL: ").toUpperCase();
				try{
					quantidade = Double.parseDouble(JOptionPane.showInputDialog(null,"QUANTIDADE: "));
					bombasDisponiveis = posto.bombasDisponiveis(combustivel,quantidade);
					if(!bombasDisponiveis.equals("Não há bombas disponíveis!")) {
						bombaEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null,"Bomba(s): "+bombasDisponiveis));
						for(int i=0;i<bombas.length;i++) {
							if(bombaEscolhida == bombas[i].getCodigoBomba()) {
								abasteceu = bombas[i].abastecerCarro(quantidade);
								if(abasteceu) {
									gasto = quantidade * bombas[i].getValorCombustivel();
									funcionario.clienteAtendido();
									JOptionPane.showMessageDialog(null, "Posto: "+posto.getNome()+
											" CNPJ: "+posto.getCnpj()+
											"\nBomba: "+bombas[i].getCodigoBomba()+
											" Funcionário: "+funcionario.getNome()+
											"\nLitros abastecidos: "+quantidade+
											" Total: R$"+gasto);
								}
							}
						}
					}
					else {
						JOptionPane.showMessageDialog(null, bombasDisponiveis);
					}
				}catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "A quantidade não esta correta!");
				}
			}
		}while(novoCliente == JOptionPane.YES_OPTION);
		
		/*String nome;
		
		do{
			String combustivel;
			double quantidade;
			String bombasDisponiveis;
			int bombaEscolhida;
			boolean abasteceu;
			double gasto;
			
			Cliente cliente = new Cliente();
			cliente.setNome(JOptionPane.showInputDialog("NOME: "));
			nome = cliente.getNome();
			nome.toUpperCase();
			
			if("SAIR" != nome.intern()) {
				cliente.setCpf(Integer.parseInt(JOptionPane.showInputDialog("CPF: ")));
				cliente.setTelefone(JOptionPane.showInputDialog("TELEFONE: "));
				
				combustivel = JOptionPane.showInputDialog("TIPO COMBUSTIVEL: ").toUpperCase();
				
				quantidade = Double.parseDouble(JOptionPane.showInputDialog("QUANTIDADE: "));
								
				bombasDisponiveis = posto.bombasDisponiveis(combustivel, quantidade);
				if("Nenhuma bomba disponível!" != bombasDisponiveis.intern()) {
					bombaEscolhida = Integer.parseInt(JOptionPane.showInputDialog(null, "BOMBAS DISPONIVEIS: "+bombasDisponiveis));
					for(int i=0; i<bombas.length;i++) {
						if(bombaEscolhida == bombas[i].getCodigoBomba()) {
							abasteceu = bombas[i].abastecerCarro(quantidade);
							if(abasteceu) {
								gasto = quantidade * bombas[i].getValorCombustivel();
								funcionario.clienteAtendido();
								JOptionPane.showMessageDialog(null, "Posto: "+posto.getNome()+
										"CNPJ: "+posto.getCnpj()+
										"\nBomba: "+bombas[i].getCodigoBomba()+
										"Funcionário: "+funcionario.getNome()+
										"\nLitros abastecidos: "+quantidade+
										"Total: R$"+gasto);
							}
						}
					}
				}
				else
					JOptionPane.showMessageDialog(null, bombasDisponiveis);
			}
			
		}while("SAIR" != nome.intern());*/
	}
}
