package ar.edu.unlp.info.oo2.ejeFile002;

import java.time.LocalDate;

public class SizeDecorator extends FileDecorator{



	
	
	public SizeDecorator(FileManager fileSize) {
		super(fileSize);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "size";
	}

	public String prettyPrint() {
		return this.toString() + super.prettyPrint();
	}

	
	
}
