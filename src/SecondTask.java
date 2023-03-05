import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTask {
        public static void main(String[] args) {
            List<String> names= List.of("Ivan", "Petr", "Fedr", "Vova", "Alex", "Sonia", "Johan");
            System.out.println((sortName(names)));
        }
        public static List sortName(List<String> name){
            return (List) name.stream()
                    .map(names->names.toUpperCase())
                    .sorted(Comparator.reverseOrder())
                    .collect(Collectors.toList());
        }
}
