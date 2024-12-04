import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Gimnasio gym = new Gimnasio();
        Gimnasio Gimnasio = new Gimnasio();
        String menu = """
                1. Añadir un nuevo miembro.
                2. Eliminar un miembro por su ID.
                3. Buscar un miembro por su nombre.
                4. Actualizar la información de un miembro por su ID.
                5. Mostrar todos los miembros.
                6. Salir del programa.""";
        int opcion = -1;

        while (opcion != 6) {
            String opcionVal = JOptionPane.showInputDialog(menu);
            opcion = Gimnasio.validarNumero(opcionVal);
            switch (opcion) {
                case 1:
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre del miembro");
                    String apellido = JOptionPane.showInputDialog("Ingrese el apellido del miembro");
                    String cedula = JOptionPane.showInputDialog("Ingrese la cedula del miembro");
                    String membresia = JOptionPane.showInputDialog("Ingrese la membresia del miembro");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del miembro"));
                    String idUsuario = JOptionPane.showInputDialog("Ingrese el id del miembro");
                    if (!Gimnasio.isNumber(cedula) || !Gimnasio.isNumber(idUsuario)) {
                        JOptionPane.showMessageDialog(null, "Ingreso de usuario fallido\n id o cedula incorrecta\n Por favor vuelva a intentar");
                        break;
                    }
                    if (!Gimnasio.isAlpha(nombre) || !Gimnasio.isAlpha(apellido) || !Gimnasio.isAlpha(membresia)) {
                        JOptionPane.showMessageDialog(null, "Ingreso de usuario fallido\n nombre, apellido o menbresia incorrecta\n Por favor vuelva a intentar");
                        break;
                    }
                    if (gym.addMember(nombre, apellido, cedula, membresia, edad, idUsuario)) {
                        JOptionPane.showMessageDialog(null, "Usuario registrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no registrado");
                    }
                    break;
                case 2:
                    String idEliminar = JOptionPane.showInputDialog("Ingrese el id a eliminar");
                    if (gym.deleteId(idEliminar)) {
                        JOptionPane.showMessageDialog(null, "Usuario eliminado");
                    } 
                    break;

                case 3:
                    String nombreBuscar = JOptionPane.showInputDialog("Ingrese el nombre a buscar");
                    if (gym.searchName(nombreBuscar)) {
                        JOptionPane.showMessageDialog(null, "Usuario encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    }
                    break;
                case 4:
                    String idActualizar = JOptionPane.showInputDialog("Ingrese por id a actualizar");
                    if (gym.updateId(idActualizar)) {
                        JOptionPane.showMessageDialog(null, "Usuario encontrado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario no encontrado");
                    }
                    break;
                case 5:
                    if (gym.user() != "") {
                        JOptionPane.showMessageDialog(null, gym.user());
                    }
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        }
    }

}
