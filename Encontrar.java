import javax.swing.JOptionPane;

public class Encontrar {

	public static void main(String[] args) {

		// criando um objeto da classe AchadoPerdido e inicializando com valores fictícios
		AchadoPerdido achado = new AchadoPerdido("Celular", "foto.jpg", "Mesa", "Eletrônico", "Achado", "foto.jpg", "18/04/2023");

		// completando os dados do objeto
		achado.setDescricao("Celular marca XYZ, cor preta");
		achado.setDataAchado("2022-04-18");

		// lendo um título digitado pelo usuário
		String tituloBusca = JOptionPane.showInputDialog(null, "Digite o título a ser buscado:");

		// chamando o método buscarTitulo e exibindo o resultado em uma mensagem do JOptionPane
		String resultadoBusca = achado.buscarTitulo(tituloBusca);
		JOptionPane.showMessageDialog(null, resultadoBusca, "Resultado da Busca", JOptionPane.INFORMATION_MESSAGE);

		// chamando o método visualizaDetalhes para exibir os detalhes do objeto em uma caixa de diálogo do JOptionPane
		achado.visualizaDetalhes();
	}
}
