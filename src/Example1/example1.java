package Example1;

// public class example1 {
//     public static void main(String[] args) {
//         System.out.println("bye world");
//         short age = 10;
//         int salary = 123456;
//         System.out.println(age); //10
//         System.out.println(salary); //123456
//         String s = "2";
//         System.out.println(s);
//
//         float e = 2.7f;
//         double pi = 3.1415;
//         System.out.println(e); // 2.7
//         System.out.println(pi); // 3.1415
//
//         char ch = '1';
//         System.out.println(Character.isDigit(ch)); // true
//         ch = 'a';
//         System.out.println(Character.isDigit(ch)); // false
//
//         boolean flag1 = 123 <= 234;
//         System.out.println(flag1); // true
//         boolean flag2 = 123 >= 234 || flag1;
//         System.out.println(flag2); // true
//         boolean flag3 = flag1 ^ flag2;
//         System.out.println(flag3); // false
//
//         String msg ="Hello world";
//         System.out.println(msg); // Hello world
//
//         var a = 123;
//         System.out.println(a); // 123
//         var d = 123.456;
//         System.out.println(d); // 123.456
//         System.out.println(getType(a)); // Integer
//         System.out.println(getType(d)); // Double
//         d = 1022;
//         System.out.println(d); // 1022
//         //d = "mistake";
//         //error: incompatible types:
//         //String cannot be converted to double
//
//         System.out.println(Integer.MAX_VALUE); // 2147483647
//         System.out.println(Integer.MIN_VALUE); // -2147483648
//
//         String s_2 = "qwer";
//         s_2.charAt(1);
//         System.out.println(s_2.charAt(3));
//
//         int c = 123;
//         a ++;
//         System.out.println(c++); // не увеличился постфиксный инкримент
//         System.out.println(c);
//         System.out.println(++c); // увеличился префиксный икримент
//         System.out.println(c);
//
//         int x = 123;
//         int y = 123;
//         x = x-- - --x;
//         System.out.println(x);
//         y = --y - y--;
//         System.out.println(y);
//
//         int j = 5;
//         int k = 2;
//         System.out.println(j | k);
//         // 101 5
//         // 010 2
//         // 111 7
//
//         int[] arr = new int[10];
//         System.out.println(arr.length); // 10
//         arr = new int[] { 1, 2, 3, 4, 5 };
//         System.out.println(arr.length); // 5
//
//     }
//     static String getType(Object o){
//         return o.getClass().getSimpleName();
//     }
// }
// public class example1 {
//     public static void main(String[] args) {
//         int[] arr[] = new int[3][5];
//         for (int[] line : arr) {
//             for (int item : line) {
//                 System.out.printf("%d ", item);
//             }
//             System.out.println();
//         }
//     }
// }

// public class example1 {
//     public static void main(String[] args) {
//         int[][] arr = new int[3][5];
//
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr[i].length; j++) {
//                 System.out.printf("%d ", arr[i][j]);
//             }
//             System.out.println();
//         }
//     }
// }
// public class example1 {
//     public static void main(String[] args) {
//         int i = 123; double d = i;
//         System.out.println(i); // 123
//         System.out.println(d); // 123.0
//         d = 3.1415; i = (int)d;
//         System.out.println(d); // 3.1415
//         System.out.println(i); // 3
//         d = 3.9415; i = (int)d;
//         System.out.println(d); // 3.9415
//         System.out.println(i); // 3
//         byte b = Byte.parseByte("123");
//         System.out.println(b); // 123
//         b = Byte.parseByte("1234");
//         System.out.println(b); // NumberFormatException: Value out of range
//     }
// }

// class example1
// {
//     public static void main(String[] args) {
//         int[] a = new int[10];
//         double[] d = a; // ИЗУЧАЕМ ковариантность и контравариантность
//     }
// }

// import java.util.Scanner;
// public class example1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("name: ");
//         String name = iScanner.nextLine();
//         System.out.printf("Привет, %s!", name);
//         iScanner.close();
//     }
// }

// import java.util.Scanner;
// public class example1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         int x = iScanner.nextInt();
//         System.out.printf("double a: ");
//         double y = iScanner.nextDouble();
//         System.out.printf("%d + %f = %f", x, y, x + y);
//         iScanner.close();
//     } }

// import java.util.Scanner;
// public class example1 {
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.printf("int a: ");
//         boolean flag = iScanner.hasNextInt();
//         System.out.println(flag);
//         int i = iScanner.nextInt();
//         System.out.println(i);
//         iScanner.close();
//     } }

// public class example1 {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = a + " + " + b + " = " + c;
//         System.out.println(res);
//         String s = "qwe";
//         int d = 123;
//         String q = s + d;
//         System.out.println(q);
//     }
// }

// public class example1 {
//     public static void main(String[] args) {
//         int a = 1, b = 2;
//         int c = a + b;
//         String res = String.format("%d + %d = %d \n", a, b, c);
//         System.out.printf("%d + %d = %d \n", a, b, c);
//         System.out.println(res);
//     }
// }

/**
 * %d: целочисленных значений
 %x: для вывода шестнадцатеричных чисел
 %f: для вывода чисел с плавающей точкой
 %e: для вывода чисел в экспоненциальной форме,
 например, 3.1415e+01
 %c: для вывода одиночного символа
 %s: для вывода строковых значений

 */

//  public class example1 {
//     public static void main(String[] args) {

//         float pi = 3.1415f;
//         System.out.printf("%f\n", pi); // 3,141500
//         System.out.printf("%.2f\n", pi); // 3,14
//         System.out.printf("%.3f\n", pi); // 3,141
//         System.out.printf("%e\n", pi); // 3,141500e+00
//         System.out.printf("%.2e\n", pi); // 3,14e+00
//         System.out.printf("%.3e\n", pi); // 3,141e+00
//     }
// }

// public class example1 {
//     public static void main(String[] args) {
//         {
//             int i = 123;
//             System.out.println(i);
//         }
//         System.out.println(i); // error: cannot find symbol
//     }
// }
public class example1 {
    static void sayHi() {
        System.out.println("hi!");
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static double factor(int n) {
        if(n==1)return 1;
        return n * factor(n-1);
    }
    public static void main(String[] args) {
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0
    }
}