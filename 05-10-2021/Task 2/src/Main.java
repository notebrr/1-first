public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(4, 5, 3);
        Room room2 = new Room(10, 12, 5);
        Room room3 = new Room(2, 2, 2);
        Room[] allRooms = {room1, room2, room3};

        Building building = new Building(room1, 2, 1, true);
        System.out.println(building.getRooms().getNumberOfLamps());
        if(building.getNumberOfFloors() > allRooms.length){
            System.out.println("This is an odd building");
        }
    }
}
