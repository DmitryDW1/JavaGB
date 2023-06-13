package Example2;


//package Example2;
//import java.io.File;
//
//public class tryDemo {
//    public static void main(String[] args) {
//        try {
//            String pathProject = System.getProperty("user.dir");
//            String pathFile = pathProject.concat("/file.txt");
//            File f3 = new File(pathFile);
//            System.out.println("try");
//        } catch (Exception e) {
//            System.out.println("catch");
//        } finally {
//            System.out.println("finally");
//        }
//    }
//}

import java.io.File;
public class tryDemo {
    public static void main(String[] args) {
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File file = new File(pathFile);
            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
            }
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
    }
}