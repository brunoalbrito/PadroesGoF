package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class LaranjaFactory implements RefrigeranteFactory{

    @Override
    public Laranja criaRefrigerante() {
        return new Laranja();
    }
    
}
