package folhaDePagamento;

import folhaDePagamento.Salario;
import javax.swing.JOptionPane;

public class FolhaDePagamento {

	public static void main(String[] args) {
		double horas = Double.parseDouble(JOptionPane.showInputDialog("informe a quantidade de horas"));
		double valorHora = Double.parseDouble(JOptionPane.showInputDialog("informe o valor da hora"));
		Salario salario = new Salario();
		salario.setQtdeHoraTrabalhada(horas);
		salario.setValorHora(valorHora);
		System.out.println(salario);
	}

}
