public class PrintDiamonds {

    public void printD(int k) {

        String star = "*";
        String spc = " ";

        int stringLength = (2 * k) - 1;
        int midIndex = (stringLength / 2);

        StringBuilder sb = new StringBuilder();
        sb.ensureCapacity(stringLength);

        int left = midIndex - 1;
        int right = midIndex + 1;

        sb.insert(midIndex, star);
        int starcount = 1;
        int currentLength = 1;
        int rowcount = 1;

        while (rowcount <= k) {
            if (starcount >= (2 * rowcount) - 1) {
                sb.insert(left, spc);
                sb.insert(right, spc);
            } else {
                sb.insert(left, star);
                sb.insert(right, star);
            }

            currentLength += 2;

            if (currentLength >= stringLength) {
                System.out.println(sb);
                rowcount++;
                left = midIndex - 1;
                right = midIndex + 1;
            }

            left--;
            right++;

        }

    }

    public static void main(String... args) {

        PrintDiamonds d = new PrintDiamonds();

        d.printD(2);
    }
}