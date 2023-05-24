// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // м
        int weight = 98; // кг
        int NMI = service.calculate(weight, height);
        System.out.println("Индекс массы тела (body mass index) равен:");
        System.out.println(NMI);
    }
}