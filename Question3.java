import java.util.ArrayList;
import java.util.Collections;

public class Question3 {
    public static void main(String[] args) {
        int[] prices = { 300, 220, 50, 60, 40, 200 };
   
        ArrayList<Integer> subset = new ArrayList<>();
        for (int price : prices) {
            if (price < 100) {
                subset.add(price);
            }
        }
        Collections.sort(subset);
        
        int index = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 100) {
                prices[i] = subset.get(index);
                index++;
            }
        }
        for (int price : prices) {
            System.out.print(price + " ");
        }
    }
}
