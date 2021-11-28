import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class formHtml extends Applet implements ActionListener{
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	String name = "", address = "", gender = "", city = "";
	Label lblname=new Label("Enter Name");
	Label lblAddress=new Label("Enter Address");
	Label lblGender =new Label("Gender");
	Label lblcity= new Label("City");
	Button submit=new Button("Submit");
	Button cancel =new Button("Cancel");
	CheckboxGroup g=new CheckboxGroup();
	TextField n=new TextField(10);
	TextField a=new TextField(15);
	Checkbox m=new Checkbox("Male",g,true);
	Checkbox f=new Checkbox("Female",g,false);
	Choice c=new Choice();
	public void init() {
		add(lblname);
		add(lblAddress);
		add(lblGender);
		add(lblcity);
		add(submit);
		add(cancel);
		add(n);
		add(a);
		add(m);
		add(f);
		c.add("Biratnagar");
		c.add("Kathmandu");
		c.add("Bhaktapur");
		c.add("Pokhara");
		setVisible(true);
		setSize(100,200);
		setLayout(null);
		submit.addActionListener(this);
	}
	public void paint(Graphics g) {
		g.drawString("Name:"+name, 30,100);
		g.drawString("Address:"+address, 30,120);
		g.drawString("Gender:"+gender, 30,140);
		g.drawString("City:"+city, 30,160);
	}
	public void actionPerformed(ActionEvent e){
		name =n.getText();
		address=a.getText();
		gender =g.getSelectedCheckbox().getLabel();
		city=c.getSelectedItem();		
		}

}
