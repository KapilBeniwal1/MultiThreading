public class Main {
    static class Ronaldo{
        public void print() throws InterruptedException {
            for(int i=0 ; i<5 ; i++)
            {
                System.out.println("Ronaldo");
                // Now Ronaldo will print 5 times with the pause of 1 seconds each in
                // every iteration because still we have only one thread that is main()
                // and main() thread will only going to sleep for given time & after the
                // iteration of whole loop 5 time Messi will print in single go(No pause)
                Thread.sleep(1000);
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
      Ronaldo r = new Ronaldo();
      r.print();

      for(int i=0 ; i<5 ; i++){
          System.out.println("Messi");
        //  Thread.sleep(1000);    //After this Ronaldo will print 5 times and
                                  // after that Messi will print 5 time but with the pause
                                 // of 1 seconds in b/w of each iteration
      }
    }
}