// TODO: 1 ЛАБОРАТОРНАЯ РАБОТА
// TODO: ЗАДАНИЕ 1.2

class zadanie_1_2 {
    public static void main(String[] args) {
        double Xn=-3, Xk=-0.6, dX=0.2, eps= 0.0001;
        for(double x=Xn; x<=Xk; x+=dX) {
            System.out.println("\nx = " + x);
            double s = 0;
            int n = 0;
            double T = -Math.pow((1 + x), 2);
            while (Math.abs(T) >= Math.pow(10, -3)) {
                s += T;
                T *= -((n * Math.pow(x, 2) + 2*n*x + n) / (n + 1));
                n ++;
            }
            System.out.println("S = " + s);
            System.out.println("y = " + Math.log(1 / (2 + 2 * x + x * x)));
        }
    }
}