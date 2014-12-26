package bart.scratch;

/**
 */
public class Scratch {

    private static void x() {

        Integer[] ints = new Integer[7];
        Integer[] intsToo = new Integer[7];

        for (int i=0; i<ints.length; i++ ) {
            ints[i] = 5000 + i;
        }

        System.arraycopy(ints, 0, intsToo, 0, ints.length);
        for (Integer anint : intsToo) {
            System.out.println(anint);
        }
    }

    public static void main(String[] args) {
        x();
    }

    private int[] calcFibonnacci(int numberToCalcTo) {

        return new int[]{};
    }

}
