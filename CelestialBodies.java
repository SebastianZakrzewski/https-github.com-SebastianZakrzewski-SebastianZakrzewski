package Planetarium;

public abstract class CelestialBodies extends Planetarium{

    private TypeOfCelestial type;
    
    private int size;

    protected void setType(TypeOfCelestial type) {
        this.type = type;
    }

    public TypeOfCelestial getType() {
        return type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }




}
