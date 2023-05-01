package in.cdac.main;

public class Effetcs {


        public static void  loadEffect(String Msg) {
            System.out.println(Msg);

            for(int i=0; i<10;i++) {
                try {
                    Thread.sleep(400);
                    System.out.print("- ");
                }catch (InterruptedException e) {
                    System.out.println("OOPS ! Something went Wrong");
                }
            }System.out.println();
        }

}

