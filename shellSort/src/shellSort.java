    public class shellSort {


        public static void shellSort(int[] arr) {
            int n = arr.length;

            // Começa com um gap grande e diminui gradualmente
            for (int gap = n/2; gap > 0; gap /= 2) {
                // Faz comparações e trocas com o gap atual
                for (int i = gap; i < n; i += 1) {
                    int temp = arr[i];
                    int j;
                    for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                        arr[j] = arr[j - gap];
                    }
                    arr[j] = temp;
                }
            }
        }
}
