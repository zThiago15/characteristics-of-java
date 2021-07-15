package one.innovation.digital.abstracts;

public abstract class GeometricForm {

    public abstract String name();
    public abstract Double area();

    public String draw(int x, int y){
        return "Drawing at coordinates X=$x and Y=$y";
    }
}
