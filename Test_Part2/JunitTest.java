package Test_Part2;
import org.junit.jupiter.api.Test;
public class JunitTest {
    @Test
    public void testProductions(){
        Productions test_1 = new Productions();
        Productions test_2 = new Productions();
        test_1.Productions("food",1,22);
    }

    @Test
    public void testPriceProblem(){

    }
    @Test
    public static void main(String args[]){
        new PriceProblem().run();
    }
    
}
