package templatemethod;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public abstract class SalvarDocumento {

	protected String titulo;
	protected String corpo;
	protected String textoFormatado;
	protected String extensao;

	public SalvarDocumento(String titulo, String corpo) {
		super();
		this.titulo = titulo;
		this.corpo = corpo;
	}

	//template method
	public final void salvarDocumento() {
		this.formatar();
		this.salvar();
		this.logTimeStamp();
	}
	
	protected abstract void formatar();

	protected void salvar() {
		String caminhoArquivo = titulo + "." + extensao;
		try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo))) {
			escritor.write(this.textoFormatado);
			System.out.println("Arquivo criado com sucesso no diretório do projeto!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected void logTimeStamp() {
		System.out.println(LocalDateTime.now());
	}
}
