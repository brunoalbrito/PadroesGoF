package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class Principal {
    public static void main(String[] args) {
        RefrigeranteFactory refrigeranteFactory = new RefrigeranteConcretFactory();
        refrigeranteFactory.criaRefrigerante("Cola");
        refrigeranteFactory.criaRefrigerante("Guarana");
        refrigeranteFactory.criaRefrigerante("Laranja");
        refrigeranteFactory.criaRefrigerante("Uva");
    }
}
