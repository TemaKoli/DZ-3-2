public class BmiService {
    public int calculate(int a, double b) { // a - кг, b - м
        double result;
        result = a / Math.pow(b, 2);
        return (int) result;
    }
}
