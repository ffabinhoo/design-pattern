package reactive;

import io.reactivex.Observable;

public class ObservableDefer {
    private static int start = 0, count = 3;
    public static void main(String[] args) {
        Observable<Integer> observable = Observable.defer(() -> {
            System.out.println("new observable created with count:" + count);
            return Observable.range(start,count);
        });
        observable.subscribe(item -> System.out.println("Observable 1: " + item));
        count = 6;
        observable.subscribe(item -> System.out.println("Observable 2: " + item));

    }
}
