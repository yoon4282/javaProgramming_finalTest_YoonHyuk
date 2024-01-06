import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MenuStart extends Frame {
	static Toolkit tk = Toolkit.getDefaultToolkit();
	static Dimension screenSize = tk.getScreenSize();
	//화면 너비,높이 정보를 screenSize에 대입
	static Image img;
	
	
	MenuStart(String title){
		super(title);
		this.setLocation(screenSize.width/2-300, screenSize.height/2-200);
		this.setSize(600, 400);
		this.setLayout(null);
		
		this.setIconImage(new ImageIcon("image/icon.png").getImage());
		
		MenuBar mb = new MenuBar();
		
		img = tk.getImage("image/atm.png");
		
		Menu mFile = new Menu("File");
		MenuItem miJoin = new MenuItem("Join",new MenuShortcut('J',true));
		MenuItem miExit = new MenuItem("Exit",new MenuShortcut('E'));
		miExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		mFile.add(miJoin); mFile.addSeparator(); mFile.add(miExit);
				
		Menu mEvent1 = new Menu("Event");
		MenuItem miCoffee = new MenuItem("자바 기본 문재");
		miCoffee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Exam("자바 기본 문재");
			}
		});
		MenuItem miBlood = new MenuItem("랜덤 색상");
		miBlood.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new RandomColor("랜덤 색상");
			}
		});
		MenuItem miLocation = new MenuItem("마우스 이동 이벤트");
		miLocation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Location("마우스 이동 이벤트");
			}
		});
		mEvent1.add(miCoffee); mEvent1.addSeparator(); mEvent1.add(miBlood);
		mEvent1.addSeparator(); mEvent1.add(miLocation);
		
		Menu mEvent2 = new Menu("AddEvent");
		MenuItem miEvent1 = new MenuItem("ATM");
		miEvent1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Main("은행");
			}
		});
		
		MenuItem miEvent2 = new MenuItem("계산기");
		miEvent2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Calculator();
			}
		});
		
		mEvent2.add(miEvent1); mEvent2.addSeparator(); mEvent2.add(miEvent2);
		
		Menu mHelp = new Menu("Help");
		MenuItem miHelp = new MenuItem("Info");
		miHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Help();
			}
		});
		MenuItem miDev = new MenuItem("DevInfo");
		miDev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Dev();
			}
		});
		mHelp.add(miHelp); mHelp.addSeparator(); mHelp.add(miDev);
		
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		this.setMenuBar(mb); mb.add(mFile); mb.add(mEvent1); mb.add(mEvent2); mb.add(mHelp);
		this.setVisible(true);
	}
	 
	public void paint(Graphics g) {
		g.drawImage(img, 175, 100, this);
	}
	
	public static void main(String[] args) {
		new MenuStart("Java Project 이윤혁");
	}
}
