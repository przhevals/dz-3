public class SearchInArr {
    void minMaxNum(int[] arr){

        System.out.println("Task 1 : Min and Max number");
        int min = arr[0], max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    void evenOddNum(int[] arr){

        System.out.println("Task 2 : Even and Odd Numbers");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }

    void longestShortestNum(int[] arr){

        System.out.println("Task 3 : Longest and Shortest Numbers");

        int largest = arr[0];
        int shortest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
            if(arr[i] < shortest){
                shortest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(shortest);
    }

    void palindromeNum(int[] arr){

        System.out.println("Task 4 : Palindrome Numbers");

        for(int i = 0; i < arr.length; i++){
            int n = arr[i];
            int temp = n;
            int rev = 0;

            while (temp != 0){
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }

            if(rev == arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
}
