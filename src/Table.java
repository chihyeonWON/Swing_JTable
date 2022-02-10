import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Table {
	public static void main(String[] args) {
		JFrame frame =  new JFrame("Table Prac.");
		JPanel panel = new JPanel();
		String[] headings = new String[]{"Id", "Name", "Country"};
		Object[][] data = new Object[][] {
			{"1","Daniel","Korea"},
			{"2","Sunny","France"},
			{"3","John","Japan"}
		};
		
		JTable table = new JTable(data, headings);
		table.setPreferredScrollableViewportSize(new Dimension(700, 600));
		
		table.setFillsViewportHeight(true);
		
		panel.add(new JScrollPane(table));
		
		frame.add(panel);
		
		frame.setVisible(true); // 보여지도록설정
		frame.setSize(800, 640); //크기 설정
		frame.setLocationRelativeTo(null); // 위치제한해제
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //종료했을  시스템종료되도록 설정
	}
}
