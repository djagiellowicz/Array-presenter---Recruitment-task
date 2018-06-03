

public class Main {
    public static void main(String[] args) {
        int[] ArrayToPresent = ArrayRandomiser.randomArray();
        int NumberOfCellsPerRow = ArrayRandomiser.randomCellNumber();
        NumberAsTablePresenter.solution(ArrayToPresent,NumberOfCellsPerRow);
    }

}
