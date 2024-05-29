//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] cal = {70, 80, 100, 90, 100, 70};

        int promedio = 0;

        for (int i = 0; i < cal.length; i++) {
            promedio += cal[i];
        }
        promedio /= cal.length;

        System.out.printf("Promedio " + promedio);

    }
}