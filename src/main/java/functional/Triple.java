package functional;

import org.springframework.util.Assert;

import java.util.function.Function;

public class Triple {

    protected static class MathCalculations {
        public static Integer triple (Integer x ){
            return x * 3;
        }
    }

    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MathCalculations::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);
    }
}
