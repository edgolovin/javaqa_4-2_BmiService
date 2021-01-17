public class BmiService {
    public float calculate(int height, float weight) {
        // height in cm
        // weight in kg
        return weight * 100_00 / (height * height);
    }
}
