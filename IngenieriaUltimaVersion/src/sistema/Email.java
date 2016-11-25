package sistema;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
/*
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
*/
import javax.swing.JOptionPane;

public class Email {

    String usuario;
    String contrasenia;

    String rutaArchivo;
    String nombreArchivo;

    String destinatario;
    String asunto;
    String mensaje;

    public Email(String usuario, String contrasenia, String rutaArchivo, String nombreArchivo, String destinatario, String asunto, String mensaje) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.destinatario = destinatario;
        this.asunto = asunto;
        this.mensaje = mensaje;
    }

    public Email(String usuario, String contrasenia, String destinatario, String mensaje) {
        this(usuario, contrasenia, "", "", destinatario, "", mensaje);
    }

    public Email(String usuario, String contrasenia, String destinatario, String asunto, String mensaje) {
        this(usuario, contrasenia, "", "", destinatario, asunto, mensaje);
    }
/*
    public boolean sendMail() throws MessagingException {
        try {
            Properties props = new Properties();
            props.put("mail.stmp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.user", usuario);
            props.setProperty("mail.smtp.auth", "true");
            
            Session session = Session.getDefaultInstance(props, null);
            BodyPart texto = new MimeBodyPart();
            texto.setText(mensaje);
            
            BodyPart adjunto = new MimeBodyPart();
            if(!rutaArchivo.equalsIgnoreCase("")){
                adjunto.setDataHandler(new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);
            }
            
            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            if(!rutaArchivo.equalsIgnoreCase("")){
                multiParte.addBodyPart(adjunto);
            }
            
            MimeMessage message =new MimeMessage (session);
            message.setFrom(new InternetAddress(usuario));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            message.setSubject(asunto);
            message.setContent(multiParte);
            
            Transport t = session.getTransport ("smtp");
            t.connect(usuario, contrasenia);
            t.sendMessage(message, message.getAllRecipients());
            t.close();
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
       
    }

   public void  enviarEmail(String email) throws MessagingException{

           String clave= "hcezknagayzewyul";
           Email e= new Email("restaurantedarius@gmail.com",clave, email,"mensaje prueba" );
           if(e.sendMail()){
               JOptionPane.showMessageDialog(null, "El email se mando correctamete");
           }else{
               JOptionPane.showMessageDialog(null, "El email no se mando correctamete");
           }
   }
   */
}
