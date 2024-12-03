import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class GeneradorArchivoHistorico {
    public void guardarJson(Moneda conversion) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        File file = new File("historico.txt");
        String saltoLinea = System.lineSeparator();
        if (!file.exists()) {
            file.createNewFile();
            System.out.println("Creando archivo");
            FileWriter escritura = new FileWriter(file);
            escritura.write(conversion.toString());
            escritura.write("\nFecha de operación: " + obtenerFecha(new Date()));
            escritura.write(saltoLinea);
            escritura.close();
        } else {
            System.out.println("\nExiste un archivo");
            List<String> lineas = Files.readAllLines(file.toPath());
            FileWriter escritura = new FileWriter(file);
            lineas.forEach(obj ->{
                try {
                    escritura.write(obj.toString()+"\n");
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            });
            escritura.write(saltoLinea);
            escritura.write(conversion.toString());
            escritura.write("\nFecha de operación: " + obtenerFecha(new Date()));
            escritura.write(saltoLinea);
            escritura.close();
        }

    }

    public void consultarHistorico() {
        File file = new File("historico.txt");

        try {
            if (Files.readAllLines(file.toPath()).isEmpty()) {
                System.out.println("Aún no tienes un historico de conversiones.");
                System.out.println("\nRealiza conversiones para poder generarte un histórico");
            } else {
                System.out.println("Consultando historico de conversiones.");
                List<String> lineas = Files.readAllLines(file.toPath()); // Lee todas las líneas en una lista
                System.out.println("\n");
                lineas.forEach(System.out::println); // Imprime cada línea
            }

        } catch (IOException e) {
            System.err.println("Aún no cuentas con el archivo: " + e.getMessage() + "\nDebes generar conversiones para poder generarte tu archivo de histórico");
        }
    }

    public static String obtenerFecha(Date fecha) {
        if (fecha != null) {
            SimpleDateFormat formatoFecha;
            formatoFecha = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            formatoFecha.setTimeZone(TimeZone.getTimeZone("America/Mexico_City"));
            return formatoFecha.format(fecha);
        } else {
            return "";
        }
    }
}
