public class Main {
    public static void main(String[] args) {
        int A= 4, B= 19, C=-21;
       int RESULT=A;
       if (B > RESULT)
           RESULT=B;
       else if (C>RESULT)
           RESULT=C;
       else
            RESULT=A;

        System.out.println(RESULT);


    }
}