package ordemCrescente;

import javax.swing.JOptionPane;

public class OrdemCrescente {

	public static void main(String[] args) {
		String valores = JOptionPane.showInputDialog("Informe 03 valores separados somente por vírgula");
		valores = ordemCrescente(valores);
		JOptionPane.showMessageDialog(null, valores);
	}
	
	public static String ordemCrescente(String valor) {
		String valores[] = valor.split(",");
		int valoresConvertidos[] = new int[valores.length];
		for(int i = 0; i < valores.length; i++) {
			try {
				valoresConvertidos[i] = Integer.parseInt(valores[i]);			
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Formato de valor incorreto");
			}
		}
		for (int j = 1; j < valoresConvertidos.length; j++) {  
           int key = valoresConvertidos[j];  
           int i = j-1;  
           while ( (i > -1) && ( valoresConvertidos[i] > key ) ) {  
        	   valoresConvertidos[i+1] = valoresConvertidos[i];  
               i--;  
           }  
           valoresConvertidos[i+1] = key;  
		}  
		for(int i = 0; i < valores.length; i++) {
			valores[i] = String.valueOf(valoresConvertidos[i]);
		}
		valor = String.join(",", valores);
		return valor;
	}

}
