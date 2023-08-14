package ejercicio2.sistemanotificaciones;

import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;

public class NotificacionPush extends TipoNotificaciones implements ISistemaNotificaciones {

    public NotificacionPush(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de notificacion push es: " + mensaje);
    }

}
