import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class AccountCheck extends Frame {
	Label laccount, lcheck;
	
	Button check;
	
	Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
	
	Color c = new Color(60, 229, 229);;//버튼색
	
	AccountCheck(){
		super("계좌확인");
		this.setBounds(-10, 30, 1900, 800);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		
		lcheck = new Label("계좌에 있는 금액은"+Main.money+"원 입니다.");
		lcheck.setBounds(300, 220, 900, 40);
		lcheck.setBackground(Color.yellow);
		lcheck.setAlignment(Label.CENTER);
		lcheck.setFont(f1);
		
		check = new Button("나가기");
		check.setBounds(1000, 550, 200, 100);
		check.setForeground(Color.black);
		check.setFont(f1);
		check.setBackground(c);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
				new Main("Bank");
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		add(lcheck); add(check);
		this.setVisible(true);
    }
}
