package javaclasslabs.domain.test;

public class hashCodeTest {


    public static int h(String s){
        int h = 0;
        for(char c : s.toCharArray()){
            h = 31 * h + c;
        }

        return h;
    }
    public static void main(String[] args) {
        String name = "Jennifer";
        System.out.println(name.hashCode());
        System.out.println(h(name));
    }
}
