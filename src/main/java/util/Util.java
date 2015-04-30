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
    
    public static void enviarMensajeError(String mensaje){
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_ERROR, mensaje, mensaje));
    }
    public static void enviarMensajeExito(String mensaje){
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(FacesMessage.SEVERITY_INFO, mensaje, mensaje));
    }
}