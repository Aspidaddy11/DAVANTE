public class Perro {

        public String raza;
        public String nombre;
        public int edad;

        public Perro(String razaPerro, String nombrePerro, int edadPerro){
            this.raza = razaPerro;
            this.nombre = nombrePerro;
            this.edad = edadPerro;
        }

        public void ladrar(){
                System.out.println("\n Guau Guau");
        }

        public void informacionPerro(){
                System.out.println("\nNombre "+ this.nombre);
                System.out.println(" Raza "+ this.raza);
                System.out.println(" Edad "+ this.edad);
        }

        public void setEdad(int edadNueva){
                if(edadNueva >= 0 && edadNueva <= 20){
                        this.edad = edadNueva;
                }
                else{
                        System.out.println("\nLa edad introducida no es válida");
                }
        }

        public void setNombre(String nombreNuevo){
                this.nombre = nombreNuevo;
        }

        public void setRaza(String razaNueva) {
            this.raza = razaNueva;
        }

        public int getEdad() {
            return edad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getRaza() {
            return raza;
        }
}       
