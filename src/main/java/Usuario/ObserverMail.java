package Usuario;



import java.util.List;

public class ObserverMail implements Observer {

    private String direccionMail;
    private MailSender mailSender;

    @Override
    public void generarAlerta(List<String> alertas){
        mailSender.send(direccionMail,alertas);
    }
}
