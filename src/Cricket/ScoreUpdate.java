package Cricket;

public class ScoreUpdate {
    public void bowlingUpdate(SpinBowler spinBowlers,int iterator, int jterator){
        int currentSpeed=spinBowlers.setBowlingSpeed(spinBowlers.upperSpeed,
                spinBowlers.lowerSpeed);
        if(jterator==6){
            System.out.println((iterator+1)+"."+(jterator%6)+" Overs: " +
                    spinBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }
        else{
            System.out.println(iterator+"."+jterator+" Overs: " +
                    spinBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }
        Double floatSpeed = new Double(currentSpeed);
        spinBowlers.totalSpeed+=floatSpeed;
    }


    public void bowlingUpdate(FastMediumBowler fastMediumBowlers,int iterator, int jterator){
        int currentSpeed=fastMediumBowlers.setBowlingSpeed(fastMediumBowlers.upperSpeed,
                fastMediumBowlers.lowerSpeed);

        if(jterator==6){
            System.out.println((iterator+1)+"."+(jterator%6)+" Overs: " +
                    fastMediumBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }
        else{
            System.out.println(iterator+"."+jterator+" Overs: " +
                    fastMediumBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }


        Double floatSpeed = new Double(currentSpeed);
        fastMediumBowlers.totalSpeed+=floatSpeed;
    }


    public void bowlingUpdate(FastBowler fastBowlers,int iterator, int jterator){
        int currentSpeed=fastBowlers.setBowlingSpeed(fastBowlers.upperSpeed,
                fastBowlers.lowerSpeed);


        if(jterator==6){
            System.out.println((iterator+1)+"."+(jterator%6)+" Overs: " +
                    fastBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }
        else{
            System.out.println(iterator+"."+jterator+" Overs: " +
                    fastBowlers.name+" at ," +currentSpeed
                    +" Km/h");
        }
        Double floatSpeed = new Double(currentSpeed);
        fastBowlers.totalSpeed+=floatSpeed;
    }

 
}
