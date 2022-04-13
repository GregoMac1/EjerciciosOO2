package ar.edu.unlp.info.oo2.p3ej3;

public class FourGConnection implements Connection{
	public String transmit(String data, int crc) {
		return null;
	}
	
	public String symb() {
		return "4G";
	}
	
	@Override
	public String sendData(String data, int crc) {
		return this.transmit(data, crc);
	}
	
	@Override
	public String pict() {
		return this.symb();
	}
}
