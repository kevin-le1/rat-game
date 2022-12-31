public class reverse {
    public static int reverse(double x) {
        if (x == 0) return 0;

        if (x > 0) {
            String newThing = "";
            String length = Double.toString(x);
            for (int i = 0; i < length.length(); i++) {
                newThing += Character.toString(length.charAt(length.length() - 1 - i));
            }
            int newValue = Integer.parseInt(newThing);
            if (newValue > Math.pow(2, 31) - 1 || newValue < -Math.pow(2, 31)) newValue = 0;
            return newValue;
        }
        else {
            String newThing = "";
            String length = Double.toString(x);
            for (int i = 0; i < length.length() - 1; i++) {
                newThing += Character.toString(length.charAt(length.length() - 1 - i));
            }
            int newValue = Integer.parseInt(newThing);
            if (newValue > Math.pow(2, 31) - 1 || newValue < -Math.pow(2, 31)) newValue = 0;
            return newValue * -1;
        }

    }


    public static void main(String[] args) {
        double x = 19923191;
        System.out.println(reverse(x));
    }
}


