public class Array {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        //By default, all the values are 0
        int[] primeNumbers = {2, 3, 5, 7, 11};

        int firstNumber = numbers[0];
        int thirdPrime = primeNumbers[2];
        System.out.println(firstNumber);
        int length = numbers.length;

        for (int primeNumber : primeNumbers) {
            System.out.println(primeNumber);
        }

        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
