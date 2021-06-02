package by.andervyd._1_procedural.loop.simple_loop._invert;

public class Ex01 {
    public static void main(String[] args) {

        String input = "123.5";
        double inputX2 = Double.valueOf(input);
        double inputX3 = Double.parseDouble(input);

        inputX2 *= 2;
        inputX3 *= 3;

        System.out.println("X2: " + inputX2
                       + "; X3: " + inputX3);
        // output: X2: 247.0; X3: 370.5
    }
}
