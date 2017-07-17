package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class ColaFactory implements RefrigeranteFactory{

    @Override
    public Cola criaRefrigerante() {
        return new Cola();
    }
    
}
