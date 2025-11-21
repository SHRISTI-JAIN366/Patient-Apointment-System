package MINI_PROJECTS_1;
import MINI_PROJECTS_1.MP22;
import MINI_PROJECTS_1.MP33;

import java.util.Scanner;

        public class MP11 {
        public static void main(String[] args) {
            startScreen();
            MP22.login_signup();
            MP33.mainpage();
        }
        public static void startScreen(){
            Scanner sc=new Scanner(System.in);
            System.out.println("===========================");
            System.out.println(" WELCOME TO PATIENT APPOINTMENT APP");
            System.out.println("=============================");
            System.out.println("TYPE START TO START THE PAGE");
            while (true){
                System.out.println("ENTER HERE:");
                String input= sc.nextLine();

            if(input.equals("START")){
                System.out.println("\\nSystem Starting...\\n");
                break;
            }
            else {
                System.out.println("Wrong input! Please type 'start' to continue.");
            }
            }
            }
            }






