class Solution {
    public int calPoints(String[] operations) {
        int[] s = new int[operations.length];
        int i = 0;
        for (String op : operations) {
            switch (op) {
                case "C": i--; break;
                case "D": s[i] = 2 * s[i-1]; i++; break;
                case "+": s[i] = s[i-1] + s[i-2]; i++; break;
                default: s[i++] = Integer.parseInt(op);
            }
        }
        int sum = 0;
        for (int k = 0; k < i; k++) sum += s[k];
        return sum;

    }
}