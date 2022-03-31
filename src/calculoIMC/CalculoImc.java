package calculoIMC;

import javax.swing.JOptionPane;

public class CalculoImc {
	
	public static void main(String[] args) {
		try {
			String sexo = JOptionPane.showInputDialog("Informe o seu sexo com: \n M - Masculino \n F - Feminino").toUpperCase();
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua Idade"));
			float peso = Float.parseFloat(JOptionPane.showInputDialog("Informe seu Peso"));
			float altura = Float.parseFloat(JOptionPane.showInputDialog("Informe sua Altura"));
			float imc = calcularImc(sexo, idade, peso, altura);
			String condicao = verificarCondicao(imc, sexo);
			JOptionPane.showMessageDialog(null, condicao);
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Valores em formatos incorretos, por favor corrija-os");
		}
		
	}
	
	public static float calcularImc(String sexo, int idade, float peso, float altura) {
		if((sexo.equalsIgnoreCase("M")) && (sexo.equalsIgnoreCase("F"))) {
			Exception e = new Exception("sexo inválido, tente novamente");
			JOptionPane.showMessageDialog(null, e);
			System.exit(0);
		}
		float imc = peso/(altura*altura);
		return imc;
	}
	
	public static String verificarCondicao(float imc, String sexo) {
		String mensagem = "";
		switch (sexo) {
			case "F":
				if(imc < 19.1) {
					mensagem = "abaixo do peso";
				}else if(imc >= 19.1 && imc <= 25.8) {
					mensagem = "no peso normal";
				}else if(imc >= 25.8 && imc <= 27.3) {
					mensagem = "marginalmente acima do peso";
				}else if(imc >= 27.3 && imc <= 32.3) {
					mensagem = "acima do peso ideal";
				}else if(imc > 32.3) {
					mensagem = "obeso";
				}
				break;
			case "M":
				if(imc < 20.7) {
					mensagem = "abaixo do peso";
				}else if(imc >= 20.7 && imc <= 26.4) {
					mensagem = "no peso normal";
				}else if(imc >= 26.4 && imc <= 27.8) {
					mensagem = "marginalmente acima do peso";
				}else if(imc >= 27.8 && imc <= 31.1) {
					mensagem = "acima do peso ideal";
				}else if(imc > 31.1) {
					mensagem = "obeso";
				}
				break;	
		}
		
		return mensagem;
	}
	
}
