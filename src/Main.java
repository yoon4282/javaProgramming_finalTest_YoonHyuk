import java.awt.*;

import java.awt.event.*;

import javax.swing.ImageIcon;

public class Main extends Frame {
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static Dimension screenSize = tk.getScreenSize();
	//화면 너비,높이 정보를 screenSize에 대입
	static Image img;
	
	Button menu1, menu2, menu3, menu4, menu5;//게좌확인, 입금, 출금, 송금, 나가기
	
	Font f1 = new Font("Dialog", Font.BOLD, 20);//폰트
	
	Color c = new Color(60, 229, 229);//버튼색
	
	static int account = 0;//계좌

	static int money;//계좌에 있는 돈

	static int sent;//보낼돈
	
	static int name1;
	
	static int account1[] = { 202310065,202310100,202310102, 202310108, 202310109, 202310111, 
			202310112, 202310114, 202310115, 202310117,202310118,202310122,202310123 };
	
	static String name[] = {"???","유정","강정수","김민순","백종건","신민서","심영배",
			 "오승윤","이윤혁","이재인","이종현","이태경","홍지성","황동준" };
	
	Main(String n){
		super("Bank");
		this.setBounds(-10, 30, 1900, 800);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		img = tk.getImage("image/atm.png");
		
		menu1 = new Button("계좌 확인");
		menu1.setBounds(150, 120, 300, 150);
		menu1.setFont(f1);
		menu1.setBackground(c);
		menu1.addActionListener(new Event1());
		
		menu2 = new Button("입금");
		menu2.setBounds(150, 320, 300, 150);
		menu2.setFont(f1);
		menu2.setBackground(c);
		menu2.addActionListener(new Event1());
		
		menu3 = new Button("출금");
		menu3.setBounds(150, 520, 300, 150);
		menu3.setFont(f1);
		menu3.setBackground(c);
		menu3.addActionListener(new Event1());
		
		menu4 = new Button("송금");
		menu4.setBounds(1100, 120, 300, 150);
		menu4.setFont(f1);
		menu4.setBackground(c);
		menu4.addActionListener(new Event1());
		
		menu5 = new Button("종료");
		menu5.setBounds(1100, 320, 300, 150);
		menu5.setFont(f1);
		menu5.setBackground(c);
		menu5.addActionListener(new Event1());
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		
		add(menu1); add(menu2); add(menu3); add(menu4); add(menu5);
		this.setVisible(true);
	}
	
	class Event1 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			 String str = null;
			 str = ((Button) e.getSource()).getLabel();
	         if (str.equals("계좌 확인")) {
	        	 dispose();
	             new AccountCheck();
	         } else if (str.equals("입금")) {
	        	 dispose();
	             new InMoney();
	         } else if (str.equals("출금")) {
	        	 dispose();
	             new OutMoney();
	         } else if (str.equals("송금")) {
	        	 dispose();
	             new Sent();
	         } else if (str.equals("종료")) {
	        	 dispose();
	             new Exit();
	         }
		}
	}
	
	public void paint(Graphics g) {
		g.drawImage(img, 670, 288, this);
	}
}
