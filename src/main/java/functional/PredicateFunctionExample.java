package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateFunctionExample {


    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7,8,9,10};
        String [] stringArray = {"aaa", "aaaa", "aaaaa" ,"8aaaaaaaa","9aaaaaaaaa", "10StringWord"};

        List<Integer> integerList = new ArrayList<>(Arrays.asList(intArray));
        List<String> stringList = new ArrayList<>(Arrays.asList(stringArray));

        Predicate<Integer> isEven = (x) -> x % 2 ==0;

        Function<Integer, Predicate<String>> createStringLength = (minLength) ->{
            return (str) -> str.length() > minLength;
        };

        List<Integer> evens = integerList.stream().filter(isEven).collect(Collectors.toList());

        System.out.println(evens);


        Predicate<String> isLongerThan5 = createStringLength.apply(9);
        List<String> strList = stringList.stream().filter(isLongerThan5).collect(Collectors.toList());

        System.out.println(strList);

    }





}
