class Solution {

    public long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0L;
        Arrays.sort(happiness);
        int dec = 0;
        for (int i = happiness.length - 1; i >= 0; i--) {
            sum += Math.max(0, happiness[i] - dec);
            dec++;
            k--;
            if (k == 0) {
                break;
            }
        }
        return sum;
    }
}