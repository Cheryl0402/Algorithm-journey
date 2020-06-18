package ArrayandString;

public class Main {

    public static void main(String[] args) {
        // write your code here
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        System.out.println(s);

        //output
        //olleh
    }

    public static void reverseString(char[] s){
        int i = 0;
        int j = s.length - 1;
        char temp;

        while(i < j){
            temp = s[j];
            s[j] = s[i];
            s[i] = temp;

            i++;
            j--;
        }
    }
}
