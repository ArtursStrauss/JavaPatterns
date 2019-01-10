package miscellaneous;
/**
 * Created by Artūrs Štrauss on Dec, 2018
 */
public class JumpingOnTheClouds {

    public static void main(String[] args) {
        int[] clouds = {0, 0, 1, 0, 1, 0, 1, 0, 0};
        int jumps = 0;
        for (int i = 0; i < clouds.length; i++) {
            if (i + 2 < clouds.length && clouds[i + 2] == 0) {
                i++;
            }
            jumps++;
        }
        jumps--;
        System.out.println(jumps);
    }
}
