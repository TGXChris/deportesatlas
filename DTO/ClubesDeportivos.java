package panita.company.deportesatlas.DTO;

public class ClubesDeportivos {
    private String Codigo;
    private String NombreClub;
    private String NombreFundador;
    private String AñoFundacion;
    private String PaisOrigen;
    private String Lema;
    private String Colores;
    private int ValorSuscripcion;
    
    public ClubesDeportivos(){
        this.Codigo = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AñoFundacion= "";
        this.PaisOrigen = "";
        this.Lema = "";
        this.Colores = "";
        this.ValorSuscripcion = 0;
       
    }

    public ClubesDeportivos(String Codigo, String NombreClub, String NombreFundador, String AñoFundacion, String PaisOrigen, String Lema, String Colores, int ValorSuscripcion) {
        this.Codigo = Codigo;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AñoFundacion = AñoFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.Colores = Colores;
        this.ValorSuscripcion = ValorSuscripcion;
    }


    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public String getAñoFundacion() {
        return AñoFundacion;
    }

    public void setAñoFundacion(String AñoFundacion) {
        this.AñoFundacion = AñoFundacion;
    }


    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }

     @Override
    public String toString(){
        return this.Codigo + " " + this.Colores +
                " " + this.Lema + " " + this.NombreClub+
                " "+ this.NombreFundador+ " " + this.PaisOrigen;
    }
    }

   