import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class GraphicalSum extends Applet implements ActionListener
{
    String a, b;
    int res;
    Label l1,l2,l3;
    TextField t1, t2, t3;
    Button b1;

    public void init() {
         l1 = new Label("First number");
         t1 = new TextField();
          t1.setBackground(Color.green);
          t1.setForeground(Color.BLACK);
         l2 = new Label("Second number");
         t2 = new TextField();

         l3 = new Label("Result");
         t3 = new TextField();

         b1 = new Button("Addition");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);

        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae)
    {
        a = t1.getText();
        b = t2.getText();
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        res = a1 + b1;
        String r = "" + res;
        t3.setText(r);

    }
}
