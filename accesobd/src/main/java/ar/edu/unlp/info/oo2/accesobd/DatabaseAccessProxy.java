package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;

import java.util.List;

public class DatabaseAccessProxy implements DatabaseAccess {
	
	private String password = "p455w0rD";
	private DatabaseAccess databaseAccess;
	private boolean checkAccess;

	public DatabaseAccessProxy(DatabaseAccess anDatabaseAccess, String aPassword) {
        super();        
        this.databaseAccess = anDatabaseAccess;
        this.checkAccess = (this.password == aPassword);
    }
		
	/*
	public void LogInDatabase( String passwordForCheck ) {
		this.passwordIngresada = passwordForCheck;
	}
	
	public void LogOutDatabase() {
		this.passwordIngresada = null;
	}
	
	private boolean checkAccess(String password) {
		return this.password == password;
	}*/
	
	//supongo q viene la password por parametro
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if( this.checkAccess ) {
			return this.databaseAccess.getSearchResults(queryString);
		}else {
			return null;
		}		
	}
		
	//supongo q viene la password por parametro
	@Override
	public int insertNewRow(List<String> rowData) {
		if( this.checkAccess ) {
			return this.databaseAccess.insertNewRow(rowData);
		}else {
			return -1;
		}
	}
	
}
