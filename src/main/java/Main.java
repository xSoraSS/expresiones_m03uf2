import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
//          CONTAR PARENOELS, RENS && FOLLETS EXPRESIONES REGULARES
        ContadorExpresionesRegulares contadorExpresionesRegulares = new ContadorExpresionesRegulares();
        contadorExpresionesRegulares.contar();

//        CONTAR PARENOELS, RENS && FOLLETS SIN EXPRESIONES REGUARES
        ContadorNormal contadorNormal = new ContadorNormal();
        contadorNormal.contar();
    }
}