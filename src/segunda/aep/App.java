package segunda.aep;

import aula.Task;

public class App {
	public static void main(String[] args) {
		try {

			Task task1 = new Task("Dragon", 1000);
			task1.verificarCompletada("Dragon", 999);
			
			Task task2 = new Task("Outcast", 300);
			task2.verificarCompletada("Outcast", 360);
			
			task2.finalizarTask();
			task1.finalizarTask();
		}catch (RuntimeException ex) {
			System.out.println("Mensagem da exceção: " + ex.getMessage());
		}
	}
}
