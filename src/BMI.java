import java.util.Scanner;
public class BMI
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите вес в килограммах: ");

        int mass = scanner.nextInt(); // масса
        if ( mass < 2 || mass > 185 ) {
            System.out.println("Ошибка!") ;
            System.out.println("Паша или Леша, введите корректное значение)") ;
            System.exit(0) ;
        }
        System.out.print("Введите рост в метрах: ");

        double growth = scanner.nextDouble(); // рост
        if ( growth < 0.35 || growth > 2.15 ) {
            System.out.println("Ошибка!") ;
            System.out.println("Паша или Леша, введите корректное значение)") ;
            System.exit(0) ;
        }

        double bmi1 = mass / growth ;
        double bmi2 = bmi1 / growth ; // конечный индекс

        System.out.printf("Индекс массы тела:" , bmi2);
        System.out.println(bmi2) ;

        System.out.println("Недовес : меньше чем 18,5");
        System.out.println("Нормальны: между 18,5 и 24,9");
        System.out.println("Избыточный вес: между 25 и 29,9");
        System.out.println("Ожирение: 30 или больше");

    }

}
