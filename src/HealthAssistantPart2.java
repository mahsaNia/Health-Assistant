
//********************************* NEW CODE *******************************************************
//***************************************************************************************************

import java.util.ArrayList;
import java.util.Scanner;

public class HealthAssistantPart2
{
    public static ArrayList<Patient> patients = new ArrayList<>() ;
    public static PatientManager patientManager = new PatientManager() ;
    public static ServantManager servantManager = new ServantManager();
    public static AdministratorManager administratorManager = new AdministratorManager();
    public static  ArrayList<Medicine> medicines = new ArrayList<>() ;
    public static  ArrayList<String> approveEquipment = new ArrayList<>(); // برای درخواست تجهیزات های تایید شده
    public static ArrayList<Doctor> doctors = new ArrayList<>();
    public static ArrayList<Servant> servants = new ArrayList<>();
    public static ArrayList<Guard> guards = new ArrayList<>();
    public static ArrayList<LogInLogOutTime> guardDailyList = new ArrayList<>(); // لیست ورود خروج روزانه
    public static ArrayList<LogInLogOutTime> guardWeeklyList = new ArrayList<>(); // لیست زمان ورود خروج هفتگی
    public static ArrayList<Secretary> secretaries = new ArrayList<>();
    public static DoctorManager doctorManager = new DoctorManager();
    public static GuardManager guardManager = new GuardManager();
    public static SecretaryManager secretaryManager = new SecretaryManager();
    public  static ArrayList<Appointment> dailyAppointments = new ArrayList<>() ; // لیست نوبت های روزانه منشی
    public  static ArrayList<Appointment> weeklyAppointments = new ArrayList<>() ; // لیست نوبت های هفتگی منشی
    public static ArrayList<Prescription> prescriptions = new ArrayList<>() ;



    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int user_type ;
        AdministratorPanel administratorPanel = new AdministratorPanel() ;
        ServantPanel servantPanel = new ServantPanel();
        DoctorPanel doctorPanel = new DoctorPanel();
        PatientPanel patientPanel = new PatientPanel();
        GuardPanel guardPanel = new GuardPanel();
        SecretaryPanel secretaryPanel = new SecretaryPanel();
        do
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println("^^^^^^^^^^Welcome to the health assistant system!^^^^^^^^^^");
            System.out.println("-------------------------------------------------------------");
            System.out.println("\tMenu");
            System.out.println(" 1) Administrator login\n 2) Patient login\n 3) Doctor login\n 4) Secretary login\n" +
                    " 5) Servant login\n 6) Guard login\n 7) Exit");
            System.out.print("\tEnter your choice ----> ");
            user_type = input.nextInt() ;

            switch (user_type)
            {
                case 1 :  // Administrator login
                {
                    administratorPanel.administratorMenu1();
                    break;
                }

                case 2 : // Patient login
                {
                    patientPanel.patientMenu1();
                    break;
                }

                case 3 : // Doctor login
                {
                   doctorPanel.doctorMenu1();
                   break;
                }

                case 4 : // Secretary login
                {
                    secretaryPanel.secretaryMenu1();
                   break;
                }

                case 5 : // Servant login
                {
                    servantPanel.servantMenu1();
                    break;
                }

                case 6 : // Guard login
                {
                    guardPanel.guardMenu1();
                    break;
                }

            }

        }while (user_type != 7) ; // Exit

    }
}


class Menu
{
    Scanner input = new Scanner(System.in);
    int login_type ;

    public int enter () // متد نوع ورود
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" 1) sign in            2) log in\n");
        System.out.print("\tEnter your choice ----> ");
        this.login_type = input.nextInt() ;
        return login_type ;
    }

    public int patientMenu()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) Edit Info\n 2) View the doctors' list and Make an appointment\n " +
                " 3) View the list of prescription\n 4) view the list of appointments\n 5) Log out") ;
        System.out.print("\tEnter your choice ----> ");
        int patientChoice = input.nextInt() ;
        return patientChoice ;
    }

    public int adminMenu1()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) Manage the days\n 2) Add employee\n 3) Add medicine\n" +
                " 4) Check the request to add equipment\n 5) Check the list of hospital breakdown\n" +
                " 6) Employee suspension\n 7) log out");
        System.out.print("\tEnter your choice ----> ");
        int administratorChoice = input.nextInt() ;
        return administratorChoice ;
    }

    public int adminMenu2() // استخدام کدام کارمند؟
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWho do you want to add ?");
        System.out.println(" 1) Add doctor\n 2) Add servant\n 3) Add guard\n 4) back");
        System.out.print("\tEnter your choice ----> ");
        int administratorChoice = input.nextInt() ;
        return administratorChoice;
    }

    public int doctorMenu()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) Add secretary\n 2) patient information\n 3) prescribe\n 4) View the list of drugs\n " +
                " 5) Receive daily salary according to the number of daily appointments\n" +
                " 6) Receive a monthly salary\n 7) View a list of days spent at work\n" +
                " 8) Estimation of monthly salary in terms of daily income\n 9) log out");
        System.out.print("\tEnter your choice ----> ");
        int doctorChoice = input.nextInt() ;
        return doctorChoice ;
    }

    public int secretaryMenu() // منشی
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) Manage patient lists\n 2) Arrange the order of patients' arrival\n " +
                " 3) Receive a monthly salary\n 4) View a list of days spent at work\n 5) log out");
        System.out.print("\tEnter your choice ----> ");
        int secretaryChoice = input.nextInt();
        return secretaryChoice;
    }

    public int servantMenu() // مستخدم
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) Report breakdown to the administrator\n 2) Request equipment from the administrator\n" +
                " 3) Receive a monthly salary\n 4) View a list of days spent at work\n 5) log out");
        System.out.print("\tEnter your choice ----> ");
        int  servantChoice = input.nextInt();
        return servantChoice;
    }

    public int guardMenu() // نگهبان
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\tWhat do you want to do?");
        System.out.println(" 1) list of daily arrival and departure times of employees\n" +
                " 2) list pf weekly arrival and departure times of employees\n" +
                " 3) Receive a monthly salary\n 4) View a list of days spent at work\n 5) log out");
        int guardChoice = input.nextInt();
        return guardChoice;
    }
}




class Appointment implements Comparable // نوبت
{
    private int  appointmentNumber ; // شماره نوبت
    // تاریخ نوبت
    int year ;
    int month ;
    int dayDate ;
    private String appointmentTime ; // زمان نوبت
    private int doctorPersonnelID ;
    private int patientFileNumber ;
    boolean emergency ; // اورژانسی است یا خیر
    public static int number1 = 1 ; // شماره نوبت کلی


    public Appointment(int appointmentNumber, int year, int month, int dayDate, String appointmentTime,
                       int doctorPersonnelID, int patientFileNumber)
    {
        number1 ++ ;
        this.appointmentNumber = appointmentNumber;
        this.year = year;
        this.month = month;
        this.dayDate = dayDate;
        this.appointmentTime = appointmentTime;
        this.doctorPersonnelID = doctorPersonnelID;
        this.patientFileNumber = patientFileNumber;
    }

    public Appointment(int year, int month, int dayDate, String appointmentTime, int doctorPersonnelID, int patientFileNumber)
    {
        this.year = year;
        this.month = month;
        this.dayDate = dayDate;
        this.appointmentTime = appointmentTime;
        this.doctorPersonnelID = doctorPersonnelID;
        this.patientFileNumber = patientFileNumber;
    }

    public int getDoctorPersonnelID() {
        return doctorPersonnelID;
    }

    public int getPatientFileNumber() {
        return patientFileNumber;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

     public int compareTo(Object o)
    {
        Appointment a = (Appointment) o ;
        if (this.emergency == a.emergency)
        {
            return 0;
        }
        else if(this.emergency && !a.emergency)
        {
            return 1 ;
        }
        return -1 ;
    }
}

class Medicine // دارو
{
    private String medicineName ;
    private int medicinePrice ;
    private String medicinePRO ; // تاریخ تولید دارو
    private String medicineEXP ; // تاریخ انقضا دارو

    public Medicine(String medicineName, int medicinePrice, String medicinePRO, String medicineEXP)
    {
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.medicinePRO = medicinePRO;
        this.medicineEXP = medicineEXP;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getMedicinePrice() {
        return medicinePrice;
    }

    public String getMedicinePRO() {
        return medicinePRO;
    }

    public String getMedicineEXP() {
        return medicineEXP;
    }
}

class Prescription // نسخه
{
    // تاریخ نوبت
    int year ;
    int month ;
    int dayDate ;
    // لیست دارو های تجویزی
    ArrayList<Medicine> prescriptionDrugs = new ArrayList<>() ;
    int doctorPersonnelID ; // شماره پرسنلی پزشک تجویز کننده
    int patientFileNum;
    int prescriptionNum ; // شماره نسخه
    public static int counter = 1 ; // شمارنده تعداد نسخه ها

    public Prescription(int year, int month, int dayDate, int doctorPersonnelID, int patientFileNum, int prescriptionNum)
    {
        counter++ ;
        this.year = year;
        this.month = month;
        this.dayDate = dayDate;
        this.doctorPersonnelID = doctorPersonnelID;
        this.patientFileNum = patientFileNum;
        this.prescriptionNum = prescriptionNum;
    }

}

abstract class User // کلاس پدر یوزر
{
    private String name ;
    private String lastName ;
    private String password ;
    private int phoneNumber ;
    private String email;
    public static int fileNumber = 1 ; // شماره پرونده (برای تولید نام کاربری)
    private int ID ;

