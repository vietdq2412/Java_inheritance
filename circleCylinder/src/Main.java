public class Main {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder(3,6,"red");

        String infor = cylinder.toString();
        System.out.println(infor);

        System.out.println("volume: "+ cylinder.getVolume());
    }
}

