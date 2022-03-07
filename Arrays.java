import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
       int[] grades = new int[3];//0,1,2
       grades[0]=98;
       grades[1]=54;
       grades[2]=92;

       int[] arr={3,2,5,7};
       //System.out.println(grades[0]);
       //System.out.println(grades[1]);
       //System.out.println(grades[2]);
        for (int i=0;i<3;i++){
            System.out.println(grades[i]);
        }
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int a : arr){
            System.out.println(a);
        }


        Scanner scanner =new Scanner(System.in);

        String[] names = new String[5];

        for(int i=0 ; i<names.length ;i++)
            names[i] = scanner.next();

        for(String name : names){
            System.out.println(name);
        }






    }
}
