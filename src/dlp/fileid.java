package dlp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class fileid{

    public int generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        int num=0;
        final String url = "jdbc:mysql://localhost:3306/dlp";
        final String user = "root";
        final String password = "";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM fileid";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                num=resultSet.getInt("prevnum");
            }
            
            sql="UPDATE fileid SET PREVNUM=? WHERE PREVNUM=?";
            PreparedStatement preparedStatement2 = conn.prepareStatement(sql);
            preparedStatement2.setInt(1, randomNumber+num);
            preparedStatement2.setInt(2,num);
            int resultSet2 = preparedStatement2.executeUpdate();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return randomNumber+num;
    }

    
}
