class Solution {
    public String oddString(String[] words) {
        String d0 = getDiff(words[0]);
        String d1 = getDiff(words[1]);
        String d2 = getDiff(words[2]);

        if (d0.equals(d1)) {
            for (int i = 2; i < words.length; i++) {
                if (!getDiff(words[i]).equals(d0)) {
                    return words[i];
                }
            }
            return words[0];
        } else {
            return d0.equals(d2) ? words[1] : words[0];
        }
    }

    private String getDiff(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            sb.append(s.charAt(i) - s.charAt(i - 1)).append(",");
        }
        return sb.toString();
    }
}