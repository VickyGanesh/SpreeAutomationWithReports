package Inheritance;

public class Kitchen extends Home{
    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.lightsInRoom = 2;
        kitchen.nameOfRoom = "LightsInHouse.Kitchen";
        kitchen.noOFLights();
    }


}
