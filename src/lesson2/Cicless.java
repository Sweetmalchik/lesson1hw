package lesson2;

public class Cicless {
    public static void testWhile() {
        int start = 0;
        while (++start < 10) {
            System.out.println(start + " ");
        }
System.out.println();
        while (start > 0){
            System.out.println(start + " ");
            start--;
        }
        start++;
        System.out.println();
        int pow = 0;
        while (pow < 20) {
            System.out.print(start + " ");
            start *= 3;
            pow++;
        }
    }
    //public static void printDeepBracketsWithLimits (int limit){
    //break - завершает свой цикл
    // lab:
    // for (int i = 0; i < 5; i++) {

    //   for (int j = 0; j < 5; j++) {

    //      for (int k = 0; k < 5; k++) {
    //         break lab;
    //         System.out.print(" * ");
    //     }

    // }
    //   System.out.print(" * ");
    //  }
    //}
    //чем меньше итераций тем лучше
    // сложность по времени определяется колличеством итерации
    // сложность по времени это функция, зависящая от входного параметра
    public static void forTest(int n){
        //alt + ctrl + l
        for (int i = 0; i < n ; i++) { // 0(n ** 2)
            System.out.print(i + "");
        }
        System.out.println();
    }
    //[[[]]], n = 3
    public static void printBrackets (int count){
        for (int i = 0; i < count; i++) {
            System.out.print("[");
        }
        for (int i = 0; i < count; i++) {
            System.out.print("]");
        }
    }
    public static void printDeepBrackets (int count) {

        for (int i = 5; i <= count ; i++) {
            for (int j = 0; j < i; j++) {
System.out.print("(");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(")");
            }
        }
    }
    //limit = 10 ()(())((()
    public static int printDeepBracketsWithLimits (int limit) {
        int j = 1, breckeds = 0;
        label:
        while (true){
            for (int i = 0; i < j; i++) {
                System.out.print("(");
                breckeds++;
                if (breckeds == limit) {
                    break label;
                }
            }
            for (int i = 0; i < j; i++) {
                System.out.print(")");
                breckeds++;
                if (breckeds == limit) {
                    return breckeds;
                }
            }
            j++;
        }
System.out.println("After return");
        return breckeds;

        }
        public static void multipleTable(int x, int y) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    //%d int Long short byte, %float double, %c char, %s String
                    // \n - переход на следующую строку
                    System.out.printf("%4d", (i + 1) * (j + 1));
                }
                System.out.println();
            }


        }
    public static void main(String[] args){
        //testWhile();
        //forTest(5);
        //printBrackets(3);
        //printDeepBrackets(3);
        //System.out.println(printDeepBracketsWithLimits(18));
        multipleTable ( 10, 10);
    }
}

