public class BmiService {
    public int calculate(int weight, double height) { // Система СИ: Weight(Вес) - в кг, height(рост) - в м
        double result;
        result = weight / Math.pow(height, 2);
        return (int) result;
    }
}
