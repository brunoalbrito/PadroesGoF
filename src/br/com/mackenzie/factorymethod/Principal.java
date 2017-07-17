package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class Principal {
    public static void main(String[] args) {
        RefrigeranteFactory colaFactory = new ColaFactory();
        Refrigerante cola = colaFactory.criaRefrigerante();
        
        RefrigeranteFactory uvaFactory = new UvaFactory();
        Refrigerante uva = uvaFactory.criaRefrigerante();
        
        
        RefrigeranteFactory laranjaFactory = new LaranjaFactory();
        Refrigerante laranja = laranjaFactory.criaRefrigerante();
        
        RefrigeranteFactory guaranaFactory = new GuaranaFactory();
        Refrigerante guarana = guaranaFactory.criaRefrigerante();
        
    }
}
