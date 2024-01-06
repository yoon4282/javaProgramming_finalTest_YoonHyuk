import java.awt.*;

import java.awt.event.*;

public class Dev1 extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	
	Font f1 = new Font("Dialog", Font.BOLD, 20);
	
	Color c = new Color(60, 229, 229);
	
	TextArea info;
	
	Button exit;
	
	Dev1() {
		super("개발자 정보");
		this.setLocation(screenSize.width/2-165, screenSize.height/2-175);
		this.setSize(330, 350);
		this.setLayout(null);
		
		info = new TextArea(); 
		info.setFont(f1);
		info.setText("개발자 이름: 이윤혁\n개발자 나이: 20살\n개발자 학교: 한세대학교\n개발자 학번: 202310114\n");
		info.setBounds(10, 40, 330, 270);
		info.setEditable(false);
		
		exit = new Button("확인");
		exit.setBounds(0, 310, 330, 40);
		exit.setBackground(c);
		exit.setFont(f1);
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(info); add(exit);
		this.setVisible(true);
	}
}
