package Inheritance;

public class Home {
    String nameOfRoom;
    int lightsInRoom;
     public void noOFLights(){
         System.out.println("The number of lights in the " + this.nameOfRoom + " is " + this.lightsInRoom );
     }

}
class LivingRoom extends Home {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        livingRoom.lightsInRoom = 8;
        livingRoom.nameOfRoom = "Living Room";
        livingRoom.noOFLights();
    }
}
