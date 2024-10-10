// Superclass Safika
class safika{
    int x = 16000;    // Variable to store x fees
    int y = 14000;  // Variable to store y fees
}

// Subclass prb6 which extends safika
public class prb6 extends safika {
    int z = 8000;

    // Constructor for prb6
    public prb6() {
        super();  // Call the constructor of the superclass safika
        this.z = 2000; 
    }

    public static void main(String[] args) {
        prb6 t = new prb6();

        // Accessing and printing the variables from both the superclass and subclass
        System.out.println("safika's x fees: " + t.x);
        System.out.println("safika's y fees: " + t.y);
        System.out.println("safika's private fees: " + t.z);
    }
}