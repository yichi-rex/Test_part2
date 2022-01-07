package Test_Part2;
import java.util.Scanner;

public class PriceProblem{
    
    public double calculate(Productions e){
        double result = 0;
        double type = 0;
        String cate = e.getCategory();

        cate = cate.toLowerCase();

        switch (cate){
            case "food":
                type = 1.13;
                break;
            case "drugs":
                type = 1.075;
                break;
            case "electronics":
                type = 1.02;
                break;
            default:
                type = 0;
                break;
        }
        result = e.getPrice() * 1.05 * (type+ 0.012*Double.valueOf(e.getPeople()));
        return result;
    }

    //public String readCategory(){
    //    System.out.println();
    //}

    public void run(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag == true){
            System.out.println("1= Get Input; Other number = End");
            try{
                int choose = sc.nextInt();
                if(choose == 1){
                    Productions e = new Productions("food",1299.99,3);
                    System.out.println(calculate(e));
                }else{
                    flag = false;
                    break;
                }
            }catch(Exception e){
                System.out.println("Need to enter integer number!");
                run();
            }
        }
        sc.close(); 
    }
    public static void main(String args[]){
        new PriceProblem().run();
    }
}