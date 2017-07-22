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
}
