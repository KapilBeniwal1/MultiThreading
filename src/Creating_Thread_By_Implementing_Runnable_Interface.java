/*
As we know in Java We cannot extend two or more classes with one class means....Multiple
Inheritance is not allowed in Java
SO....what if a user need to extend 2 classes and also wants to extend Thread class
As the solution of this problem we have Runnable Interface which allows a user to extends
more than 1 class with Thread class also
 */

public class Creating_Thread_By_Implementing_Runnable_Interface {
    //Change no. 1
    static class Ronaldo implements Runnable{
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
      Ronaldo  r = new Ronaldo();

      //Change no. 2
      //Pass the reference of Ronaldo class inside the Tread parameter
      Thread t = new Thread(r);

        //start is Method for start the thread that we have made , It will
        // automatically call the run() function
        t.start(); //Change no. 3

        for(int i=0 ; i<5 ; i++)
        {
            System.out.println("Messi");
            Thread.sleep(1000);
        }
    }
}

