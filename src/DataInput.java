import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public final class DataInput {

    String temp;

    public static Long getLong(String message) throws IOException {
        String s = getString(message);
        Long value = Long.valueOf(s);
        return value;
    }

    public static char getChar(String message) throws IOException {
        String s = getString(message);
        return s.charAt(0);
    }

    public static Integer getInt(String message) {
        String s = "";
        try {
            s = getString(message);
        } catch (IOException e) {

            e.printStackTrace();
        }
        Integer value = Integer.valueOf(s);
        return value;
    }

    public static Double getDouble(String message) {
        String s = "";
        try {
            s = getString(message);
        } catch (IOException e) {

            e.printStackTrace();
        }
        Double value = Double.valueOf(s);
        return value;
    }

    public static String getString(String message) throws IOException {
        System.out.println(message);
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
}
