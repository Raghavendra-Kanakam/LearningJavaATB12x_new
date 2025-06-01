package ex_15_StringBuffer_Builder_Strings;

public class Lab145_StringBuffer {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.append("Programming");

        sb.replace(0,4,"c++");
        System.out.println(sb);

    }
}
