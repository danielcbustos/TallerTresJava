import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio1.figurasGeometricas.Circulo;
import ejercicio1.figurasGeometricas.Cuadrado;
import ejercicio1.figurasGeometricas.Triangulo;
import ejercicio1.figurasGeometricas.interfaces.IFigurasGeometricas;
import ejercicio2.sistemanotificaciones.CorreoElectronico;
import ejercicio2.sistemanotificaciones.MensajeTexto;
import ejercicio2.sistemanotificaciones.NotificacionPush;
import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digita el numero del ejercicio que deseas visualizar (1 a 10)");
        System.out.println(
                "1. Figuras Geometricas \n2. Sistema de notificaciones \n3. Banco y cuentas \n4. Juego de cartas \n5. Tienda en linea \n6. Animales y sonido \n7. Formas geometricas y areas \n8. Empleados y salarios \n9. Instrumentos musicales \n10. Figuras en un lienzo");
        int numEjercicio = sc.nextInt();
        switch (numEjercicio) {
            case 1:
                // Ejercicio 1 --->Figuras Geometricas
                IFigurasGeometricas cuadrado = new Cuadrado(6);
                IFigurasGeometricas triangulo = new Triangulo(2, 5, 6);
                IFigurasGeometricas circulo = new Circulo(7);
                List<IFigurasGeometricas> figurasGeometricas = new ArrayList<>();
                figurasGeometricas.add(cuadrado);
                figurasGeometricas.add(triangulo);
                figurasGeometricas.add(circulo);

                for (IFigurasGeometricas figura : figurasGeometricas) {
                    figura.calculoArea();
                }
                break;
            case 2:
                // Ejercicio 2 --->Sistema de notificaciones
                ISistemaNotificaciones correoElectronico = new CorreoElectronico(
                        "Su factura del agua ha sido pagada con exito");
                ISistemaNotificaciones mensajeTexto = new MensajeTexto(
                        "Su factura del agua ha sido pagada con exito");
                ISistemaNotificaciones notificacionPush = new NotificacionPush(
                        "Su factura del agua ha sido pagada con exito");
                List<ISistemaNotificaciones> tiposMensaje = new ArrayList<>();
                tiposMensaje.add(correoElectronico);
                tiposMensaje.add(mensajeTexto);
                tiposMensaje.add(notificacionPush);
                tiposMensaje.forEach(
                        tipoMensaje -> {
                            tipoMensaje.enviar();
                        });
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
        }
        sc.close();
    }

}
