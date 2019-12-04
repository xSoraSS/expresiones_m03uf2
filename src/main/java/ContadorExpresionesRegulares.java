import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ContadorExpresionesRegulares {

    public void contar() throws IOException {
        File f = new File("santako.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        int parenoelC = 0, renC = 0, folletC = 0, lineC = 0;

        String line;

        System.out.println("\nMOSTRANDO CONTADOR EXPRESIONES REGULARES\n-----------------------------------------------------");

        while ((line = br.readLine()) != null) {
            Pattern parenoel = Pattern.compile("\\*<]:-DOo");
            Pattern ren = Pattern.compile(">:o\\)");
            Pattern follet = Pattern.compile("<]:-D");
            Matcher parenoelMat = parenoel.matcher(line);
            Matcher renMat = ren.matcher(line);
            Matcher folletMat = follet.matcher(line);

            while (parenoelMat.find()) {
                parenoelC++;
            }
            while (renMat.find()) {
                renC++;
            }
            while (folletMat.find()) {
                folletC++;
            }

            lineC++;
        }

        System.out.println("PareNoel: " + parenoelC);
        System.out.println("Ren: " + renC);
        System.out.println("Follet: " + (folletC-parenoelC));

        System.out.println("LINEAS:  " + lineC);
    }
}