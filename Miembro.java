public class Miembro {
    private String nombre;
    private String apellido;
    private String cedula;
    private String membresia;
    private int edad;
    private String idUsuario;

    public Miembro(String nombre, String apellido, String cedula, String membresia, int edad, String idUsuario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula= cedula;
        this.membresia= membresia;
        this.edad= edad;
        this.idUsuario= idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    
}
