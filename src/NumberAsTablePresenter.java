import java.util.Arrays;

/**
 * Created by Stablo on 03.06.2018.
 */
public class NumberAsTablePresenter {
    public static void solution(int[] A, int K) {
        StringBuilder stringBuilder = new StringBuilder();
        int cellLength = findLengthOfLongestNumber(A);
        int currentRowCellCount = 0;
        K = K > A.length ? A.length : K;

        for (int i = 0; i < A.length; i = i + K) {
            int[] rowOfNumbers = Arrays.copyOfRange(A,i,Math.min(i+K,A.length));
            currentRowCellCount = rowOfNumbers.length;
            stringBuilder.append(printFrameRow(K,cellLength));
            stringBuilder.append("\n");
            stringBuilder.append(printNumberRow(cellLength,rowOfNumbers));
            stringBuilder.append("\n");
        }
        stringBuilder.append(printFrameRow(currentRowCellCount,cellLength));
        System.out.println(stringBuilder.toString());

    }

    private static int findLengthOfLongestNumber(int[] A) {
        int maxLength = 0;
        for (int i = 0; i < A.length; i++) {
            int lengthOfCurrentNumber = Integer.toString(A[i]).length();

            if (lengthOfCurrentNumber > maxLength){
                maxLength = lengthOfCurrentNumber;
            }
        }
        return maxLength;
    }

    private static String printFrameRow(int cellCount, int cellLength){
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < cellCount; i++) {
            stringBuilder.append("+");
            for (int j = 0; j < cellLength; j++) {
                stringBuilder.append("-");
            }
        }
        stringBuilder.append("+");
        return stringBuilder.toString();
    }

    private static String printNumberRow(int cellLength, int[] rowOfNumbers){
        StringBuilder row = new StringBuilder();

        for (int i = 0; i < rowOfNumbers.length; i++) {
            StringBuilder numberBuilder = new StringBuilder();
            row.append("|");
            numberBuilder.append(rowOfNumbers[i]);
            while (numberBuilder.length() < cellLength){
                numberBuilder.insert(0," ");
            }
            row.append(numberBuilder.toString());
        }
        row.append("|");
        return row.toString();
    }
}
