import javax.swing.*;


public class AchadoPerdido implements Publicacao {

	private String titulo;
	private String descricao;
	private String localAchado;
	private String tipo;
	private String status;
	private String foto;

	private String dataAchado;

	public AchadoPerdido(String titulo, String descricao, String localAchado, String tipo, String status, String foto, String dataAchado) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.localAchado = localAchado;
		this.tipo = tipo;
		this.status = status;
		this.foto = foto;
		this.dataAchado = dataAchado;
	}

	@Override
	public String getTitulo() {
		return titulo;
	}

	@Override
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String getDescricao() {
		return descricao;
	}

	public String getLocalAchado() {
		return localAchado;
	}

	public void setLocalAchado(String localAchado) {
		this.localAchado = localAchado;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getDataAchado() {
		return dataAchado;
	}

	public void setDataAchado(String dataAchado) {
		this.dataAchado = dataAchado;
	}

	@Override
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	// Implementação do método buscarTitulo da interface Publicacao
	@Override
	public String buscarTitulo(String titulo) {
		if (this.titulo.equalsIgnoreCase(titulo)) {
			return "Título: " + this.titulo + "\nDescrição: " + this.descricao + "\nLocal achado: " + this.localAchado;
		} else {
			return "Não encontrado";
		}
	}

	// Implementação do método visualizaDetalhes da interface Publicacao
	@Override
	public void visualizaDetalhes() {
		String message = "Título: " + this.titulo + "\n" +
				"Foto: " + this.foto + "\n" +
				"Local Achado: " + this.localAchado + "\n" +
				"Tipo: " + this.tipo + "\n" +
				"Status: " + this.status + "\n"+ "Data que foi achado: " + this.dataAchado + "\n";

		JOptionPane.showMessageDialog(null, message, "Detalhes do Item", JOptionPane.INFORMATION_MESSAGE);
	}

}
