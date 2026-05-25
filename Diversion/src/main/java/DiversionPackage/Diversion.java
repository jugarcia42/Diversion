package DiversionPackage;

class Diversion {

    static String[] getAllCombinations(int input) {

        int total = (int) Math.pow(2, input);
        String[] combinations = new String[total];

        for (int i = 0; i < total; i++) {

            String binary = Integer.toBinaryString(i);

            while (binary.length() < input) {
                binary = "0" + binary;
            }

            combinations[i] = binary;
        }

        return combinations;
    }

    static boolean twoOnesInARow(String input) {
        if (input.contains("11")){
            return true;
        }
        return false;
    }

    static int CountNumberOfCombinationsThatDontMeetCondition(String[] input) {
        int arrayLength = input.length;
        int count = 0;
        if (arrayLength > 2) {
            for (String s : input) {
                if (!twoOnesInARow(s)) {
                    count++;
                }
            }
        }
        return count;
    }
    static int diversion(int input){
        String[] combinations = getAllCombinations(input);
        return CountNumberOfCombinationsThatDontMeetCondition(combinations);

    }
}