package br.com.mackenzie.factorymethod;

/**
 *
 * @author Bruno
 */
public class RefrigeranteConcretFactory implements RefrigeranteFactory {

    @Override
    public Refrigerante criaRefrigerante(String sabor) {
        if (sabor.equals("Cola")) {
            return new Cola();
        }

        if (sabor.equals("Guarana")) {
            return new Guarana();
        }

        if (sabor.equals("Laranja")) {
            return new Laranja();
        }

        if (sabor.equals("Uva")) {
            return new Uva();
        }
        return null;

    }

}
