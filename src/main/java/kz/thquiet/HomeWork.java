package kz.thquiet;

/**
 * Hello world!
 *
 */
public class HomeWork {
    public static void main( String[] args ) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Abylkhaiyrov" ,
                "Askar",
                "Zhienbaevich" ,
                "CEO",
                "askar@gmail.com",
                "+7(776)-426-81-11",
                5000000,
                21
        );

        employees[1] = new Employee(
                "Kudaiberganov",
                "Mukhit",
                "Bekdillaevich",
                "CTO",
                "mukhit@gmail.com",
                "8776617263276",
                4500000,
                21
        );

        employees[2] = new Employee(
                "Bokkotenov",
                "Gulzhapyrak",
                "ASlcjnlsk",
                "Backend Developer",
                "gulzhapyrak@gmail.com",
                "872376251",
                450000,
                45
        );

        employees[3] = new Employee(
                "Esbaev",
                "Nurbol",
                "Kamelovich",
                "Crane operator",
                "nurbol@gmail.com",
                "8716231365",
                450000,
                48
        );

        employees[4] = new Employee(
                "Hozhan",
                "Aibol",
                "Nurshabekovich",
                "COO",
                "aibol@gmail.com",
                "871635612345",
                450000,
                43
        );

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].getAge() > 40) {
                System.out.println(employees[i].printInfo()+"\n----------------------------------");
            }
        }
    }
}
