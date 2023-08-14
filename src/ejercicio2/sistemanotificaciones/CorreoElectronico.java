package ejercicio2.sistemanotificaciones;

import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;

public class CorreoElectronico extends TipoNotificaciones implements ISistemaNotificaciones {

    public CorreoElectronico(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de correo electronico es: " + mensaje);
    }

}
