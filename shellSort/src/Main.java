import java.text.NumberFormat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 37, 54, 2, 3};

        System.out.println("Array antes da ordenação:");
        printArray(arr);
        shellSort.shellSort(arr);

        System.out.println("Array após a ordenação:");
        printArray(arr);
    }


    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();

    }
}



