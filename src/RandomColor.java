import java.awt.*;
import java.awt.event.*;

public class RandomColor extends Frame {
    CheckboxGroup cbg;
    Checkbox cb1, cb2, cb3,cb4;

    RandomColor(String title) {
        super(title);
        this.setBounds(200, 200, 450, 300);
        this.setLayout(new FlowLayout());
        this.setBackground(new Color(120, 150, 55));

        cbg = new CheckboxGroup();
        cb1 = new Checkbox("red", cbg, false);
        cb2 = new Checkbox("green", cbg, false);
        cb3 = new Checkbox("blue", cbg, false);
        cb4 = new Checkbox("random", cbg, false);

        cb1.addItemListener(new Event4());
        cb2.addItemListener(new Event4());
        cb3.addItemListener(new Event4());
        cb4.addItemListener(new Event4());

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
            	dispose();
            }
        });

        add(cb1); add(cb2); add(cb3); add(cb4);
        this.setVisible(true);
    }

    class Event4 implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Checkbox cb = (Checkbox) e.getSource();
            String color = cb.getLabel();
            int r,g,b;
            r = (int)(Math.random()*256);
            g = (int)(Math.random()*256);
            b = (int)(Math.random()*256);

            if (color.equals("red")) {
                setBackground(Color.red);
                cb1.setBackground(Color.red);
                cb2.setBackground(Color.red);
                cb3.setBackground(Color.red);
                cb4.setBackground(Color.red);
            } else if (color.equals("green")) {
                setBackground(Color.green);
                cb1.setBackground(Color.green);
                cb2.setBackground(Color.green);
                cb3.setBackground(Color.green);
                cb4.setBackground(Color.green);
            } else if (color.equals("blue")) {
                setBackground(Color.blue);
                cb1.setBackground(Color.blue);
                cb2.setBackground(Color.blue);
                cb3.setBackground(Color.blue);
                cb4.setBackground(Color.blue);
            } else if (color.equals("random")) {
                setBackground(new Color(r,g,b));
                cb1.setBackground(new Color(r,g,b));
                cb2.setBackground(new Color(r,g,b));
                cb3.setBackground(new Color(r,g,b));
                cb4.setBackground(new Color(r,g,b));
            }
        }
    }
}
