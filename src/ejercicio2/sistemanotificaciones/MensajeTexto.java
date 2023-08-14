package ejercicio2.sistemanotificaciones;

import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;

public class MensajeTexto extends TipoNotificaciones implements ISistemaNotificaciones {

    public MensajeTexto(String mensaje) {
        super(mensaje);

    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de texto es: " + mensaje);
    }

}
