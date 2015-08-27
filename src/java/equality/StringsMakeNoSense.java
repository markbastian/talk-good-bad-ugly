package equality;

public class StringsMakeNoSense {
    public static void main(String[] args){
        System.out.println("Checking out Reference Equality");

        boolean areTheseStringsReferentiallyEqual = "ABC" == "ABC";
        boolean areTheseStringsEqual = "ABC".equals("ABC");

        System.out.println("Are these strings referentially equal? " + areTheseStringsReferentiallyEqual);
        System.out.println("Are these strings logically equal? " + areTheseStringsEqual);
    }
}
