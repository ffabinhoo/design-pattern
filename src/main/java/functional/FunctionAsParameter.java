package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

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

        public static Function<Integer, Integer> createMultiplier(Integer x){
            return (Integer y) -> x * y;
        }
    }

    public static void main(String[] args) {
        System.out.println(MyMath.combine(MyMath::add));
        System.out.println(MyMath.combine(MyMath::subtract));
        System.out.println(MyMath.combine((x,y) -> (2 * x) + (2 * y)));
        Function<Integer, Integer> timesTwo = MyMath.createMultiplier(2);
        Function<Integer, Integer> timesTree = MyMath.createMultiplier(3);

        System.out.println(timesTwo.apply(5));
        System.out.println(timesTree.apply(5));



    }

}
