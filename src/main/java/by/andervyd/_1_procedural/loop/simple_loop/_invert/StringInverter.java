package by.andervyd._1_procedural.loop.simple_loop._invert;

public class StringInverter {

    public static String  invert(String string) {
        char[] data = string.toCharArray();
        for (int i = 0; i < data.length / 2; i++) {
            char tmp = data[i];
            data[i] = data[data.length - 1 - i];
            data[data.length - 1 - i] = tmp;
        }
        return string = String.valueOf(data);
    }

    public static void main(String[] args) {

        String text = "0123456789";
        System.out.println(text);
        // output: 0123456789

        System.out.println("===============");

        text = invert(text);
        System.out.println(text);
        // output: 9876543210
    }
}
