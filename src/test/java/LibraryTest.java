import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testPalabraMethod() {
        Palabras palabras = new Palabras();
        String actual = palabras.setCadena("Noviembre");
        String expect = "erbmeivoN";
        Assert.assertNotEquals(expect, actual);
    }

    @Test
    public void testPalabraRevert(){
        Palabras palabras = new Palabras();
        String actual = palabras.RevertWord("Enero");
        String expect = "orenE";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testWordContent(){
        Palabras palabras = new Palabras();
        String actual = palabras.WordContent("Enero");
        String expect = "ner";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testWordCheck(){
        Palabras palabras = new Palabras();
        String actual = palabras.checkWordConvert("Febrero");
        String expect = "Febrero";
        Assert.assertEquals(expect,actual);
    }
}
