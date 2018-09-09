// Nick @ WashingtonBrewology
/*
CHALLENGE #5 
*/

import java.util.Arrays;
public class phoneNumber {
    public static void main(String[] args) {
        formatPhoneNumber(new int[]{8,3,1,2,5,1,0,6,1,9});
    }
    public static String formatPhoneNumber(int[] nums) {
        String phoneNums = "";
        for (int i : nums) {
            phoneNums += i;
        }
        System.out.print(phoneNums.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3"));
        return phoneNums;

    }



}
