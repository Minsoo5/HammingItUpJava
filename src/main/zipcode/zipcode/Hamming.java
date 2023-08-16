package zipcode;

public class Hamming {

    String left;
    String right;
    public Hamming(String s, String s1) {
        this.left = s;
        this.right = s1;
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
