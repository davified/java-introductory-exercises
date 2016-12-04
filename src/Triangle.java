public class Triangle {
    public String drawOne() {
        String output = "*";
        return output;
    }

    public String drawHorizontalLine(int n) {
        String output;
        output = "";
        while (n > 0) {
            output += "*";
            n--;
        }
        return output;
    }

    public String drawVerticalLine(int n) {
        String output = "";
        while (n > 0) {
            output += "*\n";
            n--;
        }
        System.out.println(output);
        return output;
    }

    public String drawRightTriangle(int n) {
        String output = "";
        for (int i = 1; i <= n; i++) {
            String newLine = new String(new char[i]).replace("\0", "*");
            output += newLine + "\n";
        }
        return output;
    }
}
