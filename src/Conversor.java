import javax.swing.JOptionPane;
import java.util.Objects;

public class Conversor {
	String option;
	
	public static void main(String[] args) {
		while(true) {
			JOptionPane.showMessageDialog(null, "Welcome to ONE!", "Challenge Java", JOptionPane.INFORMATION_MESSAGE);

			String chooseCurrency = (JOptionPane.showInputDialog(null, 
						"Options", "Menu converter", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Currency", "Temperature"}, "Choose")).toString();

			switch(chooseCurrency) {
			case "Currency":
				double amountOfMoney = Double.parseDouble(JOptionPane.showInputDialog("Insert the amount to convert"));
				
				String typeOfCurrency = (JOptionPane.showInputDialog(null, 
						"Options", "Type of Currencies", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"BRL to USD", "BRL to EUR", "BRL to GBP", "BRL to ARS", "BRL to CLP",
								"USD to BRL", "EUR to BRL", "GBP to BRL", "ARS to BRL", "CLP to BRL"}, "Choose")).toString();
				ConversorMoeda conversor = new ConversorMoeda();
				
				switch(typeOfCurrency) {
					case "BRL to USD":
						conversor.BRLtoUSD(amountOfMoney);
						break;
					case "BRL to EUR":
						conversor.BRLtoEUR(amountOfMoney);
						break;
					case "BRL to GBP":
						conversor.BRLtoGBP(amountOfMoney);
						break;
					case "BRL to ARS":
						conversor.BRLtoARS(amountOfMoney);
						break;
					case "BRL to CLP":
						conversor.BRLtoCLP(amountOfMoney);
						break;
					case "USD to BRL":
						conversor.USDtoBRL(amountOfMoney);
						break;
					case "EUR to BRL":
						conversor.EURtoBRL(amountOfMoney);
						break;
					case "GBP to BRL":
						conversor.GBPtoBRL(amountOfMoney);
						break;
					case "ARS to BRL":
						conversor.ARStoBRL(amountOfMoney);
						break;
					case "CLP to BRL":
						conversor.CLPtoBRL(amountOfMoney);
						break;
					default:
				}
			// Fim Switch Moedas
				break;
				
			case "Temperature":
				double amountOfTemp = Double.parseDouble(JOptionPane.showInputDialog("Insert the amount to convert"));
				String typeOfTemp = (JOptionPane.showInputDialog(null, 
						"Options", "Choose of Temperature", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Celsius to Kelvin", "Celsius to Fahrenheit", "Kelvin to Celsius", "Kelvin to Fahrenheit", "Fahrenheit to Celsius",
								"Fahrenheit to Kelvin"}, "Choose")).toString();
				ConversorTemp conversorTemp = new ConversorTemp();
				
				switch(typeOfTemp) {
				case "Celsius to Kelvin":
					conversorTemp.CelsiusToKelvin(amountOfTemp);
					break;
					
				case "Celsius to Fahrenheit":
					conversorTemp.CelsiusToFahrenheit(amountOfTemp);
					break;
				case "Kelvin to Celsius":
					conversorTemp.KelvinToCelsius(amountOfTemp);
					break;
					
				case "Kelvin to Fahrenheit":
					conversorTemp.KelvinToFahrenheit(amountOfTemp);
					break;
				case "Fahrenheit to Celsius":
					conversorTemp.FahrenheitToCelsius(amountOfTemp);
					break;
					
				case "Fahrenheit to Kelvin":
					conversorTemp.FahrenheitToKelvin(amountOfTemp);
					break;
					
				default:
			}
				
				break;
				
			default:
			}
		}
		
	}

}
