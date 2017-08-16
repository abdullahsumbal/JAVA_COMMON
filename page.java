import java.awt.GridLayout;
import javax.swing.*;
import java.awt.datatransfer.*;
import java.awt.Toolkit;



class page extends JFrame{

	private DBDemo db;
	private JComboBox serial_no_combo; 
	private JComboBox problem_combo;
	private JButton create;

	public page( String title){

		super(title);
		super.setSize(400, 300);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setVisible(true);
		db = new DBDemo();
		db.read();

		init();
	}

	private void init(){

		serial_no_combo = new JComboBox(db.get_serial_no());
		JPanel panel = new JPanel(new GridLayout(0,1));
		panel.add(serial_no_combo);

		problem_combo = new JComboBox(db.get_problems());
		panel.add(problem_combo);

		create = new JButton("create");
		panel.add(create);
		create.addActionListener(new java.awt.event.ActionListener(){
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				refresh(evt);
			}
		});

		super.add(panel);
	}
	private void refresh(java.awt.event.ActionEvent evt){

		//System.out.println(serial_no_combo.getSelectedItem());
		String serial = (String)serial_no_combo.getSelectedItem();
		String location = db.get_location(serial);
		String problem = (String)problem_combo.getSelectedItem();
		String email = "Hello\n\n";
		email += "location: " + location + "\n";
		email += "serial no: "+ serial+"\n";
		email += "problem: "+ problem + "\n\n";
		email += "Thank you, \nSumbal";

		String myString = email;
		StringSelection stringSelection = new StringSelection(myString);
		Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
		clpbrd.setContents(stringSelection, null);


		System.out.println(email);

	}
}