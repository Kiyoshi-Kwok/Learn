package com.learn.basis;

public class GPS {
    String rawInput;
    String[] divided;
    char[] letters;

    public GPS(String input) {
        rawInput = input;
        letters = rawInput.toCharArray();
        divided = rawInput.split("\\,");
    }

    public String getRawInput() {
        return rawInput;
    }

    public String getType() {
        return divided[0];
    }

    public String getValidationKey() {
        char[] lastPart = divided[divided.length - 1].toCharArray();
        boolean signal = false;
        String key = "";
        for (int i = 0; i < lastPart.length; i ++) {
            if (signal == true) key += lastPart[i];
            if (lastPart[i] == 42) signal = true;
        }
        return key;
    }

    public boolean validate() {
        char[] isLocated = divided[2].toCharArray();
        if (isLocated[0] == 86) return false;
        int sum = 0;
        for (int i = 1; i < letters.length; i ++) {
            sum ^= letters[i];
            if (letters[i + 1] == 42) break;
        }
        return (Integer.parseInt(getValidationKey(),16) == sum);
    }

    public String getBST() {
        char[] UTCTime = divided[1].toCharArray();
        int hour = Integer.parseInt(Character.toString(UTCTime[0]) + Character.toString(UTCTime[1]));
        int minute = Integer.parseInt(Character.toString(UTCTime[2]) + Character.toString(UTCTime[3]));
        int second = Integer.parseInt(Character.toString(UTCTime[4]) + Character.toString(UTCTime[5]));
        int temp = hour + 8;
        if (temp >= 24) temp -= 24;
        return String.format("%02d:%02d:%02d", temp, minute, second);
    }
}
