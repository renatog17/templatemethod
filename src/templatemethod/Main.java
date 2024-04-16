package templatemethod;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String titulo = "texto";
		String corpo = "texto randomico texto randomico texto randomico texto randomico";
		
		SalvarDocumento salvarHtml = new SalvarHtml(titulo, corpo);
		SalvarDocumento salvarTxt = new SalvarTxt(titulo, corpo);
		
		List<SalvarDocumento> list = Arrays.asList(salvarHtml, salvarTxt);
		
		for (SalvarDocumento salvarDocumento : list) {
			salvarDocumento.salvarDocumento();
		}
		
	}

}
