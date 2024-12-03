import com.google.gson.annotations.SerializedName;

import java.util.Date;

public class Moneda {
    @SerializedName("base_code")
    private String moneda_base;
    @SerializedName("target_code")
    private String moneda_destino;
    @SerializedName("conversion_rate")
    private float valor_conversion_por_moneda_destino;
    @SerializedName("conversion_result")
    private String resutado_de_conversion;

    private int cantidad;

    public String getMoneda_base() {
        return moneda_base;
    }

    public String getMoneda_destino() {
        return moneda_destino;
    }

    public float getValor_conversion_por_moneda_destino() {
        return valor_conversion_por_moneda_destino;
    }

    public String getResutado_de_conversion() {
        return resutado_de_conversion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Moneda base: " + moneda_base
                + "\nMoneda destino: " + moneda_destino
                + "\nValor de conversion por moneda destino: " + valor_conversion_por_moneda_destino
                + "\nCantidad de " + moneda_base + " a convertir: " + cantidad
                + "\nResutado de conversion: " + resutado_de_conversion;
    }
}
