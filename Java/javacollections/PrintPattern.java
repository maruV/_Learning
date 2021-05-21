public class PrintPattern {

    public static void PT(int k) {
        int num = 1;
        int i = 1;
        int count = 0;

        String str = "";

        while (i <= k) {
            str += num + " ";
            count++;

            if (count >= i) {
                System.out.println(str);
                i++;
                str = "";
                count = 0;
            }

            num++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Yo VS Code!");
        PT(5);
    }
}