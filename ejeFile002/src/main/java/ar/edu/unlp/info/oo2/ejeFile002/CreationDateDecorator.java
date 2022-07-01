package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class CreationDateDecorator extends FileDecorator{



	
	
	public CreationDateDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "creationDate";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}
