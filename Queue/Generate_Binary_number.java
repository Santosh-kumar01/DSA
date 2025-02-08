import java.util.*;

public class Generate_Binary_number {
    static  void generatePrintBinary(int n){
        Queue<String> q = new  LinkedList<String>();
        q.add("1");
        while (n --> 0) {
            String  s1 = q.peek();
            q.remove();
            System.out.print(s1);
            String  s2 = s1;
            q.add(s1 + " 0");
            q.add(s2  + "1");

            
        }
    }
    
    public static void main(String[] args) {
        int n = 5;
        generatePrintBinary(n);
    }
}
