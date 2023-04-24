package contas;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;

public class Arquivos {

	public static FileWriter path(int optP) throws IOException {

		// Se atentar com o Path, se o caminho do arquivo está correto
		String path = "C:\\ws-eclipse\\trabalhofinal\\";
		
		// Inserção de dados no txt responsável por todos os tipos de transações
		// realizadas por um usuário
		if (optP == 1) {
			FileWriter txtBanco = new FileWriter(path + "banco.txt", true);
			return txtBanco;
		}
		// Inserção de dados no txt responsável por Nota Fiscal
		if (optP == 2) {
			FileWriter txtSaque = new FileWriter(path + "nfSaque.txt", false);
			return txtSaque;
		}
		// Inserção de dados no txt responsável por Nota Fiscal
		if (optP == 3) {
			FileWriter txtDeposito = new FileWriter(path + "nfDeposito.txt", false);
			return txtDeposito;
		}
		// Inserção de dados no txt responsável por Nota Fiscal
		if (optP == 4) {
			FileWriter txtTransferencia = new FileWriter(path + "nfTransferencia.txt", false);
			return txtTransferencia;
		}
		// Inserção de dados no txt responsável por Nota Fiscal
		if (optP == 5) {
			FileWriter txtSeguro = new FileWriter(path + "nfSeguro.txt", false);
			return txtSeguro;
		}
		return null;
	}

	// Método de Formatação de moeda
	public static String formatInt(double valor) {

		DecimalFormat df = new DecimalFormat("#.##");
		String dataFormatada = df.format(valor);
		return dataFormatada;
	}

}
