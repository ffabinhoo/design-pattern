package reactive;

import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;

public class ObservableSingleMaybeCompletable {

    public static void main(String[] args) {
        //createSingle();
        //createMaybe();
        createCompletable();
    }

    private static void createSingle() {
        Single.just("Hello Single Observable").subscribe(System.out::println);
    }

    private static void createMaybe() {
        Maybe.empty().subscribe(new MaybeObserver<>() {
            @Override
            public void onSubscribe(Disposable disposable) {

            }

            @Override
            public void onSuccess(Object o) {
                System.out.println(o);
            }

            @Override
            public void onError(Throwable throwable) {

            }

            @Override
            public void onComplete() {
                System.out.println("done observable");
            }
        });
    }

    private static void createCompletable() {
        Completable.fromSingle(Single.just("Hello Single from Completable Obs")).subscribe(() -> System.out.println("done"));
    }
}
