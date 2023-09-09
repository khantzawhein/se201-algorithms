public class TowerOfHanoi {

    public static void main(String[] args) {
        int numDisks = 3; // Change this to the number of disks you want to solve for
        char source = 'A';
        char auxiliary = 'B';
        char destination = 'C';
        // test(3);
        // System.out.println(count);
        solveTowerOfHanoi(numDisks, source, auxiliary, destination);
    }
    static int count = 0;
    public static void test(int n) {
        
        if (n == 0) {
            return;
        }
        
        count ++;
        test(n-1);
        test(n-1);
        
    }

    public static void solveTowerOfHanoi(int numDisks, char source, char auxiliary, char destination) {
        if (numDisks == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move (numDisks - 1) disks from source to auxiliary using destination as the auxiliary peg
        solveTowerOfHanoi(numDisks - 1, source, destination, auxiliary);

        System.out.println("Move disk " + numDisks + " from " + source + " to " + destination);

        // Move (numDisks - 1) disks from auxiliary to destination using source as the auxiliary peg
        solveTowerOfHanoi(numDisks - 1, auxiliary, source, destination);
    }
}
