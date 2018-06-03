import java.util.Random;

/**
 * Created by Stablo on 03.06.2018.
 */
public class ArrayRandomiser {
    public static int randomCellNumber(){
        Random random = new Random();
        return 4 + random.nextInt(19);
    }

    public static int[] randomArray(){
        Random random = new Random();
        int numberOfNumbers = 5 + random.nextInt(95);
        int[] arrayToReturn = new int[numberOfNumbers];
        for (int i = 0; i < numberOfNumbers; i++) {
            arrayToReturn[i] = random.nextInt(10000);
        }
        return arrayToReturn;
    }
}
