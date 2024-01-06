import java.awt.*;

import java.awt.event.*;

public class Help1 extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	
	Font f1 = new Font("Dialog", Font.BOLD, 20);
	
	Color c = new Color(60, 229, 229);
	
	TextArea info;
	
	Button exit;
	
	Help1() {
		super("프로그램 정보");
		this.setLocation(screenSize.width/2-165, screenSize.height/2-175);
		this.setSize(330, 350);
		this.setLayout(null);
		
		info = new TextArea(); 
		info.setFont(f1);
		info.setText("ATM에서 계좌에 0원이\n있을때는 출금과 송금이\n불가하기 때문에 입금을 \n먼저 해줘야 한다. "
				+ "계산기는\n변수가 2개인 식만 계산\n가능하다. 또한 노트북 기준으로 \n작성된 코드라 일반 모니터에서 \n보시기에"
				+ " 불편함이 있을수 있다.");
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
