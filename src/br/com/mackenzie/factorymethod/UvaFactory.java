package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class UvaFactory implements RefrigeranteFactory{

    @Override
    public Uva criaRefrigerante() {
        return new Uva();
    }
}
