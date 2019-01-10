package miscellaneous;

/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class CountingValleys {
    public static void main(String[] args) {

        String steps = "UDDDUDUUDDDUUU";

        int stepResult = 0;
        int valleyCount = 0;
        for (String step : steps.split("")) {
            System.out.println(step);
            System.out.println(stepResult);

            if (step.equals("D")) {
                stepResult = stepResult - 1;
            } else {
                stepResult = stepResult + 1;
            }

            if (step.equals("U") && stepResult == 0) {
                valleyCount++;
            }
        }
        System.out.println(stepResult);
        System.out.println(valleyCount);
    }
}