    public User(String name, String lastName, String password, int phoneNumber, String email, int ID)
    {
        fileNumber++ ;
        this.name = name;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.ID = ID;
    }

    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }
}

class Patient extends User // بیمار
{
    public Patient(String name, String lastName, String password, int phoneNumber, String email, int ID)
    {
        super(name, lastName, password, phoneNumber, email, ID);
    }

}

class Employee extends User// کلاس پدر کارمند
{
    private int personnelID ; //  شماره پرسنلی
    private double monthlyHours ; // میزان ساعت کاری در ماه
    private int numPresentDays ; // تعداد روزهای حاضر در هفته
    private double dailyDutyHours; //  میزان ساعت کاری موظفی در روز
    private double hourlyWages ; //  حقوق ساعتی
    private int numWeeklyAbsences ; //  تعداد غیبتهای هفتگی
    private boolean suspension = false;

    public Employee(String name, String lastName, String password, int phoneNumber, String email, int personnelID,
                    double monthlyHours, int numPresentDays, double dailyDutyHours,
                    double hourlyWages)
    {
        super(name, lastName, password, phoneNumber, email, personnelID);
        this.personnelID = personnelID;
        this.monthlyHours = monthlyHours;
        this.numPresentDays = numPresentDays;
        this.dailyDutyHours = dailyDutyHours;
        this.hourlyWages = hourlyWages;
    }

    public double getDailyDutyHours() {
        return dailyDutyHours;
    }

    public void setNumWeeklyAbsences(int numWeeklyAbsences) {
        this.numWeeklyAbsences = numWeeklyAbsences;
    }

    public int getNumWeeklyAbsences() {
        return numWeeklyAbsences;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public void setSuspension(boolean suspension) {
        this.suspension = suspension;
    }

    public double getMonthlyHours() {
        return monthlyHours;
    }

    public int getNumPresentDays() {
        return numPresentDays;
    }

    public double getHourlyWages() {
        return hourlyWages;
    }

}

class Secretary extends Employee // منشی
{
    private final int doctorID ; // شماره پرسنلی پزشکی که باهاش کار میکنه

    public Secretary(String name, String lastName, String password, int phoneNumber, String email, int personnelID,
                     double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages, int doctorID)
    {
        super(name, lastName, password, phoneNumber, email, personnelID, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
        this.doctorID = doctorID;
    }
}

class Doctor extends Employee // پزشک
{
    private final String medicalExpertise ; // تخصص پزشک
    private String biography ; // بیوگرافی

    public Doctor(String name, String lastName, String password, int phoneNumber, String email, int personnelID,
                  double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages,
                  String medicalExpertise, String biography)
    {
        super(name, lastName, password, phoneNumber, email, personnelID, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
        this.medicalExpertise = medicalExpertise;
        this.biography = biography;
    }

    public String getMedicalExpertise() {
        return medicalExpertise;
    }

    public String getBiography() {
        return biography;
    }
}

class Servant extends Employee // مستخدم
{
    public static ArrayList<String> breakdown = new ArrayList<>(); // لیست خرابی های بیمارستان
    public static ArrayList<String> equipment = new ArrayList<>(); // لیست تجهیزات های درخواستی

    public Servant(String name, String lastName, String password, int phoneNumber, String email,
                   int personnelID, double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages)
    {
        super(name, lastName, password, phoneNumber, email, personnelID, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
    }
}

class Guard extends Employee // نگهبان
{
    public Guard(String name, String lastName, String password, int phoneNumber, String email, int personnelID,
                 double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages)
    {
        super(name, lastName, password, phoneNumber, email, personnelID, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
    }
}

class Administrator // ادمین
{
    private String adminPassword = "Admin" ;
    private String adminID = "Admin" ;

    public String getAdminPassword()
    {
        return adminPassword;
    }

    public String getAdminID()
    {
        return adminID;
    }
}


class DateTime
{
    public static String day = "saturday" ;
    public static ArrayList<String> days = new ArrayList<>();
    static {
        days.add("saturday") ;  days.add("sunday") ; days.add("monday") ; days.add("tuesday");
        days.add("wednesday") ; days.add("thursday") ;
    }
    public static int year = 1401 ;
    public static int month = 1 ;
    public static int dayDate = 1 ;
}

class LogInLogOutTime // زمان ورود و خروج کارمندان
{
    private int id ;
    private int year ;
    private int month ;
    private int dayDate ;
    private double entranceHour ; // ساعت ورود
    private double leavingHour ; // ساعت خروج
    private double durationOfPresence ; // مدت زمان حضور هر کارمند
    private int numAbsence ; // تعداد غیبت ها
    private String job ;

    public LogInLogOutTime(int id, int year, int month, int dayDate, int entranceHour, String job)
    {
        this.id = id;
        this.year = year;
        this.month = month;
        this.dayDate = dayDate;
        this.entranceHour = entranceHour;
        this.job = job;
    }

    public double getDurationOfPresence() {
        return durationOfPresence;
    }

    public int getNumAbsence() {
        return numAbsence;
    }

    public void setDurationOfPresence(double durationOfPresence) {
        this.durationOfPresence = durationOfPresence;
    }

    public void setNumAbsence(int numAbsence) {
        this.numAbsence = numAbsence;
    }

    public int getId() {
        return id;
    }

    public void setLeavingHour(int leavingHour) {
        this.leavingHour = leavingHour;
    }

    public double getEntranceHour() {
        return entranceHour;
    }

    public double getLeavingHour() {
        return leavingHour;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDayDate() {
        return dayDate;
    }
}

class AppointmentTime
{
    public static ArrayList<String> times = new ArrayList<>();
    static {
        times.add("8:00"); times.add("9:00"); times.add("10:00"); times.add("11:00");
        times.add("12:00"); times.add("13:00"); times.add("14:00"); times.add("15:00");
        times.add("16:00");times.add("17:00");
    }
}



//**************************** Patient Manager  &   Patient Panel ******************************************

class PatientManager
{
    public ArrayList<Appointment> appointments = new ArrayList<>() ;
    // sign in
    public int register(String patientName, String patientLastName, String patientPassword,
                        int patientPhoneNumber, String patientEmail)
    {
        int id = Patient.fileNumber ;
        Patient user = new Patient(patientName, patientLastName, patientPassword, patientPhoneNumber, patientEmail,id);
        HealthAssistantPart2.patients.add(user) ;
        return id ; // شماره پرونده که همان نام کاربری هم هست
    }

    // log in
    public boolean LogIn(int patientID, String patientPassword)
    {
        boolean found = false ;
        for(int i = 0; i < HealthAssistantPart2.patients.size(); i++)
        {
            if(HealthAssistantPart2.patients.get(i).getID() == patientID)
            {
                if(HealthAssistantPart2.patients.get(i).getPassword().equals(patientPassword))
                {
                    found = true ;
                    break;
                }
            }
        }
        return found ;
    }

    // edit info
    public boolean editInfo(int patientID,String patientNewName,String patientNewLastName,String patientNewPassword,
                            int patientNewPhoneNumber, String patientNewEmail)
    {
        boolean found = false ;
        for(int i = 0; i < HealthAssistantPart2.patients.size(); i++)
        {
            if(HealthAssistantPart2.patients.get(i).getID() == patientID)
            {
                HealthAssistantPart2.patients.get(i).setName(patientNewName);
                HealthAssistantPart2.patients.get(i).setLastName(patientNewLastName); ;
                HealthAssistantPart2.patients.get(i).setPassword(patientNewPassword);
                HealthAssistantPart2.patients.get(i).setPhoneNumber(patientNewPhoneNumber);
                HealthAssistantPart2.patients.get(i).setEmail(patientNewEmail);
                found = true ;
                break;
            }
        }
        return found ;
    }

    // add appointment to the patient  appointment list
    public void appointment(int doctorPersonnelID, int patientFileNumber, String time)
    {
        Appointment user = new Appointment(DateTime.year, DateTime.month, DateTime.dayDate, time, doctorPersonnelID,
                patientFileNumber);
        appointments.add(user) ;
    }




}

class PatientPanel // پنل کاربری بیمار
{
    int login_type ;
    Scanner input = new Scanner(System.in);
    Menu patientChoice = new Menu() ;

    public void patientMenu1()
    {
        this.login_type = patientChoice.enter() ;

        switch (login_type)
        {
            case 1 : // sign in
            {
                signIn();
                int patient_choice = patientChoice.patientMenu() ;
                patientMenu2(patient_choice);
                break;
            }

            case 2 : // log in
            {
                logIn();
                break;
            }
        }

    }

    public void patientMenu2(int patient_choice)
    {
        switch (patient_choice)
        {
            case 1 :  // Edit Info
            {
                editInfo();
                break;
            }

            case 2 : // View the doctors' list and Make an appointment
            {
                doctorListAndMakeAppointment();
                break;
            }

            case 3 : //  View the list of prescription
            {
                prescriptionList();
                break;
            }
            case 4 : // view the list of appointments
            {
                appointmentsList();
                break;
            }

            case 5 : // log out
            {
                break;
            }

        }
    }

    public void signIn()
    {
        System.out.println("\t*****Sign in*****");
        System.out.println("\tcreate an account");
        System.out.println(" Enter your information :");
        System.out.print(" 1) Name : ");
        String name = input.next() ;
        System.out.print(" 2) Last name : ");
        String lastName = input.next() ;
        System.out.print(" 3) Password : ");
        String password = input.next() ;
        System.out.print(" 4) Phone number : ");
        int phoneNumber = input.nextInt() ;
        System.out.print(" 5) Email : ");
        String email = input.next();
        System.out.println();

        int fileNumber = HealthAssistantPart2.patientManager.register(name, lastName, password, phoneNumber, email);
        System.out.println(" Registered Successfully !\n" + "Your ID and file number is : " + fileNumber);
    }

    public void logIn()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        int id = input.nextInt() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;
        System.out.println();

