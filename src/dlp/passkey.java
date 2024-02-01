package dlp;

import java.util.Random;

public class passkey {
        public int key() {
        Random random = new Random();
        int randomFourDigitNumber = 1000 + random.nextInt(9000);
        return randomFourDigitNumber;
    }
}
