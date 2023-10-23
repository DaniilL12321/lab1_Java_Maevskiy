// TODO: 1 ЛАБОРАТОРНАЯ РАБОТА
// TODO: ЗАДАНИЕ 1.1

class zadanie_1_1 {
    public static void main(String[] args) {
        double a = -4.091;
        double x1 = -2;
        double x2 = 1;
        double step = 0.3;

        double x;
        for (x = x1; x <= x2; x += step) {
            if (x <= a) {
                double y = Math.atan(x) * Math.atan(x);
                System.out.println("x = " + x);
                System.out.println("y = " + y + "\n");
            }
            if (x > a && x < 0.5) {
                double y = Math.pow(Math.E, -a*x) - 2*x*Math.log(Math.abs(x*x*x));
                System.out.println("x = " + x);
                System.out.println("y = " + y + "\n");
            }
            if (x >= 0.5) {
                double y = 1 - x;
                System.out.println("x = " + x);
                System.out.println("y = " + y + "\n");
            }
        }
    }
}