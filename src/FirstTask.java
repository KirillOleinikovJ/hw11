import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {
    //Метод приймає на вхід список імен. Необхідно повернути
    //рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
    public static void main(String[] args) {
        List<String> names= List.of("Ivan", "Petr", "Fedr", "Vova", "Alex", "Sonia", "Johan");
        System.out.println((getName(names)));
    }
    public static String getName(List<String> name){
        return  name.stream()
                .filter(names -> name.indexOf(names)%2==1)
                .map(names-> name.indexOf(names)+ " " + names)
                .collect(Collectors.joining(" "));
    }

}
