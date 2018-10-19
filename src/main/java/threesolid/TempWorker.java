package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
    public String work() {
        return "TempWorker is working...";
    }

    public void eat(){
       System.out.println("TempWorker is eating...");
   }

   public void sick(){
       System.out.println("TempWorker is sick...");
   }
}