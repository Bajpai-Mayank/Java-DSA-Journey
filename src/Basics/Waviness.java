package Basics;

public class Waviness {
    public static void main(String[] args) {
        Waviness obj = new Waviness();
        System.out.print("Total waviness : " + obj.totalWaviness(198, 202));
    }

    public int totalWaviness(int num1, int num2) {
        int waviness = 0;
        int[] digit = new int[10];
        int len = 0;
        for (int i = num1; i <= num2; i++) {
            int temp = i;
            len = 0;
            while (temp > 0) {
                digit[len] = temp % 10;
                temp /= 10;
                len++;
            }
            for (int j = 1; j < len - 1; j++) {
                //peak value
                if (digit[j - 1] < digit[j] && digit[j] > digit[j + 1] ||
                        digit[j - 1] > digit[j] && digit[j] < digit[j + 1]) {
                    waviness++;
                }
            }
        }
        return waviness;
    }
}
