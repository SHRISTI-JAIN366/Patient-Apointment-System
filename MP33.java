package MINI_PROJECTS_1;

import java.util.Scanner;

public class MP33 {
    public static void mainpage(){
        Scanner sc =new Scanner(System.in);
        System.out.println("patient appointment case");
        System.out.println("accident case or emergency case");
        String input=sc.nextLine();
        if (input.equals("accident case")){
            System.out.println("enter the full name");
            String name=sc.nextLine();
            System.out.println("emergency!accident is case is registered ");
            System.out.println("enter the location");
            String loc= sc.nextLine();
            System.out.println("call the ambulance");
            System.out.println("patient is pick up at 5 minutes");
        }
        if(input.equals("patient appointment case")){
            System.out.println("first name");
            String first = sc.nextLine();
            System.out.println("last name");
            String last = sc.nextLine();
            System.out.println("choose doctors list:\n"+ "Physician\n"
                    +"1.Cardiologist\n"
                    +"2.Pulmonologist\n"
                    +"3.Gastroenterologist\n"
                    +"4.Nephrologist\n"
                    +"5.Neurologist\n"
                    +"6.Dermatologist\n"
                    +"7.Orthopedic Surgeon\n"
                    +"8.Psychiatrist\n"
                    +"9.Dentist\n");
            String doctor= sc.nextLine();
            System.out.println("choose the hospitals:\n"
                    +"1.City Hospital"
                    +"2.Global Health Care\n"
                    +"3.Sunrise Medical Center\n"
                    +"4.Apollo Hospital\n"
                    +"5.Fortis Hospital\n");
            String hospital= sc.nextLine();
            System.out.println("choose the timing:\n"+
                    "1.9:00 AM - 10:00 AM\n"
                    +"2.10:00 AM - 11:00 AM\n"
                    +"3.11:00 AM - 12:00 PM\n"
                    +"4.1:00 PM - 2:00 PM\n"
                    +"5.3:00 PM - 4:00 PM\n");
            String timing =sc.nextLine();
            System.out.println("script of the medicine:\n"+
                    "1.Paracetamol\n"
                   +"2.Ibuprofen\n"
                    +"3.Amoxicillin\n"
                    +"4.Vitamin D Tablets\n"
                    +"5.Cough Syrup\n"
                    +"6.Antibiotic Course\n");
            String medicine =sc.nextLine();
            System.out.println("choose the rooms:"+
                    "1.General Ward\n"
                    +"2.Semi-Private Room\n"
                    +"3.Private Room\n"
                    +"4.Luxury Room\n"
                    +"5.ICU (Intensive Care Unit)\n"
                    +"6.NICU (Neonatal ICU)\n"
                    +"7.Emergency Room\n"
                    +"8.Surgery Room\n"
                    +"9.Recovery Room\n");
            String rooms=sc.nextLine();
            System.out.println("choose the dates:"+
                    "1.17-11-2025"
                    +"2.18-11-2025\n"
                    +"3.19-11-2025\n"
                    +"4.20-11-2025\n"
                    +"5.21-11-2025\n");
            String date=sc.nextLine();

        // FINAL SUMMARY
        System.out.println("\n===== APPOINTMENT CONFIRMED =====");
        System.out.println("Patient Name       : " + first + " " + last);
        System.out.println("Doctor Selected    : " + doctor);
        System.out.println("Hospital Selected  : " + hospital);
        System.out.println("Timing             : " + timing);
        System.out.println("Medicine Given     : " + medicine);
        System.out.println("Room Selected      : " + rooms);
        System.out.println("Appointment Date   : " + date);
        System.out.println("=================================");
    }
        }
    }

