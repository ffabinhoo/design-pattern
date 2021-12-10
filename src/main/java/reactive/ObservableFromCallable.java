package reactive;

import io.reactivex.Observable;

public class ObservableFromCallable {

    public static void main(String[] args) {
        Observable<Integer> observable = Observable.fromCallable(() -> {
            System.out.println("Calling method");
            return getNumber();
        });
        observable.subscribe(System.out::println,
                error -> System.out.println("Exception occurred " + error.getLocalizedMessage()));


//        Observable<Integer> observable2 = Observable.just(getNumber());
//        observable2.subscribe(System.out::println,
//                error -> System.out.println("Exception occurred " + error.getLocalizedMessage()));

    }

    private static int getNumber() {
        System.out.println("Generating Value");
        return 0/1;
    }
}
