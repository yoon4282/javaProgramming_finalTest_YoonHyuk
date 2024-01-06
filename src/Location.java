import java.awt.*; // AWT ������Ʈ ����ϱ� ����
import java.awt.event.*; // �̺�Ʈ ó���ϱ� ����

public class Location extends Frame {
	Label l1;

	Location(String title) {
		setLayout(null);
		setBounds(200, 200, 400, 300);
		setBackground(Color.yellow);
		
		l1 = new Label("마우스위치: ");
		l1.setBounds(7, 30, 200, 20);
		l1.setBackground(Color.yellow);
		
		addMouseMotionListener(new MouseMotionListener() { // 2. �̺�Ʈ ������(������)
			public void mouseDragged(MouseEvent e) {}
			public void mouseMoved(MouseEvent e) {
				l1.setText("마우스 위치: (" + e.getX() + ", " + e.getY() + ")");	
			}
		});
		
		addWindowListener(new WindowAdapter() { // ������ �ݱ� �̺�Ʈ ó��
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});

		add(l1);
		setVisible(true);
	}
}




