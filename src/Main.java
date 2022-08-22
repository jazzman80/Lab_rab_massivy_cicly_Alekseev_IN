public class Main {
    public static void main(String[] args) {

        int[] array = {2,3,4,5,6,7,8,9,10};
        int product = 1;

        for (int i=0; i < array.length; i++){
            product *= array[i];
        }

//        Вариант 2:
//        for (int j : array) {
//            product *= j;
//        }
        
        System.out.println("Произведение элементов массива равно " + product);

    }
}