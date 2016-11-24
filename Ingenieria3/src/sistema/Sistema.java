package sistema;

import java.util.ArrayList;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
//import javax.mail.MessagingException;
import javax.swing.JOptionPane;

public class Sistema {

    private ArrayList<Cliente> listaClientes;
    private Restaurante restaurante;
    private ArrayList<Evaluacion> listaEvaluaciones;
    private Sorteo sorteo;
    

    public Sistema() {
        listaClientes = new ArrayList();
        listaEvaluaciones = new ArrayList();
        sorteo = null;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Sorteo getSorteo() {
        return sorteo;
    }

    public void setSorteo(Sorteo sorteo) {
        this.sorteo = sorteo;
    }

    public ArrayList<Evaluacion> getListaEvaluaciones() {
        return listaEvaluaciones;
    }

    public void setListaEvaluaciones(ArrayList<Evaluacion> listaEvaluaciones) {
        this.listaEvaluaciones = listaEvaluaciones;
    }

    public void crearCliente(String nombre, String email) {
        Cliente c = new Cliente(nombre, email);
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (listaClientes.contains(c)) {
                return;
            }
        }
        listaClientes.add(c);
    }

    public void crearCliente(Cliente c) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (listaClientes.contains(c)) {
                return;
            }
        }
        listaClientes.add(c);
    }

    public void crearRestaurante(String nombre, String direccion, String horarios, String tipoComida) {
        this.restaurante = new Restaurante(nombre, direccion, horarios, tipoComida);
    }

    public void crearEvaluacion(int estrellas, String resena, Cliente cliente) {
        listaEvaluaciones.add(new Evaluacion(estrellas, resena, cliente));
    }

    public void crearEvaluacion(Evaluacion e) {
        listaEvaluaciones.add(e);
    }

    public void definirSorteo(int numeroGanadores, String premio, int dia, int mes, int anio) {
        sorteo = new Sorteo(listaClientes, numeroGanadores, premio, dia, mes, anio);
    }

    public void realizarSorteo() throws MessagingException {
        int ganador = -1;
        if (sorteo.getListaParticipantes().size() >= 1) {
            for (int i = 0; i < sorteo.getNumeroGanadores(); i++) {
                while (ganador < 0 || ganador > sorteo.getListaParticipantes().size()) {
                    ganador = (int) (Math.random());
                }
                Cliente c = sorteo.getListaParticipantes().get(ganador);
                enviarEmail(c.getEmail(), c.getNombre());
              
               

            }
        }

    }
   
  

//    public void enviarEmail(String email) throws MessagingException{
//         
 public void enviarEmail(String mailDestinatario, String nombre) throws MessagingException {
                final String username = "restaurantedarius5@gmail.com";
		final String password = "noxus123";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
                
                Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
                
                try{
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("restaurantedarius5@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
					InternetAddress.parse(mailDestinatario));
			message.setSubject(restaurante.getNombre());
			message.setText(nombre +
					"Felicidades!! Usted ha ganado el sorteo del " + restaurante.getNombre() +"!");

			Transport.send(message);

			System.out.println("Done");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
    }
//    }
    public void contactarGanador(Cliente ganador) {
        //Implementar
        //JavaMail

    }

}
