public class Main {
	public static void main(String[] args) {
		BmiService service = new BmiService();
		int height = 167;
		float weight = 76.6F;
		float bmi = service.calculate(height, weight);
		System.out.println(bmi);
	}
}
