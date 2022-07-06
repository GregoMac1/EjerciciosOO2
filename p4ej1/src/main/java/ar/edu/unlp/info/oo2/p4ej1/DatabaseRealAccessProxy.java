package ar.edu.unlp.info.oo2.p4ej1;

import java.util.Collection;
import java.util.List;

public class DatabaseRealAccessProxy implements DatabaseAccess{
	private DatabaseRealAccess database;
	private boolean isLogged;

	public DatabaseRealAccessProxy(DatabaseRealAccess database) {
		this.database = database;
	}

    @Override
    public Collection<String> getSearchResults(String queryString) {
        if (!this.checkAccess())
        	throw new RuntimeException("Acceso denegado");
        return database.getSearchResults(queryString);
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	if (!this.checkAccess())
        	throw new RuntimeException("Acceso denegado");
        return database.insertNewRow(rowData);
    }
    
    private boolean checkAccess() {
    	return this.isLogged;
    }
}
