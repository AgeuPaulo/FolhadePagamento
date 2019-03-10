package br.com.salario;

public class Salario {

	private double valor;

	public Salario(double salario) {
		this.valor = salario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double inss(double salario) {
		double inss = 0;
		if (salario >= 0 & salario <= 1693.72) {
			inss = (salario * 0.08);
		}
		if (salario >= 1693.73 & salario <= 2822.90) {
			inss = (salario * 0.09);
		}
		if (salario >= 2822.91 & salario <= 5645.80) {
			inss = (salario * 0.11);
		}
		inss = (int)(inss * 100 + 0.5) / 100.0;
		return inss;
	}

	public double irrf(double sBruto) {
		double contrib = inss(sBruto);
		double salAtual = (sBruto - contrib);
		double irrf = 0;
		if (salAtual >= 0 & salAtual < 1903.99) {
			irrf = 0;
		}
		if (salAtual > 1903.99 & salAtual < 2826.65) {
			irrf = ((salAtual * 0.075) - 142.80);
		}
		if (salAtual > 2826.66 & salAtual < 3751.05) {
			irrf = ((salAtual * 0.15) - 354.80);
		}
		if (salAtual > 3751.06 & salAtual < 4664.68) {
			irrf = ((salAtual * 0.225) - 636.13);
		}
		if (salAtual > 4664.69) {
			irrf = ((salAtual * 0.275) - 869.36);
		}
		irrf = (int)(irrf * 100 + 0.5) / 100.0;
		
		return irrf;
	}

	public double salarioLiquido(double bruto) {
		double inss = inss(bruto);
		double irrf = irrf(bruto);
		     
		double salLiquido = (bruto - inss - irrf);
		
		salLiquido = (int)(salLiquido * 100 + 0.5) / 100.0;
		
		return salLiquido;
	}
}
