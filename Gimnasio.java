import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Gimnasio {
    public ArrayList<Miembro> miembros = new ArrayList<Miembro>();

    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public boolean addMember(String nombre, String apellido, String cedula, String membresia, int edad,
            String idUsuario) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getIdUsuario().equals(idUsuario) || miembros.get(i).getCedula().equals(cedula)) {
                return false;
            }
        }
        miembros.add(new Miembro(nombre, apellido, cedula, membresia, edad, idUsuario));
        return true;
    }

    public boolean deleteId(String idEliminar) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getIdUsuario().equals(idEliminar)) {
                String datosUsuario = "Nombre: " + miembros.get(i).getNombre() +
                        "\nApellido: " + miembros.get(i).getApellido() +
                        "\nCedula: " + miembros.get(i).getCedula() +
                        "\nMembresia: " + miembros.get(i).getMembresia() +
                        "\nEdad: " + miembros.get(i).getEdad();
                JOptionPane.showMessageDialog(null, datosUsuario);
                miembros.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean searchName(String nombreBuscar) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getNombre().equals(nombreBuscar)) {
                String datosUsuario = "Nombre: " + miembros.get(i).getNombre() +
                        "\nApellido: " + miembros.get(i).getApellido() +
                        "\nCedula: " + miembros.get(i).getCedula() +
                        "\nMembresia: " + miembros.get(i).getMembresia() +
                        "\nEdad: " + miembros.get(i).getEdad() +
                        "\nId: " + miembros.get(i).getIdUsuario();
                JOptionPane.showMessageDialog(null, datosUsuario);
                return true;
            }
        }
        return false;
    }

    public boolean updateId(String idActualizar) {
        for (int i = 0; i < miembros.size(); i++) {
            if (miembros.get(i).getIdUsuario().equals(idActualizar)) {
                String nombreActualizar = JOptionPane.showInputDialog("Ingrese el nombre a actualizar");
                String apellidoActualizar = JOptionPane.showInputDialog("Ingrese el apellido a actualizar");
                String cedulaActualizar = JOptionPane.showInputDialog("Ingrese la cedula a actualizar");
                String membresiaActualizar = JOptionPane
                        .showInputDialog("Ingrese la membresia a actualizar");
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
                return true;
            }
        }
        return false;
    }

    public String user() {
        String usuarios = "";
        for (int i = 0; i < miembros.size(); i++) {
            usuarios += "Nombre miembro: " + miembros.get(i).getNombre() + "\n";
        }
        return usuarios;
    }

    public boolean isNumber(String numero) {
        return numero != null && numero.matches("[1-9]+");
    }

    public boolean isAlpha(String numero) {
        return numero != null && numero.matches("[a-zA-Z]+");
    }

    public int validarNumero(String numero) {
        return isNumber(numero) ? Integer.parseInt(numero) : -1;
    }
}