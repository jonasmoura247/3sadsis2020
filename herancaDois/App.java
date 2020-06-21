package herancaDois;

import java.io.ObjectInputStream.GetField;

public class App {

	public static void main(String[] args) {

		FerramentasCozinha garfo = new Talher("manusear alimento", "gaveta armario");
		FerramentasCozinha faca = new Talher("fatiar alimento", "porta facas");

		FerramentasCozinha fogaoLenha = new Fogao("Comida rustica", "Sitio");
		FerramentasCozinha fogaoEletrico = new Fogao("Comida gastronomica", "Casas e restaurantes");

		System.out.println("Info garfos:" + garfo.getUso() + " " + garfo.getArmazenamento());
		System.out.println("info facas:" + faca.getUso() + " " + faca.getArmazenamento());

		System.out.println("Info Fogao Lenha:" + fogaoLenha.getUso() + " " + fogaoLenha.getArmazenamento());
		System.out.println("info Fogao Eletrico:" + fogaoEletrico.getUso()+ " " + fogaoEletrico.getArmazenamento());

	}
}