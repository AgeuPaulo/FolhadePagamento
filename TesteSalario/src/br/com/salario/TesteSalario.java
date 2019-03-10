package br.com.salario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteSalario {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testInss() {
		Salario salario = new Salario(2434.98);
		double inss = 219.15;
		
		assertEquals(inss, salario.inss(salario.getValor()));
	}

	@Test
	void testIrrf() {
		Salario salario = new Salario(3243.84);
		double irrf = 78.25;
		
		assertEquals(irrf, salario.irrf(salario.getValor()));
	}

	@Test
	void testSalarioLiquido() {
		Salario salario = new Salario(5344.99);
		double salLiquido = 4318.21;
		
		assertEquals(salLiquido, salario.salarioLiquido(salario.getValor()));
	}

}
