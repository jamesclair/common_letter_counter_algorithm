package org.example;

class CommonLetterCounter {
    private String s1;
    private String s2;
    private static final int SIZE_OF_ALPHABET = 26;
    private static final int ASCII_OFFSET = 'a';
    int[] letterCountsS1 = new int[SIZE_OF_ALPHABET];
    int[] letterCountsS2 = new int[SIZE_OF_ALPHABET];

    public CommonLetterCounter(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
        setLetterCounts();
    }

    private void setLetterCounts() {
        for (char letter: s1.toCharArray()) {
            letterCountsS1[letter - ASCII_OFFSET]++;
        }
        for (char letter: s2.toCharArray()) {
            letterCountsS2[letter - ASCII_OFFSET]++;
        }
    }

    public int getSumOfCommonLetters() {
        int sum = 0;
        for (int i = 0; i < SIZE_OF_ALPHABET; i++) {
            sum += Math.min(letterCountsS1[i], letterCountsS2[i]);
        }
        return sum;
    }

}
