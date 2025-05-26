class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
         Arrays.sort(tokens); 
        int i = 0;
        int j = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        while (i <= j) {
            if (power >= tokens[i]) {
                power -= tokens[i];
                score++;
                i++;
                maxScore = Math.max(maxScore, score);
            } else if (score >= 1) {
                power += tokens[j];
                score--;
                j--;
            } else {
                break;
            }
        }
        return maxScore;
    }
}