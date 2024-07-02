import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ClassLevel {
    public static void main(String[] args) {
        UserManager.handleUserData();
    }
}

class UserManager {
    public static void handleUserData() {
        var userData = processUserData(List.of("user1", "user2"));
        saveUserData(userData, "path/file.txt");
        EmailService.sendMail("iletisim@emrecogalan.com");
    }

    private static List<String> processUserData(List<String> userData) {
        for (int i = 0; i < userData.size(); i++) {
            userData.set(i, userData.get(i).toUpperCase());
        }

        return userData;
    }

    private static void saveUserData(List<String> userData, String filePath) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(filePath);
            for (String data : userData) {
                writer.write(data + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

class EmailService {
    static void sendMail(String email) {
        System.out.println("Sending email to " + email);
    }
}
