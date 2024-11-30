import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gimnasio {

    public static void main(String[] args) {
        ArrayList<Miembro> miembros = new ArrayList<Miembro>();
        String menu = """
        1. Añadir un nuevo miembro.
        2. Eliminar un miembro por su ID.
        3. Buscar un miembro por su nombre.
        4. Actualizar la información de un miembro por su ID.
        5. Mostrar todos los miembros.
        6. Salir del programa.""";
        int opcion = 0;

    while (opcion!=6) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro");
                    String apellido=JOptionPane.showInputDialog("Ingrese el apellido del miembro");
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del miembro");
                    String membresia = JOptionPane.showInputDialog("Ingrese la membresia del miembro");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del miembro"));
                    String idUsuario = JOptionPane.showInputDialog("Ingrese el id del miembro");
                    miembros.add(new Miembro(nombre, apellido, cedula, membresia, edad, idUsuario));
                    break;
                case 2:
                String idEliminar = JOptionPane.showInputDialog("Ingrese el id a eliminar");
                for (int i = 0; i < miembros.size(); i++) {
                    if (miembros.get(i).getIdUsuario().equals(idEliminar)) {
                        String datosUsuario = "Nombre: "+miembros.get(i).getNombre()+
                        "\nApellido: "+miembros.get(i).getApellido()+
                        "\nCedula: "+miembros.get(i).getCedula()+
                        "\nMembresia: "+miembros.get(i).getMembresia()+
                        "\nEdad: "+miembros.get(i).getEdad();
                        JOptionPane.showMessageDialog(null, datosUsuario);
                        miembros.remove(i);
                        break;
                    }
                }
                break;
                    
                case 3:
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
                    for (int i = 0; i < miembros.size(); i++) {
                        if (miembros.get(i).getIdUsuario().equals(nombreBuscar)) {
                            String datosUsuario = "Nombre: "+miembros.get(i).getNombre()+
                            "\nApellido: "+miembros.get(i).getApellido()+
                            "\nCedula: "+miembros.get(i).getCedula()+
                            "\nMembresia: "+miembros.get(i).getMembresia()+
                            "\nEdad: "+miembros.get(i).getEdad()+
                            "\nId: "+miembros.get(i).getIdUsuario();
                            JOptionPane.showMessageDialog(null, datosUsuario);
                            break;
                        }
                    }
                    break;
                case 4:
                String idActualizar = JOptionPane.showInputDialog("Ingrese el id a actualizar");
                for (int i = 0; i < miembros.size(); i++) {
                    if (miembros.get(i).getIdUsuario().equals(idActualizar)) {
                        String nombreActualizar = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                        String apellidoActualizar = JOptionPane.showInputDialog("Ingrese el apellido a actualizar");
                        String cedulaActualizar = JOptionPane.showInputDialog("Ingrese la cedula a actualizar");
                        String membresiaActualizar = JOptionPane.showInputDialog("Ingrese la membresia a actualizar");
                        int edadActualizar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad a actualizar"));
                        miembros.get(i).setNombre(nombreActualizar);
                        miembros.get(i).getNombre();
                        miembros.get(i).setApellido(apellidoActualizar);
                        miembros.get(i).getApellido();
                        miembros.get(i).setCedula(cedulaActualizar);
                        miembros.get(i).getCedula();
                        miembros.get(i).setMembresia(membresiaActualizar);
                        miembros.get(i).getMembresia();
                        miembros.get(i).setEdad(edadActualizar);
                        miembros.get(i).getEdad();

                        break;
                    }
                }
                break;
                case 5:
                String usuario="";
                    for (int i = 0; i < miembros.size(); i++) {
                        usuario = usuario +"Nombre miembro: "+ miembros.get(i).getNombre()+"\n";
                    }
                    JOptionPane.showMessageDialog(null, usuario);
                    break;
                default:
                    break;
            }
        }
    }
}