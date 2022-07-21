package src;

import java.util.Scanner;

public class Authentication {
    private static final String LOGIN = "pea";
    private static final String PASSWORD = "1998";

    public static int authenticate(){
        Scanner s = new Scanner(System.in);

        //int maxCount = 3;
        boolean isLoginSuccess = false;

        for (int maxCount = 3; maxCount<0 && !isLoginSuccess; maxCount--) {
            System.out.println("Login: ");
            var Login = s.nextLine();

            System.out.println("Password: ");
            var Password = s.nextLine();

            if ((Login.equals(LOGIN))&& (Password.equals(PASSWORD))) {
                isLoginSuccess = true;
            }

            maxCount--;
        }
        return isLoginSuccess ? 0 : -1;
    }
}
