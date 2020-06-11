package Usuario;

import Usuario.NotificationService;
import Usuario.Observer;

import java.util.List;

public class ObserverNotify implements Observer {

    NotificationService notificationService;

    @Override
    public void generarAlerta(List<String> alertas){
        notificationService.notify(alertas);
    }
}
