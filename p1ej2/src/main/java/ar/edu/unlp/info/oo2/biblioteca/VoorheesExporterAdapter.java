package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class VoorheesExporterAdapter extends VoorheesExporter{
	
	public String exportar(List<Socio> socios) {
		JSONArray array = new JSONArray();
		for (Socio socio : socios) {
			JSONObject object = new JSONObject();
			object.put("nombre", socio.getNombre());
			object.put("email", socio.getEmail());
			object.put("legajo", socio.getLegajo());
			array.add(object);
		}
		return array.toJSONString();
	}
}
