package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int center = cathetusLength != 0 ? cathetusLength / 2 : 0;

        for (int i = 1; i <= cathetusLength; i++) {
            int maxNumber = i;
            int minNumber = 2;
            for (int j = 1; j <= cathetusLength * 2 - 1; j++) {
                if (j == cathetusLength) {
                    System.out.print(1);
                } else if (j <= cathetusLength - i || j >= cathetusLength + i) {
                    System.out.print(" ");
                } else if (j > cathetusLength - i && j < cathetusLength) {
                    if(j > cathetusLength - maxNumber && j < cathetusLength) {
                        System.out.print(maxNumber);
                        maxNumber--;
                    }
                } else if (j > cathetusLength && j < cathetusLength + i) {
                    if(j > cathetusLength && j < cathetusLength + i) {
                        System.out.print(minNumber);
                        minNumber++;
                    }
                }
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
