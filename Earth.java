package Planetarium;

public class Earth extends Planets{


    Earth() {

     setType(TypeOfPlanets.EARTH);



     
     
    }


    @Override
    public void information() {

        System.out.printf("Description: %s","The third planet from the sun \n, " +
                "Earth is the only place in the known universe confirmed to host life.\n" +
                " With a radius of 3,959 miles, Earth is the fifth largest planet in our solar system\n" +
                ", and it's the only one known for sure to have liquid water on its surface.\n " +
                "Earth is also unique in terms of monikers.");

    }
}
