import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        GeneradorArchivoHistorico generador = new GeneradorArchivoHistorico();

        char continuar = 'S';
        while (continuar == 'S') {
            String monedaBase;
            String monedaDestino;
            int cantidad = 0;
            int opcion = 0;
            Map<String, String> clavesMonedasBase = new HashMap<>();
            clavesMonedasBase.put("ARS", "Peso argentino");
            clavesMonedasBase.put("BOB", "Boliviano boliviano");
            clavesMonedasBase.put("BRL", "Real brasileño");
            clavesMonedasBase.put("CLP", "Peso chileno");
            clavesMonedasBase.put("COP", "Peso colombiano");
            clavesMonedasBase.put("MXN", "Peso mexicano");
            clavesMonedasBase.put("USD", "Dólar estadounidense");

            System.out.println("\nDigita el número de la opción que deseas ejecutar: ");
            System.out.println("\n1 - Convertir monedas" +
                    "\n2 - Consultar historico de conversiones");
            opcion = lectura.nextInt();
            lectura.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Elije una moneda base: \n");
                    clavesMonedasBase.forEach((key, value) -> {
                        System.out.println("Clave: " + key + ": " + value);
                    });
                    System.out.println("Dijita sólo la clave de la moneda base: ");
                    monedaBase = lectura.nextLine().toUpperCase();
                    clavesMonedasBase.remove(monedaBase);
                    System.out.println("Elige una moneda destion: \n");
                    clavesMonedasBase.forEach((key, value) -> {
                        System.out.println("Clave: " + key + ": " + value);
                    });
                    System.out.println("Dijita sólo la clave de la moneda destino: ");
                    monedaDestino = lectura.nextLine().toUpperCase();

                    System.out.println("\nDijite la cantidad de " + monedaBase + " que desea convertir a " + monedaDestino);
                    cantidad = lectura.nextInt();
                    lectura.nextLine();

                    Moneda moneda = consultaMoneda.buscaPelicula(monedaBase, monedaDestino, cantidad);
                    moneda.setCantidad(cantidad);
                    generador.guardarJson(moneda);
                    System.out.println("\nResultado de conversion: \n" + moneda);
                    break;
                case 2:
                    generador.consultarHistorico();
                    break;
                default:
                    System.out.println("No existe esa opcion. Por favor digita una opción válida.");
                    break;

            }
            System.out.println("\nDeseas volver a consultar el menú: ");
            System.out.println("Digita: S o N");
            continuar = lectura.nextLine().toUpperCase().charAt(0);
        }
    }
}
