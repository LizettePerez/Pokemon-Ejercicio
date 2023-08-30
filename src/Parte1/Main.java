package Parte1;

public class Main {
    public static void main(String[] args) {
        Pokemon Pikachu = new Pokemon("Pikachu", 25, "Electrico", null);
        System.out.println(Pikachu);

        String present = Pikachu.presentacion();
        System.out.println(present);

        String atacc = Pikachu.atacar();
        System.out.println(atacc + " es superefectivo");

        Fuego Charmander = new Fuego("Charmander", 4, "Fuego", null, "8.5kg");
        System.out.println(Charmander);
        String atacc2 = Charmander.atacar();
        System.out.println(atacc2);

        String pesoNuevo = Charmander.cambiarPeso("9kg");//Sobrecarga
        System.out.println(pesoNuevo);
        System.out.println(Charmander);


    }
}
