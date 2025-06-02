package src.w3resourceexercises.practicebasics.swapvariables;

public class SwapVariables {
    public static void main(String[] args) {
        int[] swapped = swap(1, 2);
        System.out.println("x = " + swapped[0] + "\n" 
                            + "y = " + swapped[1]);
    }

    public static int[] swap(int x, int y){
        int tmp = x;
        x = y;
        y = tmp;
        return new int[]{x, y};
    }
}