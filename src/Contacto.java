import java.math.BigInteger;

public class Contacto {
  public String nombre;
  public String numero;

  public Contacto(){

  }

  public Contacto(String nombre, String numero) {
    this.nombre = nombre;
    this.numero = numero;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Contacto contacto = (Contacto) obj;
    return nombre.equals(contacto.nombre);
  }
}
