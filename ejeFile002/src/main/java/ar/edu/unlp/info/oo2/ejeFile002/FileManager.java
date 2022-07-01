package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public interface FileManager {
	
	
	public String getName();
	public String getExtention();
	public double getSize();
	public LocalDate getCreationDate();
	public LocalDate getModificationDate();
	public String getPermitions();
	public String prettyPrint();
	
	
}
