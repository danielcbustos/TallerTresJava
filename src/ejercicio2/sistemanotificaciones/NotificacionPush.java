package ejercicio2.sistemanotificaciones;

public class NotificacionPush extends TipoNotificaciones {

    public NotificacionPush(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de notificacion push es: " + mensaje);
    }

}
