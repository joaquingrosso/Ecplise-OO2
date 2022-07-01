package ar.edu.unlp.info.oo2.ejeFile002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFile002 {

	FileOO2 file;
	FileManager fileSize;
	FileManager fileName;
	FileManager fileExt;
	FileManager fileCreationDate;
	FileManager fileModificationDate;
	FileManager filePermition;

	
	@BeforeEach
	void setUp() throws Exception {

		file = new FileOO2("lol", ".exe", 32, LocalDate.now(), LocalDate.now(), "lectura");
		fileSize = new SizeDecorator(file);
		fileName = new NameDecorator(fileSize);
		fileExt = new ExtDecorator(fileName);
		filePermition = new PermitionDecorator(fileExt);
		System.out.println(filePermition.prettyPrint());
		System.out.println(fileName.prettyPrint());
		System.out.println(fileExt.getName());
	

		
		
	}
    @Test
    public void testPrettyPrint() {
    	assertEquals("", file.prettyPrint());
    
		assertEquals("size ", fileSize.prettyPrint());
		assertEquals("name size ",fileName.prettyPrint());
		assertEquals(32,fileName.getSize());
 
    }
}
