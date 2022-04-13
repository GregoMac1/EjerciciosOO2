package ar.edu.unlp.info.oo2.p3ej3;

import java.util.zip.CRC32;

public class CRC32_Calculator implements Calculator{
	java.util.zip.CRC32 crc = new CRC32();
	
	@Override
	public long crcFor(String data) {
		crc.update(data.getBytes());
		return crc.getValue();
	}
}
