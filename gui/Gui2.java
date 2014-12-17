import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gui2 extends JFrame implements ActionListener {

    private Container pane;
    private JButton b1, b2;
    private JLabel l;
    private JTextArea text;
    private JPanel canvas;
    private JCheckBox box;

    public void actionPerformed(ActionEvent e){
	if (e.getSource()==b1){
	    System.out.println("you clicked button 1");}
	else if (e.getSource()==b2){
	    System.out.println("shutting down");
	    System.exit(0);}
    }

    private class Canvas extends JPanel{
	public void paintComponent(Graphics g){
	    super.paintComponent(g);
	    g.setColor(Color.red);
	    g.fillOval(30,30,30,30);
	}
    }
    /*
    private class Key implements KeyListener{
	public void keyPress(event e){}
    }
    */
    public Gui2(){

	setTitle("My Second Gui");
	setSize(800,800);
	setLocation(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = getContentPane();
	pane.setLayout(new FlowLayout());
	l = new JLabel("new label");
	text = new JTextArea("hello");
	text.setColumns(30);
	text.setRows(10);
	text.setBorder(BorderFactory.createLineBorder(Color.red,2));
	pane.add(text);

	canvas = new JPanel();
	canvas.setPreferredSize(new Dimension(300,300));
	canvas.setBorder(BorderFactory.createLineBorder(Color.blue,2));
	pane.add(canvas);
	
	b1 = new JButton("button");
	b1.addActionListener(this);
	pane.add(b1);
	b2 = new JButton("exit");
	pane.add(b2);
	box = new JCheckBox("check");
	
    }
    public static void main(String[] args) {
	Gui2 f = new Gui2();
	f.setVisible(true);
    }
}
