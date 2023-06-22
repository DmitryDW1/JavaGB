package Seminar4;

import java.util.Deque;
import java.util.LinkedList;

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("simplyfyPath(\"/home/\") = " + simplyfyPath("/home/d/../s"));
        System.out.println("simplyfyPath(\"/../\") = " + simplyfyPath("/../"));
        System.out.println("simplyfyPath(\"/home//foo/\") = " + simplyfyPath("/home//foo/"));
    }

    private static String simplyfyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if("..".equals(s)){
                if (!deq.isEmpty()){
                    deq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)){
                deq.add(s);
            }
        }
        if (deq.isEmpty()) return "/";
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()){
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }
}
