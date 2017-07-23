package CP3;

import java.util.Random;

/**
 * Created by 10235 on 2017/7/22.
 */
public class Shuffle_Cards {
    public static void shuffleCard(int[] cards) {
        if (cards == null || cards.length == 0) return;
        Random rand = new Random();
        for (int i = 0; i < cards.length; i++) {
            int k = rand.nextInt(i + 1); // 0~i (inclusive)
            int temp = cards[i];
            cards[i] = cards[k];
            cards[k] = temp;
        }
    }


    public static int[] randomSample(int[] nums, int m) {
        if (nums == null || nums.length == 0 || m <= 0) return new int[]{};
        int[] sample = new int[m];
        for (int i = 0; i < m; i++) {
            sample[i] = nums[i];
        }
        Random random = new Random();

        for (int i = m; i < nums.length; i++) {
            int k = random.nextInt(i + 1); // 0~i(inclusive)
            if (k < m) {
                sample[k] = nums[i];
            }
        }
        return sample;
    }

    public static void main(String[] args) {
        int[] cards = new int[10];
        for (int i = 0; i < 10; i++) {
            cards[i] = i;
        } // 100000 times test
        final int times = 100000;
        final int m = 5;
        int[][] count = new int[cards.length][cards.length];
        int[][] count2 = new int[cards.length][m];
        for (int i = 0; i < times; i++) {
            shuffleCard(cards);
            shuffleTest(cards, count);
            int[] sample = randomSample(cards, m);
            shuffleTest(sample, count2);
        }
        System.out.println("Shuffle cards");
        shufflePrint(count);
        System.out.println();
        System.out.println("Random sample");
        shufflePrint(count2);
    }

    public static void shuffleTest(int[] nums, int[][] count) {
        if (nums == null || nums.length == 0) return;
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]][i]++;
        }
    }

    public static void shufflePrint(int[][] count) {
        if (count == null || count.length == 0) return;
// print index
        System.out.print(" ");
        for (int i = 0; i < count[0].length; i++) {
            System.out.printf("%-7d", i);
        }
        System.out.println();
// print num appear in index i in total
        for (int i = 0; i < count.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < count[i].length; j++) {
                System.out.printf("%-7d", count[i][j]);
            }
            System.out.println();
        }
    }
}
