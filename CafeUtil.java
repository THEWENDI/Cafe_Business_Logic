import java.util.*;

public class CafeUtil{

    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    public int[] getStreakGoal(int weeks){
        int sum = 0;
        for (int i = 1; i < weeks; i++){
            sum += i;
        }
        int[] val = new int[2];
        val[0] = weeks;
        val[1] = sum;
        return val;
    }

    public double getOrderTotal(double[] lineItems){
        double total = 0.0;
        for (int i = 0; i < lineItems.length;i++){
            total += lineItems[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(String.format("%s %s", i, menuItems.get(i)));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName);
        System.out.println("There are " + customers.size() + " People in front of you");
        customers.add(userName);

        System.out.println(customers);
    }

    
















}