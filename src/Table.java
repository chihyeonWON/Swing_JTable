import javax.swing.JFrame;
import javax.swing.JPanel;

public class Table {
	public static void main(String[] args) {
		JFrame frame =  new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[]{"Id", "Name", "Country"};
		Object[][] data = new Object[][] {
			{"1","Daniel","Korea"},
			{"2","Sunny","France"},
			{"3","John","Japan"};
		};
		
		
		frame.add(panel);
		
		frame.setVisible(true); // ���������ϼ���
		frame.setSize(800, 640); //ũ�� ����
		frame.setLocationRelativeTo(null); // ��ġ��������
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //��������  �ý�������ǵ��� ����
	}
}
