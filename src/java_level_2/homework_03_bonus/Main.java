package java_level_2.homework_03_bonus;

import java.util.Scanner;
//Необходимо из консоли считать пароль и проверить валидность,
//        результат будет true или false
//
//        Требования:
//        1. Пароль должен быть не менее 8ми символов.
//        2. В пароле должно быть число
//        3. В пароле должна быть хотя бы 1 строчная буква
//        4. В пароле должна быть хотя бы 1 заглавная буква
public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String pwd;
        do {
            System.out.println("Enter password: ");
            pwd = myScanner.nextLine();
        } while (!isValid(pwd));
    }

    public static boolean isValid(String pwd){
        boolean thereIsDigit=false;
        boolean thereIsUpper=false;
        boolean thereIsLower=false;
        if(pwd.length()<8){
            System.out.println("Password must be at least 8 characters long");
            return false;
        }
        for(int i=0;i<pwd.length();i++){
            if(Character.isDigit(pwd.charAt(i))){
                thereIsDigit=true;
            }
            if(Character.isUpperCase(pwd.charAt(i))){
                thereIsUpper=true;
            }
            if(Character.isLowerCase(pwd.charAt(i))){
                thereIsLower=true;
            }
        }
        if(thereIsDigit&&thereIsLower&&thereIsUpper) {
            System.out.println("Password is valid.");
            return true;
        } else {
            System.out.println("Password must contain digit, lower case character and upper case character!");
            return false;
        }
    }
}
