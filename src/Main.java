public class Main {
    public static void main(String[] args) {
        //Define a string called string1 that has assigned the value "Hello"
        String string1 = "Hello";
        //Define a string called string2 that has assigned the value "How are you?"
        String string2 = "How are you?";
        //Take the first 2 characters string1 and the last 2 characters of
        // string2 and combine the 4 chars (Heu?) into a dedicated array called charArray//
        char[] charArray1 = new char[4];
        charArray1[0] = string1.charAt(0);
        charArray1[1] = string1.charAt(1);
        charArray1[2] = string2.charAt(string2.length() - 2);
        charArray1[3] = string2.charAt(string2.length() - 1);
        //Print charArray
        String charArray = new String(charArray1);
        System.out.println(charArray);
    }
}