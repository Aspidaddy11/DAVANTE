public class Main {
    public static void main(String[] args) {
        Perro miPerro = new Perro(  "Labrador", "Tobby", 67);
        Perro tuPerro = new Perro("Bulldog", "Sans", 43);

        System.out.println("El perro " + miPerro.getNombre() + " dice: ");
        miPerro.ladrar();

        System.out.println("El perro "+ tuPerro.getNombre() + " dice: ");
        miPerro.ladrar();

        miPerro.informacionPerro();
        tuPerro.informacionPerro();

        //Mi  perro set edad

        miPerro.setEdad(100);
        miPerro.informacionPerro();
    }
}
