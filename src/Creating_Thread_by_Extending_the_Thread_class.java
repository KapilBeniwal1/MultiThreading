public class Creating_Thread_by_Extending_the_Thread_class {
    //For Making thread of Ronaldo class we have to extend the Thread class with it
    static class Ronaldo extends Thread{
        //As the Default thread is executing through the main method...so for the Thread
        // that we have made that too also should have some default method right ! so
        // the default method for run/execute the user defined thread is run()
        @Override
            public void run(){
                for(int i=0 ; i<5 ; i++)
                {
                    System.out.println("Ronaldo");
                    //As we know that sleep method of thread class might throw
                    // Exception so to handel it we have to write it in try catch block,
                    // here we cannot use throws keyword to handel the exception because
                    //
                    try{
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
    }
    public static void main(String[] args) throws InterruptedException {
        // Making Object of class Ronaldo
        Ronaldo r = new Ronaldo();

        //start is Method for start the thread that we have made , It will
        // automatically call the run() function
        r.start();

        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("Messi");
            Thread.sleep(1000);
        }
    }
}
/*
If there was sleep method in both the main() and run() so then the output will be random
(Nothing is in sequence/fix)
 */
