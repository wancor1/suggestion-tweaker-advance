package velizarbg.suggestion_tweaker;

public final class Initials {
    private Initials() {}

    public static boolean matches(String query, String candidate) {
        if (query.length() < 2) return false;
        int start = candidate.indexOf(':') + 1;
        if (query.length() > candidate.length() - start) return false;
        boolean[] reachable = new boolean[query.length()];
        reachable[0] = true;
        while (start < candidate.length()) {
            if (isSeparator(candidate.charAt(start))) {
                start++;
                continue;
            }
            int end = start + 1;
            while (end < candidate.length() && !isSeparator(candidate.charAt(end))) end++;
            // Walk backwards so a single word cannot supply two separate prefixes.
            for (int offset = query.length() - 1; offset >= 0; offset--) {
                if (!reachable[offset]) continue;
                int length = Math.min(end - start, query.length() - offset);
                for (int i = 0; i < length && candidate.charAt(start + i) == query.charAt(offset + i); i++) {
                    int next = offset + i + 1;
                    if (next == query.length()) return true;
                    reachable[next] = true;
                }
            }
            start = end;
        }
        return false;
    }

    private static boolean isSeparator(char c) {
        return c == '_' || c == '-' || c == '.' || c == '/';
    }
}
