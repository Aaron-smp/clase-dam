

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class ClaseDamTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ClaseDamTest
{
    private ClaseDam claseDam1;
    private Alumno alumno1;
    private Alumno alumno2;
    private Alumno alumno3;
    private Alumno alumno4;
    private Alumno alumno5;

    /**
     * Default constructor for test class ClaseDamTest
     */
    public ClaseDamTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        claseDam1 = new ClaseDam(50);
        alumno1 = new Alumno("Aaron Treceño", "4982", 20);
        alumno2 = new Alumno("Aaron Perez", "2342", 19);
        alumno3 = new Alumno("Andrea cenador", "9509", 20);
        alumno4 = new Alumno("Pablo pekkaxi", "2407", 20);
        alumno5 = new Alumno("Adrian revollar", "0007", 21);
        claseDam1.matricularAlumno(alumno1);
        claseDam1.matricularAlumno(alumno2);
        claseDam1.matricularAlumno(alumno3);
        claseDam1.matricularAlumno(alumno4);
        claseDam1.matricularAlumno(alumno5);
        
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
