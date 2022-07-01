package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;
    private DatabaseAccess databaseproxyTrue;
    private DatabaseAccess databaseproxyFalse;
    
    
    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.databaseproxyTrue = new DatabaseAccessProxy(database, "p455w0rD");
        this.databaseproxyFalse = new DatabaseAccessProxy(database, "contraseña");
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));        
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    
    @Test
    void testGetSearchResultsProxy() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseproxyTrue.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.databaseproxyTrue.getSearchResults("select * from comics where id=10"));
        
        assertEquals(null, this.databaseproxyFalse.getSearchResults("select * from comics where id=1"));
        assertEquals(null, this.databaseproxyFalse.getSearchResults("select * from comics where id=10"));        
    }

    @Test
    void testInsertNewRowProxy() {
        assertEquals(3, this.databaseproxyTrue.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.databaseproxyTrue.getSearchResults("select * from comics where id=3"));
        
        assertEquals(-1, this.databaseproxyFalse.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(null, this.databaseproxyFalse.getSearchResults("select * from comics where id=3"));
    }
}