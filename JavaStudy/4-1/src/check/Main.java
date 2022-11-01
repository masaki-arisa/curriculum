package check;

import constants.Constants;

public class Main{
    
    private static String firstName = "真崎";
    private static String lastName = "亜理沙";
    
    private static void  printName(String firstName,String lastName) {
        System.out.println(firstName+lastName);
    }

    //public static void main() {

    
    public static void main(String[] args) {
        printName(firstName,lastName);
    
    Pet a = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
    a.introduce();
    RobotPet b = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
    b.introduce();
    
    //}
    //introduceの呼び出し
    //name,masterNameを引数としてつかう
}
}

