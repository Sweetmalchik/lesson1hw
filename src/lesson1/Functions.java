package lesson1;

public class Functions {
    // фунция - кусок программного кода
    // функция имеет аргументы и что то возвращает(но это не точно)
    // функция которая ничего не возвращает имеет тип void и называется процедурой



    // тип_данных имя_фунции(тип параметра1....) {impl}
    static int sum(int a, int b) {
        return a + b; //вернуть а + b
    }

    static void sumTwo(int a,int b) {
        System.out.println(a + b);
        return;
    }

    public static void main(String[] args) {
        //фунция = метод
        System.out.println(sum(1,7));
        int result = sum(1,12);
        sumTwo(1,12);
    }

}