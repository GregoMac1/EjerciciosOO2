package ar.edu.unlp.info.oo2.p3ej3;

public class Dispositivo {
	private Calculator crcCalculator;
	private Connection connection;
	private Display display;
	private Ringer ringer;
	
	public String send(String data) {
		int crc = (int)this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	private void setCalculator(Calculator c) {
		this.crcCalculator = c;
	}
	
	public void setCRC16_Calculator() {
		this.setCalculator(new CRC16_Calculator());
	}
	
	public void setCRC32_Calculator() {
		this.setCalculator(new CRC32_Calculator());
	}
	
	private void setConnection(Connection c) {
		this.connection = c;
	}
	
	private void notifyConnectionChange(String img) {
		this.display.showBanner(img);
		this.ringer.ring();
	}
	
	public void setWiFiConnection() {
		WifiConn w = new WifiConn();
		this.setConnection(w);
		this.notifyConnectionChange(w.pict());
	}
	
	public void set4GConnection() {
		FourGConnection f = new FourGConnection();
		this.setConnection(f);
		this.notifyConnectionChange(f.pict());
	}
}
