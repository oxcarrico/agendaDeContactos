package AgendaDeContactos;
import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;
   

   public Agenda() {
        this.contactos = new ArrayList<>();

   }

   public void agregarContacto(Contacto contacto) {
        contactos.add(contacto);
        System.out.println("El contacto de " + contacto.getNombre() + " Se ha agregado correctamente ");
   }

   public void eliminarContacto(String nombre) {
        Contacto contacto = buscarContacto(nombre);
        if (contacto == buscarContacto(nombre)) {
            contactos.remove(contacto);

        } else {
            System.out.println("Ese contacto no existe ");
        }
   }

   public Contacto buscarContacto(String nombre) {
    for (Contacto contacto : contactos) {
        if (contacto.getNombre().equalsIgnoreCase(nombre)) {
            return contacto;
        }
    }
    return null;
}

    public void monstrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos ");
        } else {
            for (Contacto contacto : contactos) {
            System.out.println(contacto);
            }
         }
    }
   


}
