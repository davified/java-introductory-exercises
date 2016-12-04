import java.util.ArrayList;

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

    public String drawIsoscelesTriangle(int n) {
        String output = "";
        int i = 1;
        while (n > 0) {
            String sideString = new String(new char[n-1]).replace("\0", " ");
            String starString = new String(new char[i*2 - 1]).replace("\0", "*");
            output += sideString + starString + sideString + "\n";
            n--;
            i++;
        }
        return output;
    }

    public String drawDiamondTriangle(int n) {
        String output = "";
        String finalOutput = "";
        ArrayList<String> stringSequence = new ArrayList<String>();
        int i = 1;
        while (n > 0) {
            String sideString = new String(new char[n-1]).replace("\0", " ");
            String starString = new String(new char[i*2 - 1]).replace("\0", "*");
            output = sideString + starString + sideString + "\n";
            stringSequence.add(output);
            n--;
            i++;
        }

        for (int j = stringSequence.size() - 2; j >= 0; j--) {
            stringSequence.add(stringSequence.get(j));
        }

        for (String s: stringSequence) {
            finalOutput += s;
        }

        return finalOutput;
    }

    public String drawDiamondTriangleWithName(int n, String name) {
        String tempString = drawDiamondTriangle(n);
        String lineToBeReplaced = new String(new char[n*2 - 1]).replace("\0", "*");
        String output = tempString.replace(lineToBeReplaced, name);
        return output;
    }
}
