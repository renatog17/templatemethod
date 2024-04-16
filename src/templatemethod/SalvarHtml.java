package templatemethod;


public class SalvarHtml extends SalvarDocumento{

	

	public SalvarHtml(String titulo, String corpo) {
		super(titulo, corpo);
		this.extensao = "html";
	}

	public void formatar() {
		this.textoFormatado = "<html>\n" + "<body>\n" + "<h1>" + this.titulo + "</h1>\n" + "<p>" + this.corpo + "</p>\n"
				+ "</body>\n" + "</html>\n";
	}
	

}