        boolean found = HealthAssistantPart2.patientManager.LogIn(id, password) ;

        if(found)
        {
            System.out.println("log in Successfully !");
            System.out.println("-------------------------------------------------------------");
            int patient_choice = patientChoice.patientMenu() ;
            patientMenu2(patient_choice);
        }
        else
        {
            System.out.println("ID not found !");
            patientMenu1(); // برگشت به منوی نوع ورود (ورود یا ثبت نام)
        }
    }

    public void editInfo()
    {
        System.out.println("\t*****Edit Info*****");
        System.out.print(" Enter your ID : ");
        int id = input.nextInt() ;
        System.out.print(" Enter new name : ");
        String newName = input.next() ;
        System.out.print(" Enter new last name : ");
        String newLastName = input.next() ;
        System.out.print(" Enter new password : ");
        String newPassword = input.next() ;
        System.out.print(" Enter new phone number : ");
        int newPhoneNumber = input.nextInt() ;
        System.out.print(" Enter new email : ");
        String newEmail = input.next();
        System.out.println();
        boolean found = HealthAssistantPart2.patientManager.editInfo(id, newName, newLastName, newPassword,
                newPhoneNumber, newEmail) ;

        if(found)
        {
            System.out.println(" Edit successfully !");
            System.out.println("-------------------------------------------------------------");
            int patient_choice = patientChoice.patientMenu() ; // بعد از ویرایش اطلاعات دوباره به منو باز میگردد
            patientMenu2(patient_choice); //برگشت به اول این تابع

        }
        else
        {
            System.out.println(" ID not found !!");
            System.out.println("-------------------------------------------------------------");
            int patient_choice = patientChoice.patientMenu() ; // بعد از ویرایش اطلاعات دوباره به منو باز میگردد
            patientMenu2(patient_choice); // برگشت به اول این تابع
        }
    }

    public void  doctorListAndMakeAppointment()
    {
        for (int i = 0; i < HealthAssistantPart2.doctors.size(); i++)
        {
            System.out.print(" doctor name: " + HealthAssistantPart2.doctors.get(i).getName());
            System.out.print(" " + HealthAssistantPart2.doctors.get(i).getLastName());
            System.out.print("     Medical Expertise : " + HealthAssistantPart2.doctors.get(i).getMedicalExpertise());
            System.out.print("     Doctor Personnel ID : " + HealthAssistantPart2.doctors.get(i).getID());
            System.out.print("     biography : " + HealthAssistantPart2.doctors.get(i).getBiography());
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
        // filter
        System.out.println(" 1) Filter by medical expertise and make an appointment\n 2) Back to the menu");
        System.out.print(" Enter the number ---> ");
        int number = input.nextInt() ;
        if(number == 1)
        {
            System.out.print(" Enter medical expertise : ");
            String expertise = input.next() ;
            for (int i = 0; i < HealthAssistantPart2.doctors.size(); i++)
            {
                if (HealthAssistantPart2.doctors.get(i).getMedicalExpertise().equals(expertise))
                {
                    System.out.print(" doctor name: " + HealthAssistantPart2.doctors.get(i).getName());
                    System.out.print(" " + HealthAssistantPart2.doctors.get(i).getLastName());
                    System.out.print("     Doctor Personnel ID : " + HealthAssistantPart2.doctors.get(i).getID());
                    System.out.println();
                }
            }

            System.out.println("-------------------------------------------------------------");
            System.out.println("\t****** Make an appointment******");
            System.out.print(" Enter Doctor Personnel ID : ");
            int doctorPersonnelID = input.nextInt() ;

            System.out.println(" Enter the information : ");
            System.out.print(" 1) your file number : ");
            int fileNum = input.nextInt() ;
            System.out.print(" 2) Is it an emergency? (true, false)");
            boolean emergency = input.nextBoolean();

            System.out.println(" 3) choose one time: ");
            for (int j = 0; j < AppointmentTime.times.size(); j++)
            {
                System.out.print(AppointmentTime.times.get(j) + " ");
            }
            String time = input.next();
            for (int k = 0; k < HealthAssistantPart2.dailyAppointments.size(); k++)
            {
                if (HealthAssistantPart2.dailyAppointments.get(k).getAppointmentTime().equals(time))
                {
                    System.out.println(" This time is full. Choose another time.");
                    time = input.next();
                    k = 0 ;
                }
            }

            int appointmentNumber = HealthAssistantPart2.secretaryManager.makeAppointment(doctorPersonnelID, fileNum,
                    emergency, time); // اد کردن به لیست منشی
            HealthAssistantPart2.patientManager.appointment(doctorPersonnelID, fileNum, time);
            System.out.println(" your appointment number is : " + appointmentNumber);

            int choice = patientChoice.patientMenu() ;
            patientMenu2(choice);
        }
        else if (number == 2)
        {
            int choice = patientChoice.patientMenu() ;
            patientMenu2(choice);
        }
    }

    public void prescriptionList()
    {
        System.out.print(" Enter your file number : ");
        int fileNum = input.nextInt();
        System.out.println();

        System.out.println(" \tyour prescriptions : ");
        for (int i = 0; i < HealthAssistantPart2.prescriptions.size(); i++)
        {
            if (HealthAssistantPart2.prescriptions.get(i).patientFileNum == fileNum)
            {
                System.out.print(" prescription number: " + HealthAssistantPart2.prescriptions.get(i).prescriptionNum);
                System.out.print("    prescription date: " + HealthAssistantPart2.prescriptions.get(i).year + "/");
                System.out.print(HealthAssistantPart2.prescriptions.get(i).month + "/");
                System.out.print(HealthAssistantPart2.prescriptions.get(i).dayDate + "/");
                System.out.print("    doctor personnel ID: " + HealthAssistantPart2.prescriptions.get(i).doctorPersonnelID);
                System.out.println();
                System.out.println("\tprescription drugs: ");
                for (int j = 0; j < HealthAssistantPart2.prescriptions.get(i).prescriptionDrugs.size(); j++)
                {
                    System.out.print(" Medicine name: " + HealthAssistantPart2.prescriptions.get(i).prescriptionDrugs.get(j).getMedicineName());
                    System.out.print("      price: " + HealthAssistantPart2.prescriptions.get(i).prescriptionDrugs.get(j).getMedicinePrice());
                    System.out.print("      production date: " + HealthAssistantPart2.prescriptions.get(i).prescriptionDrugs.get(j).getMedicinePRO());
                    System.out.print("      Expiration date: " + HealthAssistantPart2.prescriptions.get(i).prescriptionDrugs.get(j).getMedicineEXP());
                    System.out.println();
                }
            }
            System.out.println();
        }
        int choice = patientChoice.patientMenu() ;
        patientMenu2(choice);
    }

    public void appointmentsList()
    {
        System.out.print(" Enter your file number : ");
        int fileNum = input.nextInt();
        System.out.println("\t***** the list of appointments *****");

        for (int i = 0; i < HealthAssistantPart2.patientManager.appointments.size(); i++)
        {
            if (HealthAssistantPart2.patientManager.appointments.get(i).getPatientFileNumber() == fileNum)
            {
                System.out.print(" appointment date: " + HealthAssistantPart2.patientManager.appointments.get(i).year + "/");
                System.out.print(HealthAssistantPart2.patientManager.appointments.get(i).month + "/");
                System.out.print(HealthAssistantPart2.patientManager.appointments.get(i).dayDate);
                System.out.println("    doctor personnel ID: " + HealthAssistantPart2.patientManager.appointments.get(i).getDoctorPersonnelID());
                System.out.println();
            }
        }

        int choice = patientChoice.patientMenu() ;
        patientMenu2(choice);
    }


}


//************************************* Servant Manager & Servant Panel ******************************************

class ServantManager // منیجر مستخدم
{

  // log in
  public boolean logIn(int id, String password)
  {
      boolean found = false;
      for (int i = 0; i < HealthAssistantPart2.servants.size(); i++)
      {
          if(HealthAssistantPart2.servants.get(i).getID() == id)
          {
              if(HealthAssistantPart2.servants.get(i).getPassword().equals(password))
              {
                  found = true;
                  break;
              }
          }
      }
      return found;
  }

  public void reportBreakdown(String breakdown)
  {
      Servant.breakdown.add(breakdown);
  }

  public void requestEquipment(String equipment)
  {
     Servant.equipment.add(equipment);
  }


  // ثبت زمان ورود مستخدم
  public void recordTime(int id, int entranceHour)
  {
      LogInLogOutTime servant = new LogInLogOutTime(id, DateTime.year, DateTime.month, DateTime.dayDate, entranceHour,
              "servant");
      HealthAssistantPart2.guardDailyList.add(servant); // اد شدن به لیست روزانه
      HealthAssistantPart2.guardWeeklyList.add(servant); // اد شدن به لیست هفتگی
  }

  // دریافت حقوق ماهانه
    public double monthlySalary(int id)
    {
        double monthlySalary;
        for (int i = 0; i < HealthAssistantPart2.servants.size(); i++)
        {
            if (HealthAssistantPart2.servants.get(i).getID() == id)
            {
                 monthlySalary = ( (HealthAssistantPart2.servants.get(i).getHourlyWages() *
                        HealthAssistantPart2.servants.get(i).getDailyDutyHours()) *
                        (HealthAssistantPart2.servants.get(i).getNumPresentDays() * 4) );
                return monthlySalary;
            }
        }
        return 0;
    }

}

class ServantPanel
{
    Scanner input = new Scanner(System.in);
    Menu servantChoice = new Menu() ;

    public void servantMenu1()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        int id = input.nextInt() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;

        System.out.println(" 3) Enter arrival time :         for example---> hour: 8");
        System.out.print(" hour : "); int entranceHour = input.nextInt();
        System.out.println();

