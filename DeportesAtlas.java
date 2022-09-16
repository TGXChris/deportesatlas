
package panita.company.deportesatlas;

import panita.company.deportesatlas.DTO.ClubesDeportivos;
import panita.company.deportesatlas.DTO.Suscripcion;
import panita.company.deportesatlas.DTO.Usuarios;

public class DeportesAtlas {

    public static void main(String[] args) {
        
        
        //NUMERO FOLIO METODO/CONDICION//
        int folio=1000;
        
        
        
    //USUARIO 1//
        System.out.println("Generando...Usuario...");
    Usuarios Usu1 = new Usuarios();
    Usu1.setID(1000);
    Usu1.setNombreCompleto("David Cogiolle");
    Usu1.setRut(17029503, '8');
    Usu1.setFechaDeNacimiento("23/12/1889");
    Usu1.setTelefono(569896664);
    Usu1.setNombreUsuario("Dcog");
    Usu1.setMail("david.cogiolle@gmail.com");
    Usu1.setContraseña("Afds22231");
    
        System.out.println("Usuario creado: "+ Usu1.getNombreUsuario());
        System.out.println("Password: "+ Usu1.getContraseña());
    
      
    //USUARIO 2//
    Usuarios Usu2 = new Usuarios();
    Usu2.setID(1001);
    Usu2.setNombreCompleto("Gerr Adere");
    Usu2.setRut(18694509, '3');
    Usu2.setFechaDeNacimiento("07/09/1993");
    Usu2.setTelefono(569456430);
    Usu2.setNombreUsuario("ggft");
    Usu2.setMail("gerr.adere@live.cl");
    Usu2.setContraseña("G1ovanniGg34");
    
        System.out.println("Usuario creado: "+Usu2.getNombreUsuario());
        System.out.println("Password: "+Usu2.getContraseña());
        
        
    //USUARIO 3//
    Usuarios Usu3 = new Usuarios();
    Usu3.setID(1002);
    Usu3.setNombreCompleto("Sergio Villanueva");
    Usu3.setRut(21789453, '3');
    Usu3.setFechaDeNacimiento("07/07/2003");
    Usu3.setTelefono(567958467);
    Usu3.setNombreUsuario("scodiio");
    Usu3.setMail("sergio.villanueva@gmail.com");
    Usu3.setContraseña("5534Gato33");
        
        System.out.println("Usuario creado: "+Usu3.getNombreUsuario());
        System.out.println("Password: "+Usu3.getContraseña());
    
    
    //ClubesDeportivo 1//
    ClubesDeportivos Clu1 = new ClubesDeportivos();
    Clu1.setCodigo("ARH11");
    Clu1.setNombreClub("Arsenal de coquimbo");
    Clu1.setLema("Cañones a los puertos");
    Clu1.setValorSuscripcion(10050);
    Clu1.setColores("Amarillo, Rojo");
    Clu1.setAñoFundacion("1958");
    Clu1.setPaisOrigen("Chile");
    
        
        System.out.println("Club generado: "+ Clu1.getNombreClub());
        
        //ClubesDeportivo 2//
    
    ClubesDeportivos Clu2 = new ClubesDeportivos();
    Clu2.setCodigo("MCH12");
    Clu2.setNombreClub("Manquehue City");
    Clu2.setLema("Vivir y Fuerza");
    Clu2.setValorSuscripcion(15100);
    Clu2.setColores("Celeste, Blanco");
    Clu2.setAñoFundacion("1901");
    Clu2.setPaisOrigen("Chile");
        
        System.out.println("Club Generado.....: "+ Clu2.getNombreClub());
    
    //ClubesDeportivo 3//
    ClubesDeportivos Clu3 = new ClubesDeportivos();
    Clu3.setCodigo("MCH12");
    Clu3.setNombreClub("Los Cóndores Unidos");
    Clu3.setLema("Desde lo alto al sol");
    Clu3.setValorSuscripcion(13200);
    Clu3.setColores("Amarillo, Naranjo");
    Clu3.setAñoFundacion("1960");
    Clu3.setPaisOrigen("Chile");
        
        System.out.println("Club Generado....: "+ Clu3.getNombreClub());
    
    
    //Suscripcion-Solicitud 1//
    Suscripcion Sus1 = new Suscripcion();
    Sus1.setNumero(folio+10);
    Sus1.setUsuario("Usuario1");
    Sus1.setAbonoTotal(10050);
    Sus1.setEquipoSuscrito("ARH11 $10050, MCH12 $15100");
    
        System.out.println("Usuario1: "+Sus1.getNumero());
        System.out.println("Suscripcion 1: "+Sus1.getUsuario());
        System.out.println("AbonoTotal 1: "+Sus1.getAbonoTotal());
        System.out.println("EquipoSuscrito 1: "+Sus1.getEquipoSuscrito());
        System.out.println("Fecha de Suscripcion 1: "+Sus1.getFechaInicio());
        System.out.println("folio: "+Sus1.getNumero());
        
        
    //Suscripcion-Solicitud 2//
    Suscripcion Sus2 = new Suscripcion();
    Sus2.setNumero(folio+20);
    Sus2.setUsuario("Usuario2");
    Sus2.setAbonoTotal(13200);
    Sus2.setEquipoSuscrito("LCH13 $13200");
    
        System.out.println("FolioSuscripcion: "+Sus2.getNumero());
        System.out.println("Suscripcion 2: "+Sus2.getUsuario());
        System.out.println("AbonoTotal 2: "+Sus2.getAbonoTotal());
        System.out.println("EquipoSuscrito 2: "+Sus2.getEquipoSuscrito());
        System.out.println("folio: "+Sus2.getNumero());
    
     //Suscripcion-Solicitud 3//   
    Suscripcion Sus3 = new Suscripcion();
    Sus3.setNumero(folio+30);
    Sus3.setUsuario("Usuario3");
    Sus3.setAbonoTotal(18300);
    Sus3.setEquipoSuscrito("LCH $13200, MCH12 15100");
        
        System.out.println("Usuario 3: "+Sus3.getNumero());
        System.out.println("Suscripcion 3: "+Sus3.getUsuario());
        System.out.println("AbonoTotal 3: "+Sus3.getAbonoTotal());
        System.out.println("EquipoSuscrito 3: "+Sus3.getEquipoSuscrito());
        System.out.println("folio: "+Sus3.getNumero());
    
    
        
            
        
    }
}
