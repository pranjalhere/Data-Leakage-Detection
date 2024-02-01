package dlp;

import org.mindrot.jbcrypt.BCrypt;

public class passwordmanager {

    // Hashing cost factor - You can adjust this based on your security requirements
    private  final int COST_FACTOR = 12;

    public  String encryptPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt(COST_FACTOR));
    }

    public  boolean verifyPassword(String password, String hashedPassword) {
        return BCrypt.checkpw(password, hashedPassword);
    }

}
