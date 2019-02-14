package start;

public class jp2 {
    public static void main(String[] args) {
        String name, lastname, position;
        final String PESEL;
        char gender = 'M';
        double salary_net;
        boolean isRetired;

        // przypisanie
        name = "Adam";
        lastname = "Kowalski";
        position = "Developer";
        PESEL = "1234556654";
        salary_net = 10000;
        isRetired = false;
        // prezentacja
        System.out.printf("%10s | %10s | %12s | %12s | %2s | %8.2fzł | %b ",  name, lastname, position, PESEL, gender, salary_net, isRetired);
        System.out.println(name + " " + lastname + " ");

    }





}
