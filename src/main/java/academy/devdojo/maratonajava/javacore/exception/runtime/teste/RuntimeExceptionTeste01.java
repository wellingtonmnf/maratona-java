package academy.devdojo.maratonajava.javacore.exception.runtime.teste;

public class RuntimeExceptionTeste01 {
    public static void main(String[] args) {
        int[] nums = {1,2};
        Object object = null;
        System.out.println(object.toString()); //NullPointerException
        System.out.println(nums[2]); //ArrayIndexOutOfBoundsException
    }
}
