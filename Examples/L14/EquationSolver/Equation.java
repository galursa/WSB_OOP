import java.awt.EventQueue;

public class Equation {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new EquationFrame();
 			}
 		});
 	}
}

