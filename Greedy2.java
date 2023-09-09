public class Greedy2 {
    public static void main(String[] args) {
        int w = 13;
        int h = 29;
        int numberOfCuts = cuts(w, h);

        System.out.println("Number of cuts: " + numberOfCuts);

    }

    public static int cuts(int w, int h) {
        boolean isWider = w > h;
        int largerSide = isWider ? w : h;
        int smallerSide = isWider ? h : w;
        int numberOfCuts = 0;
        
        if (largerSide > 0) {
            numberOfCuts = largerSide / smallerSide;
            int remainder = largerSide % smallerSide;
            System.out.println("Cutting " + smallerSide + "x" + smallerSide + ", Number of Cuts: " + numberOfCuts);
            w = isWider ? remainder : w;
            h = isWider ? h : remainder; 

            if (remainder > 0) {
                return numberOfCuts + cuts(w, h);
            }
        }
        return numberOfCuts;
    }
}
