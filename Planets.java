package Planetarium;

public abstract class Planets extends CelestialBodies implements PlanetaryFunction{

   private TypeOfPlanets type;





    protected void setType(TypeOfPlanets type) {
        this.type = type;
    }
    
    Planets() {
        
        setType(TypeOfCelestial.PLANETS);
        
    }





}
