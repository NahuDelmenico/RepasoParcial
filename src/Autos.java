import java.time.LocalDate;

import javax.swing.JOptionPane;

public class Autos {

	private String patente;
	private boolean motor;
	private boolean freno;
	private boolean suspencion;
	private boolean vtv;
	private LocalDate fechavtv;

	public Autos(String patente, boolean motor, boolean freno, boolean suspencion, boolean vtv, LocalDate fechavtv) {
		this.patente = patente;
		this.freno = freno;
		this.motor = motor;
		this.suspencion = suspencion;
		this.vtv = vtv;
		this.fechavtv = fechavtv;

	}

	public String resultado() {
		String areparar = "Verificacion desaprobada, detalle:";

		if (motor && freno && suspencion) {
			this.vtv = true;
			this.fechavtv= fechavtv.plusYears(1);
			return "Verificacion aprobada" + "\n Proximo vencimiento: " + fechavtv;
			
		}else {
			vtv = false;

		if (this.motor == false) {
			areparar = areparar + " \n motor rotos";

		}

		if (this.freno == false) {
			areparar = areparar + " \n frenos rotos";
		}

		if (this.suspencion == false) {
			areparar = areparar + " \n suspension rotos";

		}

		return areparar;
	}

	}

	public void verificacion() {

		String[] op = { "Si", "No" };

		int a = JOptionPane.showOptionDialog(null, "¿El motor pasa la prueba?", null, 0, 0, null, op, op[0]);

		if (a == 0) {
			this.motor = true;
		} else {
			this.motor = false;
		}

		int b = JOptionPane.showOptionDialog(null, "¿El freno pasa la prueba?", null, 0, 0, null, op, op[0]);

		if (b == 0) {
			this.freno = true;
		} else {
			this.freno = false;
		}

		int c = JOptionPane.showOptionDialog(null, "¿La suspencion pasa la prueba?", null, 0, 0, null, op, op[0]);

		if (c == 0) {
			this.suspencion = true;
		} else {
			this.suspencion = false;
		}
	}

}
