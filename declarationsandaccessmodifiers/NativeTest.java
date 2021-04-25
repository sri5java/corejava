package declarationsandaccessmodifiers;



public class NativeTest {
    public native int intMethod(int i);
    public static void main(String[] args) {
        System.loadLibrary("Main");
        System.out.println(new NativeTest().intMethod(2));
    }
}