        boolean found = HealthAssistantPart2.servantManager.logIn(id, password);


        if(found)
        {
            // چک کردن وضعیت تعلیق کارمند
            for (int i = 0; i < HealthAssistantPart2.servants.size(); i++)
            {
                if(HealthAssistantPart2.servants.get(i).getID() == id)
                {
                    if(HealthAssistantPart2.servants.get(i).isSuspension())
                    {
                        System.out.println("\tYou have been suspended and can not log in !");
                        break;
                    }
                    else
                    {
                        System.out.println("log in Successfully !");
                        System.out.println("-------------------------------------------------------------");
                        // ثبت زمان ورود
                        HealthAssistantPart2.servantManager.recordTime(id, entranceHour);

                        int choice = servantChoice.servantMenu() ;
                        servantMenu2(choice);
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("ID not found !");
            servantMenu1();
        }

    }

    public void servantMenu2(int servant_choice)
    {
        switch (servant_choice)
        {
            case 1 : // Report breakdown to the administrator
            {
                reportBreakdown();
                int choice = servantChoice.servantMenu();
                servantMenu2(choice);
                break;
            }

            case 2 : // Request equipment from the administrator
            {
                requestEquipment();
                int choice = servantChoice.servantMenu();
                servantMenu2(choice);
                break;
            }

            case 3 : // Receive a monthly salary
            {
                System.out.print(" Enter your id : "); int id = input.nextInt();
                System.out.println(" Your monthly salary is : " + HealthAssistantPart2.servantManager.monthlySalary(id));
                int choice = servantChoice.servantMenu();
                servantMenu2(choice);
                break;
            }

            case 4 : // View a list of days spent at work
            {
                listDaysSpentAtWork();
                int choice = servantChoice.servantMenu();
                servantMenu2(choice);
                break;
            }

            case 5 : // log out
            {
                logOut();
                break;
            }
        }

    }

    public void reportBreakdown()
    {
        System.out.println(" Report breakdown to the administrator : ");
        System.out.print(" Enter breakdown : ");
        String breakdown = input.next();

        HealthAssistantPart2.servantManager.reportBreakdown(breakdown);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.print(" Enter another breakdown : ");
            String breakdown1 = input.next();

            HealthAssistantPart2.servantManager.reportBreakdown(breakdown1);

            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;

        }
    }

    public void requestEquipment()
    {
        System.out.println(" Request equipment from the administrator : ");
        System.out.print(" Enter equipment : ");
        String equipment = input.next();

        HealthAssistantPart2.servantManager.requestEquipment(equipment);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.print(" Enter another equipment : ");
            String equipment1 = input.next();

            HealthAssistantPart2.servantManager.requestEquipment(equipment1);

            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;

        }
    }

    public void logOut()
    {
        System.out.println("\t*****Log out*****");
        System.out.print(" ID : "); int id = input.nextInt() ;
        System.out.println(" Enter exit time :         for example---> hour: 17");
        System.out.print(" hour : "); int leavingHour = input.nextInt();

        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardDailyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }

        for (int i = 0; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if (HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardWeeklyList.get(i).setLeavingHour(leavingHour);
            }
        }
    }

    public void listDaysSpentAtWork()
    {
        System.out.print(" Enter your personnel id : ");
        int id = input.nextInt();

        for (int i = 0 ; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if (HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getYear() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getMonth() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getDayDate() + "/");
                System.out.print("   arrival time : " + HealthAssistantPart2.guardWeeklyList.get(i).getEntranceHour());
                System.out.print("   exit time : " + HealthAssistantPart2.guardWeeklyList.get(i).getLeavingHour());
                System.out.println();
            }
        }
    }

}

//**************************** Administrator Manager  &   Administrator Panel *****************************************

class AdministratorManager
{

    private Administrator administrator = new Administrator() ;

    // log in
    public boolean logIn(String adminID, String adminPassword)
    {
        boolean found = false ;
        if(administrator.getAdminID().equals(adminID))
        {
            if(administrator.getAdminPassword().equals(adminPassword))
            {
                found = true ;
            }
        }

        return found ;
    }

    // manage days
    public void manageDays()
    {
        // day
        if(DateTime.days.indexOf(DateTime.day) == 5)
        {
            DateTime.day = DateTime.days.get(0);
        }
        else
        {
            DateTime.day = DateTime.days.get(DateTime.days.indexOf(DateTime.day) + 1) ;
        }

        // date
        if (DateTime.dayDate == 31)
        {
            DateTime.month++ ;
            DateTime.dayDate = 1 ;
        }
        else
        {
            DateTime.dayDate++ ;
        }
    }


    // add doctor
    public int addDoctor(String name, String lastName, String password, int phoneNumber, String email,double monthlyHours,
                          int numPresentDays, double dailyDutyHours, double hourlyWages ,String medicalExpertise,
                          String biography)
    {
        int id = User.fileNumber;
        Doctor doctor = new Doctor(name, lastName, password, phoneNumber, email, id, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages, medicalExpertise, biography);
        HealthAssistantPart2.doctors.add(doctor);
        return id;
    }

    // add medicine
    public void addMedicine(String medicineName, int medicinePrice, String medicinePRO, String medicineEXP)
    {
        Medicine medicine = new Medicine(medicineName, medicinePrice, medicinePRO, medicineEXP);
        HealthAssistantPart2.medicines.add(medicine);
    }

    // Check equipment requests
    public void approveEquipment(String equipment)
    {
        HealthAssistantPart2.approveEquipment.add(equipment);
    }

    // add servant
    public int addServant(String name, String lastName, String password, int phoneNumber, String email,
                          double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages)
    {
        int id = User.fileNumber;
        Servant servant = new Servant(name, lastName, password, phoneNumber, email, id, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
        HealthAssistantPart2.servants.add(servant);
        return id;
    }

    // add guard
    public int addGuard(String name, String lastName, String password, int phoneNumber, String email,
                        double monthlyHours, int numPresentDays, double dailyDutyHours, double hourlyWages)
    {
        int id = User.fileNumber;
        Guard guard = new Guard(name, lastName, password, phoneNumber, email, id, monthlyHours, numPresentDays,
                dailyDutyHours, hourlyWages);
        HealthAssistantPart2.guards.add(guard);
        return id;
    }

    // تعلیق کارمندان
    public void employeeSuspension()
    {
        // servants
        for (int i = 0; i < HealthAssistantPart2.servants.size(); i++)
        {
            if(HealthAssistantPart2.servants.get(i).getNumWeeklyAbsences() > 2)
            {
                HealthAssistantPart2.servants.get(i).setSuspension(true);
            }
        }

        // doctors
        for (int i = 0; i < HealthAssistantPart2.doctors.size(); i++)
        {
            if(HealthAssistantPart2.doctors.get(i).getNumWeeklyAbsences() > 2)
            {
                HealthAssistantPart2.doctors.get(i).setSuspension(true);
            }
        }

        // secretaries
        for (int i = 0; i < HealthAssistantPart2.secretaries.size(); i++)
        {
            if(HealthAssistantPart2.secretaries.get(i).getNumWeeklyAbsences() > 2)
            {
                HealthAssistantPart2.secretaries.get(i).setSuspension(true);
            }
        }

        // guards
        for (int i = 0; i < HealthAssistantPart2.guards.size(); i++)
        {
            if(HealthAssistantPart2.guards.get(i).getNumWeeklyAbsences() > 2)
            {
                HealthAssistantPart2.guards.get(i).setSuspension(true);
            }
        }

    }




}

class AdministratorPanel
{

    Scanner input = new Scanner(System.in);
    Menu adminChoice = new Menu() ;

    public void administratorMenu1()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        String id = input.next() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;
        System.out.println();

        boolean found = HealthAssistantPart2.administratorManager.logIn(id, password) ;

        if(found)
        {
            System.out.println("log in Successfully !");
            System.out.println("-------------------------------------------------------------");
            int admin_choice = adminChoice.adminMenu1();
            administratorMenu2(admin_choice);
        }
        else
        {
            System.out.println("ID not found !");
            administratorMenu1(); // بازگشت به بخش لاگین
        }

    }


    public void administratorMenu2(int admin_choice)
    {
        switch (admin_choice)
        {
            case 1 : // manage the days
            {
                manageDay();
                HealthAssistantPart2.guardDailyList.clear(); // روز جدید شده پس لیست روزانه ی نگهبان پاک میشود
                HealthAssistantPart2.dailyAppointments.clear(); // روز جدید شده پس لیست روزانه ی منشی پاک میشود
                int choice = adminChoice.adminMenu1();
                administratorMenu2(choice);
                break;
            }

            case 2 : // add employee
            {
                int choice = adminChoice.adminMenu2();
                administratorMenu3(choice);
                break;
            }

            case 3 : // add medicine
            {
                addMedicine();
                break;
            }

            case 4 : // Check the request to add equipment
            {
                checkEquipment();
                break;
            }

            case 5 : // Check the list of hospital breakdown
            {
                hospitalBreakdown();
                break;
            }

            case 6 : // Employee suspension
            {
                HealthAssistantPart2.administratorManager.employeeSuspension();
                System.out.println(" The suspension of employees was successful.");
                System.out.println();
                int choice = adminChoice.adminMenu1();
                administratorMenu2(choice);
                break;
            }

            case 7 : // log out
            {
                break;
            }

        }
    }

    public void administratorMenu3(int choice)
    {
        switch (choice)
        {
            case 1 : // add doctor
            {
                addDoctor();
                choice = adminChoice.adminMenu2();
                administratorMenu3(choice);
                break;
            }

            case 2 : // add servant
            {
                addServant();
                choice = adminChoice.adminMenu2();
                administratorMenu3(choice);
                break;
            }

            case 3 : // add guard
            {
                addGuard();
                choice = adminChoice.adminMenu2();
                administratorMenu3(choice);
                break;
            }

            case 4 : // back
            {
                choice = adminChoice.adminMenu1();
                administratorMenu2(choice);
                break;
            }

        }
    }


