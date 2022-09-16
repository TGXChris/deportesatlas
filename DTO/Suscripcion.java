
package panita.company.deportesatlas.DTO;

import java.util.Date;

public class Suscripcion {
    private String Usuario;
    private int Numero;
    private Date FechaInicio;
    private int ValorSuscripcion;
    private String EquipoSuscrito;
    private int AbonoTotal;
    private String CorrelativoVenta;
    
    public Suscripcion(){
        this.Usuario = "";
        this.Numero = 0;
        this.FechaInicio = new Date();
        this.ValorSuscripcion = 0; 
        this.EquipoSuscrito = "";
        this.AbonoTotal = 0;
        this.CorrelativoVenta = "";
              
    }

    public Suscripcion(String Usuario, int Numero, Date FechaInicio, int ValorSuscripcion, String EquipoSuscrito, int AbonoTotal, String CorrelativoVenta) {
        this.Usuario = Usuario;
        this.Numero = Numero;
        this.FechaInicio = FechaInicio;
        this.ValorSuscripcion = ValorSuscripcion;
        this.EquipoSuscrito = EquipoSuscrito;
        this.AbonoTotal = AbonoTotal;
        this.CorrelativoVenta = CorrelativoVenta;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        if(Numero > 0){
            this.Numero = Numero;
    }
    }
    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public String getEquipoSuscrito() {
        return EquipoSuscrito;
    }

    public void setEquipoSuscrito(String EquipoSuscrito) {
        this.EquipoSuscrito = EquipoSuscrito;
    }

    public int getAbonoTotal() {
        return AbonoTotal;
    }

    public void setAbonoTotal(int AbonoTotal) {
        this.AbonoTotal = AbonoTotal;
    }

    public String getCorrelativoVenta() {
        return CorrelativoVenta;
    }

    public void setCorrelativoVenta(String CorrelativoVenta) {
        this.CorrelativoVenta = CorrelativoVenta;
    }

     @Override
    public String toString(){
        return this.CorrelativoVenta + " " + this.EquipoSuscrito +
                " " + this.Usuario + " " + this.AbonoTotal +
                " " + this.FechaInicio + " " + this.Numero + 
                " " + this.ValorSuscripcion;


   
}
    
}
