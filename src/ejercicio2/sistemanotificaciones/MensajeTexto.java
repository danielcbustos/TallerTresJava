package ejercicio2.sistemanotificaciones;

public class MensajeTexto extends TipoNotificaciones {

    public MensajeTexto(String mensaje) {
        super(mensaje);

    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de texto es: " + mensaje);
    }

}