    public void addMedicine()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Enter drug information : ");
        System.out.print(" 1) medicine name : ");
        String medicineName = input.next() ;
        System.out.print(" 2) medicine price : ");
        int price = input.nextInt() ;
        System.out.print(" 3) production date : ");
        String pro = input.next() ;
        System.out.print(" 4) Expiration date : ");
        String exp = input.next() ;
        System.out.println();

        HealthAssistantPart2.administratorManager.addMedicine(medicineName, price, pro, exp);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter drug information : ");
            System.out.print(" 1) medicine name : ");
            String medicineName1 = input.next() ;
            System.out.print(" 2) medicine price : ");
            int price1 = input.nextInt() ;
            System.out.print(" 3) production date : ");
            String pro1 = input.next() ;
            System.out.print(" 4) Expiration date : ");
            String exp1 = input.next() ;
            System.out.println();

            HealthAssistantPart2.administratorManager.addMedicine(medicineName1, price1, pro1, exp1);
            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;
        }

        int choice = adminChoice.adminMenu1();
        administratorMenu2(choice);
    }

    public void checkEquipment()
    {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(" 1) view the list of approved requests\n 2) Check for new requests\n 3) back");
        System.out.print(" Enter your choice : ");
        int number = input.nextInt();

        switch (number)
        {
            case 1 : // view the list of approved requests
            {
                for (int i = 0; i < HealthAssistantPart2.approveEquipment.size(); i++)
                {
                    System.out.println(" " + HealthAssistantPart2.approveEquipment.get(i));
                }
                 checkEquipment();
                 break;
            }
            case 2 : // Check for new requests
            {
                System.out.println(" You must approve or reject the request to add equipment : ");
                for (int i = 0; i < Servant.equipment.size(); i++)
                {
                    System.out.println(" " + Servant.equipment.get(i));
                    System.out.println(" choose one :\n 1) approve  2) reject");
                    int choice = input.nextInt();
                    if(choice == 1) // approve
                    {
                        HealthAssistantPart2.administratorManager.approveEquipment(Servant.equipment.get(i));
                    }
                    System.out.println("______________________________________________________");
                }
                Servant.equipment.clear();
                checkEquipment();
                break;
            }

            case 3 : // back
            {
                int choice = adminChoice.adminMenu1();
                administratorMenu2(choice);
                break;
            }
        }

        int choice = adminChoice.adminMenu1();
        administratorMenu2(choice);
    }

    public void hospitalBreakdown()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println("  hospital breakdown list : ");
        for (int i = 0; i < Servant.breakdown.size(); i++)
        {
            System.out.println(" " + Servant.breakdown.get(i));
        }

        int choice = adminChoice.adminMenu1();
        administratorMenu2(choice);
    }

    public void addDoctor()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Enter doctor information : ");
        System.out.print(" 1) doctor name : ");
        String doctorName = input.next() ;
        System.out.print(" 2) doctor last name : ");
        String doctorLastName = input.next() ;
        System.out.print(" 3) doctor password : ");
        String doctorPassword = input.next() ;
        System.out.print(" 4) doctor phone number : ");
        int phoneNumber = input.nextInt();
        System.out.print(" 5) doctor email : ");
        String email = input.next();
        System.out.print(" 6) monthly hour : ");
        double monthlyHour = input.nextDouble();
        System.out.print(" 7) Number of days present per week: ");
        int numPresentDays = input.nextInt();
        System.out.print(" 8) daily duty hours : ");
        double dailyDutyHours = input.nextDouble();
        System.out.print(" 9) hourly Wages : ");
        double hourlyWages = input.nextDouble();
        System.out.print(" 10) medical Expertise : ");
        String medicalExpertise = input.next() ;
        System.out.print(" 11) biography : ");
        String biography = input.next();
        System.out.println();

        int personnelID = HealthAssistantPart2.administratorManager.addDoctor(doctorName, doctorLastName, doctorPassword,
                phoneNumber, email, monthlyHour, numPresentDays, dailyDutyHours, hourlyWages, medicalExpertise, biography);
        System.out.println("personnel ID is : " + personnelID);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter doctor information : ");
            System.out.print(" 1) doctor name : ");
            String doctorName1 = input.next() ;
            System.out.print(" 2) doctor last name : ");
            String doctorLastName1 = input.next() ;
            System.out.print(" 3) doctor password : ");
            String doctorPassword1 = input.next() ;
            System.out.print(" 4) doctor phone number : ");
            int phoneNumber1 = input.nextInt();
            System.out.print(" 5) doctor email : ");
            String email1 = input.next();
            System.out.print(" 6) monthly hour : ");
            double monthlyHour1 = input.nextDouble();
            System.out.print(" 7) Number of days present per week: ");
            int numPresentDays1 = input.nextInt();
            System.out.print(" 8) daily duty hours : ");
            double dailyDutyHours1 = input.nextDouble();
            System.out.print(" 9) hourly Wages : ");
            double hourlyWages1 = input.nextDouble();
            System.out.print(" 10) medical Expertise : ");
            String medicalExpertise1 = input.next() ;
            System.out.print(" 11) biography : ");
            String biography1 = input.next();
            System.out.println();

            int personnelID1 = HealthAssistantPart2.administratorManager.addDoctor(doctorName1, doctorLastName1,
                    doctorPassword1, phoneNumber1, email1, monthlyHour1, numPresentDays1, dailyDutyHours1,
                    hourlyWages1, medicalExpertise1, biography1) ;
            System.out.println("personnel ID is : " + personnelID1);
            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;
        }
    }

    public void addServant()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Enter servant information : ");
        System.out.print(" 1) servant name : ");
        String name = input.next() ;
        System.out.print(" 2) servant last name : ");
        String lastName = input.next() ;
        System.out.print(" 3) servant password : ");
        String password = input.next() ;
        System.out.print(" 4) servant phone number : ");
        int phoneNumber = input.nextInt();
        System.out.print(" 5) servant email : ");
        String email = input.next();
        System.out.print(" 6) monthly hour : ");
        double monthlyHour = input.nextDouble();
        System.out.print(" 7) Number of days present per week: ");
        int numPresentDays = input.nextInt();
        System.out.print(" 8) daily duty hours : ");
        double dailyDutyHours = input.nextDouble();
        System.out.print(" 9) hourly Wages : ");
        double hourlyWages = input.nextDouble();
        System.out.println();

        int personnelID = HealthAssistantPart2.administratorManager.addServant(name, lastName, password, phoneNumber,
                email, monthlyHour, numPresentDays, dailyDutyHours, hourlyWages);
        System.out.println("personnel ID is : " + personnelID);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter servant information : ");
            System.out.print(" 1) servant name : ");
            String name1 = input.next() ;
            System.out.print(" 2) servant last name : ");
            String lastName1 = input.next() ;
            System.out.print(" 3) servant password : ");
            String password1 = input.next() ;
            System.out.print(" 4) servant phone number : ");
            int phoneNumber1 = input.nextInt();
            System.out.print(" 5) servant email : ");
            String email1 = input.next();
            System.out.print(" 6) monthly hour : ");
            double monthlyHour1 = input.nextDouble();
            System.out.print(" 7) Number of days present per week: ");
            int numPresentDays1 = input.nextInt();
            System.out.print(" 8) daily duty hours : ");
            double dailyDutyHours1 = input.nextDouble();
            System.out.print(" 9) hourly Wages : ");
            double hourlyWages1 = input.nextDouble();
            System.out.println();

            int personnelID1 = HealthAssistantPart2.administratorManager.addServant(name1,lastName1, password1,
                    phoneNumber1, email1, monthlyHour1, numPresentDays1, dailyDutyHours1, hourlyWages1);
            System.out.println("personnel ID is : " + personnelID1);
            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;
        }
    }

    public void addGuard()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Enter guard information : ");
        System.out.print(" 1) guard name : ");
        String name = input.next() ;
        System.out.print(" 2) guard last name : ");
        String lastName = input.next() ;
        System.out.print(" 3) guard password : ");
        String password = input.next() ;
        System.out.print(" 4) guard phone number : ");
        int phoneNumber = input.nextInt();
        System.out.print(" 5) guard email : ");
        String email = input.next();
        System.out.print(" 6) monthly hour : ");
        double monthlyHour = input.nextDouble();
        System.out.print(" 7) Number of days present per week: ");
        int numPresentDays = input.nextInt();
        System.out.print(" 8) daily duty hours : ");
        double dailyDutyHours = input.nextDouble();
        System.out.print(" 9) hourly Wages : ");
        double hourlyWages = input.nextDouble();
        System.out.println();

        int personnelID = HealthAssistantPart2.administratorManager.addGuard(name, lastName, password, phoneNumber,
                email, monthlyHour, numPresentDays, dailyDutyHours, hourlyWages);
        System.out.println("personnel ID is : " + personnelID);

        System.out.println(" Choose one :\n 1) Add more    2) End");
        int num = input.nextInt() ;
        while (num == 1)
        {
            System.out.println("-------------------------------------------------------------");
            System.out.println(" Enter guard information : ");
            System.out.print(" 1) guard name : ");
            String name1 = input.next() ;
            System.out.print(" 2) guard last name : ");
            String lastName1 = input.next() ;
            System.out.print(" 3) guard password : ");
            String password1 = input.next() ;
            System.out.print(" 4) guard phone number : ");
            int phoneNumber1 = input.nextInt();
            System.out.print(" 5) guard email : ");
            String email1 = input.next();
            System.out.print(" 6) monthly hour : ");
            double monthlyHour1 = input.nextDouble();
            System.out.print(" 7) Number of days present per week: ");
            int numPresentDays1 = input.nextInt();
            System.out.print(" 8) daily duty hours : ");
            double dailyDutyHours1 = input.nextDouble();
            System.out.print(" 9) hourly Wages : ");
            double hourlyWages1 = input.nextDouble();
            System.out.println();

            int personnelID1 = HealthAssistantPart2.administratorManager.addGuard(name1, lastName1, password1,
                    phoneNumber1, email1, monthlyHour1, numPresentDays1, dailyDutyHours1, hourlyWages1);
            System.out.println("personnel ID is : " + personnelID1);
            System.out.println(" Choose one :\n 1) Add more    2) End");
            num = input.nextInt() ;
        }
    }

    public void manageDay()
    {
        System.out.println();
        System.out.println("\tYou can move time forward one day");
        System.out.println(" yesterday : " + DateTime.day + "   " + DateTime.year + "/" + DateTime.month +
                "/" + DateTime.dayDate);
        HealthAssistantPart2.administratorManager.manageDays();
        System.out.println(" today : " + DateTime.day + "   " + DateTime.year + "/" + DateTime.month +
                "/" + DateTime.dayDate);
    }

}

