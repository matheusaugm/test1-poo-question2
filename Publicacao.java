public interface Publicacao {
	public void setTitulo(String titulo);
	public String getTitulo();
	public void setDescricao(String descricao);
	public String getDescricao();

	// Implementação do método buscarTitulo da interface Publicacao
	String buscarTitulo(String titulo);

	// Implementação do método visualizaDetalhes da interface Publicacao
	void visualizaDetalhes();
}
