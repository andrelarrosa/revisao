package ordemInversa;

import javax.swing.JOptionPane;

public class OrdemInversa {

	public static void main(String[] args) {
		String valores = JOptionPane.showInputDialog("Informe os valores");
		String separador = JOptionPane.showInputDialog("Informe o separador dos valores");
		try {
			String valoresInvertidos[] = inverterValores(valores, separador);
			String resultadoInversao = String.join(", ", valoresInvertidos);
			JOptionPane.showMessageDialog(null, resultadoInversao);			
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Formato inválido");
		}
	}
	
	public static String[] inverterValores(String valor, String separador) {

		String valores[] = valor.split(separador);
		String resultado[] = new String[valores.length];
		for(int i = 0; i < valores.length; i++) {
			resultado[i] = valores[valores.length-i-1];
		}
		return resultado;
	}
}
