import java.util.*;
import java.util.stream.Collectors;

public class FirstTask {
    //Метод приймає на вхід список імен. Необхідно повернути
    //рядок вигляду 1. Ivan, 3. Peter... лише з тими іменами, що стоять під непарним індексом (1, 3 тощо)
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Fedr");
        names.add("Vova");
        names.add("Alex");
        names.add("Sonia");
        names.add("Johan");
        System.out.println(getName(names));
    }
    public static String getName(ArrayList<String> name){
        return  name.stream()
                .filter(names -> name.indexOf(names)%2==1)
                .map(names-> name.indexOf(names)+ " " + names)
                .collect(Collectors.joining(" "));
    }

}
