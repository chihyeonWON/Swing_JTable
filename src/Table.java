import javax.swing.JFrame;
import javax.swing.JPanel;

public class Table {
	public static void main(String[] args) {
		JFrame frame =  new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		
		
		frame.setVisible(true); // ���������ϼ���
		frame.setSize(800, 640); //ũ�� ����
		frame.setLocationRelativeTo(null); // ��ġ��������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������  �ý�������ǵ��� ����
	}
}
