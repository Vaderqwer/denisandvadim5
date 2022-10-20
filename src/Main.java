public class Main {
    public static void main(String[] args) {
        Double[] n1 = new Double[20];
        Double sum = 0.0;
        for (int n2 = 0; n2 < 20;n2++) {
            n1[n2] = Math.random() * (100) + 0;
            System.out.println((n2 + 1) + ")" + n1[n2]);
            sum = sum + n1[n2];
        }
        sum = sum / 20;
        System.out.println(sum);
        for (int n2 = 0;n2 < 20; n2++) {
            if (n1[n2] > sum) {
                System.out.println("Больше среднего значения " + n1[n2]);
            }
        }
    }
}