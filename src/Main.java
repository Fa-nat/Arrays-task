public class Main {
    public static void main(String[] args) {
        String[] inventory = {"Ball", "T-shirt", "Boxing glove", "Racket", "Training apparatus"};
        System.out.println("Items in stock:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + ". " + inventory[i]); 
        }
    }
}
