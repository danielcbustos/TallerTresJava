package ejercicio2.sistemanotificaciones;

import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;

public abstract class TipoNotificaciones implements ISistemaNotificaciones {
    protected String mensaje;

    public TipoNotificaciones(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
    }

}
