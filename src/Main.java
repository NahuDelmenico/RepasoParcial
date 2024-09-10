import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		Autos Auto1 = new Autos("AD155FF", false,false,false, false, LocalDate.of(2023, 8, 1));
			
		Auto1.verificacion();
		
		JOptionPane.showMessageDialog(null, Auto1.resultado());
	}

}
