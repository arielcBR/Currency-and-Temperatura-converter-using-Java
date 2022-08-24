import javax.swing.JOptionPane;

public class ConversorTemp {

	public void CelsiusToKelvin (double amount) {
		double temp = amount + 273.15;
		JOptionPane.showMessageDialog(null, "Temperature in Kelvin: " + temp);
		
	}
	
	public void CelsiusToFahrenheit (double amount) {
		double temp = (9/5 * amount) + 32;
		JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + temp);
	}
	
	public void KelvinToCelsius (double amount) {
		double temp = 273.15 - amount;
		JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + temp);
		
	}
	
	public void KelvinToFahrenheit (double amount) {
		double temp = (amount * 1.8) - 459.67;
		JOptionPane.showMessageDialog(null, "Temperature in Fahrenheit: " + temp);
		
	}
	
	public void FahrenheitToKelvin (double amount) {
		double temp = (5/9 * (amount - 32)) + 273.15;
		JOptionPane.showMessageDialog(null, "Temperature in Kelvin: " + temp);
		
	}
	
	public void FahrenheitToCelsius (double amount) {
		double temp = (amount - 32) * 5/9;
		JOptionPane.showMessageDialog(null, "Temperature in Celsius: " + temp);
		
	}
	
	
		
		
	

}
