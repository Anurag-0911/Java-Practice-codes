package practice;
//
//public class prmn {
//    public static void main(String args[]){
//        int n = 100;
//        for (int i = 2;i<n ;i++){
//            int count = 0;
//            for (int j = 2;j<i/2+1;j++){
//                if (i%j==0){
//                    count++;
//                    break;
//                }
//            }
//            if (count == 0 && i != 1){
//                System.out.println(i);
//            }
//        }
//    }
//}
import java.util.*;
class prmn {
    public static int countPrimes(int n) {
        if(n<2) return 0;
        int count=0;
        boolean [] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0]=false;arr[1]=false;
        for (int i = 2;i<n ;i++){
            for (int j = 2;j<i/2+1;j++){
                if (i%j==0){
                    arr[i]=false;
                    break;
                }
            }
        }
        for(int i=0;i<n;i++){
//            System.out.println(arr[i]);
            if(arr[i]) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = countPrimes(50000);
        System.out.println(ans);
    }
}

