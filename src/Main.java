import java.util.Random;
import java.util.Scanner;

public class Main {

    public Integer[] createRandom(){
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("Danh sách phần tử của mảng: ");
        for (int i=0;i<100;i++){
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    public static void main(String[] args) {
        Main  main = new Main();
        Integer[]arr = main.createRandom();

        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhập vào chỉ số của 1 phần tử bất kỳ: ");
        int el = sc.nextInt();
        try {
            System.out.println("Giá trị của phần tử có chỉ số 5" + el + " là " + arr[el]);
        }catch (IndexOutOfBoundsException e){
            System.err.println(e);
        }

    }
}
