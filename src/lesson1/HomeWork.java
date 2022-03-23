package lesson1;

public class HomeWork {
    public static void main(String[] args) {

// Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        int a = 2;
        int d = 4;
        int c = 8;
        int b = 6;
        System.out.println(a * (b + (c / d)));
    }
    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    public static void task4() {
        int a = 10, b = 5;
        boolean f1 = true, f2 = false;
        {
            if (a + b >= 10 && a + b <= 20) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }

        }
    }
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное
// ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.


    public static void task5(int a) {
        if (a >= 0) {
            System.out.println("Это положительное число");
        } else {
            System.out.println("Это отрицательное число");
        }
    }

//Написать метод, которому в качестве параметра передается целое число, метод должен вернуть true, если число отрицательное;
    public static boolean task6(int x) {
        if (x >= 0) {
            return true;
        }
        {
            return false;
        }
    }
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести
    //в консоль сообщение «Привет, указанное_имя!»;
    public static void task7(String name) {
            System.out.println("Привет, " + name + "!");
        }
    }


