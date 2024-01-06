import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Help extends Frame {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Dimension screenSize = tk.getScreenSize();
	
	JButton next;
	
	Image img = Toolkit.getDefaultToolkit().getImage("image/help.png");;
	
	Help(){
		super("프로그램 설명");
		this.setLocation(screenSize.width/2-110, screenSize.height/2-125);
		this.setSize(220, 250);
		this.setLayout(new GridLayout(1,1));
		
		ImageIcon imageicon = new ImageIcon(img);
		
		next = new JButton(imageicon);
		next.setBackground(Color.white);
		next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new Help1();
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
