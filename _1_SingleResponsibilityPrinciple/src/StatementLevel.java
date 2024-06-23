public class StatementLevel {
    public static void main(String[] args) {
        var name = "Emre";
        var age = 29;

        // SRP öncesi
        var result = name.equals("Ahmet") ? age < 18 ? false : true : name.equals("Emre") ? age < 24 ? true : false : false;

        // SRP sonrası
        switch (name) {
            case "Ahmet":
                result = age >= 18;
                break;
            case "Emre":
                result = age < 24;
                break;
            default:
                result = false;
                break;
        }
    }
}