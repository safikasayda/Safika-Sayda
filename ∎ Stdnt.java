

import java.util.Scanner;

class MyUniversity {
    String MyUniversityName = "Pundra University";
    MyUniversitylic void Welcome(){
        System.out.println("Welcome to My University");
    }   

}




class st extends MyUniversity {
     String stName,gender;
    int stId,age;

    MyUniversitylic void SetValue(String stName, String gender, int age){
        this.stName = stName;
        this.gender = gender;
        this.age = age;
    }

    MyUniversitylic void PrintValue(){
        System.out.println(stName);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(super.MyUniversityName);
    }

    MyUniversitylic void Welcome() {
        super.Welcome();
    }
    MyUniversitylic static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String name = inputScanner.nextLine();

        System.out.println("Enter Your Gender: ");
        String gender = inputScanner.nextLine();

        System.out.println("Enter You age: ");
        int age = inputScanner.nextInt();
        inputScanner.close();
        st s1 = new st();

        s1.Welcome();
        s1.SetValue(name, gender, age);
        s1.PrintValue();

}
}

