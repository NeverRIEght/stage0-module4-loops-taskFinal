package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++) {
            for(int j = 1; j <= cathetusLength - i; j++) {
                System.out.print(" ");
            }
            for(int k = cathetusLength - i; k < cathetusLength; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
