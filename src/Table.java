import javax.swing.JFrame;
import javax.swing.JPanel;

public class Table {
	public static void main(String[] args) {
		JFrame frame =  new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		
		
		frame.setVisible(true); // 보여지도록설정
		frame.setSize(800, 640); //크기 설정
		frame.setLocationRelativeTo(null); // 위치제한해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료했을  시스템종료되도록 설정
	}
}
