public class Tiles {
    public static void main(String[] args) {
        System.out.println(waysOfTiles(5, ""));
    }

    public static int waysOfTiles(int n, String ways) {
        if (n == 1) {
            System.out.println("1" + ways);
            return 1;
        } else if (n == 2) {
            System.out.println("1 1" + ways);
            System.out.println("2" + ways);
            return 2;
        } else if (n == 3) {
            System.out.println("1 1 1" + ways);
            System.out.println("1 2" + ways);
            System.out.println("2 1" + ways);
            System.out.println("3" + ways);
            return 4;
        } else {
            return waysOfTiles(n - 1, " 1" + ways) + 
            waysOfTiles(n - 2, " 2" + ways) + waysOfTiles(n - 3, " 3" + ways);
        }
    }
}
