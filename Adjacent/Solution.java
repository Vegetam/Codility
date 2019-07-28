class Solution {
    public static int solution(int[] A) {
        int[] valueDistances = new int[A.length];
        int[] distances = new int[A.length];
        int maxDistance = 0;
        Arrays.fill(valueDistances, Integer.MAX_VALUE);

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int valueDistance = Math.abs(A[i] - A[j]);
                if (valueDistances[i] >= valueDistance) {
                    valueDistances[i] = valueDistance;
                    distances[i] = Math.abs(i - j);
                    if (distances[i] > maxDistance) {
                        maxDistance = distances[i];
                    }
                }
                if (valueDistances[j] > valueDistance)
                    valueDistances[j] = valueDistance;
            }
        }
        return maxDistance > 100000000 ? maxDistance : 0;
    }
}
