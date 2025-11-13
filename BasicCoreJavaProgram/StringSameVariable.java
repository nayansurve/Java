public class StringSameVariable {
    public static void main(String[] args) {
        String s1 = "nayan";      // first string object created in String Pool
        System.out.println("Before change: " + s1);

        s1 = "surve";             // now s1 points to a new object "surve"
        System.out.println("After change: " + s1);
    }
}
