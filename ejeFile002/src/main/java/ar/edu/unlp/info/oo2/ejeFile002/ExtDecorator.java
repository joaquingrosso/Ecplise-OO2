package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class ExtDecorator extends FileDecorator{



	
	
	public ExtDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "extention";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}