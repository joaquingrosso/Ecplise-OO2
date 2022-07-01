package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class ModificationDateDecorator extends FileDecorator{



	
	
	public ModificationDateDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "modificationDate";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}