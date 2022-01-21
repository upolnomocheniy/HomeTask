package lection3.task1;

public class TaskOneArrays {

    public static void main(String[] args) {
        int[] arr = generateRandomNumForArray(10);
        outputInfo(arr);
//        changeMaxNegativeAndMinPositive(arr);
//        System.out.println("\n");
//        outputInfo(arr);
//        sumOfEvenElements(arr);
//        replaceNegativeNumWithNull(arr);
//        outputInfo(arr);
//        tripleEveryPositiveElements(arr);
//        outputInfo(arr);
//        differenceAvgAndMin(arr);
        repeatedElementsAndOddIndexes(arr);
    }

    public static int[] generateRandomNumForArray(int len) {
        int[] randArr = new int[len];
        for (int i = 0; i < randArr.length; i++) {
            randArr[i] = ((int) (Math.random() * 21) - 10);

        }
        return randArr;
    }

    public static void outputInfo(int[] arr) {
        System.out.print("\nArr [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.print("]");
    }

    public static void changeMaxNegativeAndMinPositive(int[] arr) {

        int max = 0;
        int min = 0;
        int indexMax = 0;
        int indexMin = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {   //max
                max = arr[i];
                indexMax = i;
            }
            if (arr[i] < min) {   //min
                min = arr[i];
                indexMin = i;
            }
        }

        arr[indexMax] = min;
        arr[indexMin] = max;

//        System.out.println("\nMax: "+max);
//        System.out.println("Min: "+min);
    }

    public static void sumOfEvenElements(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            result += arr[i];
        }
        System.out.println("\nSum of even element: " + result);
    }

    public static void replaceNegativeNumWithNull(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    public static void tripleEveryPositiveElements(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < 0 && arr[i] > 0) {
                arr[i] = arr[i] * 3;
            }
        }
    }

    public static void differenceAvgAndMin(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        int sum = 0;
        int min = 0;
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            sum += i;
        }
        double avg = (double) sum / arr.length;
        double diff = avg - min;
        System.out.println("\nAvg: " + avg +
                "\n min: " + min +
                "\n Summ: " + sum +
                "\nCount: " + arr.length +
                "\n Diff: " + diff);
    }

    public static void repeatedElementsAndOddIndexes(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {// && j % 2 != 0)
                        System.out.println("\n" + arr[i]);
                    }
                }
            }
        }
    }
}
