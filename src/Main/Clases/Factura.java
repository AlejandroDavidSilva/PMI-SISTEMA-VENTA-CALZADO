package Main.Clases;

import java.util.Date;
import java.util.Random;

public class Factura {

    private Integer idUnico; //debe generarse de forma aleatoria y automatica al ejecutar una venta
    private Date fecha;

    
    public Factura(Integer idUnico, Date fecha) {
        this.idUnico = idUnico;
        this.fecha = fecha;
    }

//funcion para crear el id aleatorio y unico

    public void setIdUnico() {
        Random random = new Random();
        Integer numeroAleatorio = random.nextInt();
        this.idUnico = numeroAleatorio;

    }

    public Integer getIdUnico() {

        return this.idUnico;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
