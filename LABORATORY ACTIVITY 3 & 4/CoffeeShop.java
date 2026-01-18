public class CoffeeShop {
    public static void main(String[] args) {

        Customer joseph = new Customer("Joseph", 200);
        Customer peter = new Customer("Peter");
        Customer unknown = new Customer();


        peter.addPoints(200); 
        System.out.println("Peter earned 200 points. Total Points: " + peter.getPoints());
        peter.addPoints(20); 
        System.out.println("Peter earned 20 points. Total Points: " + peter.getPoints());
        System.out.println();

        joseph.redeemReward();
        peter.redeemReward();
        unknown.redeemReward();
        System.out.println();

   
        joseph.displayCustomerInfo();
        peter.displayCustomerInfo();
        unknown.displayCustomerInfo();
        Customer.displayTotalCustomers();
        System.out.println();


        Customer diane = new Customer("Diane");
        diane.addPoints(50);
        System.out.println("Diane earned 50 points. Total Points: " + diane.getPoints());
        Customer.displayTotalCustomers();
        System.out.println();


        Customer.getAllowedRewardsRedemption(joseph);
        Customer.getAllowedRewardsRedemption(peter);
        Customer.getAllowedRewardsRedemption(diane);
        Customer.getAllowedRewardsRedemption(unknown);
    }
}


class Customer {

    private String name;
    private int points;

    private static int totalCustomers = 0;

 
    public Customer() {
        this.name = "Unknown";
        this.points = 0;
        totalCustomers++;
    }


    public Customer(String name, int points) {
        this.name = name;
        this.points = points;
        totalCustomers++;
    }

  
    public Customer(String name) {
        this.name = name;
        this.points = 0;
        totalCustomers++;
    }

    // ===== Instance Methods =====
    public void addPoints(int earnedPoints) {
        this.points += earnedPoints;
    }

    public void redeemReward() {
        if (points >= 100) {
            System.out.println("Congratulations " + name + "! You redeemed a free drink!");
            points -= 100;
            System.out.println("Remaining Points: " + points);
        } else {
            System.out.println(name + " does not have enough points to redeem a drink.");
            System.out.println("Current Points: " + points);
        }
    }

    public void displayCustomerInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Points: " + points);
        System.out.println("---------------------------");
    }

    public int getPoints() {
        return points;
    }

    // ===== Static Methods =====
    public static void displayTotalCustomers() {
        System.out.println("Total Registered Customers: " + totalCustomers);
    }

    public static void getAllowedRewardsRedemption(Customer customer) {
        int redeemable = customer.points / 100;
        System.out.println(customer.name + " can redeem " + redeemable + " free drink(s).");
    }
}

// GUMIRAN, HANS JESSIE AUGUSTO M.
// BSCS-2D
// AI USED: ChatGPT-5 
// Conversation of AI: https://chatgpt.com/share/68f4fcf5-7f4c-8010-b920-5465336bcdaa
//
