package verificacaoIdade;

import javax.swing.JOptionPane;

public class VerificacaoIdade {

	public static void main(String[] args) {
		try {
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"));
			if (idade < 12) {
				JOptionPane.showMessageDialog(null, "Criança");
			} else if (idade >= 12 && idade < 18) {
				JOptionPane.showMessageDialog(null, "Adolescente");
			} else if (idade >= 18 && idade < 60) {
				JOptionPane.showMessageDialog(null, "Adulto");
			} else if (idade >= 60 && idade < 115) {
				JOptionPane.showMessageDialog(null, "Idoso");
			} else {
				JOptionPane.showMessageDialog(null, "Inválido");
			}

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro, digite um número" + e);
		}

	}

}
