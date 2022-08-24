import javax.swing.JOptionPane;

public class ConversorMoeda {
	private final double COTACAOUSD = 5.11;
	private final double COTACAOEUR = 5.06;
	private final double COTACAOGBP = 6.22;
	private final double COTACAOARS = 0.037;
	private final double COTACAOCLP = 0.0055;
	
	public void BRLtoUSD (double qnt) {
		double moeda = (qnt / COTACAOUSD);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "USD: " + moeda);
	}
	
	public void BRLtoEUR (double qnt) {
		double moeda = (qnt / COTACAOEUR);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "EUR: " + moeda);
	}
	
	public void BRLtoGBP (double qnt) {
		double moeda = (qnt / COTACAOGBP);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "GBP: " + moeda);
	}
	
	public void BRLtoARS (double qnt) {
		double moeda = (qnt / COTACAOARS);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "ARS: " + moeda);
	}
	
	public void BRLtoCLP (double qnt) {
		double moeda = (qnt / COTACAOCLP);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "CLP: " + moeda);
	}
	
	public void USDtoBRL (double qnt) {
		double moeda = (qnt * COTACAOUSD);
		//moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "USD: " + moeda);
	}
	
	public void EURtoBRL (double qnt) {
		double moeda = (qnt * COTACAOEUR);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "EUR: " + moeda);
	}
	
	public void GBPtoBRL (double qnt) {
		double moeda = (qnt * COTACAOGBP);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "GBP: " + moeda);
	}
	
	public void ARStoBRL (double qnt) {
		double moeda = (qnt * COTACAOARS);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "ARS: " + moeda);
	}
	
	public void CLPtoBRL (double qnt) {
		double moeda = (qnt * COTACAOCLP);
		moeda = (double) Math.round(moeda * 100d) / 100;
		JOptionPane.showMessageDialog(null, "CLP: " + moeda);
	}
}
