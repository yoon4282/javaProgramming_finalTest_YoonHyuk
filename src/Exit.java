import java.awt.*;
import java.awt.event.*;

import javax.swing.ImageIcon;

public class Exit extends Frame  {
	Button check,back;
	
	Label  lcheck;
	
	Button Check,Back;
	
	Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
	
	Color c = new Color(60, 229, 229);;//버튼색
	
	Exit(){
		super("나가기");
		this.setBounds(-10, 30, 1900, 800);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		
		check = new Button("네");
		check.setBounds(250, 400, 300, 150);
		check.setFont(f1);
		check.setBackground(c);
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		back = new Button("아니요");
		back.setBounds(1000, 400, 300, 150);
		back.setFont(f1);
		back.setBackground(c);
		back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Main("은행");
			}
		});
		
		lcheck = new Label("정말로 종료 하시겠습니까?");
		lcheck.setBounds(550, 150, 450, 40);
		lcheck.setBackground(Color.yellow);
		lcheck.setAlignment(Label.CENTER);
		lcheck.setFont(f1);
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(check); add(back); add(lcheck);
		this.setVisible(true);
	}
}
