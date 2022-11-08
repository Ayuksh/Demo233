package package1;

import java.util.Arrays;

public class Program1 {
    public static void main(String[] args) {
        String str1 = "my name is core java ";
        String str2 = "name is my BHva core ";

        int n1 = str1.length();
        int n2 = str2.length();
        if (n1==n2){
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i =0;
            boolean status=true;
            while (i!=n1)
            {
                if (arr1[i]!=arr2[i])
                  status=false;
                i++;
            }
            if (status)
                System.out.println("STRING IS ANAGRAM !!");

        }



    }
}
