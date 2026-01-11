class Solution {
    public int maximalRectangle(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1 && cols == 1)
            return matrix[0][0] == '1' ? 1 : 0;

        int[] height = new int[cols + 1];   // histogram heights
        int[] stack = new int[cols + 1];    // monotonic stack
        int maxArea = 0;

        for (int i = 0; i < rows; i++) {
            int top = 0;
            stack[0] = -1;  // sentinel

            for (int j = 0; j <= cols; j++) {

                // build histogram
                if (j == cols || matrix[i][j] == '0')
                    height[j] = 0;
                else
                    height[j]++;

                // pop while stack is decreasing
                while (top > 0 && (j == cols || height[j] < height[stack[top]])) {
                    int m = stack[top--];            // pop
                    int width = j - stack[top] - 1; // width
                    maxArea = Math.max(maxArea, height[m] * width);
                }

                stack[++top] = j; // push
            }
        }
        return maxArea;
    }
}
