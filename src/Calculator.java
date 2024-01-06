import java.awt.*;


import java.awt.event.*;

public class Calculator extends Frame {
   Button num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
   Button back,equal,plus,minus,multiply,division, initial;//키패드
   
   Label lcheck;
   
   Panel check, button;
   
   Font f1 = new Font("Dialog", Font.BOLD, 20);;//폰트
   
   Color c = new Color(60, 229, 229);;//버튼색]
   
   char cl;
   
   double n1,n2,result;
   
   Calculator(){
      super("계산기");
      this.setBounds(500, 20, 600, 800);
      this.setLayout(null);
      
      check = new Panel();
      check.setLayout(null);
      check.setBounds(0, 0, 600, 200);
      check.setBackground(Color.yellow);
      
      lcheck = new Label();
      lcheck.setBounds(0, 70, 590, 60);
      lcheck.setAlignment(Label.RIGHT);
      lcheck.setFont(f1);
      
      button = new Panel();
      button.setLayout(new GridLayout(4,4, 50, 30));
      button.setBounds(0, 250, 600, 550);
      button.setBackground(Color.white);
      
      num1 = new Button("1");
      num1.setFont(f1);
      num1.setBackground(Color.black);
      num1.setForeground(Color.WHITE);
      num1.addActionListener(new Event());
      
      num2 = new Button("2");
      num2.setFont(f1);
      num2.setBackground(Color.black);
      num2.setForeground(Color.WHITE);
      num2.addActionListener(new Event());
      
      num3 = new Button("3");
      num3.setFont(f1);
      num3.setBackground(Color.black);
      num3.setForeground(Color.WHITE);
      num3.addActionListener(new Event());
      
      num4 = new Button("4");
      num4.setFont(f1);
      num4.setBackground(Color.black);
      num4.setForeground(Color.WHITE);
      num4.addActionListener(new Event());
      
      num5 = new Button("5");
      num5.setFont(f1);
      num5.setBackground(Color.black);
      num5.setForeground(Color.WHITE);
      num5.addActionListener(new Event());
      
      num6 = new Button("6");
      num6.setFont(f1);
      num6.setBackground(Color.black);
      num6.setForeground(Color.WHITE);
      num6.addActionListener(new Event());
      
      num7 = new Button("7");
      num7.setFont(f1);
      num7.setBackground(Color.black);
      num7.setForeground(Color.WHITE);
      num7.addActionListener(new Event());
      
      num8 = new Button("8");
      num8.setFont(f1);
      num8.setBackground(Color.black);
      num8.setForeground(Color.WHITE);
      num8.addActionListener(new Event());
      
      num9 = new Button("9");
      num9.setFont(f1);
      num9.setBackground(Color.black);
      num9.setForeground(Color.WHITE);
      num9.addActionListener(new Event());
      
      back = new Button("C");
      back.setFont(f1);
      back.setBackground(Color.red);
      back.setForeground(Color.WHITE);
      back.addActionListener(new Event());
      
      num0 = new Button("0");
      num0.setFont(f1);
      num0.setBackground(Color.black);
      num0.setForeground(Color.WHITE);
      num0.addActionListener(new Event());
      
      equal = new Button("=");
      equal.setFont(f1);
      equal.setBackground(Color.gray);
      equal.setForeground(Color.WHITE);
      equal.addActionListener(new Event());
      
      plus = new Button("+");
      plus.setFont(f1);
      plus.setBackground(Color.gray);
      plus.setForeground(Color.WHITE);
      plus.addActionListener(new Event());
      
      minus = new Button("-");
      minus.setFont(f1);
      minus.setBackground(Color.gray);
      minus.setForeground(Color.WHITE);
      minus.addActionListener(new Event());
      
      multiply = new Button("*");
      multiply.setFont(f1);
      multiply.setBackground(Color.gray);
      multiply.setForeground(Color.WHITE);
      multiply.addActionListener(new Event());
      
      division = new Button("/");
      division.setFont(f1);
      division.setBackground(Color.gray);
      division.setForeground(Color.WHITE);
      division.addActionListener(new Event());
      
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent e) {
            dispose();
         }
      });
      add(check); add(button); button.add(num1); button.add(num2); button.add(num3); 
      button.add(plus); button.add(num4); button.add(num5); button.add(num6); 
      button.add(minus); button.add(num7); button.add(num8); button.add(num9); 
      button.add(multiply); button.add(equal); button.add(num0); button.add(back); 
      button.add(division); check.add(lcheck);
      this.setVisible(true);
   }
   
   class Event implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	        String str = ((Button) e.getSource()).getLabel();

	        if (str.equals("C")) {
	            lcheck.setText("");
	        } else if (str.equals("+")) {
	            cl = '+';
	            n1 = Double.parseDouble(lcheck.getText());
	            lcheck.setText("");
	        } else if (str.equals("-")) {
	            cl = '-';
	            n1 = Double.parseDouble(lcheck.getText());
	            lcheck.setText("");
	        } else if (str.equals("*")) {
	            cl = '*';
	            n1 = Double.parseDouble(lcheck.getText());
	            lcheck.setText("");
	        } else if (str.equals("/")) {
	            cl = '/';
	            n1 = Double.parseDouble(lcheck.getText());
	            lcheck.setText("");
	        } else if (str.equals("=")) {
	            n2 = Double.parseDouble(lcheck.getText());
	            if (cl == '+') {
	                result = n1 + n2;
	            } else if (cl == '-') {
	                result = n1 - n2;
	            } else if (cl == '*') {
	                result = n1 * n2;
	            } else if (cl == '/') {
	                if (n2 != 0) {
	                    result = n1 / n2;
	                } else {
	                    lcheck.setText("0으로 나눌 수 없습니다.");
	                    return;
	                }
	            }
	            lcheck.setText(String.valueOf(result));
	        } else {
	            String currentText = lcheck.getText();
	            currentText += str;
	            lcheck.setText(currentText);
	        }
	    }
	}
}