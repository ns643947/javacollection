import array.Bottle;

public class App {
    public static void main(String[] args) throws Exception {

        Bottle[] bottleArray=new Bottle[5];
        for(int i=0;i<5;i++){
            // Bottle bt=new Bottle();
            // bt.setName("Bottle "+i);
            // bt.setCapacity(12);
            // bt.setLength(10);
            // bt.setWidth(5);
            // bottleArray[i]=bt;
            bottleArray[i]=new Bottle();
            bottleArray[i].setName("dsfsd");
        }
        for(int i=0;i<5;i++){
            System.out.print(bottleArray[i]);
        }

        

        
        System.out.println("Hello, World!");
    }
}
