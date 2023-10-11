public class Main {
    public static void main(String[] args) {
        person(23,45);
        person(50, -30);
        person(34, 20);
        person(5,35);
        person(45,-25);

    }
    public static boolean person(int age, int temperature){
        if (age >=20 && age <= 45 && temperature >=-20 && temperature <=30){
            System.out.println("Можно идти гулять");
        }else if (age<20 || temperature >= 0 && temperature>=28){
            System.out.println("Можно идти гулять");
        }else if (age>45 && temperature >=-10 && temperature<=25){
            System.out.println("Можно идти гулять");
        }else {
            System.out.println("Оставайтесь дома");
        }
        return true;
    }
}