public class FlowerSort {

    public static int[] funcBouquet(int[] flowerStick, int random) {
        int[] answer = new int[flowerStick.length];

        int i = 0;
        int j = 1;
        int temp;

        while (i < random - 1) {
            if (flowerStick[i] <= flowerStick[j]) {
                if (j == random - 1) {
                    answer[i] = flowerStick[i];
                    i++;
                    j = i + 1;
                }
                j++;
            } else {
                temp = flowerStick[i];
                flowerStick[i] = flowerStick[j];
                flowerStick[j] = temp;
                j = i + 1;
            }

        }

        int k = random;
        int l = k + 1;

        while (k < flowerStick.length - 1) {
            if (flowerStick[k] >= flowerStick[l]) {
                if (l == flowerStick.length - 1) {
                    answer[k] = flowerStick[k];
                    k++;
                    l = k + 1;
                }
                l++;
            } else {
                temp = flowerStick[k];
                flowerStick[k] = flowerStick[l];
                flowerStick[l] = temp;
                l = k + 1;
            }
        }

        return answer;
    }

    public static void main(String... args) {

    }

}
