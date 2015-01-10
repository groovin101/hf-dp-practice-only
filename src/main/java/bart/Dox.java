package bart;

/**
 * Help us with test documentation
 */
public class Dox {

    public void printTestTitle(String titleOrDescriptionOfTest) {

        StringBuilder linesAroundTitle = new StringBuilder();
        for (int i=0;i<titleOrDescriptionOfTest.length();i++) {
            linesAroundTitle.append("-");
        }

        System.out.println("");
        System.out.println(linesAroundTitle);
        System.out.println(titleOrDescriptionOfTest);
        System.out.println(linesAroundTitle);
    }

    public void out(String lineToPrint) {
        System.out.println(lineToPrint);
    }

    public void blankLine() {
        System.out.println("");
    }
}
