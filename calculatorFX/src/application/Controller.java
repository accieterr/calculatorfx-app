package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.text.DecimalFormat;

public class Controller {
	
	@FXML
	
	private Math m = new Math();
	
	@FXML
	private Label numDisplay = new Label();

	public void button_0() { display(m.extendNum("0")); }
	public void button_1() { display(m.extendNum("1")); }
	public void button_2() { display(m.extendNum("2")); }
	public void button_3() { display(m.extendNum("3")); }
	public void button_4() { display(m.extendNum("4")); }
	public void button_5() { display(m.extendNum("5")); }
	public void button_6() { display(m.extendNum("6")); }
	public void button_7() { display(m.extendNum("7")); }
	public void button_8() { display(m.extendNum("8")); }
	public void button_9() { display(m.extendNum("9")); }
	
	public void add() { display(m.add()); }
	public void subtract() { display(m.subtract()); }
	public void multiply() { display(m.multiply()); }
	public void divide() { display(m.divide()); }
	
	public void equal() { 
		display(m.equal());
	}
	
	public void decimal() {display(m.decimal());}
	
	public void clear() {display(m.clearNums());}
	public void clearEntry() {display(m.clearEntry());}
	public void backspace() {display(m.backspace());}
	
	public void negative() {display(m.negative());}
	
	public void display(String s) { 
		DecimalFormat formatter = new DecimalFormat("0.####"); 
		String formatted = formatter.format(Double.parseDouble(s));
		numDisplay.setText(formatted); 
	}
	
}
