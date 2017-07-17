package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class GuaranaFactory implements RefrigeranteFactory{

    @Override
    public Guarana criaRefrigerante() {
        return new Guarana();
    }
    
}
