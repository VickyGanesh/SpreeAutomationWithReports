package Inheritance;

public class BedRoom extends Home{
    public static void main(String[] args) {
        BedRoom bedRoom = new BedRoom();
        bedRoom.lightsInRoom = 4;
        bedRoom.nameOfRoom = "Bedroom";
        bedRoom.noOFLights();
    }
}