//******************************** Doctor Manager  &   Doctor Panel **************************************************

class DoctorManager
{
    // log in
    public boolean logIn(int id, String password)
    {
        boolean found = false ;
        for (int i = 0 ; i < HealthAssistantPart2.doctors.size(); i++)
        {
            if (HealthAssistantPart2.doctors.get(i).getID() == id)
            {
                if (HealthAssistantPart2.doctors.get(i).getPassword().equals(password))
                {
                    found = true ;
                    break;
                }
            }
        }
        return found ;
    }

    // add Secretary
    public int addSecretary(String name,String lastName,String password,int phoneNumber,String email,double monthlyHours
            , int numPresentDays, double dailyDutyHours, double hourlyWages, int doctorID)
    {
        int id = User.fileNumber; // شماره پرسنلی منشی که همان شماره پروندشه
        Secretary secretary = new Secretary(name, lastName, password, phoneNumber, email, id, monthlyHours,
                numPresentDays, dailyDutyHours, hourlyWages, doctorID);
        HealthAssistantPart2.secretaries.add(secretary);
        return id ;
    }

    // ثبت زمان ورود پزشک
    public void recordTime(int id, int entranceHour)
    {

        LogInLogOutTime doctor = new LogInLogOutTime(id, DateTime.year, DateTime.month, DateTime.dayDate, entranceHour,
                "doctor");
        HealthAssistantPart2.guardDailyList.add(doctor); // اد شدن به لیست روزانه
        HealthAssistantPart2.guardWeeklyList.add(doctor); // اد شدن به لیست هفتگی
    }

    // دریافت حقوق ماهانه
    public double monthlySalary(int id)
    {
        double monthlySalary;
        for (int i = 0; i < HealthAssistantPart2.doctors.size(); i++)
        {
            if(HealthAssistantPart2.doctors.get(i).getID() == id)
            {
                monthlySalary = ( (HealthAssistantPart2.doctors.get(i).getHourlyWages() *
                        HealthAssistantPart2.doctors.get(i).getDailyDutyHours()) *
                        (HealthAssistantPart2.doctors.get(i).getNumPresentDays() * 4) );
                return monthlySalary;
            }
        }
         return 0;
    }

    // prescribe
    public int prescribe(int doctorPersonnelID, int patientFileNum)
    {
        Scanner input = new Scanner(System.in);
        int prescriptionNum = Prescription.counter ;
        Prescription user = new Prescription(DateTime.year, DateTime.month, DateTime.dayDate, doctorPersonnelID,
                patientFileNum, prescriptionNum) ;

        System.out.print(" Enter the number of prescription drugs :");
        int num = input.nextInt() ;
        while (num > 0)
        {
            System.out.println(" Enter drug information : ");
            System.out.print(" 1) medicine name : ");
            String medicineName = input.next() ;
            System.out.print(" 2) medicine price : ");
            int price = input.nextInt() ;
            System.out.print(" 3) production date : ");
            String pro = input.next() ;
            System.out.print(" 4) Expiration date : ");
            String exp = input.next() ;

            System.out.println("-------------------------------------------------------------");
            num-- ;
            Medicine user2 = new Medicine(medicineName, price, pro, exp);
            user.prescriptionDrugs.add(user2) ;
        }
        HealthAssistantPart2.prescriptions.add(user) ;

        for (int j = 0; j < HealthAssistantPart2.dailyAppointments.size(); j++) // حذف بیمار ویزیت شده از لیست نوبت
        {
            if (HealthAssistantPart2.dailyAppointments.get(j).getPatientFileNumber() == patientFileNum)
            {
                HealthAssistantPart2.dailyAppointments.remove(j) ;
                break;
            }
        }

        return prescriptionNum ;
    }




}

class DoctorPanel
{
    Scanner input = new Scanner(System.in);
    Menu doctorChoice = new Menu() ;

    public void doctorMenu1()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        int id = input.nextInt() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;

        System.out.println(" 3) Enter arrival time :         for example---> hour: 8");
        System.out.print(" hour : "); int entranceHour = input.nextInt();
        System.out.println();

        boolean found = HealthAssistantPart2.doctorManager.logIn(id, password) ;

        if(found)
        {
            // چک کردن وضعیت تعلیق کارمند
            for (int i = 0; i < HealthAssistantPart2.doctors.size(); i++)
            {
                if(HealthAssistantPart2.doctors.get(i).getID() == id)
                {
                    if(HealthAssistantPart2.doctors.get(i).isSuspension())
                    {
                        System.out.println("\tYou have been suspended and can not log in !");
                        break;
                    }
                    else
                    {
                        System.out.println("log in Successfully !");
                        System.out.println("-------------------------------------------------------------");
                        // ثبت زمان ورود
                        HealthAssistantPart2.doctorManager.recordTime(id, entranceHour);

                        int choice = doctorChoice.doctorMenu() ;
                        doctorMenu2(choice);
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("ID not found !");
            doctorMenu1(); // بازگشت به بخش لاگین
        }
    }

    public void doctorMenu2(int choice)
    {
        switch (choice)
        {
            case 1 : // Add secretary
            {
                addSecretary();
                choice = doctorChoice.doctorMenu();
                doctorMenu2(choice);
                break;
            }

            case 2 : // patient information
            {
                System.out.print(" Enter your personnel ID : ");
                int id = input.nextInt();
                System.out.println("\t**** patients' info ****");
                HealthAssistantPart2.secretaryManager.patientInfo(id);
                // بازگشت برای ورود دوباره و تجویز
                choice = doctorChoice.doctorMenu() ;
                doctorMenu2(choice);
                break;
            }

            case 3 : // prescribe
            {
                prescribe();
                choice = doctorChoice.doctorMenu() ;
                doctorMenu2(choice);
                break;
            }

            case 4 : // View the list of drugs
            {
                drugList();
                choice = doctorChoice.doctorMenu();
                doctorMenu2(choice);
                break;
            }

            case 5 : // Receive daily salary according to the number of daily appointments
            {
                receiveDailySalary();
                choice = doctorChoice.doctorMenu();
                doctorMenu2(choice);
                break;
            }

            case 6 : // Receive a monthly salary
            {
                System.out.print(" Enter your id : "); int id = input.nextInt();
                System.out.println(" your month salary is : " + HealthAssistantPart2.doctorManager.monthlySalary(id));
                choice = doctorChoice.doctorMenu();
                doctorMenu2(choice);
                break;
            }

            case 7 : // View a list of days spent at work
            {
                listDaysSpentAtWork();
                choice = doctorChoice.doctorMenu();
                doctorMenu2(choice);
                break;
            }

            case 8 : // Estimation of monthly salary in terms of daily income
            {
                  break;
            }

            case 9 : // log out
            {
                logOut();
                break;
            }
        }
    }

    public void addSecretary()
    {
        System.out.println("-------------------------------------------------------------");
        System.out.println(" Enter secretary information : ");
        System.out.print(" 1) secretary name : ");
        String name = input.next() ;
        System.out.print(" 2) secretary last name : ");
        String lastName = input.next() ;
        System.out.print(" 3) secretary password : ");
        String password = input.next() ;
        System.out.print(" 4) secretary phone number : ");
        int phoneNumber = input.nextInt();
        System.out.print(" 5) secretary email : ");
        String email = input.next();
        System.out.print(" 6) monthly hour : ");
        double monthlyHour = input.nextDouble();
        System.out.print(" 7) Number of days present per week: ");
        int numPresentDays = input.nextInt();
        System.out.print(" 8) daily duty hours : ");
        double dailyDutyHours = input.nextDouble();
        System.out.print(" 9) hourly Wages : ");
        double hourlyWages = input.nextDouble();
        System.out.print(" 10) doctor personnel id : ");
        int doctorID = input.nextInt();
        System.out.println();

        int personnelID = HealthAssistantPart2.doctorManager.addSecretary(name, lastName, password, phoneNumber, email,
                monthlyHour, numPresentDays, dailyDutyHours, hourlyWages, doctorID);
        System.out.println("personnel ID is : " + personnelID);
    }

    public void drugList()
    {
        for (int i = 0 ; i < HealthAssistantPart2.medicines.size(); i++)
        {
            System.out.print(" Medicine name: " + HealthAssistantPart2.medicines.get(i).getMedicineName());
            System.out.print("      price: " + HealthAssistantPart2.medicines.get(i).getMedicinePrice());
            System.out.print("      production date: " + HealthAssistantPart2.medicines.get(i).getMedicinePRO());
            System.out.print("      Expiration date: " + HealthAssistantPart2.medicines.get(i).getMedicineEXP());
            System.out.println();
        }
    }

    public void logOut()
    {
        System.out.println("\t*****Log out*****");
        System.out.print(" ID : "); int id = input.nextInt() ;
        System.out.println(" Enter exit time :         for example---> hour: 17");
        System.out.print(" hour : "); int leavingHour = input.nextInt();

        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardDailyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }


        for (int i = 0; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if(HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardWeeklyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }
    }

    public void prescribe()
    {
        System.out.println(" Enter the information : ");
        System.out.print(" 1) patient file number : ");
        int fileNum = input.nextInt();
        System.out.print(" 2) doctor's personnel ID : ");
        int doctorID = input.nextInt() ;

        int prescriptionNum = HealthAssistantPart2.doctorManager.prescribe(doctorID, fileNum);

        System.out.println(" the number of prescription is : " + prescriptionNum);
    }

    public void receiveDailySalary()
    {
        System.out.print(" Enter your personnel id : ");
        int id = input.nextInt();
        int counter = 0;
        for (int i = 0 ; i < HealthAssistantPart2.dailyAppointments.size(); i++)
        {
            if(HealthAssistantPart2.dailyAppointments.get(i).getDoctorPersonnelID() == id)
            {
                counter++;
            }
        }

        double dailySalary;
        for (int j =0; j < HealthAssistantPart2.doctors.size(); j++)
        {
            if(HealthAssistantPart2.doctors.get(j).getID() == id)
            {
                dailySalary = (counter * HealthAssistantPart2.doctors.get(j).getHourlyWages()) ;
                System.out.println(" your Daily Salary is : " + dailySalary);
                break;
            }

        }
    }

    public void listDaysSpentAtWork()
    {
        System.out.print(" Enter your personnel id : ");
        int id = input.nextInt();

        for (int i = 0 ; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if (HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getYear() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getMonth() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getDayDate() + "/");
                System.out.print("   arrival time : " + HealthAssistantPart2.guardWeeklyList.get(i).getEntranceHour());
                System.out.print("   exit time : " + HealthAssistantPart2.guardWeeklyList.get(i).getLeavingHour());
                System.out.println();
            }
        }
    }

}

//******************************** Guard Manager  &   Guard Panel **************************************************

class GuardManager
{
    //log in
    public boolean logIn(int id, String password) {
        boolean found = false;
        for (int i = 0; i < HealthAssistantPart2.guards.size(); i++) {
            if (HealthAssistantPart2.guards.get(i).getID() == id) {
                if (HealthAssistantPart2.guards.get(i).getPassword().equals(password)) {
                    found = true;
                    break;
                }
            }
        }
        return found;
    }

