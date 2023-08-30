package Parte1;

public class Fuego extends Pokemon {
    String peso;

    //Constructores

    public Fuego() {
    }

    public Fuego(String nombre, Integer numeroPokedex, String tipo1, String tipo2, String peso) {
        super(nombre, numeroPokedex, tipo1, tipo2);
        this.peso = peso;
    }

   //Get y set


    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    //ToString
    @Override
    public String toString() {
        return "Fuego{" +
                "peso='" + peso + '\'' +
                '}';
    }

    //Método
    //Sobreescritura de metodo:
    public String atacar () {
        return getNombre() + " falló el ataque";
    }



}

