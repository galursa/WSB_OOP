import java.awt.EventQueue;

public class HelloWordInWindow {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MyFrame();
 			}
 		});
 	}
}