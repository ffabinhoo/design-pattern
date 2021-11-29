package functional;

public interface QuadFunction<P,T,R,N,I>{
    R apply(P p, T t, R r, N n);
}
