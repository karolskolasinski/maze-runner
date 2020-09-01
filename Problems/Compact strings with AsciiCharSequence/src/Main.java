import java.util.*;

class AsciiCharSequence implements CharSequence {

    byte[] array;

    public AsciiCharSequence(byte[] array) {
        this.array = array.clone();
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
//        CharSequence charSequence = new AsciiCharSequence(array);
//        charSequence.subSequence(start, end);
        byte[] bytes = java.util.Arrays.copyOfRange(array, start, end);
        return new AsciiCharSequence(bytes);
    }

    @Override
    public String toString() {
        return new String(this.array);
    }

}
