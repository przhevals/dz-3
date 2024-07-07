//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = {12,1331,44,25,267,689986,3003,9524, 20};
        SearchInArr solution = new SearchInArr();

        //1st task
        solution.minMaxNum(arr);

        //2nd task
        solution.evenOddNum(arr);

        //3rd task
        solution.longestShortestNum(arr);

        //5th task
        solution.palindromeNum(arr);
        }
    }
