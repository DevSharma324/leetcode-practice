public class RomanToInteger {

    public int romanToInt(String s) {

        String[] r;
        int retVal = 0, curr = 0;

        r = s.split("");
        for (int j = r.length - 1; j >= 0; j--) {

            switch (r[j]) {
                case "I":
                    if (curr == 0) {
                        retVal += 1;

                    } else {
                        retVal -= 1;
                        curr = 1;

                    }

                    break;
                case "V":

                    retVal += 5;
                    curr = 1;

                    break;
                case "X":

                    if (curr <= 1) {
                        retVal += 10;
                        curr = 1;

                    } else {
                        retVal -= 10;
                        curr = 2;

                    }

                    break;
                case "L":

                    retVal += 50;
                    curr = 3;

                    break;
                case "C":

                    if (curr <= 3) {
                        retVal += 100;
                        curr = 3;

                    } else {
                        retVal -= 100;
                        curr = 4;

                    }

                    break;
                case "D":

                    retVal += 500;
                    curr = 5;

                    break;
                case "M":

                    retVal += 1000;
                    curr = 6;

                    break;
            }
        }

        System.out.println(retVal);
        return retVal;
    }
}
