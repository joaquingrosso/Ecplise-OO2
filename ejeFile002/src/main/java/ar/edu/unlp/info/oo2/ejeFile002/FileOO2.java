package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;


public class FileOO2 implements FileManager{
	private String name;
	private String extention;
	private double size;
	private LocalDate dateCreation;
	private LocalDate dateModification;
	private String permitions;
	
	
	



	

	public FileOO2(String name, String extention, double size, LocalDate dateCreation, LocalDate dateModification,
			String permitions) {
		super();
		this.name = name;
		this.extention = extention;
		this.size = size;
		this.dateCreation = dateCreation;
		this.dateModification = dateModification;
		this.permitions = permitions;
	}









	public String prettyPrint() {
		return "";
	}









	public String getName() {
		return name;
	}









	public String getExtention() {
		return extention;
	}









	public double getSize() {
		return size;
	}







	@Override
	public String getPermitions() {
		// TODO Auto-generated method stub
		return permitions;
	}









	@Override
	public LocalDate getModificationDate() {
		// TODO Auto-generated method stub
		return dateModification;
	}









	@Override
	public LocalDate getCreationDate() {
		// TODO Auto-generated method stub
		return dateCreation;
	}

}
	