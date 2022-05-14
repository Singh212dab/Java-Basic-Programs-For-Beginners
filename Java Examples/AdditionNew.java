import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdditionNew extends Addition implements ActionListener
{
TextField t1=new TextField();
TextField t2=new TextField();
TextField t3=new TextField();
public AdditionNew()
{
Label l1=new Label("First number");
Label l2=new Label("Second number");
Label l3=new Label("Result");
setLayout(new GridLayout(3,2));
setBackground(Color.blue);
add(l1);
add(t1);
add(l2);
add(t2);
add(l3);
add(t3);
t2.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
String s1=t1.getText();
Double num1=Double.parseDouble(s1);
Double num2=Double.parseDouble(t2.getText());
Double Res=num1+num2;
t3.setText("Sum is:"+Res);
}
}
 



