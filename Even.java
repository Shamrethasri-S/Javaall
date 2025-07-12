public class Even {
    public static void main(String[] args){
        int arr[] = {0, 2, 4, 5, 6, 7};
        int i;
        int sum = 0;
        for (i = 0; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
                sum += arr[i];
        }
        }
        System.out.println("Sum:" + sum);
}
}
