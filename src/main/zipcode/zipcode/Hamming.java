package zipcode;

public class Hamming {

    String left;
    String right;
    public Hamming(String s, String s1) throws IllegalArgumentException {
        this.left = s;
        this.right = s1;
        if (s.length() != s1.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    //Will eventually need a try catch for illegal argument exception
    public int getHammingDistance() {
        int counter = 0;
            for (int i = 0; i < left.length(); i++) {
                if (left.charAt(i) != right.charAt(i)) {
                    counter++;
                }
            }
        return counter;
    }


}
