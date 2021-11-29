package functional;

public class CompoundInterestFunction {


    public static void main(String[] args) {
        QuadFunction<Integer, Integer, Double, Integer, Double> compoundInterest = (p,t,r,n) -> {

            Double amount = p * Math.pow(1 + (r / n), n * t);
            Double cinterest = amount - p;

            return cinterest;
        };


        Double ret = compoundInterest.apply(20000, 3, 0.06, 645);

        System.out.println("Compound Interest after " + 3 + " years: "+ret);
    }
}
