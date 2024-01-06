import java.awt.*;
import java.awt.event.*;

public class Exam extends Frame {
    Label l1, l2;
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3, cb4;
    Button b1;

    Exam(String title) {
        super(title);
        this.setBounds(200, 200, 450, 300);
        this.setLayout(new GridLayout(7, 1)); //  행과 열로 표현
        this.setBackground(new Color(120, 150, 55));

        l1 = new Label("Panel의 기본 레이아웃을 고르세요.", Label.CENTER);

        cbg = new CheckboxGroup();
        cb1 = new Checkbox("1. BorderLayout", cbg, false);
        cb2 = new Checkbox("2. FlowLayout", cbg, false);
        cb3 = new Checkbox("3. GridLayout", cbg, false);
        cb4 = new Checkbox("4. CardLayout", cbg, false);

        b1 = new Button("OK");
        b1.addActionListener(new Event3());

        l2 = new Label("결과 : ", Label.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	dispose();
            }
        });

        add(l1);  add(cb1); add(cb2); add(cb3); add(cb4); add(b1); add(l2);
        this.setVisible(true);
    }

    class Event2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	String str = null;
            if(cb1.getState()) {
            	str = cb1.getLabel();
            } else if(cb2.getState()) {
            	str = cb1.getLabel();;
            } else if(cb3.getState()) {
            	str = cb1.getLabel();;
            } else if(cb4.getState()) {
            	str = cb1.getLabel();;
            } 
            l2.setText("당신은 "+ str + "형 입니다.");
       }
   }
    
    class Event3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	int score = 0;
            if(cb1.getState()) {
            	score = 0;
            } else if(cb2.getState()) {
            	score = 100;
            } else if(cb3.getState()) {
            	score = 0;
            } else if(cb4.getState()) {
            	score = 0;
            } 
            l2.setText("당신의 점수는 "+ score + "점 입니다.");
       }
   }
}
