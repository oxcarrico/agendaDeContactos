package AgendaDeContactos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
           try (Scanner scanner = new Scanner(System.in)) {
            Agenda agenda = new Agenda();   

            while (true) {
                System.out.println("Bienvenido al gestor de contactos, que quieres hacer. ");
                System.out.println("1. Agregar contactos ");
                System.out.println("2. Eleminar contactos ");
                System.out.println("3. Ver contactos ");
                System.out.println("4. Buscar  contacto");
                System.out.println("5. Salir");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                            System.out.println("Nombre: ");
                            String nombre = scanner.nextLine();
                            System.out.println("Telefono: ");
                            int telefono = scanner.nextInt();
                            System.out.println("Email: ");
                            String email = scanner.nextLine();
                            agenda.agregarContacto(new Contacto(nombre, telefono, email));
                        break;
                    case 2:
                            System.out.println("Escribe el nombre del contacto que quieras elminar: ");
                            String nombreElimar = scanner.nextLine();
                            agenda.eliminarContacto(nombreElimar);
                        break;
                    case 3:
                            agenda.monstrarContactos();
                        break;
                    case 4:
                            System.out.println("Escribe el nombre del contacto que quieras buscar: ");
                            String contactoBucar = scanner.nextLine();
                            agenda.buscarContacto(contactoBucar);
                        break;
                    case 5:
                            System.out.println("Saliendo...");
                        return;
                    default:
                            System.out.println("Opcion no valida");
                        break;
                }
            
            }
        }
        }


    }

    

