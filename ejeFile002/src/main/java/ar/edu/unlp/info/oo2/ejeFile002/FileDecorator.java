package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public abstract class FileDecorator implements FileManager{
	private FileManager file;
	

	public FileDecorator(FileManager file) {
		super();
		this.file = file;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.file.getName();
	}

	@Override
	public String getExtention() {
		// TODO Auto-generated method stub
		return this.file.getExtention();
	}

	@Override
	public double getSize() {
		// TODO Auto-generated method stub
		return this.file.getSize();
	}

	@Override
	public LocalDate getCreationDate() {
		// TODO Auto-generated method stub
		return this.file.getCreationDate();
	}

	@Override
	public LocalDate getModificationDate() {
		// TODO Auto-generated method stub
		return this.file.getModificationDate();
	}

	@Override
	public String getPermitions() {
		// TODO Auto-generated method stub
		return this.getPermitions();
	}
	
	
	
	public String prettyPrint() {
		return " "+file.prettyPrint();
	}
	

}
