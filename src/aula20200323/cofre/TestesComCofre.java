package aula20200323.cofre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestesComCofre {

	@Test
	void openClosedCofre() {

		Cofre cofreClosed = new Cofre();
		assertEquals(false, cofreClosed.isAberto());

		cofreClosed.abrir();
		assertEquals(true, cofreClosed.isAberto());

		cofreClosed.fechar();
		assertEquals(false, cofreClosed.isAberto());

		Cofre cofre = new Cofre();
		cofre.abrir();
		assertEquals(true, cofre.isAberto());
	}

	@Test
	void openClosedComSenha() {
		CofreSeguro cofreSeguro = new CofreSeguro("741852");

		assertEquals(false, cofreSeguro.isAberto());

		cofreSeguro.abrir("741852");
		assertEquals(true, cofreSeguro.isAberto());

		CofreSeguro senhaIncorreta = new CofreSeguro("741853");
		senhaIncorreta.abrir("741855");

		assertEquals(false, senhaIncorreta.isAberto());
	}

}
