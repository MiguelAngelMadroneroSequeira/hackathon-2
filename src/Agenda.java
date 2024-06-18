import java.util.ArrayList;
import java.util.List;

public class Agenda {
  public List<Contacto> contactos;
  public int capacidad;

  public Agenda(int capacidad){
    this.capacidad=capacidad;
    this.contactos= new ArrayList<>(capacidad);
  }

  public Agenda(){
    this(10);
  }

  public boolean agregarContacto(Contacto contacto) {
    if (contactos.size() >= capacidad) {
      System.out.println("La agenda está llena. No se puede agregar el contacto");
      return false;
    }
    if (contactos.contains(contacto)) {
      System.out.println("El contacto ya existe.No se puede volver a agregar el contacto");
      return false;
    }
    contactos.add(contacto);
    return true;
  }
//  public void agregarContacto(Contacto contacto){
//
//    if(contactos.size() >=capacidad){
//      agendaLlena();
//    }else if(contactos.contains(contacto)){
//      System.out.println("El contacto ya existe, no se puede añadir este contacto");
//    }else{
//      System.out.println("contacto agregado...");
//
//      contactos.add(contacto);
//
//    }
//
//  }

  public void existeContacto(Contacto contacto){

    if(contactos.contains(contacto)){
      System.out.println("El contacto ya existe, no se puede añadir este contacto");
    }else{
      System.out.println("El contacto no existe, se puede agregar");
    }

  }

  public void agendaLlena(){


      System.out.println("La agenda está llena, no se pueden añadir más contactos a la agenda");


  }

  public void listarContactos(){
    System.out.println("Lista de contactos: ");

    if(contactos.isEmpty()){
      System.out.println("la agenda está vacía");
    }else{

      for(Contacto contacto:contactos){
        System.out.println("nombre : "+contacto.getNombre()+ ", numero :" + contacto.getNumero());
      }
    }
  }

  public void buscarContacto(String nombre){
    for(Contacto contacto: contactos){
      if(contacto.getNombre().equals(nombre)){
        System.out.println("nombre : "+contacto.getNombre()+ ", numero :" + contacto.getNumero());
          return;
      }
    }
    System.out.println("Contacto no encontrado, no existe");


  }

  public void eliminarContacto(String nombre){


    if(contactos.removeIf(contacto->contacto.getNombre().equals(nombre))){
      System.out.println("contacto eliminado: " + nombre);

    }else{
      System.out.println("no se pudo eliminar el contacto porque no existe");
    }



  }

  public void espacioLibre(){
      int espaciosDisponibles=capacidad-contactos.size();
      if(espaciosDisponibles>0){
        System.out.println("El espacio disponible para agregar contactos es de: " +espaciosDisponibles);


      } else if (espaciosDisponibles<=0) {

        System.out.println("no hay espacio disponible" );

      }


  }
}
