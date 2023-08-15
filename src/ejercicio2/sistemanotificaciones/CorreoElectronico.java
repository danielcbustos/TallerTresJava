package ejercicio2.sistemanotificaciones;

public class CorreoElectronico extends TipoNotificaciones {

    public CorreoElectronico(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("El mensaje de correo electronico es: " + mensaje);
    }

}
