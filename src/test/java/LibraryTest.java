import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'pszak' at '2/1/16 11:06 AM' with Gradle 2.8
 *
 * @author pszak, @date 2/1/16 11:06 AM
 */
public class LibraryTest {
    private Library classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new Library();
    }

    @Test
    public void testSomeLibraryMethod() {
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }


   @Test
   public void libraryCanTellItsName() {
      assertNotNull(classUnderTest.myNameIs());
   }
}
