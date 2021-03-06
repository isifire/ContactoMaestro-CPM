
package contactomaestro;

/**
 *
 * @author Isidro Benitez Zapico UO285039
 */
public class MensajesSms {

    private String destinatario;
    private String mensaje;
    
    public MensajesSms(){
        
    }
    
    public MensajesSms(String destinatario,String mensaje){
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }
    
    public String getDestinatario() {
        return destinatario;
    }


    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }


    public String getMensaje() {
        return mensaje;
    }


    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
    @Override
    public String toString(){
        return destinatario;
    }
    
}
