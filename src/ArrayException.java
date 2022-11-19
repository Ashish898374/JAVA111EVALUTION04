public class ArrayException {
    static void fun() {
        int[] array = new int[10];
        try {
            System.out.println(array[11] = 100);
        }
        catch (Exception e) {
            System.out.println("This is   Exception code");
        } finally {
            System.out.println(" end of code ");
        }

    }

    public static void main (String[] args) {
        fun();
    }
}
