package folhaDePagamento;

public class Salario {

	private double valorHora;
	private double qtdeHoraTrabalhada;
	
	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getQtdeHoraTrabalhada() {
		return qtdeHoraTrabalhada;
	}

	public void setQtdeHoraTrabalhada(double qtdeHoraTrabalhada) {
		this.qtdeHoraTrabalhada = qtdeHoraTrabalhada;
	}
	public double getSalarioBruto() {
		return getQtdeHoraTrabalhada()*getValorHora();
	}
	
	public double getValorSindicato() {
		return getSalarioBruto() * (float)0.03;
	}
	
	public Double getImpostoDeRenda() {
		double salarioBruto = getSalarioBruto();
		if(salarioBruto <= 900) {
			return 0.0*salarioBruto;
		}else if(salarioBruto > 900 && salarioBruto <= 1500) {
			return  0.05*salarioBruto;
		}else if(salarioBruto > 1500 && salarioBruto <= 2500) {
			return 0.1*salarioBruto;
		}else {
			return 0.2*salarioBruto;
		}
	}
	
	public double getFgts() {
		return 0.11*getSalarioBruto();
	}
	
	public double getInss() {
		return 0.1*getSalarioBruto();
	}
	public double getTotalDescontos() {
		return getImpostoDeRenda()+getValorSindicato()+getInss();
	}
	
	public double getSalarioLiquido() {
		return getSalarioBruto()-getTotalDescontos();
	}
	
	@Override 
	public String toString() {
		return "Salário Bruto ("+getQtdeHoraTrabalhada()+"*"+getValorHora()+"): "+getSalarioBruto()+"\n(-) INSS ()"+getInss()+"\nFGTS (11%):"+getFgts()+"\nTotal Descontos:"+getTotalDescontos()+"\nSalário Líquido: "+getSalarioLiquido();
	}
	
}
