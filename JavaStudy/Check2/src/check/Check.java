package check;

import constants.Constants;

public class Check {
    private String firstName = "花岡";
    private String lastName = "柾";

    private void printName() {
        System.out.println("printNameメソッド → " + firstName + lastName);
    }

    public static void main(String []args){
        Check check = new Check();
        check.printName();

        String name = Constants.CHECK_CLASS_JAVA;
        String masterName = Constants.CHECK_CLASS_HOGE;
        Pet pet = new Pet(name, masterName);
        pet.introduce();

        String subName = Constants.CHECK_CLASS_R2D2;
        String subMasterName = Constants.CHECK_CLASS_LUKE;
        RobotPet robotPet = new RobotPet(subName, subMasterName);
        robotPet.introduce();
    }

}
