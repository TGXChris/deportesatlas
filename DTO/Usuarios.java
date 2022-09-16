
package panita.company.deportesatlas.DTO;

import java.util.regex.Pattern;

public class Usuarios {
    private int ID;
    private String NombreCompleto;
    private int Rut;
    private String Dv;
    private String FechaDeNacimiento;
    private int Telefono;
    private String Mail;
    private String NombreUsuario;
    private String Contraseña;
  

    public Usuarios(){
        this.ID = 0;
        this.NombreCompleto = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaDeNacimiento = "";
        this.Telefono = 569565656;
        this.Mail = "";
        this.NombreUsuario = "";
        this.Contraseña = "";
        
        
        
        
}

    public Usuarios(int ID, String NombreCompleto, int Rut, String Dv, String FechaDeNacimiento, int Telefono, String Mail, String NombreUsuario, String Contraseña) {
        this.ID = ID;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FechaDeNacimiento = FechaDeNacimiento;
        this.Telefono = Telefono;
        this.Mail = Mail;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
    }

   

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

     
    public void setRut(int Run, char Dv) {
        if(this.validarRut(Run, Dv)){
            this.Rut = Run;
            this.Dv = Dv+"";
        }
    }  
   
    
    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String FechaDeNacimiento) {
        this.FechaDeNacimiento = FechaDeNacimiento;
    }
  
    

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
           StringBuilder sb = new StringBuilder();
        sb.append(Telefono);
        if(sb.length() > 9){
            this.Telefono = Telefono;
    }
}
    public String getMail() {
          if(Mail.length() > 5 && Mail.contains("@")){
            this.Mail = "";
 }
        return null;
 }
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getContraseña() {
        return Contraseña;
    }
    private static final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{6,}$";
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    

    public void setContraseña(String Contraseña)
    {
      if (PASSWORD_PATTERN.matcher(Contraseña).matches()) {
            this.Contraseña = Contraseña;
    }
    }
     public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

 
}

   
 






    
    
    
    
    



    
    

     
    
    
    
    
  
