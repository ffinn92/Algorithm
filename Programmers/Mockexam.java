public class Mockexam {
    public int[] solution(int[] answers) {
        int[] omr = answers;

        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[] oneOmr = new int[omr.length];
        int[] twoOmr = new int[omr.length];
        int[] threeOmr = new int[omr.length];

        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;

        inputOmr(one, oneOmr);
        inputOmr(two, twoOmr);
        inputOmr(three, threeOmr);

        oneCount = checkOmr(omr, oneOmr, oneCount);
        twoCount = checkOmr(omr, twoOmr, twoCount);
        threeCount = checkOmr(omr, threeOmr, threeCount);

        int[] answer = new int[0];

        if (oneCount > twoCount && oneCount > threeCount) {
            answer = new int[]{1};
        } else if (twoCount > oneCount && twoCount > threeCount) {
            answer = new int[]{2};
        } else if (threeCount > oneCount && threeCount > twoCount) {
            answer = new int[]{3};
        } else if (oneCount > threeCount && twoCount > threeCount && oneCount == twoCount) {
            answer = new int[]{1, 2};
        } else if (oneCount > twoCount && threeCount > twoCount && oneCount == threeCount) {
            answer = new int[]{1, 3};
        } else if (twoCount > oneCount && threeCount > oneCount && twoCount == threeCount) {
            answer = new int[]{2, 3};
        } else if (oneCount == twoCount && oneCount == threeCount) {
            answer = new int[]{1, 2, 3};
        }

        return answer;
    }

    private int checkOmr(int[] omr, int[] oneOmr, int oneCount) {
        for (int i = 0; i < omr.length; i++) {
            if (omr[i] == oneOmr[i]) {
                oneCount++;
            }
        }
        return oneCount;
    }

    private void inputOmr(int[] one, int[] oneOmr) {
        for (int i = 0; i < oneOmr.length; i++) {
            int n = i % one.length;
            oneOmr[i] = one[n];
        }
    }
}
