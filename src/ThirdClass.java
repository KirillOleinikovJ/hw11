import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ThirdClass {
        public static void main(String[] args) {
           String[] array= new String[]{"1, 2, 0", "4, 5"};
            System.out.println(sortArray(array));
        }
        public static String sortArray(String[] arrays){
            return Arrays.stream(arrays)
                    .map(array -> array.split(", "))
                    .flatMap(Arrays::stream)
                    .sorted(Comparator.comparingInt(Integer::parseInt))
                    .sorted()
                    .collect(Collectors.joining(", "));
        }
    }