    // محاسبه مدت زمان حضور کارمند
    public void calculateAttendanceTime()
    {
        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            double t = HealthAssistantPart2.guardDailyList.get(i).getLeavingHour() -
                    HealthAssistantPart2.guardDailyList.get(i).getEntranceHour();
            HealthAssistantPart2.guardDailyList.get(i).setDurationOfPresence(t);
        }
    }

    // محاسبه غیبت مستخدم
    public void servantAbsenceCalculation()
    {
        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getJob().equals("servant"))
            {
                int id = HealthAssistantPart2.guardDailyList.get(i).getId();
                for (int j = 0; j < HealthAssistantPart2.servants.size(); j++)
                {
                    if(HealthAssistantPart2.servants.get(j).getID() == id)
                    {
                        if(HealthAssistantPart2.guardDailyList.get(i).getDurationOfPresence() <
                        HealthAssistantPart2.servants.get(j).getDailyDutyHours())
                        {
                            // دریافت تعداد غیبت ها
                            int numAbsences = HealthAssistantPart2.servants.get(j).getNumWeeklyAbsences() ;
                            numAbsences++ ;

                            HealthAssistantPart2.servants.get(j).setNumWeeklyAbsences(numAbsences);
                            break;
                        }
                    }
                }
            }
        }
    }

    // محاسبه غیبت پزشک
    public void doctorAbsenceCalculation()
    {
        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getJob().equals("doctor"))
            {
                int id = HealthAssistantPart2.guardDailyList.get(i).getId();
                for (int j = 0; j < HealthAssistantPart2.doctors.size(); j++)
                {
                    if(HealthAssistantPart2.doctors.get(j).getID() == id)
                    {
                        if(HealthAssistantPart2.guardDailyList.get(i).getDurationOfPresence() <
                                HealthAssistantPart2.doctors.get(j).getDailyDutyHours())
                        {
                            // دریافت تعداد غیبت ها
                            int numAbsences = HealthAssistantPart2.doctors.get(j).getNumWeeklyAbsences() ;
                            numAbsences++ ;

                            HealthAssistantPart2.doctors.get(j).setNumWeeklyAbsences(numAbsences);
                            break;
                        }
                    }
                }
            }
        }
    }

    // محاسبه غیبت  منشی
    public void secretaryAbsenceCalculation()
    {
        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getJob().equals("secretary"))
            {
                int id = HealthAssistantPart2.guardDailyList.get(i).getId();
                for (int j = 0; j < HealthAssistantPart2.secretaries.size(); j++)
                {
                    if(HealthAssistantPart2.secretaries.get(j).getID() == id)
                    {
                        if(HealthAssistantPart2.guardDailyList.get(i).getDurationOfPresence() <
                                HealthAssistantPart2.secretaries.get(j).getDailyDutyHours())
                        {
                            // دریافت تعداد غیبت ها
                            int numAbsences = HealthAssistantPart2.secretaries.get(j).getNumWeeklyAbsences() ;
                            numAbsences++ ;

                            HealthAssistantPart2.secretaries.get(j).setNumWeeklyAbsences(numAbsences);
                            break;
                        }
                    }
                }
            }
        }
    }

    // محاسبه غیبت نگهبان
    public void guardAbsenceCalculation()
    {
        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getJob().equals("guard"))
            {
                int id = HealthAssistantPart2.guardDailyList.get(i).getId();
                for (int j = 0; j < HealthAssistantPart2.guards.size(); j++)
                {
                    if(HealthAssistantPart2.guards.get(j).getID() == id)
                    {
                        if(HealthAssistantPart2.guardDailyList.get(i).getDurationOfPresence() <
                                HealthAssistantPart2.guards.get(j).getDailyDutyHours())
                        {
                            // دریافت تعداد غیبت ها
                            int numAbsences = HealthAssistantPart2.guards.get(j).getNumWeeklyAbsences() ;
                            numAbsences++ ;

                            HealthAssistantPart2.guards.get(j).setNumWeeklyAbsences(numAbsences);
                            break;
                        }
                    }
                }
            }
        }
    }


    // ثبت زمان ورود نگهبان
    public void recordTime(int id, int entranceHour)
    {
        LogInLogOutTime guard = new LogInLogOutTime(id, DateTime.year, DateTime.month, DateTime.dayDate, entranceHour,
                "guard");
        HealthAssistantPart2.guardDailyList.add(guard); // اد شدن به لیست روزانه
        HealthAssistantPart2.guardWeeklyList.add(guard); // اد شدن به لیست هفتگی
    }

    // دریافت حقوق ماهانه
    public double monthlySalary(int id)
    {
        double monthlySalary;
        for (int i = 0; i < HealthAssistantPart2.guards.size(); i++)
        {
            if (HealthAssistantPart2.guards.get(i).getID() == id)
            {
                monthlySalary = ( (HealthAssistantPart2.guards.get(i).getHourlyWages() *
                        HealthAssistantPart2.guards.get(i).getDailyDutyHours()) *
                        (HealthAssistantPart2.guards.get(i).getNumPresentDays() * 4) );
                return monthlySalary;
            }
        }
        return 0;
    }


}

class GuardPanel
{
    Scanner input = new Scanner(System.in);
    Menu guardChoice = new Menu() ;

    public void guardMenu1()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        int id = input.nextInt() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;

        System.out.println(" 3) Enter arrival time :         for example---> hour: 8");
        System.out.print(" hour : "); int entranceHour = input.nextInt();
        System.out.println();

        boolean found = HealthAssistantPart2.guardManager.logIn(id, password);

