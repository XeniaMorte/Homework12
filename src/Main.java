public class Main {
    public static void main(String[] args) {
        String firstName = " Семён";
        String middleName = " Семёнович";
        String lastName = " Иванов";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника — " + fullName);
        String fullNameToUpperCase=fullName.toUpperCase();
        System.out.println("ФИО сотрудника для отчета — " + fullNameToUpperCase);
        String fullNameE=fullName.replace('ё','е');
        System.out.println("ФИО сотрудника для отчета без ё"+fullNameE);


    }
}