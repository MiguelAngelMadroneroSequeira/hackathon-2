import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    Agenda agenda = new Agenda();
//
    agenda.agregarContacto(new Contacto("Miguel", "3137613879"));
    agenda.agregarContacto(new Contacto("Andrés", "3137613234"));
    agenda.agregarContacto(new Contacto("Juan", "3137613234"));
    agenda.agregarContacto(new Contacto("Carlos", "3137613234"));
    agenda.agregarContacto(new Contacto("Plinio", "3137613234"));
    agenda.agregarContacto(new Contacto("Mateo", "3137613234"));
    agenda.agregarContacto(new Contacto("Alejandro", "3137613234"));
    agenda.agregarContacto(new Contacto("Ana", "3137613234"));
    agenda.agregarContacto(new Contacto("Maria", "3137613234"));
//    agenda.agregarContacto(new Contacto("Jenny", "3137613234"));
//    agenda.agregarContacto(new Contacto("Alexa", "3137613234"));






//  for(Contacto contacto: agenda.contactos){
//    System.out.println(contacto.getNombre());
//    System.out.println(contacto.getNumero());
//  }

//  agenda.listarContactos();
//    agenda.buscarContacto("pepe");

//    agenda.eliminarContacto("Miguel");

//    agenda.espacioLibre();
//    agenda.agregarContacto(new Contacto("Miguel", "3137613879"));
//    agenda.listarContactos();



    Scanner scanner= new Scanner(System.in);
    int opcion;

    do{

      System.out.println("\nMenu");
      System.out.println("1: Agregar un contacto");
      System.out.println("2: Verificar si existe un contacto");
      System.out.println("3: Mostrar todos los contactos");
      System.out.println("4: Buscar un contacto");
      System.out.println("5: Eliminar contacto");
      System.out.println("6: espacio disponible en agenda");
      System.out.println("7: Salir");

      System.out.println("Elija una opcion:");
      opcion = scanner.nextInt();
      scanner.nextLine(); // Limpiar el buffer del scanner

      switch (opcion){
        case 1:
          System.out.println("Agregar contacto: ");
          System.out.println("Agregue el nombre del contacto");
          String nombre=scanner.nextLine();
          System.out.println("Agregue el numero de telefono del contacto");
          String numero= scanner.nextLine();
          if(agenda.agregarContacto(new Contacto(nombre,numero))){
            System.out.printf("Contacto de %s Agregado", nombre);

          }


          break;

        case 2:
          System.out.println("Verificar contacto: ");
          System.out.println("Agregue el nombre del contacto a verificar su existencia");
           nombre=scanner.nextLine();
          System.out.println("Agregue el numero de telefono del contacto a verificar su existencia");
           numero= scanner.nextLine();
          agenda.existeContacto(new Contacto(nombre, numero));

          break;

        case 3:
          agenda.listarContactos();
          break;

        case 4:
          System.out.println("Buscar contacto: ");
          System.out.println("Agregue el nombre del contacto a buscar");
          nombre=scanner.nextLine();
          agenda.buscarContacto(nombre);
          break;

        case 5:
          System.out.println("Eliminar contacto: ");
          System.out.println("Agregue el nombre del contacto a eliminar");
          nombre=scanner.nextLine();
          agenda.eliminarContacto(nombre);
          break;

        case 6:
          System.out.println("Espacio disponible en agenda: ");
          agenda.espacioLibre();

        case 7:
          System.out.println("Agenda cerrada");
          scanner.close();

          break;


      }

    }while (opcion!=7);
  }
}