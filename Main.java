public class Main {
    
    public static void main(String[] args) {
    
        Numbers a = new Numbers(5.0, 3.0);
        Numbers b = new Numbers(9.0, 2.0);
        Calcus calcus = new Calcus();
        Numbers addition = calcus.add(a, b);
        Numbers multiplication = calcus.multiply(a, b);
        Numbers division = calcus.divide(a, b);
        System.out.println("Результат сложения чисел: " + addition);
        System.out.println("Результат умножения чисел: " + multiplication);
        System.out.println("Результат деления чисел: " + division);
    }
}






