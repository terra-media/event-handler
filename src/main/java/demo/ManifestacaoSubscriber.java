package demo;

import rx.Subscriber;

/**
 * @author Vinícius D Saraiva vrx_vsaraiva@uolinc.com.br
 */
public class ManifestacaoSubscriber extends Subscriber {

    @Override
    public void onCompleted() {
        System.out.println("Manifestação gerada com sucesso!");
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("Abrir IM");
    }

    @Override
    public void onNext(Object o) {
        System.out.println("Chamando serviço que gera a manifestação: " + o);
    }
}
