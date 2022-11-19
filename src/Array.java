import java.util.*;
public class Array {


        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Please Enter Arraylist Length:");
            int n = s.nextInt();
            int arr[] = new int[n];
            System.out.println("PLease Enter Element of Array:");

            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println("Please Enter variable key:");
            int variablekey=s.nextInt();
            Set<Integer> hs = new HashSet<>();
            for (int i = 0; i < n; i++) {

                if (arr[i] <variablekey) {
                    hs.add(arr[i]);
                }

            }
            System.out.println(hs.size());
        }
    }
