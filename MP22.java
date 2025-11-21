package MINI_PROJECTS_1;

import java.util.Scanner;

public class MP22 {

        // store signup data
        static String firstname;
        static String lastname;
        static String username;
        static int password;

        public static void login_signup(){
            Scanner sc =new Scanner(System.in);
            System.out.println("login");
            System.out.println("signup");
            String log =sc.nextLine();

            //=================SIGNUP+LOGIN=======================//
        if (log.equals("signup")){
            System.out.println("first name");
            String firstname = sc.nextLine();
            System.out.println("last  name");
            String lastname = sc.nextLine();
            System.out.println("user name");
            username=sc.nextLine();
            System.out.println("creates password(only numbers)");
            password=sc.nextInt();
            sc.nextLine();
            System.out.println("✔ Signup successful!");
            System.out.println("Your password is: " + password);
        }
        else if (log.equals("login")){
            System.out.println("user name");
            String user = sc.nextLine();
            System.out.println("your password");
            int passinput =sc.nextInt();
            sc.nextLine();
            if (user.equals(username)&& password==passinput) {
                System.out.println("Login Successful! Welcome ");
            }
            else{
                    System.out.println("incorrect username and password");
                }
            }
            else{
                    System.out.println("invalid  try again");
                }

            }
        }




