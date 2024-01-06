import java.awt.*;

import java.awt.event.*;

import javax.swing.ImageIcon;

public class InMoney1 extends Frame {
	Label laccount, lcheck;
    
	Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
	
	Button check;
	
	Color c = new Color(60, 229, 229);;//버튼색
    
    InMoney1() {
    	super("입금");
		this.setBounds(-10, 30, 1900, 800);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		
		lcheck = new Label("입금하신 금액은"+Main.sent+"원 입니다.");
		lcheck.setBounds(300, 220, 900, 40);
		lcheck.setBackground(Color.yellow);
		lcheck.setAlignment(Label.CENTER);
		lcheck.setFont(f1);
		
		laccount = new Label("계좌에 남은 돈은"+Main.money+"원 입니다.");
		laccount.setBounds(300, 260, 900, 40);
		laccount.setBackground(Color.yellow);
		laccount.setAlignment(Label.CENTER);
		laccount.setFont(f1);	
		
		check = new Button("나가기");
		check.setBounds(1000, 550, 200, 100);
		check.setForeground(Color.black);
		check.setFont(f1);
		check.setBackground(c);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Main.sent = 0;
				dispose();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
				new Main("은행");
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(lcheck); add(laccount); add(check);
		this.setVisible(true);
    }
}
