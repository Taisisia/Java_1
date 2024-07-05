package org.example._20240612;

import java.util.Random;


    public class TestingPraktika {
        public static void main(String[] args) {

        }
        //   Создайте метод getNumbers();
//Метод должен возвращать массив из трех целочисленных значений: [1, 2, 3]
//Используйте метод Assertions.assertEquals
//Проанализируйте вывод
//Используйте метод Assertions.assertArrayEquals
//Проанализируйте результат
//Напишите тест, который проверяет размер массива
//Создайте метод void init(), определите в нем ожидаемый результат и примените аннотацию @BeforeEach
//Проанализируйте работу тестов
        public static int[] getNumber() {
            int[] arr1 = new int[3];
            Random random = new Random();
            for (int i = 0; i < 3; i++) {
                arr1[i] = random.nextInt(1, 100);
            }
            return arr1;
//           public static int[] getNumber(){
//    int[] arr1=new int[3];
//    Random random=new Random();
//    for (int i=0; i<3; i++){
//        arr1[i]= random.nextInt(1,100);
//    }
//    return arr1;
//}
        }
        public static int[] getNumbers() {
            int[] arrNum = {1, 2, 3};
            return arrNum;
//Написать метод findMax(), который возвращает максимальное число из массива
//Протестировать с помощью метода main()
//Написать тесты используя библиотеку JUnit
//тест, который проверяет пустой массив или нет
//тест, который проверяет правильность поиска максимального значения
        }
        public static Integer findMax(Integer[] array){

            Integer[] array1;
            if (array.length == 0){
                return null ;
            }
            int max=array[0];
            for (int i=0; i<array.length; i++){
                if (array[i]>max){
                    max=array[i];
                }
            }
            return max;
        }
    }


