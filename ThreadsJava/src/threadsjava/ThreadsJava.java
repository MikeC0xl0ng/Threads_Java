package threadsjava;

/**
 *
 * @author Bodliev
 */
public class ThreadsJava extends Thread{

    public static void main(String[] args) {
        Thread tic = Thread.currentThread();
        tic.setName("Thread Jeorge");
        System.out.println("Ecco il thread in corso: " + tic);
        try{
            for(int i = 3; i > 0; i--){
                System.out.println("Ecco il thread in corso: " + tic + " ");
                System.out.println(i + " secondi rimanenti al termine del processo");
                tic.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Ops… qualcosa è andato storto");
        }
        System.out.println("Il alvoro è stato terminato on successo.");
    
    }
    
}
