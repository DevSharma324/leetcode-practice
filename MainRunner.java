public class MainRunner {

    public static final int objNum = 2;

    public static void main(String[] args) {
        try {
            switch (objNum) {
                case 1:
                    RomanToInteger obj1 = new RomanToInteger();
                    String s = "MCMXCIV";
                    obj1.romanToInt(s);
                    break;

                case 2:
                    CreateMaximumNumber obj2 = new CreateMaximumNumber();
                    obj2.maxNumber(new int[]{3, 4, 6, 5}, new int[]{9, 1, 2, 5, 8, 3}, 5);
                    break;

                case 3:

                    break;

                default:
                    throw new IllegalStateException("Unexpected value: " + objNum);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
