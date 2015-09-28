package demo;

import rx.Observable;

/**
 * @author Vinícius D Saraiva vrx_vsaraiva@uolinc.com.br
 */
public class ManifestacaoReceiver {

    public void receiveMessage(String message) {
        System.out.println("Received <" + message + ">");
        Observable<String> myObservable = Observable.just(message).retry(3);
        myObservable.subscribe(new ManifestacaoSubscriber());
    }
}
