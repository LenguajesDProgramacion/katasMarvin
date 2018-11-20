import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void testPalabraMethod() {
        Palabras palabras = new Palabras();
        String actual = palabras.setCadena("Noviembre"); //Comprobacion del metodo set.
        String expect = "erbmeivoN";
        Assert.assertNotEquals(expect, actual);
    }

    @Test
    public void testPalabraRevert(){
        Palabras palabras = new Palabras();
        String actual = palabras.RevertWord("Enero"); //Palabra invertida.
        String expect = "orenE";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testWordContent(){
        Palabras palabras = new Palabras();
        String actual = palabras.WordContent("Enero"); //Contenido Invetido sin la primera y ultima letra
        String expect = "ner";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testWordCheck(){
        Palabras palabras = new Palabras();
        String actual = palabras.checkWordConvert("Pan"); //menor a 5 letras.
        String expect = "naP";
        Assert.assertEquals(expect,actual);
    }

    @Test
    public void testWordCheck2(){
        Palabras palabras = new Palabras();
        String actual = palabras.checkWordConvert("Febrero"); //mayor a 5 letras.
        String expect = "";
        Assert.assertEquals(expect,actual);
    }
}
