public class Main {

    public static void main(String[] args) {

        LoginAndPass first = new LoginAndPass("tamara2_", "hahaha", "hahaрha");

        try {
            LoginAndPass.IsLogPassTrue(first.getLogin(), first.getPassword(), first.getConfirmPassword());
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }



    }
}