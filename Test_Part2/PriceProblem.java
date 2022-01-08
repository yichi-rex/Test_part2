package Test_Part2;
import java.util.Scanner;

public class PriceProblem{
    public static Scanner sc = new Scanner(System.in);
    public double calculate(Productions e){
        double result = 0;
        double type = 0;
        String category = e.getCategory();

        category = category.toLowerCase();

        switch (category){
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

    public void getInput(){
        String category = null;
        double price = 0;;
        int people = 0;
        try{
            System.out.println("Please enter price: ");
            price = sc.nextDouble();
            System.out.println("Please enter number of people: ");
            people = sc.nextInt();
            sc.nextLine(); 
            System.out.println("Please enter category: ");
            category = sc.nextLine();
        }catch(Exception e){
            System.out.println("Please enter correct data!");
        }
        Productions e = new Productions(category,price,people);
        System.out.println(calculate(e));
        System.out.println();
    }

    public void run(){
        boolean flag = true;
        while (flag){
            System.out.println("1= Get Input; Other number = End");
            int choose = 0;
            try{
                String temp = sc.nextLine();
                choose = Integer.parseInt(temp);
                if(choose == 1){
                   getInput();
                }else{
                    flag = false;
                }
            }catch(Exception e){
                System.out.println("Need to enter integer number!");
                e.printStackTrace();
                break;
            }
        }
        sc.close(); 
    }
    public static void main(String args[]){
        new PriceProblem().run();
    }
}