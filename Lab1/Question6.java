public class Question6 {

    private String str;

    public Question6() {

    }

    public Question6(String str) {
        this.str = str;
    }

    public int Length() {
        int len = str.length();
        return len;
    }

    public int Count() {
        if (str.isEmpty()) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
                while (str.charAt(i) != ' ' && i < str.length() - 1) {
                    i++;
                }
            }
        }
        return count;
    }

    public void AddString(String k) {
        System.out.println(str + k);
    }

    public String ReverseString(String n) {
        String c = "";
        for (int i = n.length()-1; i >= 0; i--) {
            c = c + n.charAt(i);
        }
        return c;
    }
}
