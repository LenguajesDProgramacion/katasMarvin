/**
 *
 * @author Marvinero
 */
public class Palabras {
    
    public String cadena = "";
    public String comprobacion = "";
    
    public Palabras() {
    }

    public void setComprobacion(String comprobacion) {
        this.comprobacion = comprobacion;
    }

    public String getCadena() {
        return cadena;
    }

    public String getComprobacion() {
        return comprobacion;
    }

    public String setCadena(String cadena) {
        this.cadena = cadena;
        return cadena;
    }

    public String RevertWord(String cadena){
        this.cadena=cadena;
        String comprobacionfor="";
            for(int i = cadena.length()-1; i >= 0 ; i--){
                comprobacionfor += cadena.charAt(i);
            System.out.println(comprobacionfor);
            }
        return comprobacionfor;
    }
    
    public String checkWordConvert(String cadena){
        if(cadena.length() <= 5){
      }else{
            System.out.print("La palabra no se puede convertir porque tiene mas de 5 letras");
        }
        return cadena;
    }

    public String WordContent(String cadena) {
        this.cadena = cadena;
        String comprobacionWord = cadena.substring(1, cadena.length()-1);
        return comprobacionWord;
    }
}
