package Clima;

import java.util.List;

public class ObserverNotify implements ObserverClima {

    NotificationService notificationService;

    @Override
    public void generarAlerta(List<String> alertas){
        notificationService.notify(alertas);
    };
}
