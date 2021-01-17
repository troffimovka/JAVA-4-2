public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        float weight =99;
        float height = 164;
        int index = (int)service.calculate(weight, height);
        System.out.println(index);

        weight =90;
        height = 184;
        index = (int)service.calculate(weight, height);
        System.out.println(index);

        weight =60;
        height = 168;
        index = (int)service.calculate(weight, height);
        System.out.println(index);
    }
}