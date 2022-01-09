package Test_Part2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTest {
    Productions test_1 = new Productions();
    Productions test_2 = new Productions();
    Productions test_3 = new Productions();
    @Test
    public void testProductions(){
        test_1.addProductions("food",1299.99,3);
        Assertions.assertEquals(test_1.getCategory(),"food");
        Assertions.assertEquals(test_1.getPeople(),3);
        Assertions.assertEquals(test_1.getPrice(),1299.99);
    }

    @Test
    public void testPriceProblem(){
        test_2.addProductions("drugs",5432,1);
        test_3.addProductions("books",12456.95,4);
        PriceProblem Price_test = new PriceProblem();
        double result_2 = Price_test.calculate(test_2);
        double result_3 = Price_test.calculate(test_3);
        Assertions.assertEquals(result_2,6199.81);
        Assertions.assertEquals(result_3,13707.63);
    }
    @Test
    public static void main(String args[]){
        new PriceProblem().run();
    }
}
