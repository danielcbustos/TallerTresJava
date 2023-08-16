import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ejercicio1.figurasGeometricas.Circulo;
import ejercicio1.figurasGeometricas.Cuadrado;
import ejercicio1.figurasGeometricas.Triangulo;
import ejercicio1.figurasGeometricas.interfaces.IFigurasGeometricas;
import ejercicio10.figurasenunlienzo.Circulo3;
import ejercicio10.figurasenunlienzo.Cuadrado3;
import ejercicio10.figurasenunlienzo.Lienzo;
import ejercicio10.figurasenunlienzo.Triangulo3;
import ejercicio10.figurasenunlienzo.interfaces.IDibujable;
import ejercicio2.sistemanotificaciones.CorreoElectronico;
import ejercicio2.sistemanotificaciones.MensajeTexto;
import ejercicio2.sistemanotificaciones.NotificacionPush;
import ejercicio2.sistemanotificaciones.interfaces.ISistemaNotificaciones;
import ejercicio3.bancoycuentas.CuentaAhorro;
import ejercicio3.bancoycuentas.CuentaCorriente;
import ejercicio3.bancoycuentas.interfaces.ISistemaBancario;
import ejercicio4.juegodecartas.Baraja;
import ejercicio4.juegodecartas.interfaces.ISistemaCartas;
import ejercicio5.tiendaenlinea.Electronica;
import ejercicio5.tiendaenlinea.Libro;
import ejercicio5.tiendaenlinea.Ropa;
import ejercicio5.tiendaenlinea.interfaces.ISistemaTienda;
import ejercicio6.animalesysonidos.Gato;
import ejercicio6.animalesysonidos.Pajaro;
import ejercicio6.animalesysonidos.Perro;
import ejercicio6.animalesysonidos.TipoAnimales;
import ejercicio7.formasgeometricasyareas.Circulo2;
import ejercicio7.formasgeometricasyareas.Triangulo2;
import ejercicio7.formasgeometricasyareas.Cuadrado2;
import ejercicio7.formasgeometricasyareas.interfaces.IFormasGeometricas;
import ejercicio8.empleadosysalarios.EmpleadoAsalariado;
import ejercicio8.empleadosysalarios.EmpleadoPorHoras;
import ejercicio8.empleadosysalarios.TiposEmpleados;
import ejercicio9.instrumentosmusicales.Guitarra;
import ejercicio9.instrumentosmusicales.InstrumentosMusicales;
import ejercicio9.instrumentosmusicales.Piano;
import ejercicio9.instrumentosmusicales.Violin;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean repetirMenuPrincipal = true;
        int contadorContinuar = 0;
        while (repetirMenuPrincipal) {
            contadorContinuar++;
            String continuar = "si";
            if (contadorContinuar != 1) {
                System.out.println("Deseas visualizar otro ejercicio si/no");
                continuar = sc.next().toLowerCase();
            }
            if (continuar.equals("si")) {
                System.out.println("Digita el numero del ejercicio que deseas visualizar (1 a 10)");
                System.out.println(
                        "1. Figuras Geometricas \n2. Sistema de notificaciones \n3. Banco y cuentas \n4. Juego de cartas \n5. Tienda en linea \n6. Animales y sonido \n7. Formas geometricas y areas \n8. Empleados y salarios \n9. Instrumentos musicales \n10. Figuras en un lienzo \n11. Salir");
                int numEjercicio = sc.nextInt();

                switch (numEjercicio) {
                    case 1:
                        // Ejercicio 1 --->Figuras Geometricas
                        IFigurasGeometricas cuadrado = new Cuadrado(6);
                        IFigurasGeometricas triangulo = new Triangulo(2, 5, 6);
                        IFigurasGeometricas circulo = new Circulo(7);
                        cuadrado.calculoArea();
                        cuadrado.calculoPerimetro();
                        triangulo.calculoArea();
                        triangulo.calculoPerimetro();
                        circulo.calculoArea();
                        circulo.calculoPerimetro();

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
                        for (ISistemaNotificaciones tipo : tiposMensaje) {
                            tipo.enviar();
                        }
                        break;
                    case 3:
                        // Ejercicio 3 --->Banco y Cuentas
                        System.out.println("En que tipo de cuenta deseas realizar operaciones (1 o 2)");
                        System.out.println("1. Cuenta de ahorro \n2. Cuenta corriente");
                        int tipoCuenta = sc.nextInt();
                        System.out.println("El saldo de tu cuenta es:");
                        int saldo = sc.nextInt();
                        boolean infinito = true;

                        switch (tipoCuenta) {
                            case 1:
                                ISistemaBancario cuenta1 = new CuentaAhorro(saldo);

                                while (infinito) {
                                    System.out.println("\n¿Que operacion deseas realizar?");
                                    System.out.println("1. Depositar dinero \n2. Retirar dinero \n3. Salir");
                                    int tipoOperacion = sc.nextInt();
                                    if (tipoOperacion == 1) {
                                        System.out.println("¿Cuanto dinero deseas depositar?");
                                        double deposito = sc.nextDouble();
                                        cuenta1.depositarDinero(deposito);
                                    } else if (tipoOperacion == 2) {
                                        System.out.println("¿Cuanto dinero deseas retirar?");
                                        double retiro = sc.nextDouble();
                                        cuenta1.retirarDinero(retiro);
                                    } else if (tipoOperacion == 3) {
                                        break;
                                    }
                                }
                                break;

                            case 2:
                                ISistemaBancario cuenta2 = new CuentaCorriente(saldo);
                                while (infinito) {
                                    System.out.println("\n¿Que operacion deseas realizar?");
                                    System.out.println("1. Depositar dinero \n2. Retirar dinero \n3. Salir");
                                    int tipoOperacion2 = sc.nextInt();
                                    if (tipoOperacion2 == 1) {
                                        System.out.println("¿Cuanto dinero deseas depositar?");
                                        double deposito = sc.nextDouble();
                                        cuenta2.depositarDinero(deposito);
                                    } else if (tipoOperacion2 == 2) {
                                        System.out.println("¿Cuanto dinero deseas retirar?");
                                        double retiro = sc.nextDouble();
                                        cuenta2.retirarDinero(retiro);
                                    } else if (tipoOperacion2 == 3) {
                                        break;
                                    }
                                }
                                break;
                            default:
                                break;
                        }

                        break;
                    case 4:
                        // Juego de cartas
                        Baraja baraja = new Baraja();
                        baraja.mezclar();

                        for (int i = 0; i < 5; i++) {
                            ISistemaCartas carta = baraja.sacarCarta();
                            if (carta != null) {
                                carta.mostrarCarta();
                            } else {
                                System.out.println("No quedan más cartas en la baraja.");
                                break;
                            }
                        }
                        break;
                    case 5:
                        // Ejercicio 5 --->Tienda en linea
                        ISistemaTienda producto1 = new Ropa("Camisa", 30000, "M");
                        ISistemaTienda producto2 = new Electronica("Celular", 1500000, "Samsung Galaxy");
                        ISistemaTienda producto3 = new Libro("La Voragine", 70000, 900);
                        List<ISistemaTienda> productos = new ArrayList<>();
                        productos.add(producto1);
                        productos.add(producto2);
                        productos.add(producto3);
                        int total = 0;
                        for (ISistemaTienda producto : productos) {
                            producto.mostrarDetalles();
                            total += producto.calcularPrecio();
                        }
                        System.out.println("El precio total de su compra es: " + total);
                        break;
                    case 6:
                        // Ejercicio 6 ---> Animales y sonidos

                        Perro perro = new Perro("Patacon");
                        Gato gato = new Gato("Misifu");
                        Pajaro pajaro = new Pajaro("Poncho");
                        List<TipoAnimales> animales = new ArrayList<>();
                        animales.add(perro);
                        animales.add(gato);
                        animales.add(pajaro);
                        for (TipoAnimales animal : animales) {
                            animal.hacerSonido();
                        }
                        break;
                    case 7:
                        // Ejercicio 7 --->Figuras Geometricas y Areas
                        IFormasGeometricas cuadrado2 = new Cuadrado2(6);
                        IFormasGeometricas triangulo2 = new Triangulo2(2, 5, 6);
                        IFormasGeometricas circulo2 = new Circulo2(7);
                        List<IFormasGeometricas> formasGeometricas = new ArrayList<>();
                        formasGeometricas.add(cuadrado2);
                        formasGeometricas.add(triangulo2);
                        formasGeometricas.add(circulo2);

                        for (IFormasGeometricas figura : formasGeometricas) { // polimorfismo
                            figura.calculoArea();
                            figura.calculoPerimetro();
                        }
                        break;
                    case 8:
                        // Empleados y Salarios
                        EmpleadoAsalariado asalariado = new EmpleadoAsalariado(2500000); // mensual
                        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras(15000, 8, 5);// por horas
                        List<TiposEmpleados> empleados = new ArrayList<>();
                        empleados.add(asalariado);
                        empleados.add(empleadoPorHoras);
                        for (TiposEmpleados empleado : empleados) {
                            empleado.calculoSalario();
                        }
                        break;
                    case 9:
                        // Instrumentos Musicales
                        Guitarra guitarra = new Guitarra();
                        Piano piano = new Piano();
                        Violin violin = new Violin();
                        List<InstrumentosMusicales> instrumentosMusicales = new ArrayList<>();
                        instrumentosMusicales.add(guitarra);
                        instrumentosMusicales.add(piano);
                        instrumentosMusicales.add(violin);
                        for (InstrumentosMusicales instrumento : instrumentosMusicales) {
                            instrumento.tocar();
                        }
                        break;
                    case 10:
                        // Figuras en un lienzo
                        IDibujable cuadrado3 = new Cuadrado3(7);
                        IDibujable triangulo3 = new Triangulo3(5, 8, 4);
                        IDibujable circulo3 = new Circulo3(6);
                        Lienzo lienzo = new Lienzo(cuadrado3, triangulo3, circulo3);
                        List<IDibujable> listaFiguradDibujables = lienzo.listarFiguras();
                        for (IDibujable fig : listaFiguradDibujables) {
                            fig.dibujar();
                        }
                        break;
                    case 11:
                        // Salir
                        repetirMenuPrincipal = false;
                        break;
                    default:
                        System.out.println("Digita un numero valido");
                        break;
                }
            } else if (continuar.equals("no")) {
                break;

            }

        }

        sc.close();
    }

    public static String continuar(Scanner sc, int contadorContinuar) {

        return null;
    }

}
