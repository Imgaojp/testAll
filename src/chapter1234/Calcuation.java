package chapter1234;

/**
 * Created by i on 2016/8/26.
 */
public class Calcuation {
    public float avg(int... nums) {
        int sum = 0;
        for (int x : nums) {
            sum += x;
        }
        return ((float) sum / nums.length);
    }
    public static void main(String args[]){
        Calcuation cal = new Calcuation();
        float average1 = cal.avg(10, 20, 30);
        float average2 = cal.avg(5, 6, 7, 8, 9, 10);
        System.out.println(average1);
        System.out.println(average2);
    }
}
