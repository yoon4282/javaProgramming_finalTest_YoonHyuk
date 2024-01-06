import java.awt.*;

import java.awt.event.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Dev extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	
	JButton next;
	
	Image img;
	
	Dev(){
		super("개발자 설명");
		this.setLocation(screenSize.width/2-125, screenSize.height/2-130);
		this.setSize(250, 260);
		this.setLayout(new GridLayout(1,1));
		
		img = tk.getImage("image/devicon.png");
		
		ImageIcon imageicon = new ImageIcon(img);
		
		next = new JButton(imageicon);
		next.setBackground(Color.white);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Dev1();
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		add(next);
		this.setVisible(true);
	}
	
	//paint() 호출 시점 3가지
	//1. 화면이 처음 보여지는 순간
	//2. 화면이 다른 화면에 가려졌다 다시 보여지는 순간
	//3. 최소화에서 다시 화면에 다시 보여지는 순간
	
	/*
	 * public void paint(Graphics g) { g.drawImage(img, 5, 30, this); }
	 */
}
