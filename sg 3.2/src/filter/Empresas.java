package filter;

public class Empresas {
    private String nombre;
    private String vocacion;

    public Empresas(String nombre, String vocacion) {
        this.nombre = nombre;
        this.vocacion = vocacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVocacion() {
        return vocacion;
    }

    public void setVocacion(String vocacion) {
        this.vocacion = vocacion;
    }

}
