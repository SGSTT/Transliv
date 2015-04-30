/*
 */
package util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Util {
    
    public static boolean hayNumeros(String texto){
        boolean aux = false;
        char[] car = texto.toCharArray();
        for(byte i=0;i<car.length;i++){
            if(Character.isDigit(car[i])){
                aux = true; 
                break;
            }
        }
        return aux;
    }
    
    public static boolean esNumero(String texto){
        boolean aux = true;
        char[] car = texto.toCharArray();
        for(byte i=0;i<car.length;i++){
            if(!Character.isDigit(car[i])){
                aux = false;
                break;
            }
        }
        return aux;
    }
    
    public static boolean fechaCorrecta(String fecha){
        try{
            if(fecha.length()!=10 || fecha.charAt(2)!='-' || fecha.charAt(5)!='-') 
            { throw new Exception("Formato de fecha Incorrecta");}
            if(!esNumero(fecha.substring(0, 2)) 
                    || !esNumero(fecha.substring(3, 5)) 
                    || !esNumero(fecha.substring(6, 10)))
            { throw new Exception("La fecha en numeros por favor");}
            int año = Integer.parseInt(fecha.substring(0, 2));
            int mes = Integer.parseInt(fecha.substring(3, 5));
            int dia = Integer.parseInt(fecha.substring(6, 10));
            if(año<1900 || año>2013) { throw new Exception("Año incorrecto"); }
            if(mes<0 || mes>12) { throw new Exception("Mes incorrecto"); }
            if(dia<0 || dia>31) { throw new Exception("Dia incorrecto"); }
            if(mes==2 && dia>28) { throw new Exception("Febrero no puede tener\nmas de 28 dias"); }
        }
        catch(Exception ex){
            enviarMensajeError(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean horaCorrecta(String hora){
        try{
            if(hora.length()>5 || hora.charAt(2)!=':') 
            { throw new Exception("Formato de Hora Incorrecta");}
            if(!esNumero(hora.substring(0, 2))||!esNumero(hora.substring(3, 5))) 
            { throw new Exception("La fecha en numeros por favor");}
            byte horas = Byte.parseByte(hora.substring(0, 2));
            byte minutos = Byte.parseByte(hora.substring(3, 5));
            if(horas<0 || horas>23) { throw new Exception("Hora incorrecta"); }
            if(minutos<0 || minutos>59) { throw new Exception("Minuto incorrecto"); }
        }
        catch(Exception ex){
            enviarMensajeError(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public static void enviarMensajeError(String mensaje){
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, mensaje));
    }
    public static void enviarMensajeExito(String mensaje){
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, mensaje));
    }
}