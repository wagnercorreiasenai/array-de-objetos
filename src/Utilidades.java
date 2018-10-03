
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {

    /**
     * Retorna a data atual
     */
    public static String obterData(String mascara) {
        
        if (mascara == null) {
            mascara = "dd/MM/yyyy HH:mm:ss";
        }
        
        Date data = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat(mascara);
        String dataTxt = formatador.format(data);
        return dataTxt;
    }
    
    /**
     * Retorna o número formatado
     */
    public static String formartarNumero(double numero) {
        DecimalFormat df = new DecimalFormat("#.00");
        String numeroFormatado = df.format(numero);
        return numeroFormatado;
    }

}
