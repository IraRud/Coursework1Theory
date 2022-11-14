package skypro.java.course1.courseworksTheory;

public class Main {
    /*	Необходимо реализовать следующий метод:
•	Получаем на входе массив чисел.
•	Все четные числа увеличиваем на единицу.
•	Возвращаем кусок списка с 3-го по 7-й элемент.*/

    public static void main(String[] arr) {
        int[] firstArr = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8}; // пропущено оператор new
        increaseEvenNumbersAndOutputElementsFrom3To7(firstArr);
    }

    public static void increaseEvenNumbersAndOutputElementsFrom3To7 (int[] arr){
        for (byte i = 0; i < arr.length; i++) { // исправлено написание length
            if (i % 2 == 0) {
                arr[i]++;
            }

            if (i >=2 && i <= 6) {
                System.out.println("arr[" + i + "]= " + arr[i]);
            }
        }

    }
}
