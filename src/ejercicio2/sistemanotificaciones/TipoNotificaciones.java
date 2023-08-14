package ejercicio2.sistemanotificaciones;

public abstract class TipoNotificaciones {
    protected String mensaje;

    public TipoNotificaciones(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
