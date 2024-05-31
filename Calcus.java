import java.util.logging.Logger;

public class Calcus {
    private static final Logger LOGS = Logger.getLogger(Calcus.class.getName());

    public Numbers add(Numbers a, Numbers b) {
        LOGS.info("Осуществляется сложение чисел!");
        Numbers result = a.add(b);
        LOGS.info("Ответ калькулятора: " + result);
        return result;
    }
 
    public Numbers multiply(Numbers a, Numbers b) {
        LOGS.info("Осуществляется умножение чисел!");
        Numbers result = a.multiply(b);
        LOGS.info("Ответ калькулятора: " + result);
        return result;
    }
   
    public Numbers divide(Numbers a, Numbers b) {
        LOGS.info("Осуществляется деление чисел!");
        Numbers result = a.divide(b);
        LOGS.info("Ответ калькулятора: " + result);
        return result;
    }

}









