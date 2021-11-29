package functional;

import java.util.function.BiFunction;

public class FunctionAsParameter {
    protected static class MyMath{
        public static Integer add(Integer x, Integer y){
            return x + y;
        }
        public static Integer subtract(Integer x, Integer y){
            return x - y;
        }

        public static Integer combine(BiFunction<Integer, Integer, Integer> combineFunc){
            return combineFunc.apply(2,3);
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine(MyMath::add));
        System.out.println(MyMath.combine(MyMath::subtract));
        System.out.println(MyMath.combine((x,y) -> (2 * x) + (2 * y)));
    }

}
