import java.awt.*;
class MyFrame extends Frame
{
Label l1,l2,l3,l4,l5;
MyFrame()
{
setVisible(true);
setSize(200,200);
setTitle("Myframe");
l1=new Label("Simren",Label.CENTER);
l1.setBackground(Color.green);
l2=new Label("Nayan",Label.CENTER);
l2.setBackground(Color.red);
l3=new Label("Reema",Label.CENTER);
l3.setBackground(Color.blue);
l4=new Label("Kiran",Label.CENTER);
l4.setBackground(Color.yellow);
l5=new Label("Meera",Label.CENTER);
l5.setBackground(Color.cyan);
add(l1,BorderLayout.NORTH);
add(l2,BorderLayout.SOUTH);
add(l3,BorderLayout.WEST);
add(l4,BorderLayout.EAST);
add(l5,BorderLayout.CENTER);
}
public static void main(String arg[])
{
new MyFrame();
}
}