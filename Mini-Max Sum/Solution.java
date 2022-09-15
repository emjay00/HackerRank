import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    
      int l= Collections.min(arr);
     int h=Collections.max(arr); 
      
     long sum1=0;
     long sum2=0;
    // long sum3=0;
    for(int i=0;i<arr.size();i++){
    if(arr.get(i)!=l){
        sum1+=arr.get(i); 
    }
   if(arr.get(i)!=h){
        sum2+=arr.get(i);
    }
    else if(arr.get(i)==h&&arr.get(i)==l){
        sum1=4*l;
        sum2=sum1;
    }
    
    }
    System.out.println(sum2+" "+sum1);
      
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