        if(found)
        {
            // چک کردن وضعیت تعلیق کارمند
            for (int i = 0; i < HealthAssistantPart2.guards.size(); i++)
            {
                if(HealthAssistantPart2.guards.get(i).getID() == id)
                {
                    if(HealthAssistantPart2.guards.get(i).isSuspension())
                    {
                        System.out.println("\tYou have been suspended and can not log in !");
                        break;
                    }
                    else
                    {
                        System.out.println("log in Successfully !");
                        System.out.println("-------------------------------------------------------------");
                        // ثبت زمان ورود
                        HealthAssistantPart2.guardManager.recordTime(id, entranceHour);

                        int choice = guardChoice.guardMenu() ;
                        guardMenu2(choice);
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("ID not found !");
            guardMenu1(); // بازگشت به بخش لاگین
        }
    }

    public void guardMenu2(int choice)
    {
        switch (choice)
        {
            case 1 : // list of daily arrival and departure times of employees
            {
                dailyList();
                choice = guardChoice.guardMenu();
                guardMenu2(choice);
                break;
            }

            case 2 : // list of weekly arrival and departure times of employees
            {
                weeklyList();
                choice = guardChoice.guardMenu();
                guardMenu2(choice);
                break;
            }

            case 3 : // Receive a monthly salary
            {
                System.out.print(" Enter your id : "); int id = input.nextInt();
                System.out.println(" your month salary is : " + HealthAssistantPart2.guardManager.monthlySalary(id));
                choice = guardChoice.guardMenu();
                guardMenu2(choice);
                break;
            }

            case 4 : // View a list of days spent at work
            {
                listDaysSpentAtWork();
                choice = guardChoice.guardMenu();
                guardMenu2(choice);
                break;
            }

            case 5 : // log out
            {
                logOut();
                break;
            }

        }

    }

    public void dailyList()
    {
        HealthAssistantPart2.guardManager.calculateAttendanceTime(); // محاسبه مدت زمان حضور

        System.out.println("\t" + DateTime.day + "   " + DateTime.year + "/" + DateTime.month +
                "/" + DateTime.dayDate); // چاپ تاریخ

        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            System.out.print(" id : " + HealthAssistantPart2.guardDailyList.get(i).getId());
            System.out.print("     arrival time: " + HealthAssistantPart2.guardDailyList.get(i).getEntranceHour());
            System.out.print("     exit time: " + HealthAssistantPart2.guardDailyList.get(i).getLeavingHour());
            System.out.print("     duration  of presence: " +
                    HealthAssistantPart2.guardDailyList.get(i).getDurationOfPresence());
            System.out.println();
        }

        // فراخوانی متد محاسبه غیبت ها
        HealthAssistantPart2.guardManager.servantAbsenceCalculation();
        HealthAssistantPart2.guardManager.doctorAbsenceCalculation();
        HealthAssistantPart2.guardManager.secretaryAbsenceCalculation();
        HealthAssistantPart2.guardManager.guardAbsenceCalculation();

    }

    public void logOut()
    {
        System.out.println("\t*****Log out*****");
        System.out.print(" ID : "); int id = input.nextInt() ;
        System.out.println(" Enter exit time :         for example---> hour: 17");
        System.out.print(" hour : "); int leavingHour = input.nextInt();

        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardDailyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }

        for (int i = 0; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if(HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardWeeklyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }
    }

    public void listDaysSpentAtWork()
    {
        System.out.print(" Enter your personnel id : ");
        int id = input.nextInt();

        for (int i = 0 ; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if (HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getYear() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getMonth() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getDayDate() + "/");
                System.out.print("   arrival time : " + HealthAssistantPart2.guardWeeklyList.get(i).getEntranceHour());
                System.out.print("   exit time : " + HealthAssistantPart2.guardWeeklyList.get(i).getLeavingHour());
                System.out.println();
            }
        }
    }

    public void  weeklyList()
    {

        for (int i = 0; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            System.out.print(" id : " + HealthAssistantPart2.guardWeeklyList.get(i).getId());
            System.out.print("     arrival time: " + HealthAssistantPart2.guardWeeklyList.get(i).getEntranceHour());
            System.out.print("     exit time: " + HealthAssistantPart2.guardWeeklyList.get(i).getLeavingHour());
            System.out.println();
        }
    }


}

//******************************** Secretary Manager  &   Secretary Panel *******************************************

class SecretaryManager
{
   // log in
   public boolean logIn(int id, String password)
   {
       boolean found = false ;
       for (int i = 0 ; i < HealthAssistantPart2.secretaries.size(); i++)
       {
           if (HealthAssistantPart2.secretaries.get(i).getID() == id)
           {
               if (HealthAssistantPart2.secretaries.get(i).getPassword().equals(password))
               {
                   found = true ;
                   break;
               }
           }
       }
       return found ;
   }

    // ثبت زمان ورود منشی
    public void recordTime(int id, int entranceHour)
    {
        LogInLogOutTime secretary = new LogInLogOutTime(id, DateTime.year, DateTime.month, DateTime.dayDate, entranceHour,
                "secretary");
        HealthAssistantPart2.guardDailyList.add(secretary); // اد شدن به لیست روزانه
        HealthAssistantPart2.guardWeeklyList.add(secretary); // اد شدن به لیست هفتگی
    }

    //  دریافت حقوق ماهانه
    public double monthlySalary(int id)
    {
        double monthlySalary;
       for (int i = 0 ; i < HealthAssistantPart2.secretaries.size(); i++)
       {
           if (HealthAssistantPart2.secretaries.get(i).getID() == id)
           {
               monthlySalary = ( (HealthAssistantPart2.secretaries.get(i).getHourlyWages() *
                       HealthAssistantPart2.secretaries.get(i).getDailyDutyHours()) *
                       (HealthAssistantPart2.secretaries.get(i).getNumPresentDays() * 4) );
               return monthlySalary;
           }
       }
       return 0;
    }

    // add appointment to the Secretary list
    public int makeAppointment(int doctorPersonnelID, int patientFileNumber, boolean emergency, String time)
    {
        int appointmentNumber = Appointment.number1 ;
        Appointment user = new Appointment(appointmentNumber, DateTime.year, DateTime.month, DateTime.dayDate,
                time, doctorPersonnelID, patientFileNumber);
        HealthAssistantPart2.dailyAppointments.add(user);
        HealthAssistantPart2.weeklyAppointments.add(user);
        return appointmentNumber;
    }

    // show patient info
    public void patientInfo(int doctorID)
    {
        for (int i = 0 ; i < HealthAssistantPart2.dailyAppointments.size(); i++)
        {
            if(HealthAssistantPart2.dailyAppointments.get(i).getDoctorPersonnelID() == doctorID)
            {
                int fileNum = HealthAssistantPart2.dailyAppointments.get(i).getPatientFileNumber() ;
                for (int j = 0; j < HealthAssistantPart2.patients.size(); j++)
                {
                    if(HealthAssistantPart2.patients.get(j).getID() == fileNum)
                    {
                        System.out.print(" name : " + HealthAssistantPart2.patients.get(j).getName());
                        System.out.print(" " + HealthAssistantPart2.patients.get(j).getLastName());
                        System.out.print("    file number : " + HealthAssistantPart2.patients.get(j).getID());
                        System.out.print("    phone number : " + HealthAssistantPart2.patients.get(j).getPhoneNumber());
                        System.out.print("    email : " + HealthAssistantPart2.patients.get(i).getEmail());
                        System.out.println();
                    }
                }
            }
        }
    }


}


class SecretaryPanel
{
    Scanner input = new Scanner(System.in);
    Menu secretaryChoice = new Menu() ;

    public void secretaryMenu1()
    {
        System.out.println("\t*****Log in*****");
        System.out.println(" Enter your information :");
        System.out.print(" 1) ID : ");
        int id = input.nextInt() ;
        System.out.print(" 2) Password : ");
        String password = input.next() ;

        System.out.println(" 3) Enter arrival time :         for example---> hour: 8");
        System.out.print(" hour : "); int entranceHour = input.nextInt();
        System.out.println();

        boolean found = HealthAssistantPart2.secretaryManager.logIn(id, password);

        if(found)
        {
            // چک کردن وضعیت تعلیق کارمند
            for (int i = 0; i < HealthAssistantPart2.secretaries.size(); i++)
            {
                if (HealthAssistantPart2.secretaries.get(i).getID() == id)
                {
                    if (HealthAssistantPart2.secretaries.get(i).isSuspension())
                    {
                        System.out.println("\tYou have been suspended and can not log in !");
                        break;
                    }
                    else
                    {
                        System.out.println("log in Successfully !");
                        System.out.println("-------------------------------------------------------------");
                        // ثبت زمان ورود
                        HealthAssistantPart2.secretaryManager.recordTime(id, entranceHour);

                        int choice = secretaryChoice.secretaryMenu() ;
                        secretaryMenu2(choice);
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.println("ID not found !");
            secretaryMenu1();
        }
    }

    public void secretaryMenu2(int choice)
    {

        switch (choice)
        {
            case 1 : //  Manage patient lists
            {
                break;
            }

            case 2 : // Arrange the order of patients' arrival
            {
                break;
            }

            case 3 : // Receive a monthly salary
            {
                System.out.print(" Enter your id : "); int id = input.nextInt();
                System.out.println(" your month salary is : " + HealthAssistantPart2.secretaryManager.monthlySalary(id));
                choice = secretaryChoice.secretaryMenu();
                secretaryMenu2(choice);
                break;
            }

            case 4 : // View a list of days spent at work
            {
                 listDaysSpentAtWork();
                 choice = secretaryChoice.secretaryMenu();
                 secretaryMenu2(choice);
                 break;
            }

            case 5 : // log out
            {
               logOut();
               break;
            }


        }

    }


    public void logOut()
    {
        System.out.println("\t*****Log out*****");
        System.out.print(" ID : "); int id = input.nextInt() ;
        System.out.println(" Enter exit time :         for example---> hour: 17");
        System.out.print(" hour : "); int leavingHour = input.nextInt();

        for (int i = 0; i < HealthAssistantPart2.guardDailyList.size(); i++)
        {
            if(HealthAssistantPart2.guardDailyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardDailyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }


        for (int i = 0; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if(HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                HealthAssistantPart2.guardWeeklyList.get(i).setLeavingHour(leavingHour);
                break;
            }
        }
    }

    public void listDaysSpentAtWork()
    {
        System.out.print(" Enter your personnel id : ");
        int id = input.nextInt();

        for (int i = 0 ; i < HealthAssistantPart2.guardWeeklyList.size(); i++)
        {
            if (HealthAssistantPart2.guardWeeklyList.get(i).getId() == id)
            {
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getYear() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getMonth() + "/");
                System.out.print(HealthAssistantPart2.guardWeeklyList.get(i).getDayDate() + "/");
                System.out.print("   arrival time : " + HealthAssistantPart2.guardWeeklyList.get(i).getEntranceHour());
                System.out.print("   exit time : " + HealthAssistantPart2.guardWeeklyList.get(i).getLeavingHour());
                System.out.println();
            }
        }
    }


}




