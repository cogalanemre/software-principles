import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class MethodLevel {
    public static void main(String[] args) {
        //SRP prensibini uygulamadığımız metod
        processAndSaveUserData(List.of("user1", "user2"), "path/file.txt", true, "iletisim@emrecogalan.com");

        //SRP prensibini uyguladığımız metod
        handleUserData();
    }

    public static void processAndSaveUserData(List<String> userData, String filePath, boolean shouldSendEmail, String email) {
        // Verileri işleme
        for (int i = 0; i < userData.size(); i++) {
            userData.set(i, userData.get(i).toUpperCase());
        }

        // Verileri dosyaya kaydetme
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

        // E-posta gönderme
        if (shouldSendEmail) {
            System.out.println("Sending email to " + email);
        }
    }

    public static void handleUserData() {
        var userData = processUserData(List.of("user1", "user2"));
        saveUserData(userData, "path/file.txt");
        sendMail("iletisim@emrecogalan.com");
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

    private static void sendMail(String email) {
        System.out.println("Sending email to " + email);
    }
}