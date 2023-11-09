package map;

public class Empleados {
        private int id;
        private String nombre;
        private int edad;
        private int Salario;
        private String vocacion;

        public Empleados(int id, String nombre, int edad, int salario, String vocacion) {
            this.id = id;
            this.nombre = nombre;
            this.edad = edad;
            Salario = salario;
            this.vocacion = vocacion;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getSalario() {
            return Salario;
        }

        public void setSalario(int salario) {
            Salario = salario;
        }

        public String getVocacion() {
            return vocacion;
        }

        public void setVocacion(String vocacion) {
            this.vocacion = vocacion;
        }
    }


