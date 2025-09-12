class Solution {
    public int romanToInt(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    count += 4;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    count += 9;
                    i++;
                } else {
                    count += 1;
                }
            } else if (c == 'V') {
                count += 5;
            } else if (c == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    count += 40;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    count += 90;
                    i++;
                } else {
                    count += 10;
                }
            } else if (c == 'L') {
                count += 50;
            } else if (c == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    count += 400;
                    i++;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    count += 900;
                    i++;
                } else {
                    count += 100; 
                }
            } else if (c == 'D') {
                count += 500;
            } else if (c == 'M') {
                count += 1000;
            }
        }
        return count;
    }
}
