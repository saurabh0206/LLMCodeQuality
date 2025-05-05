import java.util.*;
public class first{

   public static void main(String[] args) {
       int arr[] = { 3, 5, 7, 2, 1, 5, 7, 6,6,6 };
        int max = arr[0];
        Map<Integer,Integer> map= new HashMap<>();
        for (int i : arr) {
            max = Math.max(max, i);
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
       // System.out.println(map.get(7));
        int ans = 0;

        for (int i : arr) {
            if (i < max)
                ans=Math.max(ans,i);
        }

        System.out.println("max element is " + ans + " and freq is  " + map.get(ans));
        

    }
}