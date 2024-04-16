package templatemethod;


public class SalvarTxt extends SalvarDocumento {

	public SalvarTxt(String titulo, String corpo) {
		super(titulo, corpo);
		this.extensao = "txt";
	}

	public void formatar() {
		this.textoFormatado = this.titulo + "\n" + this.corpo;
	